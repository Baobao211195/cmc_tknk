package com.tkhq.global.model.bcdulieuthaydoi;


/*
 * Modeling man hinh print bao cao thay doi do NVHQ - can confirm lai voi Diep CMC
 */
public class ThayDoiDoNVHQPrintResponse {

	private String lydo;
	private Double trigia_cu;
	private Double trigia_moi;
	private Double thay_doi;
	public ThayDoiDoNVHQPrintResponse(String lydo, Double trigia_cu,
			Double trigia_moi, Double thay_doi) {
		super();
		this.lydo = lydo;
		this.trigia_cu = trigia_cu;
		this.trigia_moi = trigia_moi;
		this.thay_doi = thay_doi;
	}
}
