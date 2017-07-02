package com.tkhq.global.controler.rest;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tkhq.cmc.utils.Utils;
import com.tkhq.global.dao.PhanHoiBaocaoDao;
import com.tkhq.global.model.UserInfo;
import com.tkhq.global.model.phanhoi.PhanHoiBaocao;
import com.tkhq.global.model.phanhoi.PostPhanHoiMessage;

@RestController
@RequestMapping(value = "bcpt")
public class PhanHoiBaocaoController {

	@Autowired
	private PhanHoiBaocaoDao repository;
	
	@RequestMapping(value = "GetManager", method = RequestMethod.GET)
	public List<UserInfo> getManagers(String username){
		//String username = Utils.getRequestingUsername();
		return repository.getManagers(username);
	}
	
	@RequestMapping(value = "GetPhanHoiSoLieuTheoChiTieuThongKe", method = RequestMethod.GET)
	public List<PhanHoiBaocao> getDSPhanHoi(int loai_bc){
		return repository.getDSPhanHoi(loai_bc);
	}
	
	@RequestMapping(value = "PhanHoiSoLieuTheoChiTieuThongKe", method = RequestMethod.POST)
	public PostPhanHoiMessage postPhanHoi(PhanHoiBaocao phanhoi){
		phanhoi.setUsername(Utils.getRequestingUsername());
		//get NOI DUNG from JS
		String noidungPH = phanhoi.getNoidung().trim();		
		byte[] bytes = noidungPH.getBytes(StandardCharsets.ISO_8859_1);
		noidungPH = new String(bytes, StandardCharsets.UTF_8);
		phanhoi.setNoidung(noidungPH);
		return repository.postPhanHoi(phanhoi);
	}
}
