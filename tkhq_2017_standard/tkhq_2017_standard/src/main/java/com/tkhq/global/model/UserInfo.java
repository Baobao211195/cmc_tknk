package com.tkhq.global.model;


/*
 * Readonly User info modeling
 */
public class UserInfo {

	private String username;
	private String fullname;
	private String ma_hq;
	
	public UserInfo(String username){
		this.username = username;
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getMa_hq() {
		return ma_hq;
	}

	public void setMa_hq(String ma_hq) {
		this.ma_hq = ma_hq;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
}
