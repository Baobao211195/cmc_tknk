package com.tkhq.cmc.dto;

public class BCT_BO_NGANH_TGHHLH_TAIXUATDTO {
	private String LOAI_XN;
	private int THANG_BC;
	private int NAM_BC;
	private String MA_HANGKB;
	private String TEN_CK;
	private double TRIGIA_USD_TK;
	public String getLOAI_XN() {
		return LOAI_XN;
	}
	public void setLOAI_XN(String lOAI_XN) {
		LOAI_XN = lOAI_XN;
	}
	public int getTHANG_BC() {
		return THANG_BC;
	}
	public void setTHANG_BC(int tHANG_BC) {
		THANG_BC = tHANG_BC;
	}
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
	public String getTEN_CK() {
		return TEN_CK;
	}
	public void setTEN_CK(String tEN_CK) {
		TEN_CK = tEN_CK;
	}
	public double getTRIGIA_USD_TK() {
		return TRIGIA_USD_TK;
	}
	public void setTRIGIA_USD_TK(double tRIGIA_USD_TK) {
		TRIGIA_USD_TK = tRIGIA_USD_TK;
	}
	public BCT_BO_NGANH_TGHHLH_TAIXUATDTO(String lOAI_XN, int tHANG_BC,
			int nAM_BC, String mA_HANGKB, String tEN_CK, double tRIGIA_USD_TK) {
		super();
		LOAI_XN = lOAI_XN;
		THANG_BC = tHANG_BC;
		NAM_BC = nAM_BC;
		MA_HANGKB = mA_HANGKB;
		TEN_CK = tEN_CK;
		TRIGIA_USD_TK = tRIGIA_USD_TK;
	}
	
	
}
