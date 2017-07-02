package com.tkhq.cmc.dao;

	import java.util.List;

	import com.tkhq.cmc.model.Tbs_Cangnn_vnaccs;

	public interface Tbs_cangnn_vnaccsDAO {
				
		void insertTbs_Cangnn(Tbs_Cangnn_vnaccs tbs_cangnn_vnaccs)	throws Exception;

		List<Tbs_Cangnn_vnaccs> findAll();
		
		Tbs_Cangnn_vnaccs findByMaCang(String maCang);
		
		void updateTbs_cangnn(Tbs_Cangnn_vnaccs tbs_cangnn_vnaccs);

		void deleteByMaCang(String maCang);

		List<Tbs_Cangnn_vnaccs> searchCangNN(String maCang, String tenNuoc, String tenTP, String maNuoc);
		
		long countTotal(String maCang, String tenNuoc, String tenTP, String maNuoc);
	}