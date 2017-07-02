package com.tkhq.cmc.controller.rest;

import java.util.ArrayList;
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
import com.tkhq.cmc.dto.Tbs_ChuyenDeDTO;
import com.tkhq.cmc.model.Tbs_ChuyenDe;
import com.tkhq.cmc.services.Tbs_ChuyenDeService;

@RestController
public class Tbs_ChuyenDeRestController {

	@Autowired
	Tbs_ChuyenDeService tbs_chuyenDeService;

	@RequestMapping(value = "/tbs_chuyende/Search/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Tbs_ChuyenDe>> getAllChuyenDe(
			@RequestBody Tbs_ChuyenDeDTO params) {
		System.out.println("getAllChuyenDe");
		List<Tbs_ChuyenDe> listChuyenDe = new ArrayList<Tbs_ChuyenDe>();
		System.out.println("Find all");
		// Get params
		String maCDe = params.getMaCDe();
		String tenCDe = params.getTenCDe();
		String maHang = params.getMaHang();
		String motaHH = params.getMotaHH();
		// call function from service
		listChuyenDe = tbs_chuyenDeService.searchChuyenDe(maCDe, tenCDe,
				maHang, motaHH);
		return new ResponseEntity<List<Tbs_ChuyenDe>>(listChuyenDe,
				HttpStatus.ACCEPTED);
	}

	@RequestMapping(value = "/tbs_chuyende/", method = RequestMethod.POST)
	public ResponseEntity<Integer> createChuyenDe(
			@RequestBody Tbs_ChuyenDeDTO params, UriComponentsBuilder ucBuilder) {
		System.out.println("Creating data with MaCDe:" + params.getMaCDe());

		if (tbs_chuyenDeService.findByMaCDe(params.getMaCDe()) != null) {
			System.out.println("maCDe da ton tai!");
			return new ResponseEntity<Integer>(3,HttpStatus.OK);
		}

		Tbs_ChuyenDe entity = new Tbs_ChuyenDe();

		try {
			entity.setMaCDe(params.getMaCDe());
			entity.setTenCDe(params.getTenCDe());
			entity.setMaHang(params.getMaHang());
			entity.setMotaHH(params.getMotaHH());

			tbs_chuyenDeService.insertTbs_ChuyenDe(entity);
		} catch (Exception ex) {
			ex.printStackTrace();
			return new ResponseEntity<Integer>(2, HttpStatus.OK);
		}

		return new ResponseEntity<Integer>(1, HttpStatus.OK);
	}

	@RequestMapping(value = "/tbs_chuyende/{maCDe}", method = RequestMethod.PUT)
	public ResponseEntity<Integer> updateChuyenDe(
			@PathVariable("maCDe") String maCDe,
			@RequestBody Tbs_ChuyenDeDTO params) {
		System.out.println("Updating data with maCDe:" + maCDe);

		Tbs_ChuyenDe tbs_chuyende = tbs_chuyenDeService.findByMaCDe(maCDe);

		if (tbs_chuyende == null) {
			System.out.println("Data not found");
			return new ResponseEntity<Integer>(0,HttpStatus.OK);
		}

		try {
			tbs_chuyende.setMaCDe(params.getMaCDe());
			tbs_chuyende.setTenCDe(params.getTenCDe());
			tbs_chuyende.setMaHang(params.getMaHang());
			tbs_chuyende.setMotaHH(params.getMotaHH());
			tbs_chuyenDeService.updateTbs_chuyende(tbs_chuyende);
		} catch (Exception ex) {
			ex.printStackTrace();
			return new ResponseEntity<Integer>(2, HttpStatus.OK);
		}
		return new ResponseEntity<Integer>(1, HttpStatus.OK);
	}

	@RequestMapping(value = "/tbs_chuyende/", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> deleteChuyenDe(
			@RequestParam(value = "lstChuyenDe") String lstChuyenDe) {

		ObjectMapper objectMapper = new ObjectMapper();
		List<String> lstchuyende = new ArrayList<String>();

		try {
			lstchuyende = objectMapper.readValue(
					lstChuyenDe,
					objectMapper.getTypeFactory().constructCollectionType(
							List.class, String.class));
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		System.out.println("Deleting data: " + lstChuyenDe);

		for (int i = 0; i < lstchuyende.size(); i++) {
			Tbs_ChuyenDe tbs_chuyende = tbs_chuyenDeService
					.findByMaCDe(lstchuyende.get(i));
			if (tbs_chuyende == null) {
				return new ResponseEntity<Integer>(0, HttpStatus.OK);
			}
		}

		for (int i = 0; i < lstchuyende.size(); i++) {
			try {
				tbs_chuyenDeService.deleteByMaCDe(lstchuyende.get(i));
			} catch (Exception ex) {
				return new ResponseEntity<Integer>(2, HttpStatus.OK);
			}
		}
		return new ResponseEntity<Integer>(1, HttpStatus.OK);
	}

}
