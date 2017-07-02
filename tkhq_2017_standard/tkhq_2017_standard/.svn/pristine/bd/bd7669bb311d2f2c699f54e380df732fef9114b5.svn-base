/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tkhq.cmc.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;


/**
 *
 * @author Admin
 */
@Entity
@Table(name = "TBS_THKE")

public class TbsThke implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TbsThkePK tbsThkePK;
    @Size(max = 255)
    @Column(name = "TEN_HANG")
    private String tenHang;
    @Size(max = 10)
    @Column(name = "TEN_DVT")
    private String tenDvt;
    @Size(max = 255)
    @Column(name = "MA_LOAI")
    private String maLoai;
    @Column(name = "IS_NHAP")
    private Long isNhap;
    @Column(name = "IS_XUAT")
    private Long isXuat;

    public TbsThke() {
    }

    public TbsThke(TbsThkePK tbsThkePK) {
        this.tbsThkePK = tbsThkePK;
    }

    public TbsThke(String maThke, String maHang) {
        this.tbsThkePK = new TbsThkePK(maThke, maHang);
    }

    public TbsThkePK getTbsThkePK() {
        return tbsThkePK;
    }

    public void setTbsThkePK(TbsThkePK tbsThkePK) {
        this.tbsThkePK = tbsThkePK;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getTenDvt() {
        return tenDvt;
    }

    public void setTenDvt(String tenDvt) {
        this.tenDvt = tenDvt;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public Long getIsNhap() {
        return isNhap;
    }

    public void setIsNhap(Long isNhap) {
        this.isNhap = isNhap;
    }

    public Long getIsXuat() {
        return isXuat;
    }

    public void setIsXuat(Long isXuat) {
        this.isXuat = isXuat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tbsThkePK != null ? tbsThkePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbsThke)) {
            return false;
        }
        TbsThke other = (TbsThke) object;
        if ((this.tbsThkePK == null && other.tbsThkePK != null) || (this.tbsThkePK != null && !this.tbsThkePK.equals(other.tbsThkePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tkhq.cmc.model.TbsThke[ tbsThkePK=" + tbsThkePK + " ]";
    }
    
}
