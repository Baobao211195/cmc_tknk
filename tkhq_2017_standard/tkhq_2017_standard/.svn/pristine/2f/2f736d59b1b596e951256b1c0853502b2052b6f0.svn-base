/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tkhq.cmc.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 *
 * @author Admin
 */
@Entity
@Table(name = "TBS_DONVI")

public class TbsDonvi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 14)
    @Column(name = "MA_DV")
    private String maDv;
    @Size(max = 255)
    @Column(name = "TEN_DV")
    private String tenDv;
    @Size(max = 255)
    @Column(name = "TEN_GD")
    private String tenGd;
    @Size(max = 10)
    @Column(name = "MALHDN")
    private String malhdn;
    @Size(max = 2)
    @Column(name = "TWDP")
    private String twdp;
    @Size(max = 10)
    @Column(name = "NOIQUANLY")
    private String noiquanly;
    @Size(max = 100)
    @Column(name = "SOGPKD")
    private String sogpkd;
    @Column(name = "NGAYCAPGPKD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngaycapgpkd;
    @Size(max = 255)
    @Column(name = "DIACHI")
    private String diachi;
    @Size(max = 255)
    @Column(name = "DIENTHOAI")
    private String dienthoai;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "FAX")
    private String fax;
    @Size(max = 100)
    @Column(name = "GIAMDOC")
    private String giamdoc;
    @Size(max = 100)
    @Column(name = "KETOAN")
    private String ketoan;
    @Size(max = 255)
    @Column(name = "TAIKHOAN")
    private String taikhoan;
    @Size(max = 1)
    @Column(name = "PPT_GTGT")
    private String pptGtgt;
    @Size(max = 10)
    @Column(name = "NHOM_CQ")
    private String nhomCq;
    @Size(max = 5)
    @Column(name = "TT_DV")
    private String ttDv;
    @Column(name = "SO_TT")
    private Long soTt;
    @Size(max = 3)
    @Column(name = "MLNSCHUONG")
    private String mlnschuong;
    @Size(max = 50)
    @Column(name = "SOGC")
    private String sogc;

    public TbsDonvi() {
    }

    public TbsDonvi(String maDv) {
        this.maDv = maDv;
    }

    public String getMaDv() {
        return maDv;
    }

    public void setMaDv(String maDv) {
        this.maDv = maDv;
    }

    public String getTenDv() {
        return tenDv;
    }

    public void setTenDv(String tenDv) {
        this.tenDv = tenDv;
    }

    public String getTenGd() {
        return tenGd;
    }

    public void setTenGd(String tenGd) {
        this.tenGd = tenGd;
    }

    public String getMalhdn() {
        return malhdn;
    }

    public void setMalhdn(String malhdn) {
        this.malhdn = malhdn;
    }

    public String getTwdp() {
        return twdp;
    }

    public void setTwdp(String twdp) {
        this.twdp = twdp;
    }

    public String getNoiquanly() {
        return noiquanly;
    }

    public void setNoiquanly(String noiquanly) {
        this.noiquanly = noiquanly;
    }

    public String getSogpkd() {
        return sogpkd;
    }

    public void setSogpkd(String sogpkd) {
        this.sogpkd = sogpkd;
    }

    public Date getNgaycapgpkd() {
        return ngaycapgpkd;
    }

    public void setNgaycapgpkd(Date ngaycapgpkd) {
        this.ngaycapgpkd = ngaycapgpkd;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getGiamdoc() {
        return giamdoc;
    }

    public void setGiamdoc(String giamdoc) {
        this.giamdoc = giamdoc;
    }

    public String getKetoan() {
        return ketoan;
    }

    public void setKetoan(String ketoan) {
        this.ketoan = ketoan;
    }

    public String getTaikhoan() {
        return taikhoan;
    }

    public void setTaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    public String getPptGtgt() {
        return pptGtgt;
    }

    public void setPptGtgt(String pptGtgt) {
        this.pptGtgt = pptGtgt;
    }

    public String getNhomCq() {
        return nhomCq;
    }

    public void setNhomCq(String nhomCq) {
        this.nhomCq = nhomCq;
    }

    public String getTtDv() {
        return ttDv;
    }

    public void setTtDv(String ttDv) {
        this.ttDv = ttDv;
    }

    public Long getSoTt() {
        return soTt;
    }

    public void setSoTt(Long soTt) {
        this.soTt = soTt;
    }

    public String getMlnschuong() {
        return mlnschuong;
    }

    public void setMlnschuong(String mlnschuong) {
        this.mlnschuong = mlnschuong;
    }

    public String getSogc() {
        return sogc;
    }

    public void setSogc(String sogc) {
        this.sogc = sogc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maDv != null ? maDv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbsDonvi)) {
            return false;
        }
        TbsDonvi other = (TbsDonvi) object;
        if ((this.maDv == null && other.maDv != null) || (this.maDv != null && !this.maDv.equals(other.maDv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tkhq.cmc.model.TbsDonvi[ maDv=" + maDv + " ]";
    }
    
}
