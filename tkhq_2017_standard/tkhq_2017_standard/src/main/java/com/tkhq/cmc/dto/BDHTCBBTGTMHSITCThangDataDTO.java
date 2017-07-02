package com.tkhq.cmc.dto;

import java.util.List;

public class BDHTCBBTGTMHSITCThangDataDTO {

	private List<ThangDataDTO> data;
	private String ss_thang_truoc;
	private String ss_thang_nam_truoc;
	public List<ThangDataDTO> getData() {
		return data;
	}
	public void setData(List<ThangDataDTO> data) {
		this.data = data;
	}
	public String getSs_thang_truoc() {
		return ss_thang_truoc;
	}
	public void setSs_thang_truoc(String ss_thang_truoc) {
		this.ss_thang_truoc = ss_thang_truoc;
	}
	public String getSs_thang_nam_truoc() {
		return ss_thang_nam_truoc;
	}
	public void setSs_thang_nam_truoc(String ss_thang_nam_truoc) {
		this.ss_thang_nam_truoc = ss_thang_nam_truoc;
	}
	public BDHTCBBTGTMHSITCThangDataDTO(List<ThangDataDTO> data,
			String ss_thang_truoc, String ss_thang_nam_truoc) {
		super();
		this.data = data;
		this.ss_thang_truoc = ss_thang_truoc;
		this.ss_thang_nam_truoc = ss_thang_nam_truoc;
	}
	public BDHTCBBTGTMHSITCThangDataDTO() {
		super();
	}
	
	
	
}
