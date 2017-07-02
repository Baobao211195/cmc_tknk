package com.tkhq.cmc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tkhq.cmc.dao.Tbs_Mahs_dkghDAO;
import com.tkhq.cmc.model.Tbs_Mahs_dkgh;

@Service("Tbs_Mahs_dkghService")
@Transactional
public class Tbs_Mahs_dkghServiceImpl implements Tbs_Mahs_dkghService{
	@Autowired
	private Tbs_Mahs_dkghDAO tbs_Mahs_dkghDAO;

	public Tbs_Mahs_dkgh findById(Long STT) {
		return tbs_Mahs_dkghDAO.findById(STT);
	}
//
//	public List<Tbs_BieuThue> findByName(String tenBieuThue) {
//		return tbs_bieuthueDAO.findByName(tenBieuThue);
//	}
//
	public void insertTbs_Mahs_dkgh(Tbs_Mahs_dkgh tbsBieuThue) throws Exception {
		tbs_Mahs_dkghDAO.insertTbs_Mahs_dkgh(tbsBieuThue);
	}

	public void updateTbs_Mahs_dkgh(Tbs_Mahs_dkgh tbsBieuThue) {
		tbs_Mahs_dkghDAO.updateTbs_Mahs_dkgh(tbsBieuThue);
		
	}
//
//	public void deleteById(Integer bieuThueId) {
//		tbs_bieuthueDAO.deleteById(bieuThueId);
//		
//	}

	public List<Tbs_Mahs_dkgh> findAll() {
		return tbs_Mahs_dkghDAO.findAll();
	}

//	public void deleteAll() {
//		tbs_bieuthueDAO.deleteAll();
//	}
//	
//	public Integer getSequence(){
//		return tbs_bieuthueDAO.getSequence();
//	}
//	
//	public List<Tbs_BieuThue> searchBieuThue(String maBieuThue, String tenBieuThue, String maHS, int minRow, int maxRow){
//		return tbs_bieuthueDAO.searchBieuThue(maBieuThue, tenBieuThue, maHS, minRow, maxRow);
//	}
//	
//	public long countTotal(String maBieuThue, String tenBieuThue, String maHS){
//		return tbs_bieuthueDAO.countTotal(maBieuThue, tenBieuThue, maHS);
//	}

}
