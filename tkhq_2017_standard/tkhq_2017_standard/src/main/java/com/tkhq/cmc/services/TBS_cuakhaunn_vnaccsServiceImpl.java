package com.tkhq.cmc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tkhq.cmc.dao.TBS_cuakhaunn_vnaccsDAO;
import com.tkhq.cmc.model.TBS_cuakhaunn_vnaccs;
import com.tkhq.cmc.model.Tbs_BieuThue;

@Service("tbs_cuakhaunn_vnaccsService")
@Transactional
public class TBS_cuakhaunn_vnaccsServiceImpl implements TBS_cuakhaunn_vnaccsService{
	
	@Autowired
	private TBS_cuakhaunn_vnaccsDAO tbs_cuakhaunn_vnaccsDAO;
	
	public List<TBS_cuakhaunn_vnaccs> findAll() {
		return tbs_cuakhaunn_vnaccsDAO.findAll();
	}
	
	public void insertTbs_Cuakhaunn(TBS_cuakhaunn_vnaccs tbs_cuakhaunn_vnaccs) throws Exception {
		tbs_cuakhaunn_vnaccsDAO.insertTbs_Cuakhaunn(tbs_cuakhaunn_vnaccs);
	}
	
	public TBS_cuakhaunn_vnaccs findById(String maCang) {
		return tbs_cuakhaunn_vnaccsDAO.findById(maCang);
	}
	
	public void updateTbs_cuakhaunn(TBS_cuakhaunn_vnaccs tbs_cuakhaunn_vnaccs) {
		tbs_cuakhaunn_vnaccsDAO.updateTbs_cuakhaunn(tbs_cuakhaunn_vnaccs);
		
	}

	public void deleteByMaCang(String maCang) {
		tbs_cuakhaunn_vnaccsDAO.deleteByMaCang(maCang);
		
	}
	
	public List<TBS_cuakhaunn_vnaccs> searchCuaKhauNN(String maCang, String loaiCang, String tenNuoc, String tenTP, 
			String maNuoc, int minRow, int maxRow){
		return tbs_cuakhaunn_vnaccsDAO.searchCuaKhauNN(maCang, loaiCang, tenNuoc, tenTP, maNuoc, minRow, maxRow);
	}
	
	public long countTotal(String maCang, String loaiCang, String tenNuoc, String tenTP, String maNuoc){
		return tbs_cuakhaunn_vnaccsDAO.countTotal(maCang, loaiCang, tenNuoc, tenTP, maNuoc);
	}
	
}
