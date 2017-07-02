package com.tkhq.cmc.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tkhq.cmc.services.Tbd_sys_userService;

//import com.tkhq.cmc.dao.UserDAO;

@RestController
public class LoginRestController {

	@Autowired
	private Tbd_sys_userService userService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)

	public ResponseEntity<Boolean> checkLogin(@RequestParam("username") String username,
			@RequestParam("password") String password) {
		boolean checkLogin = false;
		if (userService.checkLogin(username, password) == true) {
			checkLogin = true;
			return new ResponseEntity<Boolean>(checkLogin, HttpStatus.OK);
		} else
			checkLogin = false;
		return new ResponseEntity<Boolean>(checkLogin, HttpStatus.BAD_REQUEST);

	}

}
