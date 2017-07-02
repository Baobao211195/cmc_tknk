package com.tkhq.cmc.services;

import java.util.List;

import com.tkhq.cmc.model.TBS_cuakhaunn_vnaccs;
import com.tkhq.cmc.model.Tbs_BieuThue;

public interface TBS_cuakhaunn_vnaccsService {
	void insertTbs_Cuakhaunn(TBS_cuakhaunn_vnaccs tbs_cuakhaunn_vnaccs)
			throws Exception;

	List<TBS_cuakhaunn_vnaccs> findAll();

	TBS_cuakhaunn_vnaccs findById(String maCang);

	void updateTbs_cuakhaunn(TBS_cuakhaunn_vnaccs tbs_cuakhaunn_vnaccs);

	void deleteByMaCang(String maCang);

	List<TBS_cuakhaunn_vnaccs> searchCuaKhauNN(String maCang, String loaiCang,
			String tenNuoc, String tenTP, String maNuoc, int minRow, int maxRow);
	long countTotal(String maCang, String loaiCang, String tenNuoc, String tenTP, String maNuoc);
}
