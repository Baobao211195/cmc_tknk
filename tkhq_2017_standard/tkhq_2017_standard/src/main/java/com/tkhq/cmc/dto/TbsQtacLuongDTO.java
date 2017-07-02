package com.tkhq.cmc.dto;

import com.tkhq.cmc.common.PagerInfo;

public class TbsQtacLuongDTO extends PagerInfo{
	
	private Long id;
	
	private String mathongke;
	
	private String luonglonnhat;

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

	public String getLuonglonnhat() {
		return luonglonnhat;
	}

	public void setLuonglonnhat(String luonglonnhat) {
		this.luonglonnhat = luonglonnhat;
	}
}
