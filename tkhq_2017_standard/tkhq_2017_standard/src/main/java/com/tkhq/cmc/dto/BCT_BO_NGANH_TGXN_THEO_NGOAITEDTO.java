package com.tkhq.cmc.dto;

import java.util.Date;

public class BCT_BO_NGANH_TGXN_THEO_NGOAITEDTO {
	private Date TU_NGAY;
	private Date DEN_NGAY;
	private String MA_NT;
	private Double LUONG_TK_XK;
	private Double LUONG_TK_NK;
	private Double TRIGIA_USD_TK_XK;
	private Double TRIGIA_USD_TK_NK;
	public Date getTU_NGAY() {
		return TU_NGAY;
	}
	public void setTU_NGAY(Date tU_NGAY) {
		TU_NGAY = tU_NGAY;
	}
	public Date getDEN_NGAY() {
		return DEN_NGAY;
	}
	public void setDEN_NGAY(Date dEN_NGAY) {
		DEN_NGAY = dEN_NGAY;
	}
	public String getMA_NT() {
		return MA_NT;
	}
	public void setMA_NT(String mA_NT) {
		MA_NT = mA_NT;
	}
	public Double getLUONG_TK_XK() {
		return LUONG_TK_XK;
	}
	public void setLUONG_TK_XK(Double lUONG_TK_XK) {
		LUONG_TK_XK = lUONG_TK_XK;
	}
	public Double getLUONG_TK_NK() {
		return LUONG_TK_NK;
	}
	public void setLUONG_TK_NK(Double lUONG_TK_NK) {
		LUONG_TK_NK = lUONG_TK_NK;
	}
	public Double getTRIGIA_USD_TK_XK() {
		return TRIGIA_USD_TK_XK;
	}
	public void setTRIGIA_USD_TK_XK(Double tRIGIA_USD_TK_XK) {
		TRIGIA_USD_TK_XK = tRIGIA_USD_TK_XK;
	}
	public Double getTRIGIA_USD_TK_NK() {
		return TRIGIA_USD_TK_NK;
	}
	public void setTRIGIA_USD_TK_NK(Double tRIGIA_USD_TK_NK) {
		TRIGIA_USD_TK_NK = tRIGIA_USD_TK_NK;
	}
	public BCT_BO_NGANH_TGXN_THEO_NGOAITEDTO(Date tU_NGAY, Date dEN_NGAY,
			String mA_NT, Double lUONG_TK_XK, Double lUONG_TK_NK,
			Double tRIGIA_USD_TK_XK, Double tRIGIA_USD_TK_NK) {
		super();
		TU_NGAY = tU_NGAY;
		DEN_NGAY = dEN_NGAY;
		MA_NT = mA_NT;
		LUONG_TK_XK = lUONG_TK_XK;
		LUONG_TK_NK = lUONG_TK_NK;
		TRIGIA_USD_TK_XK = tRIGIA_USD_TK_XK;
		TRIGIA_USD_TK_NK = tRIGIA_USD_TK_NK;
	}
	
}
