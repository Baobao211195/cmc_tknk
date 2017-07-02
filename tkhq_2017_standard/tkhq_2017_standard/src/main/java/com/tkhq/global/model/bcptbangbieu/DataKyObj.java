package com.tkhq.global.model.bcptbangbieu;

public class DataKyObj {
	private String ky = " ";
	private String gia_tri = " ";
	public DataKyObj(String ky, String gia_tri) {
		this.ky = ky;
		this.gia_tri = gia_tri;
	}
	public DataKyObj() {
		// TODO Auto-generated constructor stub
	}
	public String getKy() {
		return ky;
	}
	public void setKy(String ky) {
		this.ky = ky;
	}
	public String getGia_tri() {
		if(gia_tri != null && gia_tri.charAt(0) == '.'){
			gia_tri = "0" + gia_tri;
		}
		return gia_tri;
	}
	public void setGia_tri(String gia_tri) {
		this.gia_tri = gia_tri;
	}
}
