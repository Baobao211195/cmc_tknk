package com.tkhq.cmc.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//import com.fasterxml.jackson.databind.ObjectMapper;
import com.tkhq.cmc.dto.Tbs_DvtDTO;
import com.tkhq.cmc.model.Tbs_Dvt;
import com.tkhq.cmc.services.TBS_DVTService;

@RestController
public class TBS_DVTRestController {
	@Autowired
	TBS_DVTService tbs_dvtService;
	
	@RequestMapping(value = "/tbs_dvt/{maDvt}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Tbs_Dvt> getDviTinh(@PathVariable("maDvt") String maDvt) {
        System.out.println("Find with id " + maDvt);
        Tbs_Dvt tbs_dvt = tbs_dvtService.findById(maDvt);
        if (tbs_dvt == null) {
            System.out.println("Khong tim duoc ban ghi nao!");
            return new ResponseEntity<Tbs_Dvt>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Tbs_Dvt>(tbs_dvt, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/dvt_all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Tbs_Dvt>> getAllDviTinh() {
        System.out.println("Find all");
        List<Tbs_Dvt> listTbs_Dvt = tbs_dvtService.findAll();
        if (listTbs_Dvt == null) {
            System.out.println("Khong tim duoc ban ghi nao!");
            return new ResponseEntity<List<Tbs_Dvt>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Tbs_Dvt>>(listTbs_Dvt, HttpStatus.OK);
    }
    
    //@ResponseBody
    @RequestMapping(value = "/ins_dvt1", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Tbs_Dvt> insertDviTinh(
    		@RequestParam(value = "maDvt") String maDvt,
    		@RequestParam(value = "tenDvt") String tenDvt,
    		@RequestParam(value = "maStd") String maStd,
    		@RequestParam(value = "tlQuydoi") String tlQuydoi) {
        System.out.println("Insert table TBS_DVT");
//        ObjectMapper objectMapper = new ObjectMapper();
        
        try{
        	//Tbs_Dvt entity = objectMapper.readValue(dvtEntity, Tbs_Dvt.class);
        	Tbs_Dvt entity = new Tbs_Dvt();
        	entity.setMaDvt(maDvt);
        	entity.setTenDvt(tenDvt);
        	entity.setMaStd(maStd);
        	entity.setTlQuydoi(Double.parseDouble(tlQuydoi));
        	System.out.println("Object: " + entity);
        	
        	tbs_dvtService.insertTBS_DVT(entity);
        }catch(Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<Tbs_Dvt>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<Tbs_Dvt>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/ins_dvt2", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Tbs_Dvt> insertDviTinh2(
    		@RequestBody  Tbs_DvtDTO dvtDto) {
        System.out.println("Insert table TBS_DVT with Param: " + dvtDto);
        
        try{
        	Tbs_Dvt entity = new Tbs_Dvt();
        	entity.setMaDvt(dvtDto.getMaDvt());
        	entity.setMaStd(dvtDto.getMaStd());
        	entity.setTenDvt(dvtDto.getTenDvt());
        	entity.setTlQuydoi(dvtDto.getTlQuydoi());
        	
        	tbs_dvtService.insertTBS_DVT(entity);
        	
        }catch(Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<Tbs_Dvt>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<Tbs_Dvt>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/del_dvt", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Tbs_Dvt> deleteDvTinh(
    		@RequestParam(value = "maDvt") String maDvt){
    	System.out.println("Delete table TBS_DVT with key: " + maDvt);
    	Tbs_Dvt entity = tbs_dvtService.findById(maDvt);
    	if(entity == null){
    		System.out.println("Row delete not found");
            return new ResponseEntity<Tbs_Dvt>(HttpStatus.NOT_FOUND);
    	}
    	
    	try{
    		tbs_dvtService.deleteById(maDvt);
    	}catch(Exception ex){
    		ex.printStackTrace();
    		return new ResponseEntity<Tbs_Dvt>(HttpStatus.INTERNAL_SERVER_ERROR);
    	}
    	return new ResponseEntity<Tbs_Dvt>(HttpStatus.OK);
    }
}
