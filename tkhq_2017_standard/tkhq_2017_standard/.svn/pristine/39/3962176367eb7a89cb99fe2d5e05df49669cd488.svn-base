package com.tkhq.cmc.controller.rest;

import java.util.ArrayList;
import java.util.List;

import org.jboss.logging.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tkhq.cmc.model.Tbs_Haiquan_KTTXNK;
import com.tkhq.cmc.services.Tbs_Haiquan_KTTXNKService;

@RestController
public class Tbs_Haiquan_KTTXNKController {

	@Autowired
	Tbs_Haiquan_KTTXNKService tbs_HQKTTXNKService;
	
	@RequestMapping(value = "/tbs_hqkttxnk", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Tbs_Haiquan_KTTXNK> getHQByMa(@Param String  ma) {
        System.out.println("Find with ma " + ma);
        Tbs_Haiquan_KTTXNK tbs_hqkttxnk = tbs_HQKTTXNKService.getHQByMa(ma);
        if (tbs_hqkttxnk == null) {
            System.out.println("Khong tim duoc ban ghi nao!");
            return new ResponseEntity<Tbs_Haiquan_KTTXNK>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Tbs_Haiquan_KTTXNK>(tbs_hqkttxnk, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/tbs_hqkttxnk/", method = RequestMethod.GET)
	public ResponseEntity<List<Tbs_Haiquan_KTTXNK>> getAllHaiQuan() {
		System.out.println("getAllHaiQuan");
		List<Tbs_Haiquan_KTTXNK> listHaiQuan = new ArrayList<Tbs_Haiquan_KTTXNK>();
		System.out.println("Find all");
		listHaiQuan = tbs_HQKTTXNKService.getAllHaiQuan();
		if (listHaiQuan == null) {
			System.out.println("Khong tim duoc ban ghi nao!");
			return new ResponseEntity<List<Tbs_Haiquan_KTTXNK>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Tbs_Haiquan_KTTXNK>>(listHaiQuan,
				HttpStatus.ACCEPTED);
	}
    
    @RequestMapping(value = "/tbs_hqkttxnk_getcuc", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Tbs_Haiquan_KTTXNK>> getAllCucHaiQuan() {
        System.out.println("getAllCucHaiQuan");
        List<Tbs_Haiquan_KTTXNK> tbs_hqkttxnk = tbs_HQKTTXNKService.getAllCucHaiQuan();
        if (tbs_hqkttxnk == null) {
            System.out.println("Khong tim duoc ban ghi nao!");
            return new ResponseEntity<List<Tbs_Haiquan_KTTXNK>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Tbs_Haiquan_KTTXNK>>(tbs_hqkttxnk, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/tbs_hqkttxnk_getchicucbycuc", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Tbs_Haiquan_KTTXNK>> getChiCucByCuc(String maCuc) {
        System.out.println("get Chi cuc By Cuc");
        List<Tbs_Haiquan_KTTXNK> tbs_hqkttxnk = tbs_HQKTTXNKService.getChiCucByCuc(maCuc);
//        if (tbs_hqkttxnk == null) {
//            System.out.println("Khong tim duoc ban ghi nao!");
//            return new ResponseEntity<List<Tbs_Haiquan_KTTXNK>>(HttpStatus.NOT_FOUND);
//        }
        return new ResponseEntity<List<Tbs_Haiquan_KTTXNK>>(tbs_hqkttxnk, HttpStatus.OK);
    }
}
