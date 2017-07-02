package com.tkhq.cmc.services;

import java.util.List;

import com.tkhq.cmc.model.Tbs_Haiquan_KTTXNK;


public interface Tbs_Haiquan_KTTXNKService {
 
	Tbs_Haiquan_KTTXNK getHQByMa(String ma);
	
	List<Tbs_Haiquan_KTTXNK> getAllHaiQuan();
	
	List<Tbs_Haiquan_KTTXNK> getAllCucHaiQuan ();
	
	List<Tbs_Haiquan_KTTXNK> getChiCucByCuc (String maCuc);
}
