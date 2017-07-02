package com.tkhq.cmc.dao;

import java.util.List;

import com.tkhq.cmc.model.Tbs_Haiquan_KTTXNK;

public interface Tbs_Haiquan_KTTXNKDAO {
	
	Tbs_Haiquan_KTTXNK getHaiQuanCTByMaChiCuc (String maChiCuc);
	List<Tbs_Haiquan_KTTXNK> getAllHaiQuan ();
	List<Tbs_Haiquan_KTTXNK> getAllCucHaiQuan ();
	List<Tbs_Haiquan_KTTXNK> getChiCucByCuc (String maCuc);
	
}
