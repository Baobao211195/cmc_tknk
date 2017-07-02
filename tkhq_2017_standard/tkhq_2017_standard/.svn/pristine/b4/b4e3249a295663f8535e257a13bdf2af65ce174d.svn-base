package com.tkhq.cmc.services;

import java.util.List;

import com.tkhq.cmc.model.Tbs_ChuyenDe;

public interface Tbs_ChuyenDeService {
	
void insertTbs_ChuyenDe(Tbs_ChuyenDe tbs_chuyende)	throws Exception;	
	
	Tbs_ChuyenDe findByMaCDe(String maCDe);
	
	void updateTbs_chuyende(Tbs_ChuyenDe tbs_chuyende);

	void deleteByMaCDe(String maCDe);

	List<Tbs_ChuyenDe> searchChuyenDe(String maCDe, String tenCDe, String maHang,String motaHH);
	
	long countTotal(String maCDe, String tenCDe, String maHang, String motaHH);
}
