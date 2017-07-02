package com.tkhq.cmc.dto;

public class BCXNKTTP022TDTO {
	private int thang;
	private int nam;
	private String loai;
	private String matinhtp;
	private String tentinhtp;
	private double trigia_ky_xk;
	private double trigia_lk_xk;
	private double trigia_ky_nk;
	private double trigia_lk_nk;
	public BCXNKTTP022TDTO(int thang, int nam, String loai,
			String matinhtp, String tentinhtp, double trigia_ky_xk,
			double trigia_lk_xk, double trigia_ky_nk, double trigia_lk_nk) {
		super();
		this.thang = thang;
		this.nam = nam;
		this.loai = loai;
		this.matinhtp = matinhtp;
		this.tentinhtp = tentinhtp;
		this.trigia_ky_xk = trigia_ky_xk;
		this.trigia_lk_xk = trigia_lk_xk;
		this.trigia_ky_nk = trigia_ky_nk;
		this.trigia_lk_nk = trigia_lk_nk;
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
	public String getLoai() {
		return loai;
	}
	public void setLoai(String loai) {
		this.loai = loai;
	}
	public String getMatinhtp() {
		return matinhtp;
	}
	public void setMatinhtp(String matinhtp) {
		this.matinhtp = matinhtp;
	}
	public String getTentinhtp() {
		return tentinhtp;
	}
	public void setTentinhtp(String tentinhtp) {
		this.tentinhtp = tentinhtp;
	}
	public double getTrigia_ky_xk() {
		return trigia_ky_xk;
	}
	public void setTrigia_ky_xk(double trigia_ky_xk) {
		this.trigia_ky_xk = trigia_ky_xk;
	}
	public double getTrigia_lk_xk() {
		return trigia_lk_xk;
	}
	public void setTrigia_lk_xk(double trigia_lk_xk) {
		this.trigia_lk_xk = trigia_lk_xk;
	}
	public double getTrigia_ky_nk() {
		return trigia_ky_nk;
	}
	public void setTrigia_ky_nk(double trigia_ky_nk) {
		this.trigia_ky_nk = trigia_ky_nk;
	}
	public double getTrigia_lk_nk() {
		return trigia_lk_nk;
	}
	public void setTrigia_lk_nk(double trigia_lk_nk) {
		this.trigia_lk_nk = trigia_lk_nk;
	}
}
