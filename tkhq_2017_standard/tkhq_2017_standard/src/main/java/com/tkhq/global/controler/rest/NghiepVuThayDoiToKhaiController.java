package com.tkhq.global.controler.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tkhq.global.dao.NghiepVuThayDoiToKhaiDao;
import com.tkhq.global.model.NghiepVuThayDoiToKhai;

@RestController
public class NghiepVuThayDoiToKhaiController {

	@Autowired
	private NghiepVuThayDoiToKhaiDao repository;
	
	@RequestMapping(value = "bcpt/GetMajor", method = RequestMethod.GET)
	public ResponseEntity<List<NghiepVuThayDoiToKhai>> getAllNghiepVuThaydoi(){
		List<NghiepVuThayDoiToKhai> list = repository.getAllNghiepVuThaydoi();
		if(list == null)
			return new ResponseEntity<List<NghiepVuThayDoiToKhai>>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<NghiepVuThayDoiToKhai>>(list, HttpStatus.OK);
	}
}
