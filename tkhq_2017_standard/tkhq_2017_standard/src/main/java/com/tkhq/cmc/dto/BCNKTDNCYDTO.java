package com.tkhq.cmc.dto;

public class BCNKTDNCYDTO {
	private int thang;
	private int nam;
	private String ten_cuc;
	private String ma_dv;
	private String ten_dv;
	private double tri_gia;
	private int nhom;
	public BCNKTDNCYDTO(int thang, int nam, String ten_cuc, String ma_dv,
			String ten_dv, double tri_gia, int nhom) {
		super();
		this.thang = thang;
		this.nam = nam;
		this.ten_cuc = ten_cuc;
		this.ma_dv = ma_dv;
		this.ten_dv = ten_dv;
		this.tri_gia = tri_gia;
		this.nhom = nhom;
	}
	public int getThang() {
		return thang;
	}
	public void setThang(int thang) {
		this.thang = thang;
	}
	public int getNam() {
		return nam;
	}
	public void setNam(int nam) {
		this.nam = nam;
	}
	public String getTen_cuc() {
		return ten_cuc;
	}
	public void setTen_cuc(String ten_cuc) {
		this.ten_cuc = ten_cuc;
	}
	public String getMa_dv() {
		return ma_dv;
	}
	public void setMa_dv(String ma_dv) {
		this.ma_dv = ma_dv;
	}
	public String getTen_dv() {
		return ten_dv;
	}
	public void setTen_dv(String ten_dv) {
		this.ten_dv = ten_dv;
	}
	public double getTri_gia() {
		return tri_gia;
	}
	public void setTri_gia(double tri_gia) {
		this.tri_gia = tri_gia;
	}
	public int getNhom() {
		return nhom;
	}
	public void setNhom(int nhom) {
		this.nhom = nhom;
	}
	
}
