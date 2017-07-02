package com.tkhq.cmc.controller.rest;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.ss.util.RegionUtil;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tkhq.cmc.common.CExcel;
import com.tkhq.cmc.common.Constants;
import com.tkhq.cmc.common.JasperExport;
import com.tkhq.cmc.common.Constants.ExportType;
import com.tkhq.cmc.utils.Utils;
import com.tkhq.global.dao.SLTheoCTTKDao;
import com.tkhq.global.dao.SLTheoCTTKRequestParams;
import com.tkhq.global.model.bcptbangbieu.SLTheoCTTK02Response;
import com.tkhq.global.model.bcptbangbieu.SLTheoCTTK14Response;

@RestController
@RequestMapping(value="/bcpt/CanhBaoSoTKTTG")
public class CanhBaoSoTKTGTTGRestController {
	@Autowired
	HttpServletRequest request;
	
	@Autowired
	private SLTheoCTTKDao repository;
	
	@Autowired 
	private ObjectMapper mapper;
	
	@RequestMapping(value="/doChart", method = RequestMethod.GET)
	public ResponseEntity<byte[]> doChart(String maCucHQ, String maChiCucHQ, String nhx, String loai_ngay, String thoi_gian,
			String tu_thoigian, String den_thoigian, String tu_nam, String den_nam) throws IOException{
		
//		String myURL = Utils.getBaseUrl(request) + "/bcpt/SoLieuTheoChiTieuThongKe14?maCucHQ=" + maCucHQ
//				+ "&maChicucHQ=" + Utils.escapeNull(maChiCucHQ) + "&nhx=" + Utils.escapeNull(nhx)
//				+ "&loai_ngay=" + Utils.escapeNull(loai_ngay) + "&thoi_gian=" + Utils.escapeNull(thoi_gian)
//				+ "&tu_thoigian=" + Utils.escapeNull(tu_thoigian) + "&den_thoigian=" + Utils.escapeNull(den_thoigian)
//				+ "&tu_nam=" + Utils.escapeNull(tu_nam) + "&den_nam=" + Utils.escapeNull(den_nam);
//		String responeJson;
//		BufferedReader reader = null;
//	    try {
//	        URL url = new URL(myURL);
//	        reader = new BufferedReader(new InputStreamReader(url.openStream()));
//	        StringBuffer buffer = new StringBuffer();
//	        int read;
//	        char[] chars = new char[1024];
//	        while ((read = reader.read(chars)) != -1)
//	            buffer.append(chars, 0, read); 
//
//	        responeJson = buffer.toString();
//	    }
//	    finally {
//	        if (reader != null)
//	            reader.close();
//	    }
		
		SLTheoCTTKRequestParams requestParams = new SLTheoCTTKRequestParams();
		requestParams.setNhx(Utils.escapeNull(nhx));
		requestParams.setMaCucHQ(Utils.escapeNull(maCucHQ));
		requestParams.setMaChicucHQ(Utils.escapeNull(maChiCucHQ));
		requestParams.setUsername(Utils.escapeNull(Utils.getPrincipalLogin().getUser().getUserName()));
		List<SLTheoCTTK14Response> lst = repository.getSLTheoCTTK14(requestParams,Utils.escapeNull(loai_ngay),
							Utils.escapeNull(thoi_gian), Utils.escapeNull(tu_thoigian), Utils.escapeNull(tu_nam), 
							Utils.escapeNull(den_thoigian), Utils.escapeNull(den_nam));	
		String responeJson = mapper.writeValueAsString(lst);
	    
	    String reportName = "CanhBaoSoTKTGTTG_SLTK";
	    try{
		    List<Map<String, Object>> dataKy = new ArrayList<Map<String, Object>>();
		    JSONArray jsonArray = new JSONArray(responeJson);
		    JSONObject jsonObject = jsonArray.getJSONObject(0);
		    JSONArray jsonArray2 = jsonObject.getJSONArray("group_data");
		    JSONObject jsonObject2 = jsonArray2.getJSONObject(0);
		    JSONArray data = jsonObject2.getJSONObject("data_ky").getJSONArray("data");
		    
		    if(data.length() > 0){
		    	dataKy = Utils.jsonToListMap(data);
		    }
	
			JRBeanCollectionDataSource lstDataSource = new JRBeanCollectionDataSource(dataKy);
			Map<String, Object> param = new HashMap<String, Object>();
			
			return JasperExport.ExportReport(reportName, lstDataSource, param ,ExportType.HTML);
	    }catch(Exception ex){
	    	ex.printStackTrace();
	    	return new ResponseEntity<byte[]>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}
	
	@RequestMapping(value="/doChart2", method = RequestMethod.GET)
	public ResponseEntity<byte[]> doChart2(String maCucHQ, String maChiCucHQ, String nhx, String loai_ngay, String thoi_gian,
			String tu_thoigian, String den_thoigian, String tu_nam, String den_nam) throws IOException{
		
//		String myURL = Utils.getBaseUrl(request) + "/bcpt/SoLieuTheoChiTieuThongKe14?maCucHQ=" + maCucHQ
//				+ "&maChicucHQ=" + Utils.escapeNull(maChiCucHQ) + "&nhx=" + Utils.escapeNull(nhx)
//				+ "&loai_ngay=" + Utils.escapeNull(loai_ngay) + "&thoi_gian=" + Utils.escapeNull(thoi_gian)
//				+ "&tu_thoigian=" + Utils.escapeNull(tu_thoigian) + "&den_thoigian=" + Utils.escapeNull(den_thoigian)
//				+ "&tu_nam=" + Utils.escapeNull(tu_nam) + "&den_nam=" + Utils.escapeNull(den_nam);
//		String responeJson;
//		BufferedReader reader = null;
//	    try {
//	        URL url = new URL(myURL);
//	        reader = new BufferedReader(new InputStreamReader(url.openStream()));
//	        StringBuffer buffer = new StringBuffer();
//	        int read;
//	        char[] chars = new char[1024];
//	        while ((read = reader.read(chars)) != -1)
//	            buffer.append(chars, 0, read); 
//
//	        responeJson = buffer.toString();
//	    }
//	    finally {
//	        if (reader != null)
//	            reader.close();
//	    }
		
		SLTheoCTTKRequestParams requestParams = new SLTheoCTTKRequestParams();
		requestParams.setNhx(Utils.escapeNull(nhx));
		requestParams.setMaCucHQ(Utils.escapeNull(maCucHQ));
		requestParams.setMaChicucHQ(Utils.escapeNull(maChiCucHQ));
		requestParams.setUsername(Utils.escapeNull(Utils.getPrincipalLogin().getUser().getUserName()));
		List<SLTheoCTTK14Response> lst = repository.getSLTheoCTTK14(requestParams,Utils.escapeNull(loai_ngay),
							Utils.escapeNull(thoi_gian), Utils.escapeNull(tu_thoigian), Utils.escapeNull(tu_nam), 
							Utils.escapeNull(den_thoigian), Utils.escapeNull(den_nam));	
		String responeJson = mapper.writeValueAsString(lst);
	    
	    String reportName = "CanhBaoSoTKTGTTG_TGTK";
	    try{
		    List<Map<String, Object>> dataKy = new ArrayList<Map<String, Object>>();
		    JSONArray jsonArray = new JSONArray(responeJson);
		    JSONObject jsonObject = jsonArray.getJSONObject(0);
		    JSONArray jsonArray2 = jsonObject.getJSONArray("group_data");
		    JSONObject jsonObject2 = jsonArray2.getJSONObject(1);
		    JSONArray data = jsonObject2.getJSONObject("data_ky").getJSONArray("data");
		    
		    if(data.length() > 0){
		    	dataKy = Utils.jsonToListMap(data);
		    }
	
			JRBeanCollectionDataSource lstDataSource = new JRBeanCollectionDataSource(dataKy);
			Map<String, Object> param = new HashMap<String, Object>();
			
			return JasperExport.ExportReport(reportName, lstDataSource, param ,ExportType.HTML);
	    }catch(Exception ex){
	    	ex.printStackTrace();
	    	return new ResponseEntity<byte[]>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}
	
	@RequestMapping(value = "/doExport", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void doExport(@RequestBody Hashtable<String, String> params, HttpServletResponse response) {
		String currentDate = Utils.getCurrentDate();
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		String excelDir = loader.getResource("ExcelTemplates/").getPath();
		String excelFilePath = excelDir + "\\DienBienSoTK_TGTTG.xls";
		String fileName = String.format("Diễn biến số tờ khai, trị giá theo thời gian_%s.xls", currentDate);
		
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
		try{
//			String myURL = Utils.getBaseUrl(request) + "/bcpt/SoLieuTheoChiTieuThongKe14?nhx=" + params.get("nhx")
//				+ "&maCucHQ=" + Utils.escapeNull(params.get("maCucHQ")) + "&maChicucHQ=" + Utils.escapeNull(params.get("maChiCucHQ"))
//				+ "&loai_ngay=" + Utils.escapeNull(params.get("loai_ngay")) + "&thoi_gian=" + Utils.escapeNull(params.get("thoi_gian"))
//				+ "&tu_thoigian=" + Utils.escapeNull(params.get("tu_thoigian")) + "&den_thoigian=" + Utils.escapeNull(params.get("den_thoigian"))
//				+ "&tu_nam=" + Utils.escapeNull(params.get("tu_nam")) + "&den_nam=" + Utils.escapeNull(params.get("den_nam"));
//			String responeJson;
//			BufferedReader reader = null;
//		    try {
//		        URL url = new URL(myURL);
//		        reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
//		        StringBuffer buffer = new StringBuffer();
//		        int read;
//		        char[] chars = new char[1024];
//		        while ((read = reader.read(chars)) != -1)
//		            buffer.append(chars, 0, read); 
//
//		        responeJson = buffer.toString();
//		    } finally {
//		        if (reader != null)
//		            reader.close();
//		    }
			
			SLTheoCTTKRequestParams requestParams = new SLTheoCTTKRequestParams();
			requestParams.setNhx(Utils.escapeNull(params.get("nhx")));
			requestParams.setMaCucHQ(Utils.escapeNull(params.get("maCucHQ")));
			requestParams.setMaChicucHQ(Utils.escapeNull(params.get("maChiCucHQ")));
			requestParams.setUsername(Utils.escapeNull(Utils.getPrincipalLogin().getUser().getUserName()));
			List<SLTheoCTTK14Response> lst = repository.getSLTheoCTTK14(requestParams,Utils.escapeNull(params.get("loai_ngay")),
								Utils.escapeNull(params.get("thoi_gian")), Utils.escapeNull(params.get("tu_thoigian")), 
								Utils.escapeNull(params.get("tu_nam")), Utils.escapeNull(params.get("den_thoigian")), 
								Utils.escapeNull(params.get("den_nam")));	
			String responeJson = mapper.writeValueAsString(lst);
		    
		    JSONArray jsonArray = new JSONArray(responeJson);
		    
		    for(int i = 0; i < jsonArray.length(); i++){
		    	JSONObject groupJson = jsonArray.getJSONObject(i);
		    	Map<String, Object> map = Utils.jsonToMap(groupJson);
		    	list.add(map);
		    }
			
		    //Tao luong doc workbook
			InputStream is = new FileInputStream(excelFilePath);
			Workbook workbook = new HSSFWorkbook(is);
			Sheet sheet = workbook.getSheetAt(0);
			Cell cell;	//store value of current cell
			Row row;	//store value of current row
			
			 Map<String, CellStyle> styles = CExcel.createStyles(workbook);
			
			Integer colNum = 0;	//position of first column fill data
			Integer rowNum = 3; //position of first row fill data
			String mergeRange = "";
			
			List<Map<String, Object>> groupData = new ArrayList<Map<String, Object>>();
			Map<String, Object> dataKy = new HashMap<String, Object>();
			List<Map<String, Object>> lstDataKy = new ArrayList<Map<String, Object>>();
			Map<String, Object> dataThang = new HashMap<String, Object>();
			List<Map<String, Object>> lstDataThang = new ArrayList<Map<String, Object>>();
			
			//fill data to cell
			for(int i = 0; i < list.size(); i++){
				groupData = (List<Map<String, Object>>)list.get(i).get("group_data");
				dataKy = (Map<String, Object>)groupData.get(0).get("data_ky");
				lstDataKy = (List<Map<String, Object>>)dataKy.get("data");
				
				colNum = 0;
				rowNum++;
				row = sheet.createRow(rowNum);
				cell = 	row.createCell(colNum);
				cell.setCellValue(list.get(i).get("group_name").toString());
				cell.setCellStyle(styles.get("cell_str"));
				
				mergeRange = "$" + CellReference.convertNumToColString(0) + "$" + (rowNum + 1) + ":$"
							+ CellReference.convertNumToColString(lstDataKy.size()) + "$" + (rowNum + 1);
				sheet.addMergedRegion(CellRangeAddress.valueOf(mergeRange));
				RegionUtil.setBorderTop(CellStyle.BORDER_THIN, CellRangeAddress.valueOf(mergeRange), sheet);
				RegionUtil.setBorderRight(CellStyle.BORDER_THIN, CellRangeAddress.valueOf(mergeRange), sheet);
				
				for(int j = 0; j < groupData.size(); j++){
					colNum = 0;
					rowNum++;
					row = sheet.createRow(rowNum);
					cell = row.createCell(colNum);
					cell.setCellValue(groupData.get(j).get("sub_name").toString());
					cell.setCellStyle(styles.get("cell_str_center"));
					
					dataKy = (Map<String, Object>)groupData.get(j).get("data_ky");
					lstDataKy = (List<Map<String, Object>>)dataKy.get("data");
					
					for(int k = 0; k < lstDataKy.size(); k++){
						colNum++;
						cell = row.createCell(colNum);
						cell.setCellValue(lstDataKy.get(k).get("ky").toString() + "\n"
								+ lstDataKy.get(k).get("gia_tri").toString());
						cell.setCellStyle(styles.get("cell_str_center"));
						sheet.setColumnWidth(colNum, 10 * 256);
					}
					
					rowNum++;
					colNum = 0;
					row = sheet.createRow(rowNum);
					cell = row.createCell(colNum);
					cell.setCellValue("AVG");
					cell.setCellStyle(styles.get("cell_str_center"));
					
					colNum++;
					cell = row.createCell(colNum);
					cell.setCellValue(groupData.get(j).get("avg").toString());
//					cell.setCellStyle(styles.get("cell_str_center"));
					
					if(lstDataKy.size() == 1){
						continue;
					}
					mergeRange = "$" + CellReference.convertNumToColString(1) + "$" + (rowNum + 1) + ":$"
							+ CellReference.convertNumToColString(lstDataKy.size()) + "$" + (rowNum + 1);
					sheet.addMergedRegion(CellRangeAddress.valueOf(mergeRange));
					RegionUtil.setBorderBottom(CellStyle.BORDER_THIN, CellRangeAddress.valueOf(mergeRange), sheet);
					RegionUtil.setBorderRight(CellStyle.BORDER_THIN, CellRangeAddress.valueOf(mergeRange), sheet);
				}
			}
			
			//create header
			colNum = 0;
			rowNum = 3;
			
			List<String> header = new ArrayList<String>();
			header.add("Chỉ tiêu");
			header.add("Thời gian");
			
			row = sheet.createRow(rowNum);
             
            for(int i = 0; i < header.size(); i++){
            	if(i == 1 && lstDataKy.size() > 1){
            		cell = row.createCell(colNum);
    				cell.setCellValue(header.get(i));
    				cell.setCellStyle(styles.get("header"));
    				colNum += lstDataKy.size() - 1;
 					mergeRange = "$" + CellReference.convertNumToColString(i) + "$4" + ":$"
 							+ CellReference.convertNumToColString(colNum) + "$4";
 					sheet.addMergedRegion(CellRangeAddress.valueOf(mergeRange));
 					
 					colNum++;
 					continue;
 				}
            	
				cell = row.createCell(colNum);
				cell.setCellValue(header.get(i));
				cell.setCellStyle(styles.get("header"));
				if(lstDataKy.size() == 1){
					sheet.setColumnWidth(colNum, 20 * 256);
				}
				
				colNum++;
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
