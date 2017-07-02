package com.tkhq.cmc.dto;

public class ThayDoiDoNVHQTongThe {
	private int row_index;
	private String lydo;
	private Double trigia_cu;
	private Double trigia_moi;
	private Double thaydoi;
	public int getRow_index() {
		return row_index;
	}
	public void setRow_index(int row_index) {
		this.row_index = row_index;
	}
	public String getLydo() {
		return lydo;
	}
	public void setLydo(String lydo) {
		this.lydo = lydo;
	}
	public Double getTrigia_cu() {
		return trigia_cu;
	}
	public void setTrigia_cu(Double trigia_cu) {
		this.trigia_cu = trigia_cu;
	}
	public Double getTrigia_moi() {
		return trigia_moi;
	}
	public void setTrigia_moi(Double trigia_moi) {
		this.trigia_moi = trigia_moi;
	}
	public Double getThaydoi() {
		return thaydoi;
	}
	public void setThaydoi(Double thaydoi) {
		this.thaydoi = thaydoi;
	}
	public ThayDoiDoNVHQTongThe(int row_index, String lydo, Double trigia_cu,
			Double trigia_moi, Double thaydoi) {
		super();
		this.row_index = row_index;
		this.lydo = lydo;
		this.trigia_cu = trigia_cu;
		this.trigia_moi = trigia_moi;
		this.thaydoi = thaydoi;
	}
	public ThayDoiDoNVHQTongThe() {
	}
}
