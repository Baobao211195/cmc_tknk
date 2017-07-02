package com.tkhq.cmc.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tkhq.cmc.dto.Tbd_Sys_LockUsersDTO;
import com.tkhq.cmc.services.TbdSysLockUserService;

@RestController
public class TbdSysLockUserRestController {
	
	@Autowired
	TbdSysLockUserService  tbdSysLockUserService;
	
	@RequestMapping(value = "/listLockUsers", method = RequestMethod.GET)
	public ResponseEntity<List<Tbd_Sys_LockUsersDTO>> getListLockUser (){
		List<Tbd_Sys_LockUsersDTO> listDto = tbdSysLockUserService.getListLockUsers();
		
		if (listDto == null){
			return new ResponseEntity<List<Tbd_Sys_LockUsersDTO>>(listDto, HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Tbd_Sys_LockUsersDTO>>(listDto, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/deleteLockUsers", method = RequestMethod.GET)
	public ResponseEntity<Integer>  deleteLockUser(String userName){
		
		Tbd_Sys_LockUsersDTO userDto = tbdSysLockUserService.getLockUserByName(userName);
		int deleteFlg = 0;
		if (userDto == null){
			deleteFlg = 2;
			return new ResponseEntity<>(deleteFlg, HttpStatus.CONFLICT);
		}
		deleteFlg = tbdSysLockUserService.deleteLockUserByName(userName);

		return new ResponseEntity<Integer>(deleteFlg, HttpStatus.OK);
	}
}
