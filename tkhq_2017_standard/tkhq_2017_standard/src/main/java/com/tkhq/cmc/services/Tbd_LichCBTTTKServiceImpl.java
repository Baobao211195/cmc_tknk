package com.tkhq.cmc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tkhq.cmc.model.TbdSysUsers;
import com.tkhq.cmc.model.Tbd_LichCB_TTTK;
import com.tkhq.cmc.dao.Tbd_LichCBTTTKDAO;;

@Service("tbdLichCBTTTKService")
@Transactional
public class Tbd_LichCBTTTKServiceImpl implements Tbd_LichCBTTTKService{
	@Autowired
	Tbd_LichCBTTTKDAO Tbd_LichCBTTTKDAO;
	
	public List<Tbd_LichCB_TTTK> search(String namCB, String loaiLichCB) {
		return Tbd_LichCBTTTKDAO.search(namCB, loaiLichCB);
	}

	public void insert(Tbd_LichCB_TTTK entity) throws Exception {
		Tbd_LichCBTTTKDAO.insertEntity(entity);
	}

	public void update(Tbd_LichCB_TTTK entity) throws Exception {
		Tbd_LichCBTTTKDAO.updateEntity(entity);
	}

	public List<TbdSysUsers> getLstUser() {
		return Tbd_LichCBTTTKDAO.getLstUser();
	}

	public Tbd_LichCB_TTTK findById(Integer lichCBTTId) {
		return Tbd_LichCBTTTKDAO.findById(lichCBTTId);
	}

}
