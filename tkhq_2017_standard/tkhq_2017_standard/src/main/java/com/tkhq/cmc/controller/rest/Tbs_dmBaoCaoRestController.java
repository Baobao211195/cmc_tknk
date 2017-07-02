package com.tkhq.cmc.controller.rest;

import java.util.List;

import org.jboss.logging.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tkhq.cmc.model.Tbs_dmbaocao;
import com.tkhq.cmc.services.Tbs_dmBaoCaoService;

@RestController
public class Tbs_dmBaoCaoRestController {

	@Autowired
	Tbs_dmBaoCaoService tbs_dmBaoCaoService;
	
	@RequestMapping(value = "/tbs_dmbaocao", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Tbs_dmbaocao>> getDmBaoCaoByMaLoai(@Param Integer  ma_loaibc) {
        System.out.println("Find with ma " + ma_loaibc.toString());
        List<Tbs_dmbaocao> lstDmBaoCao = tbs_dmBaoCaoService.getDmBcByLoaiBC(ma_loaibc);
      
        if (lstDmBaoCao == null) {
            System.out.println("Khong tim duoc ban ghi nao!");
            return new ResponseEntity<List<Tbs_dmbaocao>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Tbs_dmbaocao>>(lstDmBaoCao,HttpStatus.OK);
    }
}
