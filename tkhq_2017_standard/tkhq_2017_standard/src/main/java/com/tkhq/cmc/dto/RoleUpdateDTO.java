package com.tkhq.cmc.dto;

import java.util.List;

import com.tkhq.cmc.model.Tbd_Sys_Functions;

public class RoleUpdateDTO {

	private int id;
	private List<Tbd_Sys_Functions> roles;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Tbd_Sys_Functions> getRoles() {
		return roles;
	}

	public void setRoles(List<Tbd_Sys_Functions> roles) {
		this.roles = roles;
	}

	public RoleUpdateDTO(int id, List<Tbd_Sys_Functions> roles) {
		this.id = id;
		this.roles = roles;
	}

	public RoleUpdateDTO() {
		super();
	}
}
