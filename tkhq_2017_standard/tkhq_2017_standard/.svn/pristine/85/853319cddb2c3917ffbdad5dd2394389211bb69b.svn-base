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
public class TbsThkePK implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "MA_THKE")
    private String maThke;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "MA_HANG")
    private String maHang;

    public TbsThkePK() {
    }

    public TbsThkePK(String maThke, String maHang) {
        this.maThke = maThke;
        this.maHang = maHang;
    }

    public String getMaThke() {
        return maThke;
    }

    public void setMaThke(String maThke) {
        this.maThke = maThke;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maThke != null ? maThke.hashCode() : 0);
        hash += (maHang != null ? maHang.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbsThkePK)) {
            return false;
        }
        TbsThkePK other = (TbsThkePK) object;
        if ((this.maThke == null && other.maThke != null) || (this.maThke != null && !this.maThke.equals(other.maThke))) {
            return false;
        }
        if ((this.maHang == null && other.maHang != null) || (this.maHang != null && !this.maHang.equals(other.maHang))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tkhq.cmc.model.TbsThkePK[ maThke=" + maThke + ", maHang=" + maHang + " ]";
    }
    
}
