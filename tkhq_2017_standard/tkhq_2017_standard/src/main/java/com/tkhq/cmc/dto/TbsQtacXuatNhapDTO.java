package com.tkhq.cmc.dto;

import com.tkhq.cmc.common.PagerInfo;

public class TbsQtacXuatNhapDTO extends PagerInfo {
	
	private Long id;
	
	private String mathongke;
	
	private String manuoc;
	
	private String maphuongthucvanchuyen;
	
	private String macuakhaunn;
	
	private String macuakhauvn;

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

	public String getManuoc() {
		return manuoc;
	}

	public void setManuoc(String manuoc) {
		this.manuoc = manuoc;
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

	public String getMacuakhaunn() {
		return macuakhaunn;
	}

	public void setMacuakhaunn(String macuakhaunn) {
		this.macuakhaunn = macuakhaunn;
	}
}
