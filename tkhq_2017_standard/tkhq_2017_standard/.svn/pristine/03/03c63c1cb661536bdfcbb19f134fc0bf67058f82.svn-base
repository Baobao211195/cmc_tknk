package com.tkhq.cmc.dao;

import java.util.List;

import com.tkhq.cmc.model.TbdSysUsers;
import com.tkhq.cmc.model.Tbd_Sys_Resource;

public interface Tbd_Sys_ResourceDAO {
	Tbd_Sys_Resource findById(Integer resourceId);
	
	void insertTbdSysResource(Tbd_Sys_Resource tbdSysResource) throws Exception;
	
	void updateTbdSysResource(Tbd_Sys_Resource tbdSysResource) throws Exception;
	
	void deleteById(Integer resourceId);
	
	void deleteAll();
	
	List<Tbd_Sys_Resource> search(int firstRow, int maxRow);
	
	long countTotal();
	
	List<TbdSysUsers> getLstUser();
}
