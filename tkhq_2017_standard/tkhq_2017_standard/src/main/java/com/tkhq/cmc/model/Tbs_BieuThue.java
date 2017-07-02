package com.tkhq.cmc.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "TBS_BIEUTHUE")

public class Tbs_BieuThue implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
    @Basic(optional = false)
    @NotNull
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="gen_bieuThue")
	//@SequenceGenerator(name="gen_bieuThue", sequenceName = "bieuThue_SEQ")
    @GenericGenerator(name="BieuThueSeq" , strategy="increment")
    @GeneratedValue(generator="BieuThueSeq")
    @Column(name = "BIEUTHUEID")
    private Integer bieuThueId;

	@Size(min = 1, max = 12)
    @Column(name = "MABIEUTHUE")
    private String maBieuThue;
	
	@Size(max = 512)
    @Column(name = "TENBIEUTHUE")
    private String tenBieuThue;
	
	@Column(name = "THUESUAT")
    private Double thueSuat;
	
	@Column(name = "KIEUBIEUTHUE")
    private Integer kieuBieuThue;
	
	@Size(max = 12)
    @Column(name = "MAHS")
    private String maHS;
	
	@Column(name = "NGAY_HL")
    private Date ngayHL;
	
	@Column(name = "NGAY_HHL")
    private Date ngayHHL;
	
	public Integer getBieuThueId() {
		return bieuThueId;
	}

	public void setBieuThueId(Integer bieuThueId) {
		this.bieuThueId = bieuThueId;
	}
	
	public Tbs_BieuThue(String maBieuThue, String tenBieuThue) {
        this.maBieuThue = maBieuThue;
        this.tenBieuThue = tenBieuThue;
    }
	
	public Tbs_BieuThue() {
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((maBieuThue == null) ? 0 : maBieuThue.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tbs_BieuThue other = (Tbs_BieuThue) obj;
		if (maBieuThue == null) {
			if (other.maBieuThue != null)
				return false;
		} else if (!maBieuThue.equals(other.maBieuThue))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tbs_BieuThue [maBieuThue=" + maBieuThue + ", tenBieuThue="
				+ tenBieuThue + "]";
	}

	public String getMaBieuThue() {
		return maBieuThue;
	}

	public void setMaBieuThue(String maBieuThue) {
		this.maBieuThue = maBieuThue;
	}

	public String getTenBieuThue() {
		return tenBieuThue;
	}

	public void setTenBieuThue(String tenBieuThue) {
		this.tenBieuThue = tenBieuThue;
	}

	public Double getThueSuat() {
		return thueSuat;
	}

	public void setThueSuat(Double thueSuat) {
		this.thueSuat = thueSuat;
	}

	public Integer getKieuBieuThue() {
		return kieuBieuThue;
	}

	public void setKieuBieuThue(Integer kieuBieuThue) {
		this.kieuBieuThue = kieuBieuThue;
	}

	public String getMaHS() {
		return maHS;
	}

	public void setMaHS(String maHS) {
		this.maHS = maHS;
	}

	public Date getNgayHL() {
		return ngayHL;
	}

	public void setNgayHL(Date ngayHL) {
		this.ngayHL = ngayHL;
	}

	public Date getNgayHHL() {
		return ngayHHL;
	}

	public void setNgayHHL(Date ngayHHL) {
		this.ngayHHL = ngayHHL;
	}

}
