package com.tkhq.cmc.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "TBS_DVT")

public class Tbs_Dvt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "MA_DVT")
    private String maDvt;
    @Size(max = 15)
    @Column(name = "TEN_DVT")
    private String tenDvt;
    @Size(max = 3)
    @Column(name = "MA_STD")
    private String maStd;
    @Column(name = "TL_QUYDOI")
    private Double tlQuydoi;	//Chuyen tu BigInteger sang Double do DB Oracle khong ho tro convert

    public Tbs_Dvt() {
    }

    public Tbs_Dvt(String maDvt) {
        this.maDvt = maDvt;
    }

    public String getMaDvt() {
        return maDvt;
    }

    public void setMaDvt(String maDvt) {
        this.maDvt = maDvt;
    }

    public String getTenDvt() {
        return tenDvt;
    }

    public void setTenDvt(String tenDvt) {
        this.tenDvt = tenDvt;
    }

    public String getMaStd() {
        return maStd;
    }

    public void setMaStd(String maStd) {
        this.maStd = maStd;
    }

    public Double getTlQuydoi() {
        return tlQuydoi;
    }

    public void setTlQuydoi(Double tlQuydoi) {
        this.tlQuydoi = tlQuydoi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maDvt != null ? maDvt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbs_Dvt)) {
            return false;
        }
        Tbs_Dvt other = (Tbs_Dvt) object;
        if ((this.maDvt == null && other.maDvt != null) || (this.maDvt != null && !this.maDvt.equals(other.maDvt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tkhq.cmc.model.TbsDvt[ maDvt=" + maDvt + " ]";
    }
}