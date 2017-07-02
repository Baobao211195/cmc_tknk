package com.tkhq.global.controler.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tkhq.cmc.utils.Utils;
import com.tkhq.global.dao.SLTheoCTTKRequestParams;
import com.tkhq.global.dao.SLTheoCTTKDao;
import com.tkhq.global.model.bcptbangbieu.*;

@RestController
@RequestMapping(value="bcpt", method = RequestMethod.GET)
public class SLTheoCTTKController {

	@Autowired
	private SLTheoCTTKDao repository;
	
	@RequestMapping(value="SoLieuTheoChiTieuThongKe01")
	public SLTheoCTTK01Response getSLTheoCTTK01(SLTheoCTTKRequestParams params){
		params.setUsername(Utils.getPrincipalLogin().getUser().getUserName());
		if(params.getMaCucHQ()==null && params.getMaChicucHQ()==null )
		{
			params.setMaCucHQ(Utils.getPrincipalLogin().getMaCuc());
			params.setMaChicucHQ(Utils.getPrincipalLogin().getMaChiCuc());
		}
		return repository.getSLTheoCTTK01(params);
	}
	
	@RequestMapping(value="SoLieuTheoChiTieuThongKe02")
	public List<SLTheoCTTK02Response> getSLTheoCTTK02(SLTheoCTTKRequestParams params){
		params.setUsername(Utils.getPrincipalLogin().getUser().getUserName());
		return repository.getSLTheoCTTK02(params);
	}
	
	@RequestMapping(value="SoLieuTheoChiTieuThongKe03")
	public List<SLTheoCTTK03Response> getSLTheoCTTK03(SLTheoCTTKRequestParams params){
		params.setUsername(Utils.getPrincipalLogin().getUser().getUserName());
		return repository.getSLTheoCTTK03(params);
	}
	
	@RequestMapping(value="SoLieuTheoChiTieuThongKe04")
	public List<SLTheoCTTK04Response> getSLTheoCTTK04(SLTheoCTTKRequestParams params, String mathang){
		params.setUsername(Utils.getPrincipalLogin().getUser().getUserName());
		List<SLTheoCTTK04Response> result = repository.getSLTheoCTTK04(params, mathang);
		return result;
	}
	
	@RequestMapping(value="SoLieuTheoChiTieuThongKe05")
	public List<SLTheoCTTK05Response> getSLTheoCTTK05(SLTheoCTTKRequestParams params, 
			String chuong, String nhom){		
		params.setUsername(Utils.getPrincipalLogin().getUser().getUserName());
		return repository.getSLTheoCTTK05(params, chuong, nhom);
	}
	
	@RequestMapping(value="SoLieuTheoChiTieuThongKe06")
	public List<SLTheoCTTK06Response> getSLTheoCTTK06(SLTheoCTTKRequestParams params, 
			String phan){		
		params.setUsername(Utils.getPrincipalLogin().getUser().getUserName());
		return repository.getSLTheoCTTK06(params, phan);
	}
	
	@RequestMapping(value="SoLieuTheoChiTieuThongKe07")
	public List<SLTheoCTTK07Response> getSLTheoCTTK07(SLTheoCTTKRequestParams params, 
			String thoigian, String mathang, String chiso, String loaichiso){		
		params.setUsername(Utils.getPrincipalLogin().getUser().getUserName());
		if(params.getMaCucHQ()==null && params.getMaChicucHQ()==null )
		{						
			params.setMaCucHQ(Utils.getPrincipalLogin().getMaCuc());
			params.setMaChicucHQ(Utils.getPrincipalLogin().getMaChiCuc());
			//System.out.println("getSLTheoCTTK07@"+params.getMaCucHQ()+"|"+params.getMaChicucHQ()+"|"+params.getUsername());
		}
		return repository.getSLTheoCTTK07(params, thoigian, mathang, chiso, loaichiso);
	}
	
	@RequestMapping(value="SoLieuTheoChiTieuThongKe08")
	public List<SLTheoCTTK08Response> getSLTheoCTTK08(SLTheoCTTKRequestParams params, 
			String khoi, String nuoc){		
		params.setUsername(Utils.getPrincipalLogin().getUser().getUserName());
		if(params.getMaCucHQ()==null && params.getMaChicucHQ()==null )
		{
			params.setMaCucHQ(Utils.getPrincipalLogin().getMaCuc());
			params.setMaChicucHQ(Utils.getPrincipalLogin().getMaChiCuc());
		}
		return repository.getSLTheoCTTK08(params, khoi, nuoc);
	}
	
	@RequestMapping(value="SoLieuTheoChiTieuThongKe09")
	public List<SLTheoCTTK09Response> getSLTheoCTTK09(SLTheoCTTKRequestParams params, 
			String thitruong, String mathang){		
		params.setUsername(Utils.getPrincipalLogin().getUser().getUserName());
		return repository.getSLTheoCTTK09(params, thitruong, mathang);
	}
	
	@RequestMapping(value="SoLieuTheoChiTieuThongKe10")
	public List<SLTheoCTTK10Response> getSLTheoCTTK10(SLTheoCTTKRequestParams params, String mathang){
		params.setUsername(Utils.getPrincipalLogin().getUser().getUserName());
		return repository.getSLTheoCTTK10(params, mathang);
	}
	
	@RequestMapping(value="SoLieuTheoChiTieuThongKe11")
	public List<SLTheoCTTK11Response> getSLTheoCTTK11(SLTheoCTTKRequestParams params, String tinh){
		params.setUsername(Utils.getPrincipalLogin().getUser().getUserName());
		if(params.getMaCucHQ()==null && params.getMaChicucHQ()==null )
		{
			params.setMaCucHQ(Utils.getPrincipalLogin().getMaCuc());
			params.setMaChicucHQ(Utils.getPrincipalLogin().getMaChiCuc());
		}
		return repository.getSLTheoCTTK11(params, tinh);
	}
	
	@RequestMapping(value="SoLieuTheoChiTieuThongKe12")
	public List<SLTheoCTTK12Response> getSLTheoCTTK12(SLTheoCTTKRequestParams params){		
		params.setUsername(Utils.getPrincipalLogin().getUser().getUserName());
		return repository.getSLTheoCTTK12(params);
	}
	
	@RequestMapping(value="SoLieuTheoChiTieuThongKe13")
	public List<SLTheoCTTK13Response> getSLTheoCTTK13(SLTheoCTTKRequestParams params, 
			String group_transport, String transport){		
		params.setUsername(Utils.getPrincipalLogin().getUser().getUserName());
		return repository.getSLTheoCTTK13(params, group_transport, transport);
	}
	
	@RequestMapping(value="SoLieuTheoChiTieuThongKe14")
	public List<SLTheoCTTK14Response> getSLTheoCTTK14(SLTheoCTTKRequestParams params, 
			String loai_ngay, String thoi_gian, String tu_thoigian, String tu_nam,
			String den_thoigian, String den_nam ){		
		params.setUsername(Utils.getPrincipalLogin().getUser().getUserName());
		if(params.getMaChicucHQ().trim().isEmpty()){
			params.setMaChicucHQ(null);
		}
		return repository.getSLTheoCTTK14(params, loai_ngay, thoi_gian, tu_thoigian, tu_nam,
				den_thoigian, den_nam );
	}
	
	@RequestMapping(value="SoLieuTheoChiTieuThongKe15")
	public List<SLTheoCTTK15Response> getSLTheoCTTK15(SLTheoCTTKRequestParams params, 
			String cuakhau, String phamvi, String loaihinh){		
		params.setUsername(Utils.getPrincipalLogin().getUser().getUserName());
		return repository.getSLTheoCTTK15(params, cuakhau, phamvi, loaihinh);
	}
}
