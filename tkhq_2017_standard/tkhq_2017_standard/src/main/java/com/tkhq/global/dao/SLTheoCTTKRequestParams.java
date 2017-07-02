package com.tkhq.global.dao;

public class SLTheoCTTKRequestParams {
	private String trangthai;	//SB, DC, CT, UOC
	private String nhx;	//N, X, XNK
	private String username;
	private String maCucHQ;
	private String maChicucHQ;
	public String getTrangthai() {
		return trangthai;
	}
	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}
	public String getNhx() {
		return nhx;
	}
	public void setNhx(String nhx) {
		this.nhx = nhx;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMaCucHQ() {
		return maCucHQ;
	}
	public void setMaCucHQ(String maCucHQ) {
		this.maCucHQ = maCucHQ;
	}
	public String getMaChicucHQ() {
		return maChicucHQ;
	}
	public void setMaChicucHQ(String maChicucHQ) {
		this.maChicucHQ = maChicucHQ;
	}
	public SLTheoCTTKRequestParams(String trangthai, String nhx, String username, String maCucHQ, String maChicucHQ) {
		super();
		this.trangthai = trangthai;
		this.nhx = nhx;
		this.username = username;
		this.maCucHQ = maCucHQ;
		this.maChicucHQ = maChicucHQ;
	}
	public SLTheoCTTKRequestParams(){}
}
