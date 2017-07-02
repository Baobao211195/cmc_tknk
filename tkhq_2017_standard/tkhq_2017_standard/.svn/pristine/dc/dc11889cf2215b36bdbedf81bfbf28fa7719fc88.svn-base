package com.tkhq.cmc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tkhq.cmc.dao.TBS_TinhTPDAO;
import com.tkhq.cmc.model.Tbs_TinhTP;

@Service("tbs_tinhtpService")
@Transactional
public class TBS_TinhTPServiceImpl implements TBS_TinhTPService{

	@Autowired
	private TBS_TinhTPDAO tbsTinhTPDao;
	
	public Tbs_TinhTP findById(String maTinhTP) {
		return tbsTinhTPDao.findById(maTinhTP);
	}

	public List<Tbs_TinhTP> findByName(String maTinhTP, String tenTinhTP, int firstRow, int maxRow) {
		return tbsTinhTPDao.findByName(maTinhTP, tenTinhTP, firstRow, maxRow);
	}

	public void insertTbs_TinhTP(Tbs_TinhTP tbsTinhTP) throws Exception {
		tbsTinhTPDao.insertTbs_TinhTP(tbsTinhTP);
	}

	public void updateTbs_TinhTP(Tbs_TinhTP tbsTinhTP) throws Exception {
		tbsTinhTPDao.updateTbs_TinhTP(tbsTinhTP);	
	}

	public void deleteById(String maTinhTP) throws Exception {
		tbsTinhTPDao.deleteById(maTinhTP);	
	}

	public List<Tbs_TinhTP> findAll() {
		return null;
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public long countTotal(String maTinhTP, String tenTinhTP) {
		return tbsTinhTPDao.countTotal(maTinhTP, tenTinhTP);
	}

	public long getSequence() {
		return tbsTinhTPDao.getSequence();
	}

}
