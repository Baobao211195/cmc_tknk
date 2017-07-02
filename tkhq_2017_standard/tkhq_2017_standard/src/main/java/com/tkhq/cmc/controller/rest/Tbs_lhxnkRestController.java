package com.tkhq.cmc.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tkhq.cmc.model.Tbs_lhxnk;
import com.tkhq.cmc.services.Tbs_lhxnkSerivce;

@RestController
public class Tbs_lhxnkRestController {
	
	@Autowired
	Tbs_lhxnkSerivce tbs_lhxnkSerivce;
	 @RequestMapping(value = "/tbs_lhxnk/", method = RequestMethod.GET)
	    public ResponseEntity<List<Tbs_lhxnk>> listAll() {
	        List<Tbs_lhxnk> lstTbs_lhxnk = tbs_lhxnkSerivce.getAll();
	        if(lstTbs_lhxnk.isEmpty()){
	            return new ResponseEntity<List<Tbs_lhxnk>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
	        }
	        return new ResponseEntity<List<Tbs_lhxnk>>(lstTbs_lhxnk, HttpStatus.OK);
	    }

}
