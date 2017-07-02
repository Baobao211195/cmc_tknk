package com.tkhq.cmc.dto;

public class BCXNKHHTNLHDTO {
	private int thang;
	private int nam;
	private String ten_nhom_lh;
	private String ten_cuc;
	private String ma_hq;
	private String ten_hq;
	private double tong_sotk_xk;
	private double tong_sotk_nk;
	private double tong_trigia_xk;
	private double tong_trigia_nk;
	public BCXNKHHTNLHDTO(int thang, int nam, String ten_nhom_lh,
			String ten_cuc, String ma_hq, String ten_hq, double tong_sotk_xk,
			double tong_sotk_nk, double tong_trigia_xk, double tong_trigia_nk) {
		super();
		this.thang = thang;
		this.nam = nam;
		this.ten_nhom_lh = ten_nhom_lh;
		this.ten_cuc = ten_cuc;
		this.ma_hq = ma_hq;
		this.ten_hq = ten_hq;
		this.tong_sotk_xk = tong_sotk_xk;
		this.tong_sotk_nk = tong_sotk_nk;
		this.tong_trigia_xk = tong_trigia_xk;
		this.tong_trigia_nk = tong_trigia_nk;
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
	public String getTen_nhom_lh() {
		return ten_nhom_lh;
	}
	public void setTen_nhom_lh(String ten_nhom_lh) {
		this.ten_nhom_lh = ten_nhom_lh;
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
	public double getTong_sotk_xk() {
		return tong_sotk_xk;
	}
	public void setTong_sotk_xk(double tong_sotk_xk) {
		this.tong_sotk_xk = tong_sotk_xk;
	}
	public double getTong_sotk_nk() {
		return tong_sotk_nk;
	}
	public void setTong_sotk_nk(double tong_sotk_nk) {
		this.tong_sotk_nk = tong_sotk_nk;
	}
	public double getTong_trigia_xk() {
		return tong_trigia_xk;
	}
	public void setTong_trigia_xk(double tong_trigia_xk) {
		this.tong_trigia_xk = tong_trigia_xk;
	}
	public double getTong_trigia_nk() {
		return tong_trigia_nk;
	}
	public void setTong_trigia_nk(double tong_trigia_nk) {
		this.tong_trigia_nk = tong_trigia_nk;
	}
	
}
