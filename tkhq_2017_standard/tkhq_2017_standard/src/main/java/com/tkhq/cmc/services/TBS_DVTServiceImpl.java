package com.tkhq.cmc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tkhq.cmc.dao.TBS_DVTDAO;
import com.tkhq.cmc.model.Tbs_Dvt;

@Service("tbs_dvtService")
@Transactional
public class TBS_DVTServiceImpl implements TBS_DVTService{
	@Autowired
	private TBS_DVTDAO tbs_dvtDAO;

	public Tbs_Dvt findById(String maDvt) {
		
		return tbs_dvtDAO.findById(maDvt);
	}

	public Tbs_Dvt findByName(String tenDvt) {
		return tbs_dvtDAO.findByName(tenDvt);
	}

	public void insertTBS_DVT(Tbs_Dvt tbsDvt) throws Exception {
		tbs_dvtDAO.insertTBS_DVT(tbsDvt);
	}

	public void deleteById(String maDvt) {
		tbs_dvtDAO.deleteById(maDvt);
	}

	public List<Tbs_Dvt> findAll() {
		return tbs_dvtDAO.findAll();
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public void updateTBS_DVT(Tbs_Dvt tbsDvt) {
		tbs_dvtDAO.updateTBS_DVT(tbsDvt);
	}

	@Override
	public long getSequence() {
		return tbs_dvtDAO.getSequence();
	}

	@Override
	public long countTotal(String maDvt, String tenDvt) {
		return tbs_dvtDAO.countTotal(maDvt, tenDvt);
	}

	@Override
	public List<Tbs_Dvt> search(String maDvt, String tenDvt, int firstRow,
			int maxRow) {
		return tbs_dvtDAO.search(maDvt, tenDvt, firstRow, maxRow);
	}

}
