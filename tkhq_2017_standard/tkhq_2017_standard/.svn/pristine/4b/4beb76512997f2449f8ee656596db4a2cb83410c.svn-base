/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tkhq.cmc.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 *
 * @author Admin
 */
@Entity
@Table(name = "TBS_CUAKHAUNN_VNACCS")

public class TbsCuakhaunnVnaccs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "MA_CANG")
    private String maCang;
    @Size(max = 255)
    @Column(name = "TEN_TP")
    private String tenTp;
    @Size(max = 255)
    @Column(name = "MA_NUOC")
    private String maNuoc;
    @Size(max = 255)
    @Column(name = "TEN_NUOC")
    private String tenNuoc;
    @Size(max = 255)
    @Column(name = "LOAI_CANG")
    private String loaiCang;

    public TbsCuakhaunnVnaccs() {
    }

    public TbsCuakhaunnVnaccs(String maCang) {
        this.maCang = maCang;
    }

    public String getMaCang() {
        return maCang;
    }

    public void setMaCang(String maCang) {
        this.maCang = maCang;
    }

    public String getTenTp() {
        return tenTp;
    }

    public void setTenTp(String tenTp) {
        this.tenTp = tenTp;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maCang != null ? maCang.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbsCuakhaunnVnaccs)) {
            return false;
        }
        TbsCuakhaunnVnaccs other = (TbsCuakhaunnVnaccs) object;
        if ((this.maCang == null && other.maCang != null) || (this.maCang != null && !this.maCang.equals(other.maCang))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tkhq.cmc.model.TbsCuakhaunnVnaccs[ maCang=" + maCang + " ]";
    }
    
}
