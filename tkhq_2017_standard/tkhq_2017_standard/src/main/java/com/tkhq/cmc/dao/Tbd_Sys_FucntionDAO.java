package com.tkhq.cmc.dao;

import java.util.List;

import com.tkhq.cmc.dto.Tbd_Sys_FunctionsDTO;
import com.tkhq.cmc.model.Tbd_Sys_Functions;

public interface  Tbd_Sys_FucntionDAO {

	void  add(Tbd_Sys_Functions function) throws Exception;
	void delete(int id);
	List<Tbd_Sys_Functions> findByGroup(int groupId);
	List<Tbd_Sys_Functions> findByAll();
	void update(Tbd_Sys_Functions function);
	
}
