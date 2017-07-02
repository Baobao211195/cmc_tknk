/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tkhq.cmc.model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "TBD_SYS_LOG_SESSION")

public class TbdSysLogSession  {

	
	@Id
//	@Basic(optional = false)
	@NotNull
	@Column(name = "ID")
	@GenericGenerator(name="tbdSysLogSessionSeq", strategy="increment")
	@GeneratedValue(generator="tbdSysLogSessionSeq")
	private Long id;
	@Size(max = 40)
	@Column(name = "TEN_DANG_NHAP")
	private String tenDangNhap;
	@Column(name = "THOI_GIAN_DANG_NHAP")
	@Temporal(TemporalType.DATE)
	private Date thoiGianDangNhap;
	@Column(name = "THOI_GIAN_DANG_XUAT")
	@Temporal(TemporalType.DATE)
	private Date thoiGianDangXuat;

	public TbdSysLogSession(){
		super();
	}
	
	public TbdSysLogSession(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTenDangNhap() {
		return tenDangNhap;
	}

	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}

	public Date getThoiGianDangNhap() {
		return thoiGianDangNhap;
	}

	public void setThoiGianDangNhap(Date thoiGianDangNhap) {
		this.thoiGianDangNhap = thoiGianDangNhap;
	}

	public Date getThoiGianDangXuat() {
		return thoiGianDangXuat;
	}

	public void setThoiGianDangXuat(Date thoiGianDangXuat) {
		this.thoiGianDangXuat = thoiGianDangXuat;
	}
	
	

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof TbdSysLogSession)) {
			return false;
		}
		TbdSysLogSession other = (TbdSysLogSession) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.tkhq.cmc.model.TbdSysLogSession[ id=" + id + " ]";
	}

}
