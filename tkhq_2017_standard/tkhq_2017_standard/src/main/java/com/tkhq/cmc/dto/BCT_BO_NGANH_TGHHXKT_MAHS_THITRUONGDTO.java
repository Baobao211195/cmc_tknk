package com.tkhq.cmc.dto;

public class BCT_BO_NGANH_TGHHXKT_MAHS_THITRUONGDTO {
	private String TEN_MATHANG;
	private String TEN_THI_TRUONG;
	private int TU_NAM;
	private int DEN_NAM;
	private int THANG;
	private int NAM;
	private String TEN_DV;
	private String MA_HANGKB;
	private String TEN_DVT;
	private Double LUONG_TK;
	private Double TRIGIA_USD_TK;

	public String getTEN_MATHANG() {
		return TEN_MATHANG;
	}

	public void setTEN_MATHANG(String tEN_MATHANG) {
		TEN_MATHANG = tEN_MATHANG;
	}

	public String getTEN_THI_TRUONG() {
		return TEN_THI_TRUONG;
	}

	public void setTEN_THI_TRUONG(String tEN_THI_TRUONG) {
		TEN_THI_TRUONG = tEN_THI_TRUONG;
	}

	public int getTU_NAM() {
		return TU_NAM;
	}

	public void setTU_NAM(int tU_NAM) {
		TU_NAM = tU_NAM;
	}

	public int getDEN_NAM() {
		return DEN_NAM;
	}

	public void setDEN_NAM(int dEN_NAM) {
		DEN_NAM = dEN_NAM;
	}

	public int getTHANG() {
		return THANG;
	}

	public void setTHANG(int tHANG) {
		THANG = tHANG;
	}

	public int getNAM() {
		return NAM;
	}

	public void setNAM(int nAM) {
		NAM = nAM;
	}

	public String getTEN_DV() {
		return TEN_DV;
	}

	public void setTEN_DV(String tEN_DV) {
		TEN_DV = tEN_DV;
	}

	public String getMA_HANGKB() {
		return MA_HANGKB;
	}

	public void setMA_HANGKB(String mA_HANGKB) {
		MA_HANGKB = mA_HANGKB;
	}

	public String getTEN_DVT() {
		return TEN_DVT;
	}

	public void setTEN_DVT(String tEN_DVT) {
		TEN_DVT = tEN_DVT;
	}

	public Double getLUONG_TK() {
		return LUONG_TK;
	}

	public void setLUONG_TK(Double lUONG_TK) {
		LUONG_TK = lUONG_TK;
	}

	public Double getTRIGIA_USD_TK() {
		return TRIGIA_USD_TK;
	}

	public void setTRIGIA_USD_TK(Double tRIGIA_USD_TK) {
		TRIGIA_USD_TK = tRIGIA_USD_TK;
	}

	public BCT_BO_NGANH_TGHHXKT_MAHS_THITRUONGDTO(String tEN_MATHANG,
			String tEN_THI_TRUONG, int tU_NAM, int dEN_NAM, int tHANG, int nAM,
			String tEN_DV, String mA_HANGKB, String tEN_DVT, Double lUONG_TK,
			Double tRIGIA_USD_TK) {
		super();
		TEN_MATHANG = tEN_MATHANG;
		TEN_THI_TRUONG = tEN_THI_TRUONG;
		TU_NAM = tU_NAM;
		DEN_NAM = dEN_NAM;
		THANG = tHANG;
		NAM = nAM;
		TEN_DV = tEN_DV;
		MA_HANGKB = mA_HANGKB;
		TEN_DVT = tEN_DVT;
		LUONG_TK = lUONG_TK;
		TRIGIA_USD_TK = tRIGIA_USD_TK;
	}
	
}