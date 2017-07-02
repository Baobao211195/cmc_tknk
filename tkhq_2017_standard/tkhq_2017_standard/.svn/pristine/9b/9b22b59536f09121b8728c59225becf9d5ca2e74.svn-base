package com.tkhq.cmc.services;

import java.util.List;

import com.tkhq.cmc.model.Tbs_BieuThue;

public interface TBS_BieuThueService {
	Tbs_BieuThue findById(Integer bieuThueId);
	
	List<Tbs_BieuThue> findByName(String tenBieuThue);
	
	void insertTbs_BieuThue(Tbs_BieuThue tbsBieuThue) throws Exception;
	
	void updateTbs_BieuThue(Tbs_BieuThue tbsBieuThue);
	
	void deleteById(Integer bieuThueId);

	List<Tbs_BieuThue> findAll();
	
	void deleteAll();
	
	Integer getSequence();
	
	List<Tbs_BieuThue> searchBieuThue(String maBieuThue, String tenBieuThue, String maHS, int minRow, int maxRow);
	
	long countTotal(String maBieuThue, String tenBieuThue, String maHS);
}
