package com.tkhq.global.model.bcptbangbieu;

public class SLTheoCTTK15Response {
	private String sub_name;
	private String avg=" ";
	private SLTheoCTTK15DataKy data_ky;
	private SLTheoCTTK15DataThang data_thang;
	public SLTheoCTTK15Response() {
		// TODO Auto-generated constructor stub
		data_ky = new SLTheoCTTK15DataKy();
		data_thang = new SLTheoCTTK15DataThang();
	}
	public SLTheoCTTK15Response(String sub_name, String avg, SLTheoCTTK15DataKy data_ky,
			SLTheoCTTK15DataThang data_thang) {
		this.sub_name = sub_name;
		this.avg = avg;
		this.data_ky = data_ky;
		this.data_thang = data_thang;
	}
	public String getSub_name() {
		return sub_name;
	}
	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}
	public String getAvg() {
		if(avg != null && avg.charAt(0) == '.')
			avg = "0" + avg;
		return avg;
	}
	public void setAvg(String avg) {
		this.avg = avg;
	}
	public SLTheoCTTK15DataKy getData_ky() {
		return data_ky;
	}
	public void setData_ky(SLTheoCTTK15DataKy data_ky) {
		this.data_ky = data_ky;
	}
	public SLTheoCTTK15DataThang getData_thang() {
		return data_thang;
	}
	public void setData_thang(SLTheoCTTK15DataThang data_thang) {
		this.data_thang = data_thang;
	}
}
