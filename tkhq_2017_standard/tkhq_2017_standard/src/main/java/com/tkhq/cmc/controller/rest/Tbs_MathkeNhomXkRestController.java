package com.tkhq.cmc.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tkhq.cmc.model.TbsMathkeNhomXk;
import com.tkhq.cmc.services.Tbs_MathkeNhomXkService;

@RestController
public class Tbs_MathkeNhomXkRestController {
	@Autowired
	Tbs_MathkeNhomXkService tbs_MathkeNhomXkService ;	
	 @RequestMapping(value = "/tbs_mathkenhomXk/", method = RequestMethod.GET)
	    public ResponseEntity<List<TbsMathkeNhomXk>> listAllMathKe() {
	        List<TbsMathkeNhomXk> lstMathkeNhomXk = tbs_MathkeNhomXkService.getAll();
	        if(lstMathkeNhomXk.isEmpty()){
	            return new ResponseEntity<List<TbsMathkeNhomXk>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
	        }
	        return new ResponseEntity<List<TbsMathkeNhomXk>>(lstMathkeNhomXk, HttpStatus.OK);
	    }
}
