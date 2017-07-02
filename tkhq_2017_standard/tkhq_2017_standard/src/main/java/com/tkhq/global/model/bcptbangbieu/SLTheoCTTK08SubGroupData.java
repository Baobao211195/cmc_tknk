package com.tkhq.global.model.bcptbangbieu;

public class SLTheoCTTK08SubGroupData {
	private int sub_id;
	private String sub_name;
	private String avg=" ";
	private SLTheoCTTK08DataKy data_ky;
	private SLTheoCTTK08DataThang data_thang;
	public SLTheoCTTK08SubGroupData(String subname, String avg, SLTheoCTTK08DataKy data_ky,
			SLTheoCTTK08DataThang data_thang) {
		this.sub_name = subname;
		this.avg = avg;
		this.data_ky = data_ky;
		this.data_thang = data_thang;
	}
	public SLTheoCTTK08SubGroupData() {
		// TODO Auto-generated constructor stub
		data_ky = new SLTheoCTTK08DataKy();
		data_thang = new SLTheoCTTK08DataThang();
	}
	public int getSub_id() {
		return sub_id;
	}
	public void setSub_id(int sub_id) {
		this.sub_id = sub_id;
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
	public SLTheoCTTK08DataKy getData_ky() {
		return data_ky;
	}
	public void setData_ky(SLTheoCTTK08DataKy data_ky) {
		this.data_ky = data_ky;
	}
	public SLTheoCTTK08DataThang getData_thang() {
		return data_thang;
	}
	public void setData_thang(SLTheoCTTK08DataThang data_thang) {
		this.data_thang = data_thang;
	}
}
