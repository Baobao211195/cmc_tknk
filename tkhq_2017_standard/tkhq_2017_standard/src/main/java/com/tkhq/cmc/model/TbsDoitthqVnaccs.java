/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tkhq.cmc.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;


/**
 *
 * @author Admin
 */
@Entity
@Table(name = "TBS_DOITTHQ_VNACCS")

public class TbsDoitthqVnaccs implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TbsDoitthqVnaccsPK tbsDoitthqVnaccsPK;
    @Size(max = 100)
    @Column(name = "TEN_DOI")
    private String tenDoi;
    @Size(max = 100)
    @Column(name = "TEN_CC")
    private String tenCc;
    @Size(max = 255)
    @Column(name = "TEN_DOI_UNI")
    private String tenDoiUni;
    @Size(max = 255)
    @Column(name = "TEN_CC_UNI")
    private String tenCcUni;
    @Size(max = 6)
    @Column(name = "MA_DOI_MOI")
    private String maDoiMoi;
    @Size(max = 4)
    @Column(name = "MA_BO_PHAN_XU_LY_TO_KHAI")
    private String maBoPhanXuLyToKhai;

    public TbsDoitthqVnaccs() {
    }

    public TbsDoitthqVnaccs(TbsDoitthqVnaccsPK tbsDoitthqVnaccsPK) {
        this.tbsDoitthqVnaccsPK = tbsDoitthqVnaccsPK;
    }

    public TbsDoitthqVnaccs(String maCc, String maDoiTqdt) {
        this.tbsDoitthqVnaccsPK = new TbsDoitthqVnaccsPK(maCc, maDoiTqdt);
    }

    public TbsDoitthqVnaccsPK getTbsDoitthqVnaccsPK() {
        return tbsDoitthqVnaccsPK;
    }

    public void setTbsDoitthqVnaccsPK(TbsDoitthqVnaccsPK tbsDoitthqVnaccsPK) {
        this.tbsDoitthqVnaccsPK = tbsDoitthqVnaccsPK;
    }

    public String getTenDoi() {
        return tenDoi;
    }

    public void setTenDoi(String tenDoi) {
        this.tenDoi = tenDoi;
    }

    public String getTenCc() {
        return tenCc;
    }

    public void setTenCc(String tenCc) {
        this.tenCc = tenCc;
    }

    public String getTenDoiUni() {
        return tenDoiUni;
    }

    public void setTenDoiUni(String tenDoiUni) {
        this.tenDoiUni = tenDoiUni;
    }

    public String getTenCcUni() {
        return tenCcUni;
    }

    public void setTenCcUni(String tenCcUni) {
        this.tenCcUni = tenCcUni;
    }

    public String getMaDoiMoi() {
        return maDoiMoi;
    }

    public void setMaDoiMoi(String maDoiMoi) {
        this.maDoiMoi = maDoiMoi;
    }

    public String getMaBoPhanXuLyToKhai() {
        return maBoPhanXuLyToKhai;
    }

    public void setMaBoPhanXuLyToKhai(String maBoPhanXuLyToKhai) {
        this.maBoPhanXuLyToKhai = maBoPhanXuLyToKhai;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tbsDoitthqVnaccsPK != null ? tbsDoitthqVnaccsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbsDoitthqVnaccs)) {
            return false;
        }
        TbsDoitthqVnaccs other = (TbsDoitthqVnaccs) object;
        if ((this.tbsDoitthqVnaccsPK == null && other.tbsDoitthqVnaccsPK != null) || (this.tbsDoitthqVnaccsPK != null && !this.tbsDoitthqVnaccsPK.equals(other.tbsDoitthqVnaccsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tkhq.cmc.model.TbsDoitthqVnaccs[ tbsDoitthqVnaccsPK=" + tbsDoitthqVnaccsPK + " ]";
    }
    
}
