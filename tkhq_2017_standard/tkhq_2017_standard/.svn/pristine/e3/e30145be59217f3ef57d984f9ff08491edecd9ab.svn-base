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
@Table(name = "TBS_QTAC_VANTAI_HANGNHAP_NN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbsQtacVantaiHangnhapNn.findAll", query = "SELECT t FROM TbsQtacVantaiHangnhapNn t")
    , @NamedQuery(name = "TbsQtacVantaiHangnhapNn.findById", query = "SELECT t FROM TbsQtacVantaiHangnhapNn t WHERE t.id = :id")
    , @NamedQuery(name = "TbsQtacVantaiHangnhapNn.findByMaphuongthucvanchuyen", query = "SELECT t FROM TbsQtacVantaiHangnhapNn t WHERE t.maphuongthucvanchuyen = :maphuongthucvanchuyen")
    , @NamedQuery(name = "TbsQtacVantaiHangnhapNn.findByMacuakhaunn", query = "SELECT t FROM TbsQtacVantaiHangnhapNn t WHERE t.macuakhaunn = :macuakhaunn")})
public class TbsQtacVantaiHangnhapNn implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    @GenericGenerator(name="TbsQtacVantaiHangnhapNnSeq" , strategy="increment")
    @GeneratedValue(generator="TbsQtacVantaiHangnhapNnSeq")
    private Long id;
    @Column(name = "MAPHUONGTHUCVANCHUYEN")
    private String maphuongthucvanchuyen;
    @Column(name = "MACUAKHAUNN")
    private String macuakhaunn;
    @Column(name = "TEN_PTVT")
    private String tenPhuongThucVanTai;
    @Column(name = "TEN_CUAKHAU_NN")
    private String tenCuaKhauNn;
    @Column(name = "TRANGTHAI")
    private int trangThai;
    @Column(name = "MO_TA")
    private String moTa;
    
    public TbsQtacVantaiHangnhapNn() {
    }

    public TbsQtacVantaiHangnhapNn(Long id) {
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

    public String getMacuakhaunn() {
        return macuakhaunn;
    }

    public void setMacuakhaunn(String macuakhaunn) {
        this.macuakhaunn = macuakhaunn;
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
        if (!(object instanceof TbsQtacVantaiHangnhapNn)) {
            return false;
        }
        TbsQtacVantaiHangnhapNn other = (TbsQtacVantaiHangnhapNn) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tkhq.cmc.model.TbsQtacVantaiHangnhapNn[ id=" + id + " ]";
    }

	public String getTenPhuongThucVanTai() {
		return tenPhuongThucVanTai;
	}

	public void setTenPhuongThucVanTai(String tenPhuongThucVanTai) {
		this.tenPhuongThucVanTai = tenPhuongThucVanTai;
	}

	public String getTenCuaKhauNn() {
		return tenCuaKhauNn;
	}

	public void setTenCuaKhauNn(String tenCuaKhauNn) {
		this.tenCuaKhauNn = tenCuaKhauNn;
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
