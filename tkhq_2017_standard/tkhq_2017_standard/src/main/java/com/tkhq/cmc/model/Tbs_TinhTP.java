package com.tkhq.cmc.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;




@Entity
@Table(name = "TBS_TINHTP")

public class Tbs_TinhTP implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
    @Basic(optional = false)
    @NotNull
//    @GenericGenerator(name="TinhTPSeq" , strategy="increment")
//    @GeneratedValue(generator="TinhTPSeq")
	@Size(max = 2)
    @Column(name = "MATINHTP")
    private String maTinhTP;
	
	@Size(max = 40)
    @Column(name = "TENTINHTP")
    private String tenTinhTP;
	
	@Override
	public String toString() {
		return "Tbs_TinhTP [maTinhTP=" + maTinhTP + ", tenTinhTP=" + tenTinhTP
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((maTinhTP == null) ? 0 : maTinhTP.hashCode());
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
		Tbs_TinhTP other = (Tbs_TinhTP) obj;
		if (maTinhTP == null) {
			if (other.maTinhTP != null)
				return false;
		} else if (!maTinhTP.equals(other.maTinhTP))
			return false;
		return true;
	}

	public String getMaTinhTP() {
		return maTinhTP;
	}

	public void setMaTinhTP(String maTinhTP) {
		this.maTinhTP = maTinhTP;
	}

	public String getTenTinhTP() {
		return tenTinhTP;
	}

	public void setTenTinhTP(String tenTinhTP) {
		this.tenTinhTP = tenTinhTP;
	}

}
