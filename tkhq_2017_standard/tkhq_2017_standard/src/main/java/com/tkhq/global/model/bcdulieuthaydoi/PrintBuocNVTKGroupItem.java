package com.tkhq.global.model.bcdulieuthaydoi;

public class PrintBuocNVTKGroupItem {
	private int row_index;
	public PrintBuocNVTKGroupItem() {
		// TODO Auto-generated constructor stub
	}
	public PrintBuocNVTKGroupItem(int row_index, String lydo, String trigia_cu, String trigia_moi, String thaydoi) {
		this.row_index = row_index;
		this.lydo = lydo;
		this.trigia_cu = trigia_cu;
		this.trigia_moi = trigia_moi;
		this.thaydoi = thaydoi;
	}
	private String lydo;
	private String trigia_cu;
	private String trigia_moi;
	private String thaydoi;
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
	public String getTrigia_cu() {
		return trigia_cu;
	}
	public void setTrigia_cu(String trigia_cu) {
		this.trigia_cu = trigia_cu;
	}
	public String getTrigia_moi() {
		return trigia_moi;
	}
	public void setTrigia_moi(String trigia_moi) {
		this.trigia_moi = trigia_moi;
	}
	public String getThaydoi() {
		return thaydoi;
	}
	public void setThaydoi(String thaydoi) {
		this.thaydoi = thaydoi;
	}
}
