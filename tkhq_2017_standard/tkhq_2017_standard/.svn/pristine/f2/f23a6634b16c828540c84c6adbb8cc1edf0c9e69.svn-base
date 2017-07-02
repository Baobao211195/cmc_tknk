package com.tkhq.cmc.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tkhq.cmc.dao.Tbs_MathkeNhomXkDAO;
import com.tkhq.cmc.model.TbsMathkeNhomXk;

@Service("tbs_MathkeNhomXkService")
@Transactional
public class Tbs_MathkeNhomXkServiceImpl implements Tbs_MathkeNhomXkService{
	@Autowired
	Tbs_MathkeNhomXkDAO tbs_MathkeNhomXkDAO;
	
	public List<TbsMathkeNhomXk> getAll() {
		return tbs_MathkeNhomXkDAO.getAll();
	}
}
