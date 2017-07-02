package com.tkhq.cmc.services;

import java.util.List;

import com.tkhq.cmc.dto.BCT_BO_NGANH_NUOC_TRIGIADTO;
import com.tkhq.cmc.dto.BCT_BO_NGANH_TGXN_CATRA;
import com.tkhq.cmc.dto.BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO;

public interface BaoCaoTheoBoNganh01Service {

	public List<BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO> TS_TGXN_MOTSO_MATHANG(final String maHQ ,final int thang, final int nam, final String loaiXN);
	public List<BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO> TS_TGXN_MOTSO_MATHANG01(final String maHQ ,final int thang, final int nam, final String loaiXN);
	public List<BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO> TS_TGXUAT_TUIXACH_THITRUONG(final String maHQ ,final int thang, final int nam, final String loaiXN);
	public List<BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO> TS_TGXUAT_TUIXACH_HS(final String maHQ ,final int thang, final int nam, final String loaiXN);
	public List<BCT_BO_NGANH_NUOC_TRIGIADTO> TS_TGXUAT_TUIXACH_THITRUONG_HS(final String maHQ ,final int thang, final int nam, final String loaiXN);
	public List<BCT_BO_NGANH_TGXN_CATRA> TS_TGXUAT_CATRA(final String maHQ ,final int thang, final int nam, final String loaiXN);
	public List<BCT_BO_NGANH_TGXN_CATRA> TS_TGNHAP_CATRA(final String maHQ ,final int thang, final int nam, final String loaiXN);
}
