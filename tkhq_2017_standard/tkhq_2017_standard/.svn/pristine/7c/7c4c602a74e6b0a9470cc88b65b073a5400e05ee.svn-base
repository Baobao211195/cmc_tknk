package com.tkhq.cmc.controller.rest;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tkhq.cmc.common.CExcel;
import com.tkhq.cmc.common.PagerInfo;
import com.tkhq.cmc.dto.Tbd_Sys_ResourceDTO;
import com.tkhq.cmc.model.TbdSysUsers;
import com.tkhq.cmc.model.Tbd_Sys_Resource;
import com.tkhq.cmc.services.Tbd_Sys_ResourceService;
import com.tkhq.cmc.utils.Utils;

@RestController
public class QLUserSDTKRestController {
	@Autowired
	Tbd_Sys_ResourceService tbdSysResourceService;
	
	@RequestMapping(value = "/qluser_sdtk/", method = RequestMethod.POST)
    public ResponseEntity<String> createTbdSysResource(@RequestBody Tbd_Sys_ResourceDTO tbdSysResourceDto,
    		UriComponentsBuilder ucBuilder) {
 
        if (tbdSysResourceService.findById(tbdSysResourceDto.getResourceId()) != null) {
            return new ResponseEntity<String>(HttpStatus.CONFLICT);
        }
        
        Tbd_Sys_Resource entity = new Tbd_Sys_Resource();
        
        try{
        	Utils.copyProperties(entity, tbdSysResourceDto, false);
        	entity.setResourceId(null);
        	entity.setTbdSysUser(new TbdSysUsers(Integer.valueOf(tbdSysResourceDto.getUserQL())));
        
	        tbdSysResourceService.insertTbdSysResource(entity);
        }catch(Exception ex){
        	ex.printStackTrace();
        	return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
 
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/qluser_sdtk/{resourceId}").buildAndExpand(entity.getResourceId()).toUri());
        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
    }
    
    @RequestMapping(value = "/qluser_sdtk/{resourceId}", method = RequestMethod.PUT)
    public ResponseEntity<Tbd_Sys_Resource> updateTbdSysResource(@PathVariable("resourceId") Integer resourceId,
    		@RequestBody(required=false) Tbd_Sys_ResourceDTO tbdSysResourceDto) {
         
    	Tbd_Sys_Resource foundEntity = tbdSysResourceService.findById(resourceId);
         
        if (foundEntity == null) {
            return new ResponseEntity<Tbd_Sys_Resource>(HttpStatus.NOT_FOUND);
        }
 
        try{
        	Utils.copyProperties(foundEntity, tbdSysResourceDto, false);
        	
        	tbdSysResourceService.updateTbdSysResource(foundEntity);
        }catch(Exception ex){
        	ex.printStackTrace();
        	return new ResponseEntity<Tbd_Sys_Resource>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
        return new ResponseEntity<Tbd_Sys_Resource>(foundEntity, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/qluser_sdtk/", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Tbd_Sys_Resource> deleteTbdSysResource(@RequestParam(value = "lstUserSDTK") String lstUserSDTK) {
    	
    	ObjectMapper objectMapper = new ObjectMapper();
    	List<String> lstId = new ArrayList<String>();
    	
    	try{
    		lstId = objectMapper.readValue(
    				lstUserSDTK, objectMapper.getTypeFactory().constructCollectionType(List.class, String.class));
    	}catch(Exception ex){
    		ex.printStackTrace();
    		return new ResponseEntity<Tbd_Sys_Resource>(HttpStatus.INTERNAL_SERVER_ERROR);
    	}
        
        for(int i = 0; i < lstId.size(); i++){
        	Tbd_Sys_Resource tbsTinhTP = tbdSysResourceService.findById(Integer.valueOf(lstId.get(i)));
	        if (tbsTinhTP == null) {
	            return new ResponseEntity<Tbd_Sys_Resource>(HttpStatus.NOT_FOUND);
	        }
        }
        
        for(int i = 0; i < lstId.size(); i++){
	        try{
	        	tbdSysResourceService.deleteById(Integer.valueOf(lstId.get(i)));
	        }catch(Exception ex){
	        	ex.printStackTrace();
	        	return new ResponseEntity<Tbd_Sys_Resource>(HttpStatus.INTERNAL_SERVER_ERROR);
	        }
        }
        
        return new ResponseEntity<Tbd_Sys_Resource>(HttpStatus.NO_CONTENT);
    }
    
    @RequestMapping(value = "/qluser_sdtk/search", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PagerInfo> search(@RequestBody Hashtable<String, String> params) {
    	
    	List<Tbd_Sys_Resource> lstTbdSysResource = new ArrayList<Tbd_Sys_Resource>();
    	PagerInfo pager = new PagerInfo();
    	Tbd_Sys_ResourceDTO dto = new Tbd_Sys_ResourceDTO();
    	List<Tbd_Sys_ResourceDTO> lstResults = new ArrayList<Tbd_Sys_ResourceDTO>();
    	
    	String currentPage = params.get("currentPage");
    	String pageSize = params.get("pageSize");
    	
    	try{
	    	int firstRow = (Integer.valueOf(currentPage) - 1) * Integer.valueOf(pageSize);
	    	int maxRow = Integer.valueOf(pageSize);
	    	
	    	long totalCount = tbdSysResourceService.countTotal();
	    	
	    	if(totalCount == 0){
	            return new ResponseEntity<PagerInfo>(HttpStatus.NOT_FOUND);
	    	}
	    	
	    	lstTbdSysResource = tbdSysResourceService.search(firstRow, maxRow);
	    	
	    	for(Tbd_Sys_Resource entity : lstTbdSysResource){
	    		dto = new Tbd_Sys_ResourceDTO();
	    		Utils.copyProperties(dto, entity, false);
	    		dto.setUserName(entity.getTbdSysUser().getUsername());
	    		dto.setUserQL(String.valueOf(entity.getTbdSysUser().getUserId()));
	    		
	    		lstResults.add(dto);
	    	}
	    	
	    	int maxPage = (int) Math.ceil(totalCount / Integer.valueOf(pageSize));
	    	
	    	pager.setContent(lstResults);
	    	pager.setCurrentPage(Integer.valueOf(currentPage));
	    	pager.setMaxPage(maxPage);
	    	pager.setPageSize(Integer.valueOf(pageSize));
	    	pager.setTotalItems(totalCount);
    	}catch(Exception ex){
    		ex.printStackTrace();
    		return new ResponseEntity<PagerInfo>(pager,HttpStatus.INTERNAL_SERVER_ERROR);
    	}   	
    	
    	return new ResponseEntity<PagerInfo>(pager,HttpStatus.ACCEPTED);
    }
    
    @RequestMapping(value = "/qluser_sdtk/getLstUser", method = RequestMethod.GET)
    public ResponseEntity<List<TbdSysUsers>> getLstUser() {
    	List<TbdSysUsers> lstUser = new ArrayList<TbdSysUsers>();
    	try{
    		lstUser = tbdSysResourceService.getLstUser();
    	}catch(Exception ex){
    		ex.printStackTrace();
    		return new ResponseEntity<List<TbdSysUsers>>(lstUser,HttpStatus.INTERNAL_SERVER_ERROR);
    	}   	
    	
    	return new ResponseEntity<List<TbdSysUsers>>(lstUser,HttpStatus.ACCEPTED);
    }
    
    @RequestMapping(value = "/qluser_sdtk/doExport", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void doExport(@RequestBody Hashtable<String, String> params, HttpServletResponse response) {		
		List<Tbd_Sys_ResourceDTO> list = new ArrayList<Tbd_Sys_ResourceDTO>();
		List<Tbd_Sys_Resource> lstTbdSysResource = new ArrayList<Tbd_Sys_Resource>();
		Tbd_Sys_ResourceDTO dto = new Tbd_Sys_ResourceDTO();
		
		int totalFields = dto.getClass().getDeclaredFields().length;
		
		String currentDate = Utils.getCurrentDate();
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		String excelDir = loader.getResource("ExcelTemplates/").getPath();
		String excelFilePath = excelDir + "\\QLUserSDSPTK.xls";
		String fileName = String.format("Quản lý cá nhân, tổ chức sử dụng sản phẩm thống kê_%s.xls", currentDate);
		
		try{
			int firstRow = (Integer.valueOf(Integer.valueOf(params.get("currentPage"))) - 1) * Integer.valueOf(Integer.valueOf(params.get("pageSize")));
	    	int maxRow = Integer.valueOf(Integer.valueOf(params.get("pageSize")));
			lstTbdSysResource = tbdSysResourceService.search(firstRow, maxRow);
			
			for(Tbd_Sys_Resource entity : lstTbdSysResource){
				dto = new Tbd_Sys_ResourceDTO();
	    		Utils.copyProperties(dto, entity, false);
	    		dto.setUserName(entity.getTbdSysUser().getUsername()); 
	    		
	    		list.add(dto);
			}
			
			//Tao luong doc workbook
			InputStream is = new FileInputStream(excelFilePath);
			Workbook workbook = new HSSFWorkbook(is);
			Sheet sheet = workbook.getSheetAt(0);
			Cell cell;	//store value of current cell
			Row row;	//store value of current row
			Map<String, CellStyle> styles = CExcel.createStyles(workbook);
			
			//Integer colNum = 0;	//position of column fill data
			Integer rowNum = 5; //position of row fill data
			
			//Conversion to two dimensional arrays
			String[][] detail = new String[list.size()][totalFields];
			Field[] fields = dto.getClass().getDeclaredFields();
			
			for(Field field : fields){
				field.setAccessible(true);
			}
			for(int i = 0; i < list.size(); i++){
				dto = list.get(i);
				for(int j = 0; j < totalFields; j++){
					if(fields[j].getName() == "resourceId" || fields[j].getName() == "userQL"){
						continue;
					}
					if(fields[j].get(dto) == null){
						detail[i][j] = "";
						continue;
					}
					detail[i][j] = fields[j].get(dto).toString();	
				}
			}
			
			//fill data to cell
			int ignoreCell = 0;
			for(int i = 0; i < list.size(); i++){
				ignoreCell = 0;
				row = sheet.createRow(i + rowNum);
				for(int j = 0; j < totalFields; j++){
					if(j == 0 || j == 11){
						ignoreCell++;
						continue;
					}
					cell = row.createCell(j - ignoreCell);
					cell.setCellValue(detail[i][j]);
					cell.setCellStyle(styles.get("cell_str_center"));
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
