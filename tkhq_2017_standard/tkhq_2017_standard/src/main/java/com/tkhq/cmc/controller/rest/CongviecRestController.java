package com.tkhq.cmc.controller.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tkhq.cmc.dto.CongViecDTO;
import com.tkhq.cmc.model.Tbs_BieuThue;
import com.tkhq.cmc.services.CongViecService;

@RestController
public class CongviecRestController {
	@Autowired
	CongViecService congViecService;
	
	@RequestMapping(value="/listCongviec",method=RequestMethod.GET)
	public ResponseEntity<List<CongViecDTO>> getAllBieuThue(){
		List<CongViecDTO> lst = new ArrayList<CongViecDTO>();
		System.out.println("Find all");
		lst = congViecService.getListCongViec();
        if (lst == null) {
            System.out.println("Khong tim duoc ban ghi nao!");
            return new ResponseEntity<List<CongViecDTO>>(HttpStatus.NOT_FOUND);
        }
		
		return new ResponseEntity<List<CongViecDTO>>(lst,HttpStatus.ACCEPTED);
	}
}
