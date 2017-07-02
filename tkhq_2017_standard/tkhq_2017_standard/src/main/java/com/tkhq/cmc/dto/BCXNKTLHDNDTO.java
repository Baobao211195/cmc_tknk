package com.tkhq.cmc.dto;

public class BCXNKTLHDNDTO {
	private int thang;
	private int nam;
	private String ma_cuc;
	private String ten_cuc;
	private String ma_hq;
	private String ten_hq;
	private double trigia_xk;
	private double trigia_nk;
	private int ma_nhom_lhdn;
	private String ten_nhom_lhdn;
	public BCXNKTLHDNDTO(int thang, int nam, String ma_cuc, String ten_cuc,
			String ma_hq, String ten_hq, double trigia_xk, double trigia_nk,
			int ma_nhom_lhdn, String ten_nhom_lhdn) {
		super();
		this.thang = thang;
		this.nam = nam;
		this.ma_cuc = ma_cuc;
		this.ten_cuc = ten_cuc;
		this.ma_hq = ma_hq;
		this.ten_hq = ten_hq;
		this.trigia_xk = trigia_xk;
		this.trigia_nk = trigia_nk;
		this.ma_nhom_lhdn = ma_nhom_lhdn;
		this.ten_nhom_lhdn = ten_nhom_lhdn;
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
	public String getMa_cuc() {
		return ma_cuc;
	}
	public void setMa_cuc(String ma_cuc) {
		this.ma_cuc = ma_cuc;
	}
	public String getTen_cuc() {
		return ten_cuc;
	}
	public void setTen_cuc(String ten_cuc) {
		this.ten_cuc = ten_cuc;
	}
	public String getMa_hq() {
		return ma_hq;
	}
	public void setMa_hq(String ma_hq) {
		this.ma_hq = ma_hq;
	}
	public String getTen_hq() {
		return ten_hq;
	}
	public void setTen_hq(String ten_hq) {
		this.ten_hq = ten_hq;
	}
	public double getTrigia_xk() {
		return trigia_xk;
	}
	public void setTrigia_xk(double trigia_xk) {
		this.trigia_xk = trigia_xk;
	}
	public double getTrigia_nk() {
		return trigia_nk;
	}
	public void setTrigia_nk(double trigia_nk) {
		this.trigia_nk = trigia_nk;
	}
	public int getMa_nhom_lhdn() {
		return ma_nhom_lhdn;
	}
	public void setMa_nhom_lhdn(int ma_nhom_lhdn) {
		this.ma_nhom_lhdn = ma_nhom_lhdn;
	}
	public String getTen_nhom_lhdn() {
		return ten_nhom_lhdn;
	}
	public void setTen_nhom_lhdn(String ten_nhom_lhdn) {
		this.ten_nhom_lhdn = ten_nhom_lhdn;
	}
	
	
}
