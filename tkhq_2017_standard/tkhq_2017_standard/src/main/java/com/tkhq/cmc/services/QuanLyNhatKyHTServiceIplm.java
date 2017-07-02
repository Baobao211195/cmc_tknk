package com.tkhq.cmc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tkhq.cmc.dao.QuanLyNhatKyHTDAO;
import com.tkhq.cmc.dto.QuanLyNhatKyHTDTO;

@Service
@Transactional
public class QuanLyNhatKyHTServiceIplm implements QuanLyNhatKyHTService{
	
	@Autowired QuanLyNhatKyHTDAO quanLyNhatKyHTDAO;
	@Override
	public List<QuanLyNhatKyHTDTO> getListThongTinNhatKyHT(String tuNgay, String denNgay, String tenDangNhap, String maDonVi) {
		return quanLyNhatKyHTDAO.getListThongTinNhatKyHT(tuNgay, denNgay, tenDangNhap, maDonVi);
	}
}
