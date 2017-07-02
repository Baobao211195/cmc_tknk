package com.tkhq.cmc.dao;

import java.util.List;

import com.tkhq.cmc.model.Tbs_Dvt;

public interface TBS_DVTDAO{
	Tbs_Dvt findById(String maDvt);
	
	Tbs_Dvt findByName(String tenDvt);
	
	void insertTBS_DVT(Tbs_Dvt tbsDvt) throws Exception;
	
	void updateTBS_DVT(Tbs_Dvt tbsDvt);
	
	void deleteById(String maDvt);

	List<Tbs_Dvt> findAll();
	
	void deleteAll();
	
	long getSequence();
	
	long countTotal(String maDvt, String tenDvt);
	
	List<Tbs_Dvt> search(String maDvt, String tenDvt, int firstRow, int maxRow);
}
