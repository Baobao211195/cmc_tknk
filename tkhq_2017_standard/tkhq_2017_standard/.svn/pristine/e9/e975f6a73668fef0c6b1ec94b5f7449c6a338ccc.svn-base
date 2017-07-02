package com.tkhq.cmc.model;

import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "TBD_SYS_PARAMETER")
@XmlRootElement
public class TbdSysparameters {
	@Id
	@Basic(optional = false)
	@NotNull
	@GenericGenerator(name = "parameterSeq", strategy = "increment")
	@GeneratedValue(generator = "parameterSeq")
	@Column(name = "MA_ID")
	private Integer ma;

	@Column(name = "TEN_THAMSO")
	private String ten_thamSo;

	@Column(name = "NGUOI_CAPNHAT")
	private String nguoi_capnhat;

	@Column(name = "NGAY_CAPNHAT")
	private Date ngay_capnhat;

	@Column(name = "GIA_TRI")
	private String gia_tri;

	@Column(name = "GHI_CHU")
	private String ghichu;

	public String getGhichu() {
		return ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}

	public String getGia_tri() {
		return gia_tri;
	}

	public void setGia_tri(String gia_tri) {
		this.gia_tri = gia_tri;
	}

	public Integer getMa() {
		return ma;
	}

	public void setMa(Integer ma) {
		this.ma = ma;
	}

	public String getTen_thamSo() {
		return ten_thamSo;
	}

	public void setTen_thamSo(String ten_thamSo) {
		this.ten_thamSo = ten_thamSo;
	}

	public String getNguoi_capnhat() {
		return nguoi_capnhat;
	}

	public void setNguoi_capnhat(String nguoi_capnhat) {
		this.nguoi_capnhat = nguoi_capnhat;
	}

	public Date getNgay_capnhat() {
		return ngay_capnhat;
	}

	public void setNgay_capnhat(Date ngay_capnhat) {
		this.ngay_capnhat = ngay_capnhat;
	}

}
