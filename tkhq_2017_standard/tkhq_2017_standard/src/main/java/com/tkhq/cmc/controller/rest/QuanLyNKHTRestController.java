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
import com.tkhq.cmc.dto.QuanLyNhatKyHTDTO;
import com.tkhq.cmc.services.QuanLyNhatKyHTService;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@RestController
public class QuanLyNKHTRestController {
	
	private static final String TYPE_EXCEL = "0";
	
	@Autowired
	QuanLyNhatKyHTService quanLyNhatKyHTService;
	
	@RequestMapping(value = "/lisNhatKyHT", method = RequestMethod.GET)
	public ResponseEntity<List<QuanLyNhatKyHTDTO>> getListNhatKyHT(String tuNgay, String denNgay, String tenDangNhap, String maDonVi){
		
		List<QuanLyNhatKyHTDTO> listDto =  quanLyNhatKyHTService.getListThongTinNhatKyHT(tuNgay, denNgay, tenDangNhap, maDonVi);
		
		if (listDto == null){
			return new ResponseEntity<List<QuanLyNhatKyHTDTO>>(listDto, HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<QuanLyNhatKyHTDTO>>(listDto, HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/exportNhatKyHT", method = RequestMethod.GET)
	public ResponseEntity<byte[]> doExportNhatKyHT (String typeKetXuat, String tuNgay, String denNgay, String tenDangNhap,String maDonVi) {

		List<QuanLyNhatKyHTDTO> listDto =  quanLyNhatKyHTService.getListThongTinNhatKyHT(tuNgay, denNgay, tenDangNhap, maDonVi);
		if (listDto == null){
			return new ResponseEntity<byte[]>(HttpStatus.NO_CONTENT);
		} 
		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(listDto);
		Map<String, Object> param= new HashMap<String, Object>();
		if (TYPE_EXCEL.equals(typeKetXuat)) {
			return JasperExport.ExportReport("QuanLyNhatKy", listData, param, ExportType.EXCEL);
		}
		return JasperExport.ExportReport("QuanLyNhatKy", listData, param, ExportType.PDFINLINE);
	}
}
