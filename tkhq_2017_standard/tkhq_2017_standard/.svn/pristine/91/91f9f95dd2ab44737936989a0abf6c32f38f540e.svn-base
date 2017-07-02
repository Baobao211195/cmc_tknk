package com.tkhq.cmc.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tkhq.cmc.model.TbsMathkeNhomNk;
import com.tkhq.cmc.services.Tbs_MathkeNhomNkService;

@RestController
public class Tbs_MathkeNhomNkRestController {
	
	@Autowired
	Tbs_MathkeNhomNkService tbs_MathkeNhomNkService ;	
	 @RequestMapping(value = "/tbs_mathkenhomNk/", method = RequestMethod.GET)
	    public ResponseEntity<List<TbsMathkeNhomNk>> listAllMathKe() {
	        List<TbsMathkeNhomNk> lstMathkeNhomNk = tbs_MathkeNhomNkService.getAll();
	        if(lstMathkeNhomNk.isEmpty()){
	            return new ResponseEntity<List<TbsMathkeNhomNk>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
	        }
	        return new ResponseEntity<List<TbsMathkeNhomNk>>(lstMathkeNhomNk, HttpStatus.OK);
	    }

}
