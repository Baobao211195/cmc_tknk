package com.tkhq.global.model.bcptbangbieu;

public class SLTheoCTTK10Response {

	private String sub_name;
	private String avg=" ";
	private SLTheoCTTK10DataKy data_ky;
	private SLTheoCTTK10DataThang data_thang;
	public SLTheoCTTK10Response() {
		// TODO Auto-generated constructor stub
		data_ky = new SLTheoCTTK10DataKy();
		data_thang = new SLTheoCTTK10DataThang();
	}
	public SLTheoCTTK10Response(String subname, String avg, SLTheoCTTK10DataKy data_ky,
			SLTheoCTTK10DataThang data_thang) {
		this.sub_name = subname;
		this.avg = avg;
		this.data_ky = data_ky;
		this.data_thang = data_thang;
	}
	public String getSubname() {
		return sub_name;
	}
	public void setSubname(String subname) {
		this.sub_name = subname;
	}
	public String getAvg() {
		if(avg != null && avg.charAt(0) == '.')
			avg = "0" + avg;
		return avg;
	}
	public void setAvg(String avg) {
		this.avg = avg;
	}
	public SLTheoCTTK10DataKy getData_ky() {
		return data_ky;
	}
	public void setData_ky(SLTheoCTTK10DataKy data_ky) {
		this.data_ky = data_ky;
	}
	public SLTheoCTTK10DataThang getData_thang() {
		return data_thang;
	}
	public void setData_thang(SLTheoCTTK10DataThang data_thang) {
		this.data_thang = data_thang;
	}
}
