package com.tkhq.cmc.dto;

import java.util.List;

public class Tbs_ChuyenDeDTO {

	private String maCDe;
	private String tenCDe;
	private String maHang;
	private String motaHH;
	private boolean isChecked;
	private String currentPage;
	private String pageSize;
	private List lstChuyenDe;
	private long totalCount;
	private long maxPage;
	
	
	public boolean isChecked() {
		return isChecked;
	}
	public void setChecked(boolean isChecked) {
		this.isChecked = isChecked;
	}
	public String getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}
	public String getPageSize() {
		return pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public List getLstChuyenDe() {
		return lstChuyenDe;
	}
	public void setLstChuyenDe(List lstChuyenDe) {
		this.lstChuyenDe = lstChuyenDe;
	}
	public long getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}
	public long getMaxPage() {
		return maxPage;
	}
	public void setMaxPage(long maxPage) {
		this.maxPage = maxPage;
	}
	public String getMaCDe() {
		return maCDe;
	}
	public void setMaCDe(String maCDe) {
		this.maCDe = maCDe;
	}
	public String getTenCDe() {
		return tenCDe;
	}
	public void setTenCDe(String tenCDe) {
		this.tenCDe = tenCDe;
	}
	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}
	public String getMotaHH() {
		return motaHH;
	}
	public void setMotaHH(String motaHH) {
		this.motaHH = motaHH;
	}
		
}
