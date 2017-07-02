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
@Table(name = "TBS_LHINHMD")

public class TbsLhinhmd implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 3)
    @Column(name = "NHOM_LH")
    private String nhomLh;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "MA_LH")
    private String maLh;
    @Size(max = 40)
    @Column(name = "TEN_LH")
    private String tenLh;
    @Size(max = 10)
    @Column(name = "TEN_VT")
    private String tenVt;
    @Column(name = "LH_ND")
    private Long lhNd;
    @Column(name = "SO_TT")
    private Long soTt;
    @Column(name = "IS_TK")
    private Long isTk;

    public TbsLhinhmd() {
    }

    public TbsLhinhmd(String maLh) {
        this.maLh = maLh;
    }

    public String getNhomLh() {
        return nhomLh;
    }

    public void setNhomLh(String nhomLh) {
        this.nhomLh = nhomLh;
    }

    public String getMaLh() {
        return maLh;
    }

    public void setMaLh(String maLh) {
        this.maLh = maLh;
    }

    public String getTenLh() {
        return tenLh;
    }

    public void setTenLh(String tenLh) {
        this.tenLh = tenLh;
    }

    public String getTenVt() {
        return tenVt;
    }

    public void setTenVt(String tenVt) {
        this.tenVt = tenVt;
    }

    public Long getLhNd() {
        return lhNd;
    }

    public void setLhNd(Long lhNd) {
        this.lhNd = lhNd;
    }

    public Long getSoTt() {
        return soTt;
    }

    public void setSoTt(Long soTt) {
        this.soTt = soTt;
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
        hash += (maLh != null ? maLh.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbsLhinhmd)) {
            return false;
        }
        TbsLhinhmd other = (TbsLhinhmd) object;
        if ((this.maLh == null && other.maLh != null) || (this.maLh != null && !this.maLh.equals(other.maLh))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tkhq.cmc.model.TbsLhinhmd[ maLh=" + maLh + " ]";
    }
    
}
