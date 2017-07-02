package com.tkhq.global.model;

import java.util.Date;

public class PhanHoiSoLieu {
	
	private Long id;
	private String noidung;
	private String username;
	private Date thoigian;
	private String loai_bc;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNoidung() {
		return noidung;
	}
	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getThoigian() {
		return thoigian;
	}
	public void setThoigian(Date thoigian) {
		this.thoigian = thoigian;
	}
	public String getLoai_bc() {
		return loai_bc;
	}
	public void setLoai_bc(String loai_bc) {
		this.loai_bc = loai_bc;
	}
	public PhanHoiSoLieu(Long id, String noidung, String username, Date thoigian, String loai_bc) {
		super();
		this.id = id;
		this.noidung = noidung;
		this.username = username;
		this.thoigian = thoigian;
		this.loai_bc = loai_bc;
	}
}
