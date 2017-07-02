/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tkhq.cmc.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Admin
 */
@Embeddable
public class TbsNuocMhPK implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "MA_NUOC")
    private String maNuoc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "MA_NHOM")
    private String maNhom;

    public TbsNuocMhPK() {
    }

    public TbsNuocMhPK(String maNuoc, String maNhom) {
        this.maNuoc = maNuoc;
        this.maNhom = maNhom;
    }

    public String getMaNuoc() {
        return maNuoc;
    }

    public void setMaNuoc(String maNuoc) {
        this.maNuoc = maNuoc;
    }

    public String getMaNhom() {
        return maNhom;
    }

    public void setMaNhom(String maNhom) {
        this.maNhom = maNhom;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maNuoc != null ? maNuoc.hashCode() : 0);
        hash += (maNhom != null ? maNhom.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbsNuocMhPK)) {
            return false;
        }
        TbsNuocMhPK other = (TbsNuocMhPK) object;
        if ((this.maNuoc == null && other.maNuoc != null) || (this.maNuoc != null && !this.maNuoc.equals(other.maNuoc))) {
            return false;
        }
        if ((this.maNhom == null && other.maNhom != null) || (this.maNhom != null && !this.maNhom.equals(other.maNhom))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tkhq.cmc.model.TbsNuocMhPK[ maNuoc=" + maNuoc + ", maNhom=" + maNhom + " ]";
    }
    
}
