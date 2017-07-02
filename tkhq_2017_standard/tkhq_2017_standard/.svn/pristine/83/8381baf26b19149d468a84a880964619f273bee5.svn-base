package com.tkhq.global.dao;

import java.util.List;

import com.tkhq.global.model.bcdulieuthaydoi.*;

public interface BaoCaoDuLieuThayDoiDao {

	List<ThayDoiDoNVHQTongTheResponse> getThayDoiTongThe(
			final ThayDoiDoNVHQRequest requestParams);

	List<ThayDoiDoNVHQBSToKhaiResponse> getThayDoiDoBSToKhai(
			final ThayDoiDoNVHQRequest requestParams);

	List<ThayDoiDoNVHQNhomHuyXoaResponse> getThayDoiDoHuyXoa(
			final ThayDoiDoNVHQRequest requestParams);
	
	List<ThayDoiDoNVHQNhomSDBSResponse> getThayDoiDoSDBS(
			final ThayDoiDoNVHQRequest requestParams);

	List<List<PrintTongTheGroupItem>> getPrintTongThe(final TongThePrintParams requestParams);
	
	List<List<PrintBuocNVTKGroupItem>> getPrintBuocNVTKValue(
			final BuocNVTKPrintParams requestParams);

	List<XemThayDoiDoBuocNVThKe> xemChitietThayDoi_BuocNVTHKE(final XemToKhaiThayDoiParams params);

	List<XemThayDoiDoBSToKhai> xemChitietThayDoi_BSToKhai(final XemToKhaiThayDoiParams params);

	List<XemThayDoiDoSDBS> xemChitietThayDoi_SDBS(final XemToKhaiThayDoiParams params);
}
