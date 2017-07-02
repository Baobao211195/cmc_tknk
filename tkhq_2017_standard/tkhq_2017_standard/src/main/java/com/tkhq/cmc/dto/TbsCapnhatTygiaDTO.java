package com.tkhq.cmc.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class TbsCapnhatTygiaDTO {
	private String ngay;
	private String maNt;
	private BigDecimal tygiaVnd;
	private BigDecimal tygiaUsd;
	private Long tygiaId;
	
	public String getNgay() {
		return ngay;
	}
	public void setNgay(String ngay) {
		this.ngay = ngay;
	}
	public String getMaNt() {
		return maNt;
	}
	public void setMaNt(String maNt) {
		this.maNt = maNt;
	}
	public BigDecimal getTygiaVnd() {
		return tygiaVnd;
	}
	public void setTygiaVnd(BigDecimal tygiaVnd) {
		this.tygiaVnd = tygiaVnd;
	}
	public BigDecimal getTygiaUsd() {
		return tygiaUsd;
	}
	public void setTygiaUsd(BigDecimal tygiaUsd) {
		this.tygiaUsd = tygiaUsd;
	}
	public Long getTygiaId() {
		return tygiaId;
	}
	public void setTygiaId(Long tygiaId) {
		this.tygiaId = tygiaId;
	}
	
}
