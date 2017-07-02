package com.tkhq.cmc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tkhq.cmc.dao.Tbs_Haiquan_KTTXNKDAO;
import com.tkhq.cmc.model.Tbs_Haiquan_KTTXNK;

@Service("tbs_haiquan_KTTXNKService")
@Transactional
public class Tbs_Haiquan_KTTXNKServiceImpl implements Tbs_Haiquan_KTTXNKService {

	@Autowired
	Tbs_Haiquan_KTTXNKDAO tbs_HQKTTXNKDAO ;
	
	public Tbs_Haiquan_KTTXNK getHQByMa(String ma) {
		
		return tbs_HQKTTXNKDAO.getHaiQuanCTByMaChiCuc(ma);
	}
	
	public List<Tbs_Haiquan_KTTXNK> getAllHaiQuan() {
		
		return tbs_HQKTTXNKDAO.getAllHaiQuan();
	}
	
	public List<Tbs_Haiquan_KTTXNK> getAllCucHaiQuan() {
		
		return tbs_HQKTTXNKDAO.getAllCucHaiQuan();
	}
	
	public List<Tbs_Haiquan_KTTXNK> getChiCucByCuc (String maCuc) {
		
		return tbs_HQKTTXNKDAO.getChiCucByCuc(maCuc);
	}

}
