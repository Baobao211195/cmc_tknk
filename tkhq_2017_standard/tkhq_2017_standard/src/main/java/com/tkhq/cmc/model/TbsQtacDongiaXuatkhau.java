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
@Table(name = "TBS_QTAC_DONGIA_XUATKHAU")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbsQtacDongiaXuatkhau.findAll", query = "SELECT t FROM TbsQtacDongiaXuatkhau t")
    , @NamedQuery(name = "TbsQtacDongiaXuatkhau.findById", query = "SELECT t FROM TbsQtacDongiaXuatkhau t WHERE t.id = :id")
    , @NamedQuery(name = "TbsQtacDongiaXuatkhau.findByMathongke", query = "SELECT t FROM TbsQtacDongiaXuatkhau t WHERE t.mathongke = :mathongke")
    , @NamedQuery(name = "TbsQtacDongiaXuatkhau.findByDongialonnhat", query = "SELECT t FROM TbsQtacDongiaXuatkhau t WHERE t.dongialonnhat = :dongialonnhat")
    , @NamedQuery(name = "TbsQtacDongiaXuatkhau.findByDongianhonhat", query = "SELECT t FROM TbsQtacDongiaXuatkhau t WHERE t.dongianhonhat = :dongianhonhat")})
public class TbsQtacDongiaXuatkhau implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    @GenericGenerator(name="TbsQtacDongiaXuatkhauSeq" , strategy="increment")
    @GeneratedValue(generator="TbsQtacDongiaXuatkhauSeq")
    private Long id;
    @Column(name = "MATHONGKE")
    private String mathongke;
    @Column(name = "DONGIALONNHAT")
    private Double dongialonnhat;
    @Column(name = "DONGIANHONHAT")
    private Double dongianhonhat;
    @Column(name = "TEN_HANG")
    private String tenHang;
    @Column(name = "TRANG_THAI")
    private int trangThai;
    @Column(name = "MO_TA")
    private String moTa;
    
    public TbsQtacDongiaXuatkhau() {
    }

    public TbsQtacDongiaXuatkhau(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMathongke() {
        return mathongke;
    }

    public void setMathongke(String mathongke) {
        this.mathongke = mathongke;
    }

    public Double getDongialonnhat() {
        return dongialonnhat;
    }

    public void setDongialonnhat(Double dongialonnhat) {
        this.dongialonnhat = dongialonnhat;
    }

    public Double getDongianhonhat() {
        return dongianhonhat;
    }

    public void setDongianhonhat(Double dongianhonhat) {
        this.dongianhonhat = dongianhonhat;
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
        if (!(object instanceof TbsQtacDongiaXuatkhau)) {
            return false;
        }
        TbsQtacDongiaXuatkhau other = (TbsQtacDongiaXuatkhau) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tkhq.cmc.model.TbsQtacDongiaXuatkhau[ id=" + id + " ]";
    }

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
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
