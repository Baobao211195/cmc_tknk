package com.tkhq.cmc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tkhq.cmc.dao.BaoCaoTheoBoNganh01DAO;
import com.tkhq.cmc.dto.BCT_BO_NGANH_NUOC_TRIGIADTO;
import com.tkhq.cmc.dto.BCT_BO_NGANH_TGXN_CATRA;
import com.tkhq.cmc.dto.BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO;
@Service
@Transactional
public class BaoCaoTheoBoNganh01ServiceImpl implements BaoCaoTheoBoNganh01Service {
	@Autowired
	BaoCaoTheoBoNganh01DAO baocaoDAO;
	
	public List<BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO> TS_TGXN_MOTSO_MATHANG(final String maHQ ,final int thang, final int nam, final String loaiXN)
	{
		return baocaoDAO.TS_TGXN_MOTSO_MATHANG(maHQ, thang, nam, loaiXN);
				
	}
	
	public List<BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO> TS_TGXN_MOTSO_MATHANG01(final String maHQ ,final int thang, final int nam, final String loaiXN)
	{
		return baocaoDAO.TS_TGXN_MOTSO_MATHANG01(maHQ, thang, nam, loaiXN);
				
	}
	
	public List<BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO> TS_TGXUAT_TUIXACH_THITRUONG(final String maHQ ,final int thang, final int nam, final String loaiXN)
	{
		return baocaoDAO.TS_TGXUAT_TUIXACH_THITRUONG(maHQ, thang, nam, loaiXN);
				
	}
	
	public List<BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO> TS_TGXUAT_TUIXACH_HS(final String maHQ ,final int thang, final int nam, final String loaiXN)
	{
		return baocaoDAO.TS_TGXUAT_TUIXACH_HS(maHQ, thang, nam, loaiXN);
				
	}
	
	public List<BCT_BO_NGANH_NUOC_TRIGIADTO> TS_TGXUAT_TUIXACH_THITRUONG_HS(final String maHQ ,final int thang, final int nam, final String loaiXN)
	{
		return baocaoDAO.TS_TGXUAT_TUIXACH_THITRUONG_HS(maHQ, thang, nam, loaiXN);
				
	}
	
	public List<BCT_BO_NGANH_TGXN_CATRA> TS_TGXUAT_CATRA(final String maHQ ,final int thang, final int nam, final String loaiXN)
	{
		return baocaoDAO.TS_TGXUAT_CATRA(maHQ, thang, nam, loaiXN);
				
	}
	
	public List<BCT_BO_NGANH_TGXN_CATRA> TS_TGNHAP_CATRA(final String maHQ ,final int thang, final int nam, final String loaiXN)
	{
		return baocaoDAO.TS_TGNHAP_CATRA(maHQ, thang, nam, loaiXN);
				
	}
}
