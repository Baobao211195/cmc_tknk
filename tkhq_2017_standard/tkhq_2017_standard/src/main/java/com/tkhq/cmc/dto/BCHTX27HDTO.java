package com.tkhq.cmc.dto;

public class BCHTX27HDTO {
	private int ky;
	private int nam;
	private String loai;
	private int stt;
	private int sapxep;
	private String ten_nhom;
	private String ten_hang;
	private String ten_dvt;
	private double luong_ky;
	private double trigia_ky;
	private double luong_lk;
	private double trigia_lk;
	public BCHTX27HDTO(int ky, int nam, String loai, int stt, int sapxep,
			String ten_nhom, String ten_hang, String ten_dvt, double luong_ky,
			double trigia_ky, double luong_lk, double trigia_lk) {
		super();
		this.ky = ky;
		this.nam = nam;
		this.loai = loai;
		this.stt = stt;
		this.sapxep = sapxep;
		this.ten_nhom = ten_nhom;
		this.ten_hang = ten_hang;
		this.ten_dvt = ten_dvt;
		this.luong_ky = luong_ky;
		this.trigia_ky = trigia_ky;
		this.luong_lk = luong_lk;
		this.trigia_lk = trigia_lk;
	}
	public int getKy() {
		return ky;
	}
	public void setKy(int ky) {
		this.ky = ky;
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
	public int getStt() {
		return stt;
	}
	public void setStt(int stt) {
		this.stt = stt;
	}
	public int getSapxep() {
		return sapxep;
	}
	public void setSapxep(int sapxep) {
		this.sapxep = sapxep;
	}
	public String getTen_nhom() {
		return ten_nhom;
	}
	public void setTen_nhom(String ten_nhom) {
		this.ten_nhom = ten_nhom;
	}
	public String getTen_hang() {
		return ten_hang;
	}
	public void setTen_hang(String ten_hang) {
		this.ten_hang = ten_hang;
	}
	public String getTen_dvt() {
		return ten_dvt;
	}
	public void setTen_dvt(String ten_dvt) {
		this.ten_dvt = ten_dvt;
	}
	public double getLuong_ky() {
		return luong_ky;
	}
	public void setLuong_ky(double luong_ky) {
		this.luong_ky = luong_ky;
	}
	public double getTrigia_ky() {
		return trigia_ky;
	}
	public void setTrigia_ky(double trigia_ky) {
		this.trigia_ky = trigia_ky;
	}
	public double getLuong_lk() {
		return luong_lk;
	}
	public void setLuong_lk(double luong_lk) {
		this.luong_lk = luong_lk;
	}
	public double getTrigia_lk() {
		return trigia_lk;
	}
	public void setTrigia_lk(double trigia_lk) {
		this.trigia_lk = trigia_lk;
	}
	
	
}
