package com.tkhq.cmc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tkhq.cmc.dao.Tbs_MathkeNhomNkDAO;
import com.tkhq.cmc.model.TbsMathkeNhomNk;

@Service("tbs_MathkeNhomNkService")
@Transactional
public class Tbs_MathkeNhomNkServiceImpl implements Tbs_MathkeNhomNkService {

	@Autowired
	Tbs_MathkeNhomNkDAO tbs_MathkeNhomNkDAO;
	
	public List<TbsMathkeNhomNk> getAll() {
		return tbs_MathkeNhomNkDAO.getAll();
	}

}
