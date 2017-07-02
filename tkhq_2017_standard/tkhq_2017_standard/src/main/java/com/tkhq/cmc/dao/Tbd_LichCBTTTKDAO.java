package com.tkhq.cmc.dao;

import java.util.List;

import com.tkhq.cmc.model.TbdSysUsers;
import com.tkhq.cmc.model.Tbd_LichCB_TTTK;

public interface Tbd_LichCBTTTKDAO {
	List<Tbd_LichCB_TTTK> search(String namCB, String loaiLichCB);
	
	Tbd_LichCB_TTTK findById(Integer lichCBTTId);
	
	void insertEntity(Tbd_LichCB_TTTK entity) throws Exception;
	
	void updateEntity(Tbd_LichCB_TTTK entity) throws Exception;
	
	List<TbdSysUsers> getLstUser();
}
