package com.tkhq.global.model;

public class MatHang {

	private String ma;
	private String ten;
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public MatHang(String ma, String ten) {
		super();
		this.ma = ma;
		this.ten = ten;
	}
}
