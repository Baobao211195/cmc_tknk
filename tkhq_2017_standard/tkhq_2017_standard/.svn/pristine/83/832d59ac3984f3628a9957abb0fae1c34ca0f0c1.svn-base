package com.tkhq.cmc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tkhq.cmc.dao.Tbs_lhxnkDAO;
import com.tkhq.cmc.model.Tbs_lhxnk;

@Service("tbs_lhxnkService")
@Transactional
public class Tbs_lhxnkServiceImpl implements Tbs_lhxnkSerivce {

	@Autowired
	Tbs_lhxnkDAO tbs_lhxnkDAO;
	
	public List<Tbs_lhxnk> getAll() {		
		return tbs_lhxnkDAO.getAll();
	}

}
