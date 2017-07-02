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
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "TBS_MAHS_DKGH")

public class Tbs_Mahs_dkgh implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "STT")
    private Long STT;
    @Size(max = 3)
    @Column(name = "MA_PTVT")
    private String MA_PTVT;
    @Size(max = 100)
    @Column(name = "TEN_PTVT")
    private String TEN_PTVT;
    @DecimalMax("100.0")
    @NotNull 
    @Column(name = "I")
    private Double   I;
    @NotNull 
    @Column(name = "F")
    private Double F;

    public Tbs_Mahs_dkgh() {
    }

    public Tbs_Mahs_dkgh(Long STT) {
        this.STT = STT;
    }

	public Long getSTT() {
		return STT;
	}

	public void setSTT(Long sTT) {
		STT = sTT;
	}

	public String getMA_PTVT() {
		return MA_PTVT;
	}

	public void setMA_PTVT(String mA_PTVT) {
		MA_PTVT = mA_PTVT;
	}

	public String getTEN_PTVT() {
		return TEN_PTVT;
	}

	public void setTEN_PTVT(String tEN_PTVT) {
		TEN_PTVT = tEN_PTVT;
	}

	public Double getI() {
		return I;
	}

	public void setI(Double i) {
		I = i;
	}

	public Double getF() {
		return F;
	}

	public void setF(Double f) {
		F = f;
	}    

   

//	@Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (userId != null ? userId.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof TbdSysUsers)) {
//            return false;
//        }
//        TbdSysUsers other = (TbdSysUsers) object;
//        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "com.tkhq.cmc.model.TbdSysUsers[ userId=" + userId + " ]";
//    }
    
}
