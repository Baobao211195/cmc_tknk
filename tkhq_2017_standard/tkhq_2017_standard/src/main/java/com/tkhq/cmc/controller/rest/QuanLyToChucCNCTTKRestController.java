package com.tkhq.cmc.controller.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tkhq.cmc.common.Constants.ExportType;
import com.tkhq.cmc.common.JasperExport;
import com.tkhq.cmc.dto.QuanLyToChucDTO;
import com.tkhq.cmc.services.Tbd_sys_userService;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@RestController
public class QuanLyToChucCNCTTKRestController {
	
	private static final String TYPE_EXCEL = "0";
	
	@Autowired
	Tbd_sys_userService service;
	
	@RequestMapping(value = "/lisThongTinQuanLy", method = RequestMethod.GET)
	public ResponseEntity<List<QuanLyToChucDTO>> getListThongTin(int nhomId, int trangThai, String maTongCuc, String maChiCuc) {
		List<QuanLyToChucDTO> listDto = service.searchUser(nhomId, trangThai, maTongCuc, maChiCuc);
		
		if (listDto == null){
			return new ResponseEntity<List<QuanLyToChucDTO>>(listDto, HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<List<QuanLyToChucDTO>>(listDto, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/exportThongTinQL", method = RequestMethod.GET)
	public ResponseEntity<byte[]> doExportThongTinQL (String typeKetXuat, int nhomId, int trangThai, String maTongCuc, String maChiCuc) {
		List<QuanLyToChucDTO> lisDto = service.searchUser(nhomId, trangThai, maTongCuc, maChiCuc);
		if (lisDto == null){
			return new ResponseEntity<byte[]>(HttpStatus.NO_CONTENT);
		} 
		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(lisDto);
		Map<String, Object> param= new HashMap<String, Object>();
		if (TYPE_EXCEL.equals(typeKetXuat)) {
			return JasperExport.ExportReport("QuanLyThongTin", listData, param, ExportType.EXCEL);
		}
		return JasperExport.ExportReport("QuanLyThongTin", listData, param, ExportType.PDFINLINE);
	}

}
