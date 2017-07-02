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
@Table(name = "TBS_LOAICTD")

public class TbsLoaictd implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MA")
    private Short ma;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "MA_GD")
    private String maGd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "TEN_VT")
    private String tenVt;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "TEN")
    private String ten;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MA_NCT")
    private short maNct;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "MA_NCT_GD")
    private String maNctGd;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MA_CU")
    private short maCu;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HIDE")
    private short hide;

    public TbsLoaictd() {
    }

    public TbsLoaictd(Short ma) {
        this.ma = ma;
    }

    public TbsLoaictd(Short ma, String maGd, String tenVt, String ten, short maNct, String maNctGd, short maCu, short hide) {
        this.ma = ma;
        this.maGd = maGd;
        this.tenVt = tenVt;
        this.ten = ten;
        this.maNct = maNct;
        this.maNctGd = maNctGd;
        this.maCu = maCu;
        this.hide = hide;
    }

    public Short getMa() {
        return ma;
    }

    public void setMa(Short ma) {
        this.ma = ma;
    }

    public String getMaGd() {
        return maGd;
    }

    public void setMaGd(String maGd) {
        this.maGd = maGd;
    }

    public String getTenVt() {
        return tenVt;
    }

    public void setTenVt(String tenVt) {
        this.tenVt = tenVt;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public short getMaNct() {
        return maNct;
    }

    public void setMaNct(short maNct) {
        this.maNct = maNct;
    }

    public String getMaNctGd() {
        return maNctGd;
    }

    public void setMaNctGd(String maNctGd) {
        this.maNctGd = maNctGd;
    }

    public short getMaCu() {
        return maCu;
    }

    public void setMaCu(short maCu) {
        this.maCu = maCu;
    }

    public short getHide() {
        return hide;
    }

    public void setHide(short hide) {
        this.hide = hide;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ma != null ? ma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbsLoaictd)) {
            return false;
        }
        TbsLoaictd other = (TbsLoaictd) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tkhq.cmc.model.TbsLoaictd[ ma=" + ma + " ]";
    }
    
}
