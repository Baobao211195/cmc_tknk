package com.tkhq.cmc.dto;

public class BCXKHH015KDTO {
	private long ky;
	private long thang;
	private long nam;
	private String loai;
	private long stt;
	private long sapxep;
	private String ten_nhom;
	private String ten_hang;
	private String ten_dvt;
	private double luong_ky;
	private double trigia_ky;
	private double luong_lk;
	private double trigia_lk;
	public long getStt() {
		return stt;
	}
	public void setStt(long stt) {
		this.stt = stt;
	}
	public long getSapxep() {
		return sapxep;
	}
	public void setSapxep(long sapxep) {
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
	
	
	public long getKy() {
		return ky;
	}
	public void setKy(long ky) {
		this.ky = ky;
	}
	public long getThang() {
		return thang;
	}
	public void setThang(long thang) {
		this.thang = thang;
	}
	public long getNam() {
		return nam;
	}
	public void setNam(long nam) {
		this.nam = nam;
	}
	public String getLoai() {
		return loai;
	}
	public void setLoai(String loai) {
		this.loai = loai;
	}

	public BCXKHH015KDTO(long ky, long thang, long nam, String loai, long stt, long sapxep,
			String ten_nhom, String ten_hang, String ten_dvt, double luong_ky,
			double trigia_ky, double luong_lk, double trigia_lk) {
		super();
		this.ky = ky;
		this.thang = thang;
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
}
