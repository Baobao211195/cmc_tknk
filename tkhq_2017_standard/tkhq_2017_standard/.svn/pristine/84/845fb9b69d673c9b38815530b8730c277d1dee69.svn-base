package com.tkhq.cmc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tkhq.cmc.dao.TbdSysLockUserDAO;
import com.tkhq.cmc.dto.Tbd_Sys_LockUsersDTO;


@Service
@Transactional
public class TbdSysLockUserServiceImpl implements TbdSysLockUserService{
	
	@Autowired
	TbdSysLockUserDAO tbdSysLockUserDAO;

	@Override
	public List<Tbd_Sys_LockUsersDTO> getListLockUsers() {
		return tbdSysLockUserDAO.findAll();
	}

	@Override
	public Tbd_Sys_LockUsersDTO getLockUserByName(String userName) {
		return tbdSysLockUserDAO.fildByName(userName);
	}

	@Override
	public int deleteLockUserByName(String userName) {
		return tbdSysLockUserDAO.deleteByName(userName);
	}
}
