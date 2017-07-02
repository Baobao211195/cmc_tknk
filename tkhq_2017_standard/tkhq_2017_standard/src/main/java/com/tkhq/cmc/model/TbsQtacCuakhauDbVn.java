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
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author TUANDIEP
 */
@Entity
@Table(name = "TBS_QTAC_CUAKHAU_DB_VN")
@XmlRootElement
public class TbsQtacCuakhauDbVn implements Serializable {

    
    /**
	 * 
	 */
	private static final long serialVersionUID = 5917267465326899434L;

	@Id
    @Basic(optional = false)
    @Column(name = "ID")
    @GenericGenerator(name="tbsQtacCuakhauDbVnSeq" , strategy="increment")
    @GeneratedValue(generator="tbsQtacCuakhauDbVnSeq")
    private Long id;
    
    @Column(name = "MACUAKHAU")
    private String macuakhau;
    
    @Column(name = "MANUOCDEN")
    private String manuocden;
    
    @Column(name = "MACUAKHAUDEN")
    private String macuakhauden;
    
    @Column(name = "TEN_CUAKHAU")
    private String tenCuaKhau;
    
    @Column(name = "TEN_NUOC_DEN")
    private String tenNuocDen;
    
    @Column(name = "TEN_CUAKHAU_DEN")
    private String tenCuaKhauDen;
    
    @Column(name = "TRANG_THAI")
    private int trangThai;
    
    @Column(name = "MO_TA")
    private String moTa;
    

    public TbsQtacCuakhauDbVn() {
    }

    public TbsQtacCuakhauDbVn(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMacuakhau() {
        return macuakhau;
    }

    public void setMacuakhau(String macuakhau) {
        this.macuakhau = macuakhau;
    }

    public String getManuocden() {
        return manuocden;
    }

    public void setManuocden(String manuocden) {
        this.manuocden = manuocden;
    }

    public String getMacuakhauden() {
        return macuakhauden;
    }

    public void setMacuakhauden(String macuakhauden) {
        this.macuakhauden = macuakhauden;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbsQtacCuakhauDbVn)) {
            return false;
        }
        TbsQtacCuakhauDbVn other = (TbsQtacCuakhauDbVn) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tkhq.cmc.model.TbsQtacCuakhauDbVn[ id=" + id + " ]";
    }

	public String getTenCuaKhau() {
		return tenCuaKhau;
	}

	public void setTenCuaKhau(String tenCuaKhau) {
		this.tenCuaKhau = tenCuaKhau;
	}

	public String getTenNuocDen() {
		return tenNuocDen;
	}

	public void setTenNuocDen(String tenNuocDen) {
		this.tenNuocDen = tenNuocDen;
	}

	public String getTenCuaKhauDen() {
		return tenCuaKhauDen;
	}

	public void setTenCuaKhauDen(String tenCuaKhauDen) {
		this.tenCuaKhauDen = tenCuaKhauDen;
	}

	public int getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
    
}
