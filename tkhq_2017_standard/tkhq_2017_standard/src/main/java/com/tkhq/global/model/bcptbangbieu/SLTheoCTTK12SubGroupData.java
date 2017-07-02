package com.tkhq.global.model.bcptbangbieu;

public class SLTheoCTTK12SubGroupData {
	private String sub_name;
	private String avg=" ";
	private SLTheoCTTK12DataKy data_ky;
	private SLTheoCTTK12DataThang data_thang;
	public SLTheoCTTK12SubGroupData() {
		// TODO Auto-generated constructor stub
		data_ky = new SLTheoCTTK12DataKy();
		data_thang = new SLTheoCTTK12DataThang();
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
	public SLTheoCTTK12DataKy getData_ky() {
		return data_ky;
	}
	public void setData_ky(SLTheoCTTK12DataKy data_ky) {
		this.data_ky = data_ky;
	}
	public SLTheoCTTK12DataThang getData_thang() {
		return data_thang;
	}
	public void setData_thang(SLTheoCTTK12DataThang data_thang) {
		this.data_thang = data_thang;
	}
	public SLTheoCTTK12SubGroupData(String sub_name, String avg, SLTheoCTTK12DataKy data_ky,
			SLTheoCTTK12DataThang data_thang) {
		this.sub_name = sub_name;
		this.avg = avg;
		this.data_ky = data_ky;
		this.data_thang = data_thang;
	}
}
