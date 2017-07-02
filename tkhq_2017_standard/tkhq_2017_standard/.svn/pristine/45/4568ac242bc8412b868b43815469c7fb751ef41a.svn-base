package com.tkhq.cmc.controller.rest;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tkhq.cmc.common.Constants.ExportType;
import com.tkhq.cmc.common.JasperExport;
import com.tkhq.cmc.dto.BCThayDoiDoTHQTNV;
import com.tkhq.cmc.utils.Utils;
import com.tkhq.global.model.bcdulieuthaydoi.XemThayDoiDoBuocNVThKe;

@RestController
@RequestMapping(value = "bcThayDoiDoTHQTNV")
public class bcThayDoiDoTHQTNVRestController {
	
	@Autowired
	HttpServletRequest request;


	@RequestMapping(value = "/ThayDoiDoTHQTNV", method = RequestMethod.GET)
	public ResponseEntity<byte[]> ThayDoiDoTHQTNV(String maCucHQ, String maChicucHQ,
			String nhx) throws IOException {

		String myURL = Utils.getBaseUrl(request) + "/bcpt/ThayDoiDoNVHQ/Print?maCucHQ=" + maCucHQ
				+ "&maChicucHQ=" + maChicucHQ + "&nhx=" + nhx ;
		List<BCThayDoiDoTHQTNV> listdata = (List<BCThayDoiDoTHQTNV>) Utils
				.getDataStringFromApiReturnList(myURL, BCThayDoiDoTHQTNV.class);

		JRBeanCollectionDataSource listData1 = new JRBeanCollectionDataSource(
				listdata);
		Map<String, Object> param = new HashMap<String, Object>();

		return JasperExport.ExportReport("BCThayDoiDoTHQTNV", listData1,
				param, ExportType.HTML);

	}
	
	@RequestMapping(value = "/doExport", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void doExport(@RequestBody Hashtable<String, String> params, HttpServletResponse response) {		
		List<XemThayDoiDoBuocNVThKe> list = new ArrayList<XemThayDoiDoBuocNVThKe>();
		XemThayDoiDoBuocNVThKe rowItem = new XemThayDoiDoBuocNVThKe();
		
		int totalFields = rowItem.getClass().getDeclaredFields().length;
		
		String currentDate = Utils.getCurrentDate();
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		String excelDir = loader.getResource("ExcelTemplates/").getPath();
		String excelFilePath = excelDir + "\\ThaydoiDoTHQTNV.xls";
		String fileName = String.format("Thay đổi do thực hiện các quy trình, nghiệp vụ, bước nghiệp vụ TK_%s.xls", currentDate);
		
		try{
			String myURL = Utils.getBaseUrl(request) + "/bcpt/XemThayDoi/BuocNVTHKE?"				 
				+ "&maCucHQ=" + params.get("maCucHQ") + "&maChicucHQ=" + params.get("maChiCucHQ") + "nhx=" + params.get("nhx")
				+ "&loai_ky=" + params.get("loai_ky") + "&tu_ngay=" + params.get("tu_ngay")
				+ "&den_ngay=" + params.get("den_ngay") + "&ky=" + params.get("ky")
				+ "&thang=" + params.get("thang") + "&nam=" + params.get("nam");
		    
		    list = Utils.getDataStringFromApiReturnList(myURL, XemThayDoiDoBuocNVThKe.class);
		    
			//Tao luong doc workbook
			InputStream is = new FileInputStream(excelFilePath);
			Workbook workbook = new HSSFWorkbook(is);
			Sheet sheet = workbook.getSheetAt(0);
			Cell cell;	//store value of current cell
			Row row;	//store value of current row
			
			//Integer colNum = 0;	//position of column fill data
			Integer rowNum = 7; //position of row fill data
			
			//Conversion to two dimensional arrays
			String[][] detail = new String[list.size()][totalFields];
			Field[] fields = rowItem.getClass().getDeclaredFields();
			
			for(Field field : fields){
				field.setAccessible(true);
			}
			for(int i = 0; i < list.size(); i++){
				rowItem = list.get(i);
				for(int j = 0; j < totalFields; j++){
					if(fields[j].get(rowItem) == null){
						detail[i][j] = "";
					}
					detail[i][j] = fields[j].get(rowItem).toString();	
				}
			}
			
			//fill data to cell
			for(int i = 0; i < list.size(); i++){
				row = sheet.createRow(i + rowNum);
				for(int j = 0; j < totalFields; j++){
					cell = row.createCell(j);
					cell.setCellValue(detail[i][j]);
				}
			}
			
			response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
			response.setHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");

			//Tao luong ghi
			ServletOutputStream out = response.getOutputStream();
			workbook.write(out);

			out.flush();
			
			out.close();
			workbook.close();
			is.close();
			
    	}catch(Exception ex){
    		ex.printStackTrace();
    	}
	}
}
