package com.tkhq.cmc.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "TBD_SYS_RESOURCE")
@XmlRootElement
public class Tbd_Sys_Resource implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
    @Basic(optional = false)
    @NotNull
    @GenericGenerator(name="SysResourceSeq" , strategy="increment")
    @GeneratedValue(generator="SysResourceSeq")
    @Column(name = "RESOURCE_ID")
    private Integer resourceId;

	@Size(max = 100)
    @Column(name = "TEN_TOCHUC")
    private String tenTochuc;
	
	@Size(max = 100)
    @Column(name = "TEN_CANHAN")
    private String tenCanhan;
	
	@Size(max = 40)
	@Column(name = "EMAIL")
    private String email;
	
	@Column(name = "MOBILE")
    private String mobile;
	
	@Size(max = 500)
    @Column(name = "MOTA_NHUCAU_NSD")
    private String mota;
	
    @Column(name = "CHITIEU_TKCHINH")
    private String chitieuTK;
	
    @Column(name = "KHAINIEM")
    private String khainiem;
    
    @Column(name = "CANCU")
    private String cancu;
    
    @Column(name = "TANSUAT")
    private String tansuat;
    
    @Column(name = "DEXUAT_DL")
    private String dexuatDL;
    
    @Column(name = "GHICHU")
    private String ghichu;
    
    @Column(name = "MUCDO")
    private String mucdo;
    
    @ManyToOne(optional=false)
    @JoinColumn(name="USER_ID", referencedColumnName="USER_ID", insertable = true, updatable = true)
    private TbdSysUsers tbdSysUser;

	public TbdSysUsers getTbdSysUser() {
		return tbdSysUser;
	}

	public void setTbdSysUser(TbdSysUsers tbdSysUser) {
		this.tbdSysUser = tbdSysUser;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((resourceId == null) ? 0 : resourceId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tbd_Sys_Resource other = (Tbd_Sys_Resource) obj;
		if (resourceId == null) {
			if (other.resourceId != null)
				return false;
		} else if (!resourceId.equals(other.resourceId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tbd_Sys_Resource [resourceId=" + resourceId + ", tenTochuc="
				+ tenTochuc + ", tenCanhan=" + tenCanhan + "]";
	}

	public Integer getResourceId() {
		return resourceId;
	}

	public void setResourceId(Integer resourceId) {
		this.resourceId = resourceId;
	}

	public String getTenTochuc() {
		return tenTochuc;
	}

	public void setTenTochuc(String tenTochuc) {
		this.tenTochuc = tenTochuc;
	}

	public String getTenCanhan() {
		return tenCanhan;
	}

	public void setTenCanhan(String tenCanhan) {
		this.tenCanhan = tenCanhan;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public String getChitieuTK() {
		return chitieuTK;
	}

	public void setChitieuTK(String chitieuTK) {
		this.chitieuTK = chitieuTK;
	}

	public String getKhainiem() {
		return khainiem;
	}

	public void setKhainiem(String khainiem) {
		this.khainiem = khainiem;
	}

	public String getCancu() {
		return cancu;
	}

	public void setCancu(String cancu) {
		this.cancu = cancu;
	}

	public String getTansuat() {
		return tansuat;
	}

	public void setTansuat(String tansuat) {
		this.tansuat = tansuat;
	}

	public String getDexuatDL() {
		return dexuatDL;
	}

	public void setDexuatDL(String dexuatDL) {
		this.dexuatDL = dexuatDL;
	}

	public String getGhichu() {
		return ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}

	public String getMucdo() {
		return mucdo;
	}

	public void setMucdo(String mucdo) {
		this.mucdo = mucdo;
	}
}
