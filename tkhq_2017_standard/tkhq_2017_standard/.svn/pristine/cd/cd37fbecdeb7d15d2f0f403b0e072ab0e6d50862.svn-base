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
@Table(name = "TBS_NUOC_MH")

public class TbsNuocMh implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TbsNuocMhPK tbsNuocMhPK;
    @Size(max = 50)
    @Column(name = "TEN_NUOC")
    private String tenNuoc;
    @Column(name = "IS_NHAP")
    private Long isNhap;
    @Column(name = "IS_XUAT")
    private Long isXuat;
    @Column(name = "IS_TK")
    private Long isTk;

    public TbsNuocMh() {
    }

    public TbsNuocMh(TbsNuocMhPK tbsNuocMhPK) {
        this.tbsNuocMhPK = tbsNuocMhPK;
    }

    public TbsNuocMh(String maNuoc, String maNhom) {
        this.tbsNuocMhPK = new TbsNuocMhPK(maNuoc, maNhom);
    }

    public TbsNuocMhPK getTbsNuocMhPK() {
        return tbsNuocMhPK;
    }

    public void setTbsNuocMhPK(TbsNuocMhPK tbsNuocMhPK) {
        this.tbsNuocMhPK = tbsNuocMhPK;
    }

    public String getTenNuoc() {
        return tenNuoc;
    }

    public void setTenNuoc(String tenNuoc) {
        this.tenNuoc = tenNuoc;
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

    public Long getIsTk() {
        return isTk;
    }

    public void setIsTk(Long isTk) {
        this.isTk = isTk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tbsNuocMhPK != null ? tbsNuocMhPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbsNuocMh)) {
            return false;
        }
        TbsNuocMh other = (TbsNuocMh) object;
        if ((this.tbsNuocMhPK == null && other.tbsNuocMhPK != null) || (this.tbsNuocMhPK != null && !this.tbsNuocMhPK.equals(other.tbsNuocMhPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tkhq.cmc.model.TbsNuocMh[ tbsNuocMhPK=" + tbsNuocMhPK + " ]";
    }
    
}
