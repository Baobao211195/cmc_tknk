package com.tkhq.cmc.model;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "TBS_CUAKHAUNN_VNACCS")

public class TBS_cuakhaunn_vnaccs implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @NotNull
    @Column(name = "MA_CANG")
	private String maCang;
	
	@Column(name = "TEN_TP")
	private String tenTP;
	
	@Column(name = "MA_NUOC")
	private String maNuoc;
	
	@Column(name = "TEN_NUOC")
	private String tenNuoc;
	
	@Column(name = "LOAI_CANG")
	private String loaiCang;
	
	public TBS_cuakhaunn_vnaccs(){
		
	}
	
	public String getMaCang() {
		return maCang;
	}
	public void setMaCang(String maCang) {
		this.maCang = maCang;
	}
	public String getTenTP() {
		return tenTP;
	}
	public void setTenTP(String tenTP) {
		this.tenTP = tenTP;
	}
	public String getMaNuoc() {
		return maNuoc;
	}
	public void setMaNuoc(String maNuoc) {
		this.maNuoc = maNuoc;
	}
	public String getTenNuoc() {
		return tenNuoc;
	}
	public void setTenNuoc(String tenNuoc) {
		this.tenNuoc = tenNuoc;
	}
	public String getLoaiCang() {
		return loaiCang;
	}
	public void setLoaiCang(String loaiCang) {
		this.loaiCang = loaiCang;
	}
}
