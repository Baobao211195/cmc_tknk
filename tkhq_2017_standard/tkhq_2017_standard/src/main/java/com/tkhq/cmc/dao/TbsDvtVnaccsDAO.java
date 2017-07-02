package com.tkhq.cmc.dao;

import java.util.List;

import com.tkhq.cmc.model.TBS_cuakhaunn_vnaccs;
import com.tkhq.cmc.model.TbsDvtVnaccs;
import com.tkhq.cmc.model.Tbs_BieuThue;

public interface TbsDvtVnaccsDAO {

	void insertTbsDvtVnaccs(TbsDvtVnaccs tbsDvtVnaccs)
			throws Exception;

	List<TbsDvtVnaccs> findAll();

	TbsDvtVnaccs findById(String maDvt);

	void updateTbsDvtVnaccs(TbsDvtVnaccs tbsDvtVnaccs);

	void deleteByMaDvt(String maDvt);

	List<TbsDvtVnaccs> searchTbsDvtVnaccs(String maDvt, String tenDvt,
			String tenDvtv, String tenDvtUni, int minRow, int maxRow);
	long countTotal(String maDvt, String tenDvt, String tenDvtv, String tenDvtUni);
}
