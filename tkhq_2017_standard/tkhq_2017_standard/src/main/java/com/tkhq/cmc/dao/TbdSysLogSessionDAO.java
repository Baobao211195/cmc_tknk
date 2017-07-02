package com.tkhq.cmc.dao;

import java.util.List;

import com.tkhq.cmc.model.TbdSysLogSession;

public interface TbdSysLogSessionDAO {

	void insert(String username) throws Exception;
	List<TbdSysLogSession> getAll();
	void update(TbdSysLogSession entity) throws Exception;
	void updateNewLogUser(String username) throws Exception;
	List<TbdSysLogSession> search(String username);
}
