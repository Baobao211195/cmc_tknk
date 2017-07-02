/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tkhq.cmc.model;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "TBS_MATHKE_NHOM_XK")

public class TbsMathkeNhomXk implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 255)
    @Column(name = "TEN_HANG")
    private String tenHang;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "MA_THKE")
    private String maThke;
    @Size(max = 255)
    @Column(name = "TEN_DVT")
    private String tenDvt;
    @Size(max = 4)
    @Column(name = "MA_NHOM")
    private String maNhom;
    @Size(max = 255)
    @Column(name = "TEN_NHOM")
    private String tenNhom;
    @Column(name = "SAPXEP")
    private BigInteger sapxep;

    public TbsMathkeNhomXk() {
    }

    public TbsMathkeNhomXk(String maThke) {
        this.maThke = maThke;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getMaThke() {
        return maThke;
    }

    public void setMaThke(String maThke) {
        this.maThke = maThke;
    }

    public String getTenDvt() {
        return tenDvt;
    }

    public void setTenDvt(String tenDvt) {
        this.tenDvt = tenDvt;
    }

    public String getMaNhom() {
        return maNhom;
    }

    public void setMaNhom(String maNhom) {
        this.maNhom = maNhom;
    }

    public String getTenNhom() {
        return tenNhom;
    }

    public void setTenNhom(String tenNhom) {
        this.tenNhom = tenNhom;
    }

    public BigInteger getSapxep() {
        return sapxep;
    }

    public void setSapxep(BigInteger sapxep) {
        this.sapxep = sapxep;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maThke != null ? maThke.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbsMathkeNhomXk)) {
            return false;
        }
        TbsMathkeNhomXk other = (TbsMathkeNhomXk) object;
        if ((this.maThke == null && other.maThke != null) || (this.maThke != null && !this.maThke.equals(other.maThke))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tkhq.cmc.model.TbsMathkeNhomXk[ maThke=" + maThke + " ]";
    }
    
}
