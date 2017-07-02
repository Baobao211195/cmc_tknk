package com.tkhq.cmc.dto;

import java.util.List;

public class BDHTCBBTGTMHSITCKyDataDTO {
	public BDHTCBBTGTMHSITCKyDataDTO(List<KyDataDTO> data) {
		super();
		this.data = data;
	}
	private List<KyDataDTO> data;
	private String ss_ky_nam_truoc;
	private String ss_ky_truoc;
	public List<KyDataDTO> getData() {
		return data;
	}
	public void setData(List<KyDataDTO> data) {
		this.data = data;
	}
	public String getSs_ky_nam_truoc() {
		return ss_ky_nam_truoc;
	}
	public void setSs_ky_nam_truoc(String ss_ky_nam_truoc) {
		this.ss_ky_nam_truoc = ss_ky_nam_truoc;
	}
	public String getSs_ky_truoc() {
		return ss_ky_truoc;
	}
	public void setSs_ky_truoc(String ss_ky_truoc) {
		this.ss_ky_truoc = ss_ky_truoc;
	}
	public BDHTCBBTGTMHSITCKyDataDTO(List<KyDataDTO> data, String ss_ky_nam_truoc,
			String ss_ky_truoc) {
		super();
		this.data = data;
		this.ss_ky_nam_truoc = ss_ky_nam_truoc;
		this.ss_ky_truoc = ss_ky_truoc;
	}
	public BDHTCBBTGTMHSITCKyDataDTO() {
		super();
	}
	
}
