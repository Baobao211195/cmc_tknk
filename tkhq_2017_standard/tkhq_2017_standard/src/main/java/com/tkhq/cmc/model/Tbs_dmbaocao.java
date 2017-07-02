package com.tkhq.cmc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBS_DMBAOCAO")
public class Tbs_dmbaocao {
	
	@Id
	@Column(name = "MA")
	private String ma;
	
	@Column(name = "TEN")
	private String ten;
	
	@Column(name = "MA_LOAIBC")
	private Integer ma_loaibc;
	
	@Column(name = "PATH")
	private String path;

	@Column(name = "MA_HS")
	private Integer maHS;
	
	@Column(name = "MA_HQ")
	private Integer maHQ;
	
	@Column(name = "MA_CUC")
	private Integer maCuc;

	@Column(name = "KY")
	private Integer ky;
	
	@Column(name = "THANG")
	private Integer thang;
	
	@Column(name = "QUY")
	private Integer quy;
	
	@Column(name = "NAM")
	private Integer nam;
	
	@Column(name = "LOAI_BC")
	private Integer loaiBC;
	
	@Column(name = "TUNGAY_DENNGAY")
	private Integer tungaydenngay;
	
	@Column(name = "TUNAM_DENNAM")
	private Integer tunamdennam;

	@Column(name = "TUTHANG_DENTHANG")
	private Integer tuthangdenthang;
	
	public Integer getTuthangdenthang() {
		return tuthangdenthang;
	}

	public void setTuthangdenthang(Integer tuthangdenthang) {
		this.tuthangdenthang = tuthangdenthang;
	}

	@Column(name = "MA_THITRUONG")
	private Integer maTTruong;
	
	@Column(name = "MA_THKE")
	private Integer maTKe;
	
	@Column(name = "MA_NLH")
	private Integer maNLH;
	
	@Column(name = "TINH_TP")
	private Integer tinh;
	
	@Column(name = "NHX")
	private String nhx;
			
	public String getNhx() {
		return nhx;
	}

	public void setNhx(String nhx) {
		this.nhx = nhx;
	}

	public Integer getMaHS() {
		return maHS;
	}

	public void setMaHS(Integer maHS) {
		this.maHS = maHS;
	}

	public Integer getMaHQ() {
		return maHQ;
	}

	public void setMaHQ(Integer maHQ) {
		this.maHQ = maHQ;
	}

	public Integer getMaCuc() {
		return maCuc;
	}

	public void setMaCuc(Integer maCuc) {
		this.maCuc = maCuc;
	}

	public Integer getKy() {
		return ky;
	}

	public void setKy(Integer ky) {
		this.ky = ky;
	}

	public Integer getThang() {
		return thang;
	}

	public void setThang(Integer thang) {
		this.thang = thang;
	}

	public Integer getQuy() {
		return quy;
	}

	public void setQuy(Integer quy) {
		this.quy = quy;
	}

	public Integer getNam() {
		return nam;
	}

	public void setNam(Integer nam) {
		this.nam = nam;
	}

	public Integer getLoaiBC() {
		return loaiBC;
	}

	public void setLoaiBC(Integer loaiBC) {
		this.loaiBC = loaiBC;
	}

	public Integer getTungaydenngay() {
		return tungaydenngay;
	}

	public void setTungaydenngay(Integer tungaydenngay) {
		this.tungaydenngay = tungaydenngay;
	}

	public Integer getTunamdennam() {
		return tunamdennam;
	}

	public void setTunamdennam(Integer tunamdennam) {
		this.tunamdennam = tunamdennam;
	}

	public Integer getMaTTruong() {
		return maTTruong;
	}

	public void setMaTTruong(Integer maTTruong) {
		this.maTTruong = maTTruong;
	}

	public Integer getMaTKe() {
		return maTKe;
	}

	public void setMaTKe(Integer maTKe) {
		this.maTKe = maTKe;
	}

	public Integer getMaNLH() {
		return maNLH;
	}

	public void setMaNLH(Integer maNLH) {
		this.maNLH = maNLH;
	}

	public Integer getTinh() {
		return tinh;
	}

	public void setTinh(Integer tinh) {
		this.tinh = tinh;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public Integer getMa_loaibc() {
		return ma_loaibc;
	}

	public void setMa_loaibc(Integer ma_loaibc) {
		this.ma_loaibc = ma_loaibc;
	}		
}
