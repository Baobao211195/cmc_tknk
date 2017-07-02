package com.tkhq.cmc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tkhq.cmc.dao.TbsDvtVnaccsDAO;
import com.tkhq.cmc.model.TbsDvtVnaccs;

@Service("tbsDvtVnaccsService")
@Transactional
public class TbsDvtVnaccsServiceImpl implements TbsDvtVnaccsService{
	
	@Autowired
	private TbsDvtVnaccsDAO tbsDvtVnaccsDAO;
	
	public List<TbsDvtVnaccs> findAll() {
		return tbsDvtVnaccsDAO.findAll();
	}
	
	public void insertTbsDvtVnaccs(TbsDvtVnaccs tbsDvtVnaccs) throws Exception {
		tbsDvtVnaccsDAO.insertTbsDvtVnaccs(tbsDvtVnaccs);
	}
	
	public TbsDvtVnaccs findById(String maDvt) {
		return tbsDvtVnaccsDAO.findById(maDvt);
	}
	
	public void updateTbsDvtVnaccs(TbsDvtVnaccs tbsDvtVnaccs) {
		tbsDvtVnaccsDAO.updateTbsDvtVnaccs(tbsDvtVnaccs);
		
	}

	public void deleteByMaDvt(String maDvt) {
		tbsDvtVnaccsDAO.deleteByMaDvt(maDvt);
		
	}
	
	public List<TbsDvtVnaccs> searchTbsDvtVnaccs(String maDvt, String tenDvt,
			String tenDvtv, String tenDvtUni, int minRow, int maxRow){
		return tbsDvtVnaccsDAO.searchTbsDvtVnaccs(maDvt, tenDvt, tenDvtv, tenDvtUni, minRow, maxRow);
	}
	
	public long countTotal(String maDvt, String tenDvt, String tenDvtv, String tenDvtUni){
		return tbsDvtVnaccsDAO.countTotal(maDvt, tenDvt, tenDvtv, tenDvtUni);
	}
	
}
