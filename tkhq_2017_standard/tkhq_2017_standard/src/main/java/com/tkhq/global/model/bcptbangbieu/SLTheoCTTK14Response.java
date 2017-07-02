package com.tkhq.global.model.bcptbangbieu;

import java.util.ArrayList;
import java.util.List;

public class SLTheoCTTK14Response {
	private String group_id;
	private String group_name;
	private List<SLTheoCTTK14SubGroupData> group_data;
	public SLTheoCTTK14Response() {
		// TODO Auto-generated constructor stub
		group_data = new ArrayList<SLTheoCTTK14SubGroupData>();
	}
	public String getGroup_id() {
		return group_id;
	}
	public void setGroup_id(String group_id) {
		this.group_id = group_id;
	}
	public String getGroup_name() {
		return group_name;
	}
	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}
	public List<SLTheoCTTK14SubGroupData> getGroup_data() {
		return group_data;
	}
	public void setGroup_data(List<SLTheoCTTK14SubGroupData> group_data) {
		this.group_data = group_data;
	}
}
