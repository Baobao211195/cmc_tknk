package com.tkhq.cmc.controller.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tkhq.cmc.common.JasperExport;
import com.tkhq.cmc.common.Constants.ExportType;
import com.tkhq.cmc.dto.BCNKHHCUCHQDTO;
import com.tkhq.cmc.dto.BCSLVNBELARUTDTO;
import com.tkhq.cmc.dto.BCSLVNUCRAINADTO;
import com.tkhq.cmc.dto.BCSLVN_ASIANDTO;
import com.tkhq.cmc.dto.BCSLVN_LAODTO;
import com.tkhq.cmc.dto.BCSLVN_NGADTO;
import com.tkhq.cmc.dto.BCSLVN_TOWORLDDTO;
import com.tkhq.cmc.dto.TMBCXKHH20TDTO;
import com.tkhq.cmc.services.PHANHE_PBTKSPService;
import com.tkhq.cmc.services.PHANHE_PBTKService;
import com.tkhq.cmc.services.Tbd_sys_userService;

@RestController
@RequestMapping(value="pbtk")
public class PHANHE_PBTKSPRestController {
	
	@Autowired
	PHANHE_PBTKSPService baocaoService;
	
	@Autowired
	Tbd_sys_userService userService;
	
	@RequestMapping(value="/Ts_BCSLVN_UCRAINA", method =RequestMethod.GET)
	public ResponseEntity<byte[]> ts_BCSLVN_UCRAINA(int ky, int nam, @RequestParam(value="type",required=false) String type){
		boolean hasRole = userService.checkRoleBieu(0, 0, 0, nam, "", "Ts_BCSLVN_UCRAINA");
		List<BCSLVNUCRAINADTO> list = baocaoService.Ts_BCSLVN_UCRAINA(ky, nam);
		
		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(list);
		Map<String, Object> param= new HashMap<String, Object>();
		return JasperExport.ExportReport("BCSLVNUCRAINA",listData, param, type);
	}
	
	@RequestMapping(value="/Ts_BCSLVNX_BELARUT", method =RequestMethod.GET)
	public ResponseEntity<byte[]> ts_BCSLVNX_BELARUT(int ky, int nam, @RequestParam(value="type",required=false) String type){
		boolean hasRole = userService.checkRoleBieu(0, 0, 0, nam, "", "Ts_BCSLVNX_BELARUT");
		List<BCSLVNBELARUTDTO> list = baocaoService.Ts_BCSLVN_BELARUT(ky, nam, "XUAT");
		
		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(list);
		Map<String, Object> param= new HashMap<String, Object>();
		return JasperExport.ExportReport("BCSLVNXBELARUT",listData, param, type);
	}
	
	@RequestMapping(value="/Ts_BCSLVNN_BELARUT", method =RequestMethod.GET)
	public ResponseEntity<byte[]> ts_BCSLVNN_BELARUT(int ky, int nam, @RequestParam(value="type",required=false) String type){
		boolean hasRole = userService.checkRoleBieu(0, 0, 0, nam, "", "Ts_BCSLVNN_BELARUT");
		List<BCSLVNBELARUTDTO> list = baocaoService.Ts_BCSLVN_BELARUT(ky, nam, "NHAP");
		
		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(list);
		Map<String, Object> param= new HashMap<String, Object>();
		return JasperExport.ExportReport("BCSLVNNBELARUT",listData, param, type);
	}
	
	@RequestMapping(value="/Ts_BCSLVN_LAO", method =RequestMethod.GET)
	public ResponseEntity<byte[]> ts_BCSLVN_LAO(int quy, int nam, @RequestParam(value="type",required=false) String type){
		boolean hasRole = userService.checkRoleBieu(0, 0, quy, nam, "", "Ts_BCSLVN_LAO");
		List<BCSLVN_LAODTO> list = baocaoService.ts_BCSLVN_LAO(quy, nam);
		
		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(list);
		Map<String, Object> param= new HashMap<String, Object>();
		return JasperExport.ExportReport("BCSLVN_LAO",listData, param, type);
	}
	@RequestMapping(value="/Ts_BCSLVN_NGA", method =RequestMethod.GET)
	public ResponseEntity<byte[]> ts_BCSLVN_NGA(int ky, int nam, @RequestParam(value="type",required=false) String type){
		boolean hasRole = userService.checkRoleBieu(0, 0, ky, nam, "", "Ts_BCSLVN_NGA");
		List<BCSLVN_NGADTO> list = baocaoService.ts_BCSLVN_NGA(ky, nam);
		
		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(list);
		Map<String, Object> param= new HashMap<String, Object>();
		return JasperExport.ExportReport("BCSLVN_NGA",listData, param, type);
	}
	@RequestMapping(value="/Ts_BCSLVNXK_ASIAN", method =RequestMethod.GET)
	public ResponseEntity<byte[]> ts_BCSLVNXK_ASIAN(int quy, int nam, @RequestParam(value="type",required=false) String type){
		boolean hasRole = userService.checkRoleBieu(0, 0, quy, nam, "", "Ts_BCSLVN_ASIAN");
		List<BCSLVN_ASIANDTO> list = baocaoService.ts_BCSLVN_ASIAN(quy, nam,"XUAT");
		
		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(list);
		Map<String, Object> param= new HashMap<String, Object>();
		return JasperExport.ExportReport("BCSLVN_ASIAN",listData, param, type);
	}
	@RequestMapping(value="/Ts_BCSLVNNK_ASIAN", method =RequestMethod.GET)
	public ResponseEntity<byte[]> ts_BCSLVNNK_ASIAN(int quy, int nam, @RequestParam(value="type",required=false) String type){
		boolean hasRole = userService.checkRoleBieu(0, 0, quy, nam, "", "Ts_BCSLVN_ASIAN");
		List<BCSLVN_ASIANDTO> list = baocaoService.ts_BCSLVN_ASIAN(quy, nam,"NHAP");
		
		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(list);
		Map<String, Object> param= new HashMap<String, Object>();
		return JasperExport.ExportReport("BCSLVN_ASIAN",listData, param, type);
	}
	@RequestMapping(value="/Ts_BCSLVNNK_WTO", method =RequestMethod.GET)
	public ResponseEntity<byte[]> ts_BCSLVNNK_WTO(int nam, @RequestParam(value="type",required=false) String type){
		boolean hasRole = userService.checkRoleBieu(0, 0,0, nam, "", "Ts_BCSLVNNK_WTO");
		List<BCSLVN_TOWORLDDTO> list = baocaoService.ts_BCSLVN_TOWORLD( nam,null);
		
		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(list);
		Map<String, Object> param= new HashMap<String, Object>();
		return JasperExport.ExportReport("BCSLVNNK_FROMWORLD",listData, param, type);
	}	
	@RequestMapping(value="/Ts_BCSLVNNK_UNSD", method =RequestMethod.GET)
	public ResponseEntity<byte[]> ts_BCSLVNNK_UNSD(int nam, @RequestParam(value="type",required=false) String type){
		boolean hasRole = userService.checkRoleBieu(0, 0,0, nam, "", "Ts_BCSLVNNK_UNSD");
		List<BCSLVN_TOWORLDDTO> list = baocaoService.ts_BCSLVN_TOWORLD( nam,"NHAP");
		
		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(list);
		Map<String, Object> param= new HashMap<String, Object>();
		return JasperExport.ExportReport("BCSLVNNK_FROMWORLD",listData, param, type);
	}
	@RequestMapping(value="/Ts_BCSLVNXK_UNSD", method =RequestMethod.GET)
	public ResponseEntity<byte[]> ts_BCSLVNXK_UNSD(int nam, @RequestParam(value="type",required=false) String type){
		boolean hasRole = userService.checkRoleBieu(0, 0,0, nam, "", "Ts_BCSLVNXK_UNSD");
		List<BCSLVN_TOWORLDDTO> list = baocaoService.ts_BCSLVN_TOWORLD( nam,"XUAT");
		
		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(list);
		Map<String, Object> param= new HashMap<String, Object>();
		return JasperExport.ExportReport("BCSLVNNK_TOWORLD",listData, param, type);
	}
}
