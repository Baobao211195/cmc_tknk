package com.tkhq.cmc.dao;

import java.util.List;

import com.tkhq.cmc.model.Tbs_TinhTP;

public interface TBS_TinhTPDAO {
	Tbs_TinhTP findById(String maTinhTP);
	
	List<Tbs_TinhTP> findByName(String maTinhTP, String tenTinhTP, int firstRow, int maxRow);
	
	void insertTbs_TinhTP(Tbs_TinhTP tbsTinhTP) throws Exception;
	
	void updateTbs_TinhTP(Tbs_TinhTP tbsTinhTP) throws Exception;
	
	void deleteById(String maTinhTP) throws Exception;

	List<Tbs_TinhTP> findAll();
	
	void deleteAll();
	
	long countTotal(String maTinhTP, String tenTinhTP);
	
	long getSequence();
}
