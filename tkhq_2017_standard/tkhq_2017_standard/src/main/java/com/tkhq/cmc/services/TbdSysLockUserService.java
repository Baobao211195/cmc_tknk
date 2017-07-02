package com.tkhq.cmc.services;

import java.util.List;

import com.tkhq.cmc.dto.Tbd_Sys_LockUsersDTO;

public interface TbdSysLockUserService {
	
	public List<Tbd_Sys_LockUsersDTO> getListLockUsers();
	
	public Tbd_Sys_LockUsersDTO getLockUserByName(String userName);
	
	public int deleteLockUserByName(String userName);

}
