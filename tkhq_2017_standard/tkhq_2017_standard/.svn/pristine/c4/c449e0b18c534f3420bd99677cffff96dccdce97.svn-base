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
@Table(name = "TBS_QTAC_VANTAI_HANGNHAP_VN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbsQtacVantaiHangnhapVn.findAll", query = "SELECT t FROM TbsQtacVantaiHangnhapVn t")
    , @NamedQuery(name = "TbsQtacVantaiHangnhapVn.findById", query = "SELECT t FROM TbsQtacVantaiHangnhapVn t WHERE t.id = :id")
    , @NamedQuery(name = "TbsQtacVantaiHangnhapVn.findByMaphuongthucvanchuyen", query = "SELECT t FROM TbsQtacVantaiHangnhapVn t WHERE t.maphuongthucvanchuyen = :maphuongthucvanchuyen")
    , @NamedQuery(name = "TbsQtacVantaiHangnhapVn.findByMacuakhauvn", query = "SELECT t FROM TbsQtacVantaiHangnhapVn t WHERE t.macuakhauvn = :macuakhauvn")})
public class TbsQtacVantaiHangnhapVn implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    @GenericGenerator(name="TbsQtacVantaiHangnhapVnSeq" , strategy="increment")
    @GeneratedValue(generator="TbsQtacVantaiHangnhapVnSeq")
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
    
    public TbsQtacVantaiHangnhapVn() {
    }

    public TbsQtacVantaiHangnhapVn(Long id) {
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
        if (!(object instanceof TbsQtacVantaiHangnhapVn)) {
            return false;
        }
        TbsQtacVantaiHangnhapVn other = (TbsQtacVantaiHangnhapVn) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tkhq.cmc.model.TbsQtacVantaiHangnhapVn[ id=" + id + " ]";
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
