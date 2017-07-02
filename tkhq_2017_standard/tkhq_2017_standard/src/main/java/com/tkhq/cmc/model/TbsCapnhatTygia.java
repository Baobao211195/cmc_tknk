/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tkhq.cmc.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;



/**
 *
 * @author Admin
 */
@Entity
@Table(name = "TBS_CAPNHAT_TYGIA")
@XmlRootElement
public class TbsCapnhatTygia implements Serializable {
	
	
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "TYGIA_ID")
    private Long tygiaId;    
    @NotNull
    @Column(name = "NGAY")
    private Date ngay;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "MA_NT")
    private String maNt;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TYGIA_VND")
    private BigDecimal tygiaVnd;
    @Column(name = "TYGIA_USD")
    private BigDecimal tygiaUsd;   

    public TbsCapnhatTygia() {
    }

//    public TbsCapnhatTygia(Long tygiaId) {
//        this.tygiaId = tygiaId;
//    }
//
//    public TbsCapnhatTygia(Long tygiaId, Date ngay, String maNt) {
//        this.tygiaId = tygiaId;
//        this.ngay = ngay;
//        this.maNt = maNt;
//    }

    public Long getTygiaId() {
        return tygiaId;
    }

    public void setTygiaId(Long tygiaId) {
        this.tygiaId = tygiaId;
    }
    
    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public String getMaNt() {
        return maNt;
    }

    public void setMaNt(String maNt) {
        this.maNt = maNt;
    }

    public BigDecimal getTygiaVnd() {
        return tygiaVnd;
    }

    public void setTygiaVnd(BigDecimal tygiaVnd) {
        this.tygiaVnd = tygiaVnd;
    }

    public BigDecimal getTygiaUsd() {
        return tygiaUsd;
    }

    public void setTygiaUsd(BigDecimal tygiaUsd) {
        this.tygiaUsd = tygiaUsd;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tygiaId != null ? tygiaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbsCapnhatTygia)) {
            return false;
        }
        TbsCapnhatTygia other = (TbsCapnhatTygia) object;
        if ((this.tygiaId == null && other.tygiaId != null) || (this.tygiaId != null && !this.tygiaId.equals(other.tygiaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tkhq.cmc.model.TbsCapnhatTygia[ tygiaId=" + tygiaId + " ]";
    }
    
}
