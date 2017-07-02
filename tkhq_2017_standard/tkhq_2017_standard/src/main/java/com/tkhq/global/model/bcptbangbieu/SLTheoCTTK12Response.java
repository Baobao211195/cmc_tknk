package com.tkhq.global.model.bcptbangbieu;

import java.util.ArrayList;
import java.util.List;

public class SLTheoCTTK12Response {
	private int group_id;
	private String group_name;
	private List<SLTheoCTTK12SubGroupData> group_data;
	public SLTheoCTTK12Response() {
		// TODO Auto-generated constructor stub
		group_data = new ArrayList<SLTheoCTTK12SubGroupData>();
	}
	public SLTheoCTTK12Response(int group_id, String group_name, List<SLTheoCTTK12SubGroupData> group_data) {
		this.group_id = group_id;
		this.group_name = group_name;
		this.group_data = group_data;
	}
	public int getGroup_id() {
		return group_id;
	}
	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}
	public String getGroup_name() {
		return group_name;
	}
	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}
	public List<SLTheoCTTK12SubGroupData> getGroup_data() {
		return group_data;
	}
	public void setGroup_data(List<SLTheoCTTK12SubGroupData> group_data) {
		this.group_data = group_data;
	}
}
