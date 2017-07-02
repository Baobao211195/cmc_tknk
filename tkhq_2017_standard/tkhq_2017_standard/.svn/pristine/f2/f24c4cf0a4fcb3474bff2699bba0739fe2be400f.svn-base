package com.tkhq.cmc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tkhq.cmc.dao.TBS_BieuThueDAO;
import com.tkhq.cmc.model.Tbs_BieuThue;

@Service("tbs_bieuthueService")
@Transactional
public class TBS_BieuThueServiceImpl implements TBS_BieuThueService{
	@Autowired
	private TBS_BieuThueDAO tbs_bieuthueDAO;

	public Tbs_BieuThue findById(Integer bieuThueId) {
		return tbs_bieuthueDAO.findById(bieuThueId);
	}

	public List<Tbs_BieuThue> findByName(String tenBieuThue) {
		return tbs_bieuthueDAO.findByName(tenBieuThue);
	}

	public void insertTbs_BieuThue(Tbs_BieuThue tbsBieuThue) throws Exception {
		tbs_bieuthueDAO.insertTbs_BieuThue(tbsBieuThue);
	}

	public void updateTbs_BieuThue(Tbs_BieuThue tbsBieuThue) {
		tbs_bieuthueDAO.updateTbs_BieuThue(tbsBieuThue);
		
	}

	public void deleteById(Integer bieuThueId) {
		tbs_bieuthueDAO.deleteById(bieuThueId);
		
	}

	public List<Tbs_BieuThue> findAll() {
		return tbs_bieuthueDAO.findAll();
	}

	public void deleteAll() {
		tbs_bieuthueDAO.deleteAll();
	}
	
	public Integer getSequence(){
		return tbs_bieuthueDAO.getSequence();
	}
	
	public List<Tbs_BieuThue> searchBieuThue(String maBieuThue, String tenBieuThue, String maHS, int minRow, int maxRow){
		return tbs_bieuthueDAO.searchBieuThue(maBieuThue, tenBieuThue, maHS, minRow, maxRow);
	}
	
	public long countTotal(String maBieuThue, String tenBieuThue, String maHS){
		return tbs_bieuthueDAO.countTotal(maBieuThue, tenBieuThue, maHS);
	}

}
