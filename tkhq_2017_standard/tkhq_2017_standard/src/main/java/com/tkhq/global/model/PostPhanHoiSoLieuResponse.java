package com.tkhq.global.model;

public class PostPhanHoiSoLieuResponse {
	private String error_code;
	private String error_mes;
	public String getError_code() {
		return error_code;
	}
	public void setError_code(String error_code) {
		this.error_code = error_code;
	}
	public String getError_mes() {
		return error_mes;
	}
	public void setError_mes(String error_mes) {
		this.error_mes = error_mes;
	}
	public PostPhanHoiSoLieuResponse(String error_code, String error_mes) {
		super();
		this.error_code = error_code;
		this.error_mes = error_mes;
	}
	
}
