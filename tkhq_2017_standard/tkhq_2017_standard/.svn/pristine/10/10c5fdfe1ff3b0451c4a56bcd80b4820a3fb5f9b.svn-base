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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 *
 * @author Admin
 */
@Entity
@Table(name = "TBS_PHANCONG_CONGVIEC")

public class TbsPhancongCongviec implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "STT")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long stt;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "MA_CV")
    private String maCv;
    @Size(max = 255)
    @Column(name = "TEN_CV")
    private String tenCv;

    public TbsPhancongCongviec() {
    }

    public TbsPhancongCongviec(Long stt) {
        this.stt = stt;
    }

    public TbsPhancongCongviec(Long stt, String maCv) {
        this.stt = stt;
        this.maCv = maCv;
    }

    public Long getStt() {
        return stt;
    }

    public void setStt(Long stt) {
        this.stt = stt;
    }

    public String getMaCv() {
        return maCv;
    }

    public void setMaCv(String maCv) {
        this.maCv = maCv;
    }

    public String getTenCv() {
        return tenCv;
    }

    public void setTenCv(String tenCv) {
        this.tenCv = tenCv;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stt != null ? stt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbsPhancongCongviec)) {
            return false;
        }
        TbsPhancongCongviec other = (TbsPhancongCongviec) object;
        if ((this.stt == null && other.stt != null) || (this.stt != null && !this.stt.equals(other.stt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tkhq.cmc.model.TbsPhancongCongviec[ stt=" + stt + " ]";
    }
    
}
