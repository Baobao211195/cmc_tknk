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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author TUANDIEP
 */
@Entity
@Table(name = "TBS_QTAC_VANTAI_HANGXUAT_VN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbsQtacVantaiHangxuatVn.findAll", query = "SELECT t FROM TbsQtacVantaiHangxuatVn t")
    , @NamedQuery(name = "TbsQtacVantaiHangxuatVn.findById", query = "SELECT t FROM TbsQtacVantaiHangxuatVn t WHERE t.id = :id")
    , @NamedQuery(name = "TbsQtacVantaiHangxuatVn.findByMaphuongthucvanchuyen", query = "SELECT t FROM TbsQtacVantaiHangxuatVn t WHERE t.maphuongthucvanchuyen = :maphuongthucvanchuyen")
    , @NamedQuery(name = "TbsQtacVantaiHangxuatVn.findByMacuakhauvn", query = "SELECT t FROM TbsQtacVantaiHangxuatVn t WHERE t.macuakhauvn = :macuakhauvn")})
public class TbsQtacVantaiHangxuatVn implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    @GenericGenerator(name="TbsQtacVantaiHangxuatVnSeq" , strategy="increment")
    @GeneratedValue(generator="TbsQtacVantaiHangxuatVnSeq")
    private Long id;
    @Column(name = "MAPHUONGTHUCVANCHUYEN")
    private String maphuongthucvanchuyen;
    @Column(name = "MACUAKHAUVN")
    private String macuakhauvn;
    @Column(name = "TEN_PTVT")
    private String tenPhuongThucVanTai;
    @Column(name = "TEN_CUAKHAU_VN")
    private String tenCuaKhauVn;
    @Column(name = "TRANGTHAI")
    private int trangThai;
    @Column(name = "MO_TA")
    private String moTa;
    
    public TbsQtacVantaiHangxuatVn() {
    }

    public TbsQtacVantaiHangxuatVn(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaphuongthucvanchuyen() {
        return maphuongthucvanchuyen;
    }

    public void setMaphuongthucvanchuyen(String maphuongthucvanchuyen) {
        this.maphuongthucvanchuyen = maphuongthucvanchuyen;
    }

    public String getMacuakhauvn() {
        return macuakhauvn;
    }

    public void setMacuakhauvn(String macuakhauvn) {
        this.macuakhauvn = macuakhauvn;
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
        if (!(object instanceof TbsQtacVantaiHangxuatVn)) {
            return false;
        }
        TbsQtacVantaiHangxuatVn other = (TbsQtacVantaiHangxuatVn) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tkhq.cmc.model.TbsQtacVantaiHangxuatVn[ id=" + id + " ]";
    }

	public String getTenPhuongThucVanTai() {
		return tenPhuongThucVanTai;
	}

	public void setTenPhuongThucVanTai(String tenPhuongThucVanTai) {
		this.tenPhuongThucVanTai = tenPhuongThucVanTai;
	}

	public String getTenCuaKhauVn() {
		return tenCuaKhauVn;
	}

	public void setTenCuaKhauVn(String tenCuaKhauVn) {
		this.tenCuaKhauVn = tenCuaKhauVn;
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
