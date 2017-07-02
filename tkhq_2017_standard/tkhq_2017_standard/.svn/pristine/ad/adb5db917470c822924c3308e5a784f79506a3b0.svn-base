package com.tkhq.global.model.bcptbangbieu;

public class SLTheoCTTK04SubGroupData {
	private int sub_id;
	private String sub_name;
	private String avg;
	private SLTheoCTTK04DataKy data_ky;
	private SLTheoCTTK04DataThang data_thang;
	public SLTheoCTTK04SubGroupData(String subname, String avg, SLTheoCTTK04DataKy data_ky,
			SLTheoCTTK04DataThang data_thang) {
		this.sub_name = subname;
		this.avg = avg;
		this.data_ky = data_ky;
		this.data_thang = data_thang;
	}
	public SLTheoCTTK04SubGroupData() {
		// TODO Auto-generated constructor stub
		data_ky = new SLTheoCTTK04DataKy();
		data_thang = new SLTheoCTTK04DataThang();
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
	public SLTheoCTTK04DataKy getData_ky() {
		return data_ky;
	}
	public void setData_ky(SLTheoCTTK04DataKy data_ky) {
		this.data_ky = data_ky;
	}
	public SLTheoCTTK04DataThang getData_thang() {
		return data_thang;
	}
	public void setData_thang(SLTheoCTTK04DataThang data_thang) {
		this.data_thang = data_thang;
	}
}
