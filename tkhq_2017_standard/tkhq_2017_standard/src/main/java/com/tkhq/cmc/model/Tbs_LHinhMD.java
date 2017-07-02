package com.tkhq.cmc.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "TBS_LHINHMD")
@XmlRootElement
public class Tbs_LHinhMD implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
    @Basic(optional = false)
    @NotNull
    @GenericGenerator(name="lhinhMDSeq" , strategy="increment")
    @GeneratedValue(generator="lhinhMDSeq")
    @Column(name = "LHINHMD_ID")
    private Integer lhinhMDId;
	
	@Size(max = 3)
	@Column(name = "NHOM_LH")
    private String nhomLH;
	
	@Size(max = 5)
	@Column(name = "MA_LH")
    private String maLH;
	
	@Size(max = 5)
	@Column(name = "TEN_LH")
    private String tenLH;
	
	@Size(max = 10)
	@Column(name = "TEN_VT")
    private String tenVT;

	@Column(name = "LH_ND")
    private Integer lhND;
	
	@Column(name = "SO_TT")
    private Integer soTT;
	
	@Column(name = "IS_TK")
    private Integer isTK;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((lhinhMDId == null) ? 0 : lhinhMDId.hashCode());
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
		Tbs_LHinhMD other = (Tbs_LHinhMD) obj;
		if (lhinhMDId == null) {
			if (other.lhinhMDId != null)
				return false;
		} else if (!lhinhMDId.equals(other.lhinhMDId))
			return false;
		return true;
	}

	public Integer getLhinhMDId() {
		return lhinhMDId;
	}

	public void setLhinhMDId(Integer lhinhMDId) {
		this.lhinhMDId = lhinhMDId;
	}

	public String getNhomLH() {
		return nhomLH;
	}

	public void setNhomLH(String nhomLH) {
		this.nhomLH = nhomLH;
	}

	public String getMaLH() {
		return maLH;
	}

	public void setMaLH(String maLH) {
		this.maLH = maLH;
	}

	public String getTenLH() {
		return tenLH;
	}

	public void setTenLH(String tenLH) {
		this.tenLH = tenLH;
	}

	public String getTenVT() {
		return tenVT;
	}

	public void setTenVT(String tenVT) {
		this.tenVT = tenVT;
	}

	public Integer getLhND() {
		return lhND;
	}

	public void setLhND(Integer lhND) {
		this.lhND = lhND;
	}

	public Integer getSoTT() {
		return soTT;
	}

	public void setSoTT(Integer soTT) {
		this.soTT = soTT;
	}

	public Integer getIsTK() {
		return isTK;
	}

	public void setIsTK(Integer isTK) {
		this.isTK = isTK;
	}

	@Override
	public String toString() {
		return "Tbs_LHinhMD [lhinhMDId=" + lhinhMDId + ", maLH=" + maLH
				+ ", tenLH=" + tenLH + "]";
	}
}
