package com.tkhq.cmc.dto;

public class BCT_BO_NGANH_TGNK_PHANMEMDTO {
	private int NAM_BC;
	private String MA_HANGKB;
	private String TEN_HANG;
	private double TRIGIA_USD_TK;
	private String NUOC_XX;
	public int getNAM_BC() {
		return NAM_BC;
	}
	public void setNAM_BC(int nAM_BC) {
		NAM_BC = nAM_BC;
	}
	public String getMA_HANGKB() {
		return MA_HANGKB;
	}
	public void setMA_HANGKB(String mA_HANGKB) {
		MA_HANGKB = mA_HANGKB;
	}
	public String getTEN_HANG() {
		return TEN_HANG;
	}
	public void setTEN_HANG(String tEN_HANG) {
		TEN_HANG = tEN_HANG;
	}
	public double getTRIGIA_USD_TK() {
		return TRIGIA_USD_TK;
	}
	public void setTRIGIA_USD_TK(double tRIGIA_USD_TK) {
		TRIGIA_USD_TK = tRIGIA_USD_TK;
	}
	public String getNUOC_XX() {
		return NUOC_XX;
	}
	public void setNUOC_XX(String nUOC_XX) {
		NUOC_XX = nUOC_XX;
	}
	public BCT_BO_NGANH_TGNK_PHANMEMDTO(int nAM_BC, String mA_HANGKB,
			String tEN_HANG, double tRIGIA_USD_TK, String nUOC_XX) {
		super();
		NAM_BC = nAM_BC;
		MA_HANGKB = mA_HANGKB;
		TEN_HANG = tEN_HANG;
		TRIGIA_USD_TK = tRIGIA_USD_TK;
		NUOC_XX = nUOC_XX;
	}
	
}
