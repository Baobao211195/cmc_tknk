package com.tkhq.cmc.dto;

public class BCSLVNBELARUTDTO {
	public String getTitle() {
		return title;
	}
	public String getMa_hs() {
		return ma_hs;
	}
	public String getNuoc_xx() {
		return nuoc_xx;
	}
	public double getLuong_tk() {
		return luong_tk;
	}
	public String getTen_dvt() {
		return ten_dvt;
	}
	public double getTrigia_usd() {
		return trigia_usd;
	}
	private String title;
	private String ma_hs;
	private String nuoc_xx;
	private double luong_tk;
	private String ten_dvt;
	private double trigia_usd;
	public BCSLVNBELARUTDTO(String title, String ma_hs, String nuoc_xx,
			double luong_tk, String ten_dvt, double trigia_usd) {
		super();
		this.title = title;
		this.ma_hs = ma_hs;
		this.nuoc_xx = nuoc_xx;
		this.luong_tk = luong_tk;
		this.ten_dvt = ten_dvt;
		this.trigia_usd = trigia_usd;
	}
	
	
}
