package com.tkhq.cmc.controller.rest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tkhq.cmc.dao.PhanQuyenNSDDAO;
import com.tkhq.cmc.dto.RoleGroup;
import com.tkhq.cmc.dto.RoleUpdateDTO;
import com.tkhq.cmc.utils.Utils;

@RestController
public class PhanquyenNSDRestController {

	@Autowired
	private PhanQuyenNSDDAO phanquyenNSDDAO;

	@RequestMapping(value = "/getAllRoleByUser/{userId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)

	public ResponseEntity<List<RoleGroup>> getListRoleByUserId(@PathVariable("userId") int userId) {

		List<RoleGroup> list = phanquyenNSDDAO.getListRoleByUserId(userId);
		if (list != null) {
			return new ResponseEntity<List<RoleGroup>>(list, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<RoleGroup>>(list, HttpStatus.NO_CONTENT);
		}
	}

	@RequestMapping(value = "/getAllRoleByGroup/{groupId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)

	public ResponseEntity<List<RoleGroup>> getListRoleByGroupId(@PathVariable("groupId") int groupId) {

		List<RoleGroup> list = phanquyenNSDDAO.getListRoleByGroupId(groupId);
		if (list != null) {
			return new ResponseEntity<List<RoleGroup>>(list, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<RoleGroup>>(list, HttpStatus.NO_CONTENT);
		}
	}

	// @RequestMapping(value="/updateRole/{type}",method=RequestMethod.PUT)
	// @RequestMapping(value="/updateRole/",method=RequestMethod.PUT,produces=MediaType.APPLICATION_JSON_VALUE)
	// public ResponseEntity<Integer> updateRoleByUserId(@PathVariable("type")
	// int type,@RequestBody RoleUpdateDTO roles){
	//
	// return new ResponseEntity<Integer>(1,HttpStatus.OK);
	// public ResponseEntity<Integer> updateRoleByUserId(@RequestBody
	// RoleUpdateDTO roles){
	// if(type == 0){
	// if(phanquyenNSDDAO.updateRoleByGroup(roles.getId(),roles.getRoles()) ==
	// 1){
	// return new ResponseEntity<Integer>(1,HttpStatus.OK);
	// }else return new
	// ResponseEntity<Integer>(0,HttpStatus.SERVICE_UNAVAILABLE);
	// }else if (type==1){
	// if(phanquyenNSDDAO.updateRoleByUserId(roles.getId(), roles.getRoles()) ==
	// 1){
	// return new ResponseEntity<Integer>(1,HttpStatus.OK);
	// }else {
	// return new ResponseEntity<Integer>(0,HttpStatus.SERVICE_UNAVAILABLE);
	// }
	// }else {
	// return new ResponseEntity<Integer>(500,HttpStatus.BAD_REQUEST);
	// }
	//
	// }

	@RequestMapping(value = "/getNameFunction/{groupId}", method = RequestMethod.GET)
	public ResponseEntity<List<RoleGroup>> getNameFunction(@PathVariable("groupId") int groupId) {

		List<RoleGroup> role = phanquyenNSDDAO.getListRoleByGroupId(groupId);
		List<RoleGroup> nameFunction = new ArrayList<RoleGroup>();
		if (role != null) {

			for (int i = 0; i < role.size(); i++) {
				String functionName = phanquyenNSDDAO.nameFunction(role.get(i).getfunctionId());
				nameFunction.add(new RoleGroup(role.get(i).getfunctionId(), functionName));
			}

			return new ResponseEntity<List<RoleGroup>>(nameFunction, HttpStatus.OK);
		} else
			return new ResponseEntity<List<RoleGroup>>(HttpStatus.NOT_FOUND);

	}

	@RequestMapping(value = "/test/{id}", method = RequestMethod.PUT)
	public ResponseEntity<String> test(@PathVariable("id") int id, @RequestBody RoleGroup role) {
		return new ResponseEntity<String>(HttpStatus.OK);
	}

	@RequestMapping(value = "/updateRole/{type}", method = RequestMethod.PUT)
	public ResponseEntity<Integer> updateRoleByType(@PathVariable("type") int type, @RequestBody RoleUpdateDTO update)
			throws IOException {
		if (type == 0) {
			if (phanquyenNSDDAO.updateRoleByGroup(update.getId(), update.getRoles()) == 1) {
				return new ResponseEntity<Integer>(1, HttpStatus.OK);
			} else {
				return new ResponseEntity<Integer>(0, HttpStatus.NOT_FOUND);
			}
		} else

		if (type == 1) {
			if (phanquyenNSDDAO.updateRoleByUserId(update.getId(), update.getRoles()) == 1) {
				return new ResponseEntity<Integer>(1, HttpStatus.OK);
			} else {
				return new ResponseEntity<Integer>(0, HttpStatus.NOT_FOUND);
			}
		} else {
			return new ResponseEntity<Integer>(HttpStatus.NOT_FOUND);
		}
	}

}
