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
import com.tkhq.cmc.common.PagerInfo;
import com.tkhq.cmc.dto.TbsDvtVnaccsDTO;
import com.tkhq.cmc.model.TbsDvtVnaccs;
import com.tkhq.cmc.services.TbsDvtVnaccsService;
import com.tkhq.cmc.utils.Utils;

@RestController
public class TbsDvtVnaccsRestController {
	@Autowired
	TbsDvtVnaccsService tbsDvtVnaccsService;
	
	@RequestMapping(value="/tbsdvtvnaccs/",method=RequestMethod.GET)
	public ResponseEntity<List<TbsDvtVnaccs>> getAllDvtVnaccs(){
		System.out.println("getAllcuakhaunnVnaccs");
		List<TbsDvtVnaccs> listDvtVnaccs = new ArrayList<TbsDvtVnaccs>();
		System.out.println("Find all");
		listDvtVnaccs = tbsDvtVnaccsService.findAll();
        if (listDvtVnaccs == null) {
            System.out.println("Khong tim duoc ban ghi nao!");
            return new ResponseEntity<List<TbsDvtVnaccs>>(HttpStatus.NOT_FOUND);
        }
		
		return new ResponseEntity<List<TbsDvtVnaccs>>(listDvtVnaccs,HttpStatus.ACCEPTED);
	}
	
	@RequestMapping(value = "/tbsdvtvnaccs/", method = RequestMethod.POST)
    public ResponseEntity<Void> createDvtVnaccs(@RequestBody TbsDvtVnaccsDTO tbsDvtVnaccsDTO,
    		UriComponentsBuilder ucBuilder) {
        System.out.println("Creating data with MaDvt:" + tbsDvtVnaccsDTO.getMaDvt());
 
        if (tbsDvtVnaccsService.findById(tbsDvtVnaccsDTO.getMaDvt()) != null) {
            System.out.println("maDvt da ton tai!");
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
        
        TbsDvtVnaccs entity = new TbsDvtVnaccs();
        
        try{	        
	        entity.setMaDvt(tbsDvtVnaccsDTO.getMaDvt());
	        entity.setTenDvt(tbsDvtVnaccsDTO.getTenDvt());
	        entity.setTenDvtv(tbsDvtVnaccsDTO.getTenDvtv());
	        entity.setTenDvtUni(tbsDvtVnaccsDTO.getTenDvtUni());	       
	        
	        tbsDvtVnaccsService.insertTbsDvtVnaccs(entity);
        }catch(Exception ex){
        	ex.printStackTrace();
        }
 
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/tbsdvtvnaccs/{maDvt}").buildAndExpand(entity.getMaDvt()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
	
	@RequestMapping(value = "/tbsdvtvnaccs/{maDvt}", method = RequestMethod.PUT)
    public ResponseEntity<TbsDvtVnaccs> updateDvtVnaccs(@PathVariable("maDvt") String maDvt, @RequestBody TbsDvtVnaccsDTO tbsDvtVnaccsDTO) {
        System.out.println("Updating data with maDvt:" + maDvt);
         
        TbsDvtVnaccs tbsDvtVnaccs = tbsDvtVnaccsService.findById(maDvt);
         
        if (tbsDvtVnaccs == null) {
            System.out.println("Data not found");
            return new ResponseEntity<TbsDvtVnaccs>(HttpStatus.NOT_FOUND);
        }
 
        try{
        	tbsDvtVnaccs.setMaDvt(tbsDvtVnaccsDTO.getMaDvt());
        	tbsDvtVnaccs.setTenDvt(tbsDvtVnaccsDTO.getTenDvt());
        	tbsDvtVnaccs.setTenDvtv(tbsDvtVnaccsDTO.getTenDvtv());
        	tbsDvtVnaccs.setTenDvtUni(tbsDvtVnaccsDTO.getTenDvtUni());        	
        	tbsDvtVnaccsService.updateTbsDvtVnaccs(tbsDvtVnaccs);
        }catch(Exception ex){
        	ex.printStackTrace();
        }
        return new ResponseEntity<TbsDvtVnaccs>(tbsDvtVnaccs, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/tbsdvtvnaccs/", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TbsDvtVnaccs> deleteDvtVnaccs(@RequestParam(value = "lstDvtVnaccs") String lstDvtVnaccs) {
    	
    	ObjectMapper objectMapper = new ObjectMapper();
    	List<String> lstMaDvt = new ArrayList<String>();
    	
    	try{
    		lstMaDvt = objectMapper.readValue(
    				lstDvtVnaccs, objectMapper.getTypeFactory().constructCollectionType(List.class, String.class));
    	}catch(Exception ex){
    		ex.printStackTrace();
    	}
    	
        System.out.println("Deleting data: " + lstMaDvt);
        
        for(int i = 0; i < lstMaDvt.size(); i++){
        	TbsDvtVnaccs tbs_cuakhaunn_vnaccs = tbsDvtVnaccsService.findById(lstMaDvt.get(i));
	        if (tbs_cuakhaunn_vnaccs == null) {
	            System.out.println("Unable to delete. Data not found with maCang: " + lstMaDvt.get(i));
	            return new ResponseEntity<TbsDvtVnaccs>(HttpStatus.NOT_FOUND);
	        }
        }
        
        for(int i = 0; i < lstMaDvt.size(); i++){
	        try{
	        	tbsDvtVnaccsService.deleteByMaDvt(lstMaDvt.get(i));
	        }catch(Exception ex){
	        	ex.printStackTrace();
	        }
        }
        return new ResponseEntity<TbsDvtVnaccs>(HttpStatus.NO_CONTENT);
    }
    
    @RequestMapping(value = "/tbsdvtvnaccs/search", method = RequestMethod.POST,
    		produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TbsDvtVnaccsDTO> schDvtVnaccs(@RequestBody TbsDvtVnaccsDTO params) {
    	
    	System.out.println("schDvtVnaccs START@params:"+ params);
    	TbsDvtVnaccsDTO resultPage = new TbsDvtVnaccsDTO();
    	
    	String maDvt = params.getMaDvt();
    	String tenDvt = params.getTenDvt();
    	String tenDvtv = params.getTenDvtv();
    	String tenDvtUni = params.getTenDvtUni();    	
    	String currentPage = params.getCurrentPage();
    	String pageSize = params.getPageSize();    	
    	
    	int minRow = (Integer.valueOf(currentPage) - 1) * Integer.valueOf(pageSize);    	
    	int maxRow = Integer.valueOf(pageSize);    	
    	long totalCount = tbsDvtVnaccsService.countTotal(maDvt, tenDvt, tenDvtv, tenDvtUni);    	
    	if(totalCount == 0){
    		System.out.println("Khong tim duoc ban ghi nao!");
    		resultPage.setLstDvtVnaccs(null);
        	resultPage.setCurrentPage("1");
        	resultPage.setPageSize("10");
        	resultPage.setTotalCount(0);
        	resultPage.setMaxPage(0);
        	
        	System.out.println("schDvtVnaccs END@resultPage:"+resultPage);
        	
        	return new ResponseEntity<TbsDvtVnaccsDTO>(resultPage,HttpStatus.ACCEPTED);
    		
//            return new ResponseEntity<TbsDvtVnaccsDTO>(HttpStatus.NOT_FOUND);
    	}    	
    	List<TbsDvtVnaccs> lstDvtVnaccs = tbsDvtVnaccsService.searchTbsDvtVnaccs(maDvt, tenDvt, tenDvtv, tenDvtUni, minRow, maxRow);    	
//    	if(lstDvtVnaccs == null){
//    		System.out.println("Khong tim duoc ban ghi nao!");
//            return new ResponseEntity<TbsDvtVnaccsDTO>(HttpStatus.NOT_FOUND);
//    	}
    	int maxPage = (int) Math.ceil(totalCount / Integer.valueOf(pageSize));
    	
    	resultPage.setLstDvtVnaccs(lstDvtVnaccs);
    	resultPage.setCurrentPage(currentPage);
    	resultPage.setPageSize(pageSize);
    	resultPage.setTotalCount(totalCount);
    	resultPage.setMaxPage(maxPage);
    	
    	System.out.println("schDvtVnaccs END@resultPage:"+resultPage);
    	
    	return new ResponseEntity<TbsDvtVnaccsDTO>(resultPage,HttpStatus.ACCEPTED);
    }
    

}
