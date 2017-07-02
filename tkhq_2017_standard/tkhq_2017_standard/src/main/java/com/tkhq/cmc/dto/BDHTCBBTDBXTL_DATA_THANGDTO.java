package com.tkhq.cmc.dto;

import java.util.List;

public class BDHTCBBTDBXTL_DATA_THANGDTO {
	
	private List<ThangDataDTO> data;
	private String ss_thang_nam_truoc;
	private String ss_thang_truoc;
	private String trend;
	private String forecast;
	public List<ThangDataDTO> getData() {
		return data;
	}
	public void setData(List<ThangDataDTO> data) {
		this.data = data;
	}
	public String getSs_thang_nam_truoc() {
		return ss_thang_nam_truoc;
	}
	public void setSs_thang_nam_truoc(String ss_thang_nam_truoc) {
		this.ss_thang_nam_truoc = ss_thang_nam_truoc;
	}
	public String getSs_thang_truoc() {
		return ss_thang_truoc;
	}
	public void setSs_thang_truoc(String ss_thang_truoc) {
		this.ss_thang_truoc = ss_thang_truoc;
	}
	public String getTrend() {
		return trend;
	}
	public void setTrend(String trend) {
		this.trend = trend;
	}
	public String getForecast() {
		return forecast;
	}
	public void setForecast(String forecast) {
		this.forecast = forecast;
	}
	public BDHTCBBTDBXTL_DATA_THANGDTO(List<ThangDataDTO> data,
			String ss_thang_nam_truoc, String ss_thang_truoc, String trend,
			String forecast) {
		super();
		this.data = data;
		this.ss_thang_nam_truoc = ss_thang_nam_truoc;
		this.ss_thang_truoc = ss_thang_truoc;
		this.trend = trend;
		this.forecast = forecast;
	}
	public BDHTCBBTDBXTL_DATA_THANGDTO() {
		super();
	}
	
	
}
