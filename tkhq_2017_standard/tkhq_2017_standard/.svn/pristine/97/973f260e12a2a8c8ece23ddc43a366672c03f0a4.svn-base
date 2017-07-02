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
@SuppressWarnings("serial")
@Embeddable
public class TbsDoitthqVnaccsPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "MA_CC")
    private String maCc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "MA_DOI_TQDT")
    private String maDoiTqdt;

    public TbsDoitthqVnaccsPK() {
    }

    public TbsDoitthqVnaccsPK(String maCc, String maDoiTqdt) {
        this.maCc = maCc;
        this.maDoiTqdt = maDoiTqdt;
    }

    public String getMaCc() {
        return maCc;
    }

    public void setMaCc(String maCc) {
        this.maCc = maCc;
    }

    public String getMaDoiTqdt() {
        return maDoiTqdt;
    }

    public void setMaDoiTqdt(String maDoiTqdt) {
        this.maDoiTqdt = maDoiTqdt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maCc != null ? maCc.hashCode() : 0);
        hash += (maDoiTqdt != null ? maDoiTqdt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbsDoitthqVnaccsPK)) {
            return false;
        }
        TbsDoitthqVnaccsPK other = (TbsDoitthqVnaccsPK) object;
        if ((this.maCc == null && other.maCc != null) || (this.maCc != null && !this.maCc.equals(other.maCc))) {
            return false;
        }
        if ((this.maDoiTqdt == null && other.maDoiTqdt != null) || (this.maDoiTqdt != null && !this.maDoiTqdt.equals(other.maDoiTqdt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tkhq.cmc.model.TbsDoitthqVnaccsPK[ maCc=" + maCc + ", maDoiTqdt=" + maDoiTqdt + " ]";
    }
    
}
