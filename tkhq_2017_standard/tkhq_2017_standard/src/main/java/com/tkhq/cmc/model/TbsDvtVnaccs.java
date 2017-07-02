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
@Table(name = "TBS_DVT_VNACCS")//, catalog = "", schema = "TKNC")

public class TbsDvtVnaccs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "MA_DVT", nullable = false, length = 255)
    private String maDvt;
    @Size(max = 255)
    @Column(name = "TEN_DVT", length = 255)
    private String tenDvt;
    @Size(max = 255)
    @Column(name = "TEN_DVTV", length = 255)
    private String tenDvtv;
    @Size(max = 255)
    @Column(name = "TEN_DVT_UNI", length = 255)
    private String tenDvtUni;

    public TbsDvtVnaccs() {
    }

    public TbsDvtVnaccs(String maDvt) {
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

    public String getTenDvtv() {
        return tenDvtv;
    }

    public void setTenDvtv(String tenDvtv) {
        this.tenDvtv = tenDvtv;
    }

    public String getTenDvtUni() {
        return tenDvtUni;
    }

    public void setTenDvtUni(String tenDvtUni) {
        this.tenDvtUni = tenDvtUni;
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
        if (!(object instanceof TbsDvtVnaccs)) {
            return false;
        }
        TbsDvtVnaccs other = (TbsDvtVnaccs) object;
        if ((this.maDvt == null && other.maDvt != null) || (this.maDvt != null && !this.maDvt.equals(other.maDvt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tkhq.cmc.model.TbsDvtVnaccs[ maDvt=" + maDvt + " ]";
    }
    
}
