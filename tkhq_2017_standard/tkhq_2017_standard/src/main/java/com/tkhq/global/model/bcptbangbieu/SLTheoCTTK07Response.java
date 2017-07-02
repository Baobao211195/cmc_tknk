package com.tkhq.global.model.bcptbangbieu;

public class SLTheoCTTK07Response {
	private int id;
	private String chitieu=" ";
	private String ss_kygoc=" ";
	private String ss_cungky_namtruoc=" ";
	private String ss_kycuoi_namtruoc=" ";
	private String ss_kytruoc=" ";
	private String ss_luyke=" ";
	public SLTheoCTTK07Response() {
		// TODO Auto-generated constructor stub
	}
	public SLTheoCTTK07Response(String chitieu, String ss_kygoc, String ss_cungky_namtruoc, String ss_kycuoi_namtruoc,
			String ss_kytruoc, String ss_luyke) {
		this.chitieu = chitieu;
		this.ss_kygoc = ss_kygoc;
		this.ss_cungky_namtruoc = ss_cungky_namtruoc;
		this.ss_kycuoi_namtruoc = ss_kycuoi_namtruoc;
		this.ss_kytruoc = ss_kytruoc;
		this.ss_luyke = ss_luyke;
	}
	public String getChitieu() {
		return chitieu;
	}
	public void setChitieu(String chitieu) {
		this.chitieu = chitieu;
	}
	public String getSs_kygoc() {
		if(ss_kygoc == null || ss_kygoc.trim().isEmpty()){
			ss_kygoc = " ";
		}
		return ss_kygoc;
	}
	public void setSs_kygoc(String ss_kygoc) {
		this.ss_kygoc = ss_kygoc;
	}
	public String getSs_cungky_namtruoc() {
		if(ss_cungky_namtruoc == null || ss_cungky_namtruoc.trim().isEmpty()){
			ss_cungky_namtruoc = " ";
		}
		return ss_cungky_namtruoc;
	}
	public void setSs_cungky_namtruoc(String ss_cungky_namtruoc) {
		this.ss_cungky_namtruoc = ss_cungky_namtruoc;
	}
	public String getSs_kycuoi_namtruoc() {
		if(ss_kycuoi_namtruoc == null || ss_kycuoi_namtruoc.trim().isEmpty()){
			ss_kycuoi_namtruoc = " ";
		}
		return ss_kycuoi_namtruoc;
	}
	public void setSs_kycuoi_namtruoc(String ss_kycuoi_namtruoc) {
		this.ss_kycuoi_namtruoc = ss_kycuoi_namtruoc;
	}
	public String getSs_kytruoc() {
		if(ss_kytruoc == null || ss_kytruoc.trim().isEmpty()){
			ss_kytruoc = " ";
		}
		return ss_kytruoc;
	}
	public void setSs_kytruoc(String ss_kytruoc) {
		this.ss_kytruoc = ss_kytruoc;
	}
	public String getSs_luyke() {
		if(ss_luyke == null){
			ss_luyke = " ";
		}
		return ss_luyke;
	}
	public void setSs_luyke(String ss_luyke) {
		this.ss_luyke = ss_luyke;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
