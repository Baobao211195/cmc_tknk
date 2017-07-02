package com.tkhq.global.model.phanhoi;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

public class PhanHoiBaocao {
	
	private int loai_bc;
	//username of staff who made the feedback

	private String username;

	private String noidung;
	
	private String thoigian;
	
	public PhanHoiBaocao() {
		// TODO Auto-generated constructor stub
	}

	public int getLoai_bc() {
		return loai_bc;
	}

	public void setLoai_bc(int loai_bc) {
		this.loai_bc = loai_bc;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNoidung() {
		return noidung;
	}

	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}

	public String getThoigian() {
		return thoigian;
	}

	public void setThoigian(String thoigian) {
		this.thoigian = thoigian;
	}

	public PhanHoiBaocao(int loai_bc, String username, String noidung, String thoigian) {
		this.loai_bc = loai_bc;
		this.username = username;
		this.noidung = noidung;
		this.thoigian = thoigian;
	}
	
}
