package com.tkhq.cmc.controller.rest;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

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
import com.tkhq.cmc.common.Constants;
import com.tkhq.cmc.common.PagerInfo;
import com.tkhq.cmc.dto.Tbs_BieuThueDTO;
import com.tkhq.cmc.dto.Tbs_DvtDTO;
import com.tkhq.cmc.dto.Tbs_TinhTPDTO;
import com.tkhq.cmc.model.Tbs_BieuThue;
import com.tkhq.cmc.model.Tbs_Dvt;
import com.tkhq.cmc.model.Tbs_TinhTP;
import com.tkhq.cmc.services.TBS_BieuThueService;
import com.tkhq.cmc.services.TBS_DVTService;
import com.tkhq.cmc.services.TBS_TinhTPService;
import com.tkhq.cmc.utils.Utils;


@RestController
public class DanhMucRestController {
	@Autowired
	TBS_BieuThueService tbs_bieuThueService;
	
	@Autowired
	TBS_TinhTPService tbs_tinhTPService;
	
	@Autowired
	TBS_DVTService tbs_dvtService;
	
	@RequestMapping(value="/tbs_bieuthue/",method=RequestMethod.GET)
	public ResponseEntity<List<Tbs_BieuThue>> getAllBieuThue(){
		List<Tbs_BieuThue> listBieuThue = new ArrayList<Tbs_BieuThue>();
		System.out.println("Find all");
		listBieuThue = tbs_bieuThueService.findAll();
        if (listBieuThue == null) {
            System.out.println("Khong tim duoc ban ghi nao!");
            return new ResponseEntity<List<Tbs_BieuThue>>(HttpStatus.NOT_FOUND);
        }
		
		return new ResponseEntity<List<Tbs_BieuThue>>(listBieuThue,HttpStatus.ACCEPTED);
	}
	
	@RequestMapping(value = "/tbs_bieuthue/", method = RequestMethod.POST)
    public ResponseEntity<String> createBieuThue(@RequestBody Tbs_BieuThueDTO tbsBieuThueDto,
    		UriComponentsBuilder ucBuilder) {
        System.out.println("Creating data with id:" + tbsBieuThueDto.getBieuThueId());
        //String message = "";
 
        if (tbs_bieuThueService.findById(tbsBieuThueDto.getBieuThueId()) != null) {
            return new ResponseEntity<String>(HttpStatus.CONFLICT);
        }
        
        Tbs_BieuThue entity = new Tbs_BieuThue();
        
        try{
	        //entity.setBieuThueId(tbsBieuThueDto.getBieuThueId());
	        entity.setMaBieuThue(tbsBieuThueDto.getMaBieuThue());
	        entity.setTenBieuThue(tbsBieuThueDto.getTenBieuThue());
	        entity.setThueSuat(tbsBieuThueDto.getThueSuat());
	        entity.setKieuBieuThue(tbsBieuThueDto.getKieuBieuThue());
	        entity.setMaHS(tbsBieuThueDto.getMaHS());
	        //entity.setNgayHL(Utils.getSqlDate(Utils.convertStringtoDate(tbsBieuThueDto.getNgayHL(), null)));
	        entity.setNgayHL(Utils.getSqlDate(Utils.convertStringtoDate(tbsBieuThueDto.getNgayHL(), Constants.DATE_FORMAT_2)));
	        //entity.setNgayHHL(Utils.getSqlDate(Utils.convertStringtoDate(tbsBieuThueDto.getNgayHHL(), null)));
	        entity.setNgayHHL(Utils.getSqlDate(Utils.convertStringtoDate(tbsBieuThueDto.getNgayHHL(), Constants.DATE_FORMAT_2)));
        
	        tbs_bieuThueService.insertTbs_BieuThue(entity);
        }catch(Exception ex){
        	ex.printStackTrace();
        }
 
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/tbs_bieuthue/{maBieuThue}").buildAndExpand(entity.getMaBieuThue()).toUri());
        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
    }
	
	@RequestMapping(value = "/tbs_bieuthue/{bieuThueId}", method = RequestMethod.PUT)
    public ResponseEntity<Tbs_BieuThue> updateBieuThue(@PathVariable("bieuThueId") Integer bieuThueId, @RequestBody Tbs_BieuThueDTO tbsBieuThueDto) {
        System.out.println("Updating data with id:" + bieuThueId);
         
        Tbs_BieuThue tbsBieuThue = tbs_bieuThueService.findById(bieuThueId);
         
        if (tbsBieuThue == null) {
            System.out.println("Data not found");
            return new ResponseEntity<Tbs_BieuThue>(HttpStatus.NOT_FOUND);
        }
 
        try{
	        tbsBieuThue.setMaBieuThue(tbsBieuThueDto.getMaBieuThue());
	        tbsBieuThue.setTenBieuThue(tbsBieuThueDto.getTenBieuThue());
	        tbsBieuThue.setThueSuat(tbsBieuThueDto.getThueSuat());
	        tbsBieuThue.setKieuBieuThue(tbsBieuThueDto.getKieuBieuThue());
	        tbsBieuThue.setMaHS(tbsBieuThueDto.getMaHS());
	        //tbsBieuThue.setNgayHL(Utils.getSqlDate(Utils.convertStringtoDate(tbsBieuThueDto.getNgayHL(), null)));
	        tbsBieuThue.setNgayHL(Utils.getSqlDate(Utils.convertStringtoDate(tbsBieuThueDto.getNgayHL(), Constants.DATE_FORMAT_2)));
	        //tbsBieuThue.setNgayHHL(Utils.getSqlDate(Utils.convertStringtoDate(tbsBieuThueDto.getNgayHHL(), null)));
	        tbsBieuThue.setNgayHHL(Utils.getSqlDate(Utils.convertStringtoDate(tbsBieuThueDto.getNgayHHL(), Constants.DATE_FORMAT_2)));
	        tbs_bieuThueService.updateTbs_BieuThue(tbsBieuThue);
        }catch(Exception ex){
        	ex.printStackTrace();
        }
        return new ResponseEntity<Tbs_BieuThue>(tbsBieuThue, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/tbs_bieuthue/", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Tbs_BieuThue> deleteBieuThue(@RequestParam(value = "lstBieuThue") String lstBieuThue) {
    	
    	ObjectMapper objectMapper = new ObjectMapper();
    	List<String> lstId = new ArrayList<String>();
    	
    	try{
    		lstId = objectMapper.readValue(
    			lstBieuThue, objectMapper.getTypeFactory().constructCollectionType(List.class, String.class));
    	}catch(Exception ex){
    		ex.printStackTrace();
    	}
    	
        System.out.println("Deleting data: " + lstId);
        
        for(int i = 0; i < lstId.size(); i++){
	        Tbs_BieuThue tbsBieuThue = tbs_bieuThueService.findById(Integer.valueOf(lstId.get(i)));
	        if (tbsBieuThue == null) {
	            System.out.println("Unable to delete. Data not found with id: " + lstId.get(i));
	            return new ResponseEntity<Tbs_BieuThue>(HttpStatus.NOT_FOUND);
	        }
        }
        
        for(int i = 0; i < lstId.size(); i++){
	        try{
	        	tbs_bieuThueService.deleteById(Integer.valueOf(lstId.get(i)));
	        }catch(Exception ex){
	        	ex.printStackTrace();
	        }
        }
        return new ResponseEntity<Tbs_BieuThue>(HttpStatus.NO_CONTENT);
    }
    
//    /**
//     * Map request body to object
//     ***/  
//    @RequestMapping(value = "/tbs_bieuthue/search", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<List<Tbs_BieuThue>> schBieuThue(@RequestBody Tbs_BieuThueDTO params) {
//    	
//    	String maBieuThue = params.getMaBieuThue();
//    	String tenBieuThue = params.getTenBieuThue();
//    	String maHS = params.getMaHS();
//    	
//    	List<Tbs_BieuThue> listBieuThue = tbs_bieuthueService.searchBieuThue(maBieuThue, tenBieuThue, maHS);
//    	
//    	if(listBieuThue == null){
//    		System.out.println("Khong tim duoc ban ghi nao!");
//            return new ResponseEntity<List<Tbs_BieuThue>>(HttpStatus.NOT_FOUND);
//    	}
//    	return new ResponseEntity<List<Tbs_BieuThue>>(listBieuThue,HttpStatus.ACCEPTED);
//    }
    
    /**
     * Map request body to map
     ***/
    @RequestMapping(value = "/tbs_bieuthue/search", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PagerInfo> schBieuThue(@RequestBody Hashtable<String, String> params) {
    	System.out.println("Params: " + params);
    	
    	List<Tbs_BieuThue> listBieuThue = new ArrayList<Tbs_BieuThue>();
    	PagerInfo pager = new PagerInfo();
    	
    	String currentPage = params.get("currentPage");
    	String pageSize = params.get("pageSize");
    	String maBieuThue = params.get("maBieuThue");
    	String tenBieuThue = params.get("tenBieuThue");
    	String maHS = params.get("maHS");
    	
    	try{
	    	int minRow = (Integer.valueOf(currentPage) - 1) * Integer.valueOf(pageSize);
	    	//int maxRow = (Integer.valueOf(currentPage) + 1) * Integer.valueOf(pageSize);
	    	int maxRow = Integer.valueOf(pageSize);
	    	
	    	long totalCount = tbs_bieuThueService.countTotal(maBieuThue, tenBieuThue, maHS);
	    	
	    	if(totalCount == 0){
	    		System.out.println("Khong tim duoc ban ghi nao!");
	            return new ResponseEntity<PagerInfo>(HttpStatus.NOT_FOUND);
	    	}
	    	
	    	listBieuThue = tbs_bieuThueService.searchBieuThue(maBieuThue, tenBieuThue, maHS, minRow, maxRow);
	    	
	    	int maxPage = (int) Math.ceil(totalCount / Integer.valueOf(pageSize));
	    	
	    	pager.setContent(listBieuThue);
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
    
    @RequestMapping(value = "/tbs_tinhtp/", method = RequestMethod.POST)
    public ResponseEntity<String> createTinhTP(@RequestBody Tbs_TinhTPDTO tbsTinhTPDto,
    		UriComponentsBuilder ucBuilder) {
        //String message = "";
 
        if (tbs_tinhTPService.findById(tbsTinhTPDto.getMaTinhTP()) != null) {
            return new ResponseEntity<String>(HttpStatus.CONFLICT);
        }
        
        Tbs_TinhTP entity = new Tbs_TinhTP();
        
        try{
        	long maxId = tbs_tinhTPService.getSequence();
        	
	        entity.setMaTinhTP(String.valueOf(maxId + 1));
	        entity.setTenTinhTP(tbsTinhTPDto.getTenTinhTP());
        
	        tbs_tinhTPService.insertTbs_TinhTP(entity);
        }catch(Exception ex){
        	ex.printStackTrace();
        }
 
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/tbs_tinhtp/{maTinhTP}").buildAndExpand(entity.getMaTinhTP()).toUri());
        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
    }
    
    @RequestMapping(value = "/tbs_tinhtp/{maTinhTP}", method = RequestMethod.PUT)
    public ResponseEntity<Tbs_TinhTP> updateTinhTP(@PathVariable("maTinhTP") String maTinhTP, @RequestBody Tbs_TinhTPDTO tbsTinhTPDto) {
         
    	Tbs_TinhTP tbsTinhTP = tbs_tinhTPService.findById(maTinhTP);
         
        if (tbsTinhTP == null) {
            return new ResponseEntity<Tbs_TinhTP>(HttpStatus.NOT_FOUND);
        }
 
        try{
        	tbsTinhTP.setMaTinhTP(tbsTinhTPDto.getMaTinhTP());
        	tbsTinhTP.setTenTinhTP(tbsTinhTPDto.getTenTinhTP());
        	
        	tbs_tinhTPService.updateTbs_TinhTP(tbsTinhTP);
        }catch(Exception ex){
        	ex.printStackTrace();
        }
        
        return new ResponseEntity<Tbs_TinhTP>(tbsTinhTP, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/tbs_tinhtp/", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Tbs_TinhTP> deleteTinhTP(@RequestParam(value = "lstTinhTP") String lstTinhTP) {
    	
    	ObjectMapper objectMapper = new ObjectMapper();
    	List<String> lstId = new ArrayList<String>();
    	
    	try{
    		lstId = objectMapper.readValue(
    				lstTinhTP, objectMapper.getTypeFactory().constructCollectionType(List.class, String.class));
    	}catch(Exception ex){
    		ex.printStackTrace();
    	}
        
        for(int i = 0; i < lstId.size(); i++){
        	Tbs_TinhTP tbsTinhTP = tbs_tinhTPService.findById(lstId.get(i));
	        if (tbsTinhTP == null) {
	            return new ResponseEntity<Tbs_TinhTP>(HttpStatus.NOT_FOUND);
	        }
        }
        
        for(int i = 0; i < lstId.size(); i++){
	        try{
	        	tbs_tinhTPService.deleteById(lstId.get(i));
	        }catch(Exception ex){
	        	ex.printStackTrace();
	        }
        }
        
        return new ResponseEntity<Tbs_TinhTP>(HttpStatus.NO_CONTENT);
    }
    
    @RequestMapping(value = "/tbs_tinhtp/search", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PagerInfo> searchTinhTP(@RequestBody Hashtable<String, String> params) {
    	
    	List<Tbs_TinhTP> listTinhTP = new ArrayList<Tbs_TinhTP>();
    	PagerInfo pager = new PagerInfo();
    	
    	String currentPage = params.get("currentPage");
    	String pageSize = params.get("pageSize");
    	String maTinhTP = params.get("maTinhTP");
    	String tenTinhTP = params.get("tenTinhTP");
    	
    	try{
	    	int firstRow = (Integer.valueOf(currentPage) - 1) * Integer.valueOf(pageSize);
	    	int maxRow = Integer.valueOf(pageSize);
	    	
	    	long totalCount = tbs_tinhTPService.countTotal(maTinhTP, tenTinhTP);
	    	
	    	if(totalCount == 0){
	            return new ResponseEntity<PagerInfo>(HttpStatus.NOT_FOUND);
	    	}
	    	
	    	listTinhTP = tbs_tinhTPService.findByName(maTinhTP, tenTinhTP, firstRow, maxRow);
	    	
	    	int maxPage = (int) Math.ceil(totalCount / Integer.valueOf(pageSize));
	    	
	    	pager.setContent(listTinhTP);
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
    
    @RequestMapping(value = "/tbs_dvt/", method = RequestMethod.POST)
    public ResponseEntity<String> createDVT(@RequestBody Tbs_DvtDTO tbsDvtDto,
    		UriComponentsBuilder ucBuilder) {
 
        if (tbs_dvtService.findById(tbsDvtDto.getMaDvt()) != null) {
            return new ResponseEntity<String>(HttpStatus.CONFLICT);
        }
        
        Tbs_Dvt entity = new Tbs_Dvt();
        
        try{
        	long maxId = tbs_dvtService.getSequence();
        	
	        entity.setMaDvt(String.valueOf(maxId + 1));
	        entity.setTenDvt(tbsDvtDto.getTenDvt());
	        entity.setMaStd(tbsDvtDto.getMaStd());
	        entity.setTlQuydoi(tbsDvtDto.getTlQuydoi());
        
	        tbs_dvtService.insertTBS_DVT(entity);
        }catch(Exception ex){
        	ex.printStackTrace();
        }
 
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/tbs_dvt/{maDvt}").buildAndExpand(entity.getMaDvt()).toUri());
        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
    }
    
    @RequestMapping(value = "/tbs_dvt/{maDvt}", method = RequestMethod.PUT)
    public ResponseEntity<Tbs_Dvt> updateDVT(@PathVariable("maDvt") String maDvt, @RequestBody Tbs_DvtDTO tbsDvtDto) {
         
    	Tbs_Dvt entity = tbs_dvtService.findById(maDvt);
         
        if (entity == null) {
            return new ResponseEntity<Tbs_Dvt>(HttpStatus.NOT_FOUND);
        }
 
        try{
        	entity.setMaDvt(tbsDvtDto.getMaDvt());
        	entity.setMaStd(tbsDvtDto.getMaStd());
        	entity.setTenDvt(tbsDvtDto.getTenDvt());
        	entity.setTlQuydoi(tbsDvtDto.getTlQuydoi());
        	
        	tbs_dvtService.updateTBS_DVT(entity);
        }catch(Exception ex){
        	ex.printStackTrace();
        }
        
        return new ResponseEntity<Tbs_Dvt>(entity, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/tbs_dvt/", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Tbs_Dvt> deleteDVT(@RequestParam(value = "lstDVT") String lstDVT) {
    	
    	ObjectMapper objectMapper = new ObjectMapper();
    	List<String> lstId = new ArrayList<String>();
    	
    	try{
    		lstId = objectMapper.readValue(
    				lstDVT, objectMapper.getTypeFactory().constructCollectionType(List.class, String.class));
    	}catch(Exception ex){
    		ex.printStackTrace();
    	}
        
        for(int i = 0; i < lstId.size(); i++){
        	Tbs_Dvt entity = tbs_dvtService.findById(lstId.get(i));
	        if (entity == null) {
	            return new ResponseEntity<Tbs_Dvt>(HttpStatus.NOT_FOUND);
	        }
        }
        
        for(int i = 0; i < lstId.size(); i++){
	        try{
	        	tbs_dvtService.deleteById(lstId.get(i));
	        }catch(Exception ex){
	        	ex.printStackTrace();
	        }
        }
        
        return new ResponseEntity<Tbs_Dvt>(HttpStatus.NO_CONTENT);
    }
    
    @RequestMapping(value = "/tbs_dvt/search", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PagerInfo> searchDVT(@RequestBody Hashtable<String, String> params) {
    	
    	List<Tbs_Dvt> listDVT = new ArrayList<Tbs_Dvt>();
    	PagerInfo pager = new PagerInfo();
    	
    	String currentPage = params.get("currentPage");
    	String pageSize = params.get("pageSize");
    	String maDvt = params.get("maDvt");
    	String tenDvt = params.get("tenDvt");
    	
    	try{
	    	int firstRow = (Integer.valueOf(currentPage) - 1) * Integer.valueOf(pageSize);
	    	int maxRow = Integer.valueOf(pageSize);
	    	
	    	long totalCount = tbs_dvtService.countTotal(maDvt, tenDvt);
	    	
	    	if(totalCount == 0){
	            return new ResponseEntity<PagerInfo>(HttpStatus.NOT_FOUND);
	    	}
	    	
	    	listDVT = tbs_dvtService.search(maDvt, tenDvt, firstRow, maxRow);
	    	
	    	int maxPage = (int) Math.ceil(totalCount / Integer.valueOf(pageSize));
	    	
	    	pager.setContent(listDVT);
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
}
