package com.tkhq.cmc.dao;

import java.util.List;

import com.tkhq.cmc.dto.Tbd_Sys_LockUsersDTO;

public interface TbdSysLockUserDAO {
	
	public List<Tbd_Sys_LockUsersDTO> findAll();
	
	public Tbd_Sys_LockUsersDTO fildByName(String userName);
	
	public int deleteByName(String userName);

}
