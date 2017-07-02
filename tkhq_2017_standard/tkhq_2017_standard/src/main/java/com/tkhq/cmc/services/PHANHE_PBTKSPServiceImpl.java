package com.tkhq.cmc.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tkhq.cmc.dao.PHANHE_PBTKSPDAO;
import com.tkhq.cmc.dto.BCSLVNBELARUTDTO;
import com.tkhq.cmc.dto.BCSLVNUCRAINADTO;
import com.tkhq.cmc.dto.BCSLVN_ASIANDTO;
import com.tkhq.cmc.dto.BCSLVN_LAODTO;
import com.tkhq.cmc.dto.BCSLVN_NGADTO;
import com.tkhq.cmc.dto.BCSLVN_TOWORLDDTO;

@Service
@Transactional
public class PHANHE_PBTKSPServiceImpl implements PHANHE_PBTKSPService {
	@Autowired
	PHANHE_PBTKSPDAO baocaoDAO;

	public List<BCSLVNUCRAINADTO> Ts_BCSLVN_UCRAINA(int ky, int nam) {
		return baocaoDAO.Ts_BCSLVN_UCRAINA(ky, nam);
	}

	public List<BCSLVNBELARUTDTO> Ts_BCSLVN_BELARUT(int ky, int nam,String nhx) {
		return baocaoDAO.Ts_BCSLVN_BELARUT(ky, nam, nhx);
	}
	
	public List<BCSLVN_LAODTO> ts_BCSLVN_LAO(int ky, int nam) {
		return baocaoDAO.ts_BCSLVN_LAO(ky, nam);
	}

	@Override
	public List<BCSLVN_NGADTO> ts_BCSLVN_NGA(int ky, int nam) {
		return baocaoDAO.ts_BCSLVN_NGA(ky, nam);
	}

	@Override
	public List<BCSLVN_ASIANDTO> ts_BCSLVN_ASIAN(int quy, int nam,
			String nhx) {
		return baocaoDAO.ts_BCSLVN_ASIAN(quy, nam,nhx);
	}

	@Override
	public List<BCSLVN_TOWORLDDTO> ts_BCSLVN_TOWORLD(int nam, String nhx) {
		return baocaoDAO.ts_BCSLVN_TOWORLD(nam,nhx);
	}
}
