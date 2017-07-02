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
@Table(name = "TBS_HANCHE")

public class TbsHanche implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MA_ID")
    private Integer maId;
    @Size(max = 10)
    @Column(name = "MA_HS")
    private String maHs;
    @Size(max = 2)
    @Column(name = "MA_NUOC")
    private String maNuoc;
    @Size(max = 15)
    @Column(name = "MA_DV")
    private String maDv;
    @Size(max = 200)
    @Column(name = "MO_TA")
    private String moTa;
    @Column(name = "KIEU_HANCHE")
    private Short kieuHanche;
    @Column(name = "ACTIVE")
    private Short active;

    public TbsHanche() {
    }

    public TbsHanche(Integer maId) {
        this.maId = maId;
    }

    public Integer getMaId() {
        return maId;
    }

    public void setMaId(Integer maId) {
        this.maId = maId;
    }

    public String getMaHs() {
        return maHs;
    }

    public void setMaHs(String maHs) {
        this.maHs = maHs;
    }

    public String getMaNuoc() {
        return maNuoc;
    }

    public void setMaNuoc(String maNuoc) {
        this.maNuoc = maNuoc;
    }

    public String getMaDv() {
        return maDv;
    }

    public void setMaDv(String maDv) {
        this.maDv = maDv;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Short getKieuHanche() {
        return kieuHanche;
    }

    public void setKieuHanche(Short kieuHanche) {
        this.kieuHanche = kieuHanche;
    }

    public Short getActive() {
        return active;
    }

    public void setActive(Short active) {
        this.active = active;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maId != null ? maId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbsHanche)) {
            return false;
        }
        TbsHanche other = (TbsHanche) object;
        if ((this.maId == null && other.maId != null) || (this.maId != null && !this.maId.equals(other.maId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tkhq.cmc.model.TbsHanche[ maId=" + maId + " ]";
    }
    
}
