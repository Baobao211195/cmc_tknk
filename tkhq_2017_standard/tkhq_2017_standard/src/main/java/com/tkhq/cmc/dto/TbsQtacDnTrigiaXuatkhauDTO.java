package com.tkhq.cmc.dto;

import com.tkhq.cmc.common.PagerInfo;

public class TbsQtacDnTrigiaXuatkhauDTO extends PagerInfo {
	private Long id;
	private String masodn;
	private double trigiaxuatkhau;
    private String tenDn;
    private int trangThai;
    private String moTa;
	
	public TbsQtacDnTrigiaXuatkhauDTO(String masodn, double trigiaxuatkhau,
			String tenDn, int trangThai, String moTa) {
		super();
		this.masodn = masodn;
		this.trigiaxuatkhau = trigiaxuatkhau;
		this.tenDn = tenDn;
		this.trangThai = trangThai;
		this.moTa = moTa;
	}

	public TbsQtacDnTrigiaXuatkhauDTO() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMasodn() {
		return masodn;
	}

	public void setMasodn(String masodn) {
		this.masodn = masodn;
	}

	public double getTrigiaxuatkhau() {
		return trigiaxuatkhau;
	}

	public void setTrigiaxuatkhau(double trigiaxuatkhau) {
		this.trigiaxuatkhau = trigiaxuatkhau;
	}

	public String getTenDn() {
		return tenDn;
	}

	public void setTenDn(String tenDn) {
		this.tenDn = tenDn;
	}

	public int getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
}
