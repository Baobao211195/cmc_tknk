package com.tkhq.global.model.bcptbangbieu;

import java.util.ArrayList;
import java.util.List;

public class SLTheoCTTK09Response {
	private int group_id;
	private String group_name;
	private List<SLTheoCTTK09SubGroupData> group_data;
	public SLTheoCTTK09Response() {
		// TODO Auto-generated constructor stub
		group_data = new ArrayList<SLTheoCTTK09SubGroupData>();
	}
	public SLTheoCTTK09Response(String group_name, List<SLTheoCTTK09SubGroupData> group_data) {
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
	public List<SLTheoCTTK09SubGroupData> getGroup_data() {
		return group_data;
	}
	public void setGroup_data(List<SLTheoCTTK09SubGroupData> group_data) {
		this.group_data = group_data;
	}
}
