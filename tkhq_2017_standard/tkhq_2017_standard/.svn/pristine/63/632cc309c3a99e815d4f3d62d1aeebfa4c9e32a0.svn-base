package com.tkhq.cmc.controller.rest;

import java.util.ArrayList;
//import java.util.Hashtable;
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
import com.tkhq.cmc.common.PagerInfo;
import com.tkhq.cmc.dto.TBS_cuakhaunn_vnaccsDTO;
//import com.tkhq.cmc.dto.Tbs_BieuThueDTO;
import com.tkhq.cmc.model.TBS_cuakhaunn_vnaccs;
//import com.tkhq.cmc.model.Tbs_BieuThue;
import com.tkhq.cmc.services.TBS_cuakhaunn_vnaccsService;
//import com.tkhq.cmc.utils.Utils;

@RestController
public class TBS_cuakhaunn_vnaccsRestController {
	@Autowired
	TBS_cuakhaunn_vnaccsService tbs_cuakhaunn_vnaccsService;
	
	@RequestMapping(value="/tbs_cuakhaunn_vnaccs/",method=RequestMethod.GET)
	public ResponseEntity<List<TBS_cuakhaunn_vnaccs>> getAllcuakhaunnVnaccs(){
		System.out.println("getAllcuakhaunnVnaccs");
		List<TBS_cuakhaunn_vnaccs> listCuaKhauNN = new ArrayList<TBS_cuakhaunn_vnaccs>();
		System.out.println("Find all");
		listCuaKhauNN = tbs_cuakhaunn_vnaccsService.findAll();
        if (listCuaKhauNN == null) {
            System.out.println("Khong tim duoc ban ghi nao!");
            return new ResponseEntity<List<TBS_cuakhaunn_vnaccs>>(HttpStatus.NOT_FOUND);
        }
		
		return new ResponseEntity<List<TBS_cuakhaunn_vnaccs>>(listCuaKhauNN,HttpStatus.ACCEPTED);
	}
	
	@RequestMapping(value = "/tbs_cuakhaunn_vnaccs/", method = RequestMethod.POST)
    public ResponseEntity<Void> createCuaKhauNN(@RequestBody TBS_cuakhaunn_vnaccsDTO tbs_cuakhaunn_vnaccsDTO,
    		UriComponentsBuilder ucBuilder) {
        System.out.println("Creating data with MaCang:" + tbs_cuakhaunn_vnaccsDTO.getMaCang());
 
        if (tbs_cuakhaunn_vnaccsService.findById(tbs_cuakhaunn_vnaccsDTO.getMaCang()) != null) {
            System.out.println("maCang da ton tai!");
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
        
        TBS_cuakhaunn_vnaccs entity = new TBS_cuakhaunn_vnaccs();
        
        try{	        
	        entity.setMaCang(tbs_cuakhaunn_vnaccsDTO.getMaCang());
	        entity.setMaNuoc(tbs_cuakhaunn_vnaccsDTO.getMaNuoc());
	        entity.setTenNuoc(tbs_cuakhaunn_vnaccsDTO.getTenNuoc());
	        entity.setTenTP(tbs_cuakhaunn_vnaccsDTO.getTenTP());
	        entity.setLoaiCang(tbs_cuakhaunn_vnaccsDTO.getLoaiCang());
	        
	        tbs_cuakhaunn_vnaccsService.insertTbs_Cuakhaunn(entity);
        }catch(Exception ex){
        	ex.printStackTrace();
        }
 
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/tbs_cuakhaunn_vnaccs/{maCang}").buildAndExpand(entity.getMaCang()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
	
	@RequestMapping(value = "/tbs_cuakhaunn_vnaccs/{maCang}", method = RequestMethod.PUT)
    public ResponseEntity<TBS_cuakhaunn_vnaccs> updateCuaKhauNN(@PathVariable("maCang") String maCang, @RequestBody TBS_cuakhaunn_vnaccsDTO tbs_cuakhaunn_vnaccsDTO) {
        System.out.println("Updating data with maCang:" + maCang);
         
        TBS_cuakhaunn_vnaccs tbs_cuakhaunn_vnaccs = tbs_cuakhaunn_vnaccsService.findById(maCang);
         
        if (tbs_cuakhaunn_vnaccs == null) {
            System.out.println("Data not found");
            return new ResponseEntity<TBS_cuakhaunn_vnaccs>(HttpStatus.NOT_FOUND);
        }
 
        try{
        	tbs_cuakhaunn_vnaccs.setMaCang(tbs_cuakhaunn_vnaccsDTO.getMaCang());
        	tbs_cuakhaunn_vnaccs.setMaNuoc(tbs_cuakhaunn_vnaccsDTO.getMaNuoc());
        	tbs_cuakhaunn_vnaccs.setTenNuoc(tbs_cuakhaunn_vnaccsDTO.getTenNuoc());
        	tbs_cuakhaunn_vnaccs.setTenTP(tbs_cuakhaunn_vnaccsDTO.getTenTP());
        	tbs_cuakhaunn_vnaccs.setLoaiCang(tbs_cuakhaunn_vnaccsDTO.getLoaiCang());
        	tbs_cuakhaunn_vnaccsService.updateTbs_cuakhaunn(tbs_cuakhaunn_vnaccs);
        }catch(Exception ex){
        	ex.printStackTrace();
        }
        return new ResponseEntity<TBS_cuakhaunn_vnaccs>(tbs_cuakhaunn_vnaccs, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/tbs_cuakhaunn_vnaccs/", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TBS_cuakhaunn_vnaccs> deleteCuaKhauNN(@RequestParam(value = "lstCuaKhauNN") String lstCuaKhauNN) {
    	
    	ObjectMapper objectMapper = new ObjectMapper();
    	List<String> lstMaCang = new ArrayList<String>();
    	
    	try{
    		lstMaCang = objectMapper.readValue(
    				lstCuaKhauNN, objectMapper.getTypeFactory().constructCollectionType(List.class, String.class));
    	}catch(Exception ex){
    		ex.printStackTrace();
    	}
    	
        System.out.println("Deleting data: " + lstMaCang);
        
        for(int i = 0; i < lstMaCang.size(); i++){
        	TBS_cuakhaunn_vnaccs tbs_cuakhaunn_vnaccs = tbs_cuakhaunn_vnaccsService.findById(lstMaCang.get(i));
	        if (tbs_cuakhaunn_vnaccs == null) {
	            System.out.println("Unable to delete. Data not found with maCang: " + lstMaCang.get(i));
	            return new ResponseEntity<TBS_cuakhaunn_vnaccs>(HttpStatus.NOT_FOUND);
	        }
        }
        
        for(int i = 0; i < lstMaCang.size(); i++){
	        try{
	        	tbs_cuakhaunn_vnaccsService.deleteByMaCang(lstMaCang.get(i));
	        }catch(Exception ex){
	        	ex.printStackTrace();
	        }
        }
        return new ResponseEntity<TBS_cuakhaunn_vnaccs>(HttpStatus.NO_CONTENT);
    }
    
    @RequestMapping(value = "/tbs_cuakhaunn_vnaccs/search", method = RequestMethod.POST,
    		produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TBS_cuakhaunn_vnaccsDTO> schCuaKhauNN(@RequestBody TBS_cuakhaunn_vnaccsDTO params) {
    	
    	System.out.println("schCuaKhauNN START@params:"+ params);
    	TBS_cuakhaunn_vnaccsDTO resultPage = new TBS_cuakhaunn_vnaccsDTO();
    	
    	String maCang = params.getMaCang();
    	String loaiCang = params.getLoaiCang();
    	String tenNuoc = params.getTenNuoc();
    	String tenTP = params.getTenTP();
    	String maNuoc = params.getMaNuoc();
    	String currentPage = params.getCurrentPage();
    	String pageSize = params.getPageSize();    	
    	
    	int minRow = (Integer.valueOf(currentPage) - 1) * Integer.valueOf(pageSize);    	
    	int maxRow = Integer.valueOf(pageSize);    	
    	long totalCount = tbs_cuakhaunn_vnaccsService.countTotal(maCang, loaiCang, tenNuoc, tenTP, maNuoc);    	
    	if(totalCount == 0){
    		System.out.println("Khong tim duoc ban ghi nao!");
    		resultPage.setLstCuaKhauNN(null);
        	resultPage.setCurrentPage("1");
        	resultPage.setPageSize("10");
        	resultPage.setTotalCount(0);
        	resultPage.setMaxPage(0);
        	        	        	
        	return new ResponseEntity<TBS_cuakhaunn_vnaccsDTO>(resultPage,HttpStatus.ACCEPTED);    		    		
//            return new ResponseEntity<TBS_cuakhaunn_vnaccsDTO>(HttpStatus.NOT_FOUND);
    	}    	
    	List<TBS_cuakhaunn_vnaccs> listCuaKhauNN = tbs_cuakhaunn_vnaccsService.searchCuaKhauNN(maCang, loaiCang, tenNuoc, 
    			tenTP, maNuoc, minRow, maxRow);    
    	
//    	if(listCuaKhauNN == null){
//    		System.out.println("Khong tim duoc ban ghi nao!");
//            return new ResponseEntity<TBS_cuakhaunn_vnaccsDTO>(HttpStatus.NOT_FOUND);
//    	}
    	
    	int maxPage = (int) Math.ceil(totalCount / Integer.valueOf(pageSize));
    	
    	resultPage.setLstCuaKhauNN(listCuaKhauNN);
    	resultPage.setCurrentPage(currentPage);
    	resultPage.setPageSize(pageSize);
    	resultPage.setTotalCount(totalCount);
    	resultPage.setMaxPage(maxPage);
    	
    	System.out.println("schCuaKhauNN END@resultPage:"+resultPage);
    	
    	return new ResponseEntity<TBS_cuakhaunn_vnaccsDTO>(resultPage,HttpStatus.ACCEPTED);
    }
    
    
//    @RequestMapping(value = "/tbs_cuakhaunn_vnaccs/search", method = RequestMethod.POST,
//    		produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<List<TBS_cuakhaunn_vnaccs>> schCuaKhauNN(@RequestBody TBS_cuakhaunn_vnaccsDTO params) {
//    	
//    	System.out.println("schCuaKhauNN START");
//    	
//    	String maCang = params.getMaCang();
//    	String loaiCang = params.getLoaiCang();
//    	String tenNuoc = params.getTenNuoc();
//    	String tenTP = params.getTenTP();
//    	String maNuoc = params.getMaNuoc();
//    	System.out.println("schCuaKhauNN@maCang:"+maCang+"|loaiCang:"+loaiCang+"|tenNuoc:"+tenNuoc
//    			+"|tenTP:"+tenTP+"|maNuoc:"+maNuoc);
//    	
//    	List<TBS_cuakhaunn_vnaccs> listCuaKhauNN = tbs_cuakhaunn_vnaccsService.searchCuaKhauNN(maCang, loaiCang, tenNuoc, tenTP, maNuoc);
//    	
//    	if(listCuaKhauNN == null){
//    		System.out.println("Khong tim duoc ban ghi nao!");
//            return new ResponseEntity<List<TBS_cuakhaunn_vnaccs>>(HttpStatus.NOT_FOUND);
//    	}
//    	return new ResponseEntity<List<TBS_cuakhaunn_vnaccs>>(listCuaKhauNN,HttpStatus.ACCEPTED);
//    }

}
