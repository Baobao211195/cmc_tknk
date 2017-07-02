package com.tkhq.cmc.dto;

public class TbdSysFunctionsDTO {
	public int getfunctionId() {
		return functionId;
	}
	public void setfunctionId(int functionId) {
		this.functionId = functionId;
	}
	public String getFunctionName() {
		return functionName;
	}
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public int getWeb() {
		return web;
	}
	public void setWeb(int web) {
		this.web = web;
	}
	private int functionId;
	private String functionName;
	private int parentId;
	private String path;
	private int web;
	public TbdSysFunctionsDTO(int functionId, String functionName,
			int parentId, String path, int web) {
		super();
		this.functionId = functionId;
		this.functionName = functionName;
		this.parentId = parentId;
		this.path = path;
		this.web = web;
	}
	
}
