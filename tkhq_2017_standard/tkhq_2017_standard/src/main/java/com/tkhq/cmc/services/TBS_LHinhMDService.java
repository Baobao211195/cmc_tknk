package com.tkhq.cmc.services;

import java.util.List;

import com.tkhq.cmc.model.Tbs_LHinhMD;

public interface TBS_LHinhMDService {
Tbs_LHinhMD findById(Integer lhinhMDId);
	
	void insertEntity(Tbs_LHinhMD tbsLhinhMD) throws Exception;
	
	void updateEntity(Tbs_LHinhMD tbsLhinhMD) throws Exception;
	
	void deleteById(Integer lhinhMDId);

	List<Tbs_LHinhMD> findAll();
	
	void deleteAll();
	
	List<Tbs_LHinhMD> search(String nhomLH, String maLH, String tenLH, String tenVT, int firstRow, int maxRow);
	
	long countTotal(String nhomLH, String maLH, String tenLH, String tenVT);
}
