package com.tkhq.cmc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tkhq.cmc.dao.Tbd_Sys_ResourceDAO;
import com.tkhq.cmc.model.TbdSysUsers;
import com.tkhq.cmc.model.Tbd_Sys_Resource;

@Service("tbd_sys_resourceService")
@Transactional
public class Tbd_Sys_ResourceServiceImpl implements Tbd_Sys_ResourceService{
	@Autowired
	private Tbd_Sys_ResourceDAO tbdSysResourceDao;
	
	public Tbd_Sys_Resource findById(Integer resourceId) {
		return tbdSysResourceDao.findById(resourceId);
	}

	public void insertTbdSysResource(Tbd_Sys_Resource tbdSysResource) throws Exception {
		tbdSysResourceDao.insertTbdSysResource(tbdSysResource);
	}

	public void updateTbdSysResource(Tbd_Sys_Resource tbdSysResource)
			throws Exception {
		tbdSysResourceDao.updateTbdSysResource(tbdSysResource);
	}

	public void deleteById(Integer resourceId) {
		tbdSysResourceDao.deleteById(resourceId);
	}

	public void deleteAll() {
		tbdSysResourceDao.deleteAll();	
	}

	public List<Tbd_Sys_Resource> search(int firstRow, int maxRow) {
		return tbdSysResourceDao.search(firstRow, maxRow);
	}

	public long countTotal() {
		return tbdSysResourceDao.countTotal();
	}

	public List<TbdSysUsers> getLstUser() {
		return tbdSysResourceDao.getLstUser();
	}

}
