package com.tkhq.cmc.dto;

import java.util.List;


public class BDHTCBBTDBXTLDTO {
	private String group_id;
	private String group_name;
	private List<BDHTCBBTDBXTL_GROUP_DATADTO> group_data;
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
	public List<BDHTCBBTDBXTL_GROUP_DATADTO> getGroup_data() {
		return group_data;
	}
	public void setGroup_data(List<BDHTCBBTDBXTL_GROUP_DATADTO> group_data) {
		this.group_data = group_data;
	}
	public BDHTCBBTDBXTLDTO() {
		super();
	}
	public BDHTCBBTDBXTLDTO(String group_id, String group_name,
			List<BDHTCBBTDBXTL_GROUP_DATADTO> group_data) {
		super();
		this.group_id = group_id;
		this.group_name = group_name;
		this.group_data = group_data;
	}
	
}
