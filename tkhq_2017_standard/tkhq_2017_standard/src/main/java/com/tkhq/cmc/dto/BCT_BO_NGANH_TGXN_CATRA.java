package com.tkhq.cmc.dto;

import java.util.Date;

public class BCT_BO_NGANH_TGXN_CATRA {
	private String LOAI_XN;
	private int THANG_BC;
	private int NAM_BC;
	private String TEN_NXX;
	private String TEN_NNK;
	private String MA_HANGKB;
	private String TEN_DVT;
	private double LUONG;
	private double TRIGIA_USD_TK;
	private String TEN_DV;
	private String MA_DV;
	private Date NGAY_DK;
	private String DE_XUAT_KHAC;
	
//	public BCT_BO_NGANH_TGXN_CATRA(String lOAI_XN, int THANG_BC,
//			int NAM_BC, String TEN_NXX, String TEN_NNK, String MA_HANGKB,
//			String TEN_DVT, double LUONG, double TRIGIA_USD_TK, String TEN_DV, 
//			String MA_DV, Date NGAY_DK, String DE_XUAT_KHAC) {
//		super();
//		this.LOAI_XN = lOAI_XN;
//		this.THANG_BC = THANG_BC;
//		this.NAM_BC = NAM_BC;
//		this.TEN_NXX = TEN_NXX;
//		this.TEN_NNK = TEN_NNK;
//		this.MA_HANGKB = MA_HANGKB;
//		this.TEN_DVT = TEN_DVT;
//		this.LUONG = LUONG;
//		this.TRIGIA_USD_TK = TRIGIA_USD_TK;
//		this.TEN_DV = TEN_DV;
//		this.MA_DV = MA_DV;
//		this.NGAY_DK = NGAY_DK;
//		this.DE_XUAT_KHAC = DE_XUAT_KHAC;
//	}
	public BCT_BO_NGANH_TGXN_CATRA(){
		super();
	}
	
	public String getMA_HANGKB() {
		return MA_HANGKB;
	}
	public void setMA_HANGKB(String mA_HANGKB) {
		MA_HANGKB = mA_HANGKB;
	}
	public String getDE_XUAT_KHAC() {
		return DE_XUAT_KHAC;
	}
	public void setDE_XUAT_KHAC(String dE_XUAT_KHAC) {
		DE_XUAT_KHAC = dE_XUAT_KHAC;
	}
	public String getTEN_DV() {
		return TEN_DV;
	}
	public void setTEN_DV(String tEN_DV) {
		TEN_DV = tEN_DV;
	}
	public String getMA_DV() {
		return MA_DV;
	}
	public void setMA_DV(String mA_DV) {
		MA_DV = mA_DV;
	}
	public Date getNGAY_DK() {
		return NGAY_DK;
	}
	public void setNGAY_DK(Date nGAY_DK) {
		NGAY_DK = nGAY_DK;
	}
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
	public String getTEN_NXX() {
		return TEN_NXX;
	}
	public void setTEN_NXX(String tEN_NXX) {
		TEN_NXX = tEN_NXX;
	}
	public String getTEN_NNK() {
		return TEN_NNK;
	}
	public void setTEN_NNK(String tEN_NNK) {
		TEN_NNK = tEN_NNK;
	}	
	public String getTEN_DVT() {
		return TEN_DVT;
	}
	public void setTEN_DVT(String tEN_DVT) {
		TEN_DVT = tEN_DVT;
	}
	public double getLUONG() {
		return LUONG;
	}
	public void setLUONG(double lUONG) {
		LUONG = lUONG;
	}
	public double getTRIGIA_USD_TK() {
		return TRIGIA_USD_TK;
	}
	public void setTRIGIA_USD_TK(double tRIGIA_USD_TK) {
		TRIGIA_USD_TK = tRIGIA_USD_TK;
	}
		
}
