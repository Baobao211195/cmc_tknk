package com.tkhq.cmc.dao;

import java.util.List;

import com.tkhq.cmc.model.TBS_cuakhaunn_vnaccs;

public interface TBS_cuakhaunn_vnaccsDAO {

	void insertTbs_Cuakhaunn(TBS_cuakhaunn_vnaccs tbs_cuakhaunn_vnaccs)
			throws Exception;

	List<TBS_cuakhaunn_vnaccs> findAll();

	TBS_cuakhaunn_vnaccs findById(String maCang);

	void updateTbs_cuakhaunn(TBS_cuakhaunn_vnaccs tbs_cuakhaunn_vnaccs);

	void deleteByMaCang(String maCang);

	List<TBS_cuakhaunn_vnaccs> searchCuaKhauNN(String maCang, String loaiCang,
			String tenNuoc, String tenTP, String maNuoc, int minRow, int maxRow);
	long countTotal(String maCang, String loaiCang,String tenNuoc, String tenTP, String maNuoc);
}
