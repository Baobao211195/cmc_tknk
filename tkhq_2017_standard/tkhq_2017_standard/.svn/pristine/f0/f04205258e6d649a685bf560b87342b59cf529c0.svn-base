package com.tkhq.cmc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tkhq.cmc.dao.TbsQtacVantaiHangnhapVnDao;
import com.tkhq.cmc.dto.TbsQtacXuatNhapDTO;
import com.tkhq.cmc.model.TbsQtacVantaiHangnhapVn;

@Service("tbsQtacVantaiHangnhapVnService")
@Transactional
public class TbsQtacVantaiHangnhapVnServiceImpl implements TbsQtacVantaiHangnhapVnService{
	
	@Autowired
	private TbsQtacVantaiHangnhapVnDao tbsQtacVantaiHangnhapVnDao;

	@Override
	public void insert(TbsQtacVantaiHangnhapVn entity) {
		tbsQtacVantaiHangnhapVnDao.insert(entity);
	}

	@Override
	public void update(TbsQtacXuatNhapDTO entityDto) {
		tbsQtacVantaiHangnhapVnDao.update(entityDto);
	}

	@Override
	public void delete(long id) {
		tbsQtacVantaiHangnhapVnDao.delete(id);
	}

	@Override
	public TbsQtacVantaiHangnhapVn findById(Long id) {
		return tbsQtacVantaiHangnhapVnDao.findById(id);
	}

	@Override
	public List<TbsQtacVantaiHangnhapVn> findAll() {
		return tbsQtacVantaiHangnhapVnDao.findAll();
	}

	@Override
	public List<TbsQtacVantaiHangnhapVn> searchData(String mathongke, String macuakhauvn, int minRow, int maxRow) {
		return tbsQtacVantaiHangnhapVnDao.searchData(mathongke, macuakhauvn, minRow, maxRow);
	}

	@Override
	public long countTotal(String mathongke, String macuakhauvn) {
		return tbsQtacVantaiHangnhapVnDao.countTotal(mathongke, macuakhauvn);
	}
}
