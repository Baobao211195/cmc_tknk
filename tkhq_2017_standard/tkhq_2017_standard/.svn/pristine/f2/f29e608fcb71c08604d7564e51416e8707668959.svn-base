package com.tkhq.cmc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tkhq.cmc.dao.TBS_LHinhMDDAO;
import com.tkhq.cmc.model.Tbs_LHinhMD;

public class TBS_LHinhMDServiceImpl implements TBS_LHinhMDService{
	@Autowired
	private TBS_LHinhMDDAO tbsLhinhMDDao;

	public Tbs_LHinhMD findById(Integer lhinhMDId) {
		return tbsLhinhMDDao.findById(lhinhMDId);
	}

	public void insertEntity(Tbs_LHinhMD tbsLhinhMD) throws Exception {
		tbsLhinhMDDao.insertEntity(tbsLhinhMD);		
	}

	public void updateEntity(Tbs_LHinhMD tbsLhinhMD) throws Exception {
		tbsLhinhMDDao.updateEntity(tbsLhinhMD);	
	}

	public void deleteById(Integer lhinhMDId) {
		tbsLhinhMDDao.deleteById(lhinhMDId);	
	}

	public List<Tbs_LHinhMD> findAll() {
		return tbsLhinhMDDao.findAll();
	}

	public void deleteAll() {
		tbsLhinhMDDao.deleteAll();
	}

	public List<Tbs_LHinhMD> search(String nhomLH, String maLH, String tenLH,
			String tenVT, int firstRow, int maxRow) {
		return tbsLhinhMDDao.search(nhomLH, maLH, tenLH, tenVT, firstRow, maxRow);
	}

	public long countTotal(String nhomLH, String maLH, String tenLH,
			String tenVT) {
		return tbsLhinhMDDao.countTotal(nhomLH, maLH, tenLH, tenVT);
	}

}
