package com.tkhq.cmc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tkhq.cmc.dao.TbsQtacVantaiHangxuatNnDao;
import com.tkhq.cmc.dto.TbsQtacXuatNhapDTO;
import com.tkhq.cmc.model.TbsQtacVantaiHangxuatNn;

@Service("tbsQtacVantaiHangxuatNnService")
@Transactional
public class TbsQtacVantaiHangxuatNnServiceImpl implements TbsQtacVantaiHangxuatNnService{
	
	@Autowired
	private TbsQtacVantaiHangxuatNnDao tbsQtacVantaiHangxuatNnDao;

	@Override
	public void insert(TbsQtacVantaiHangxuatNn entity) {
		tbsQtacVantaiHangxuatNnDao.insert(entity);
	}

	@Override
	public void update(TbsQtacXuatNhapDTO entityDto) {
		tbsQtacVantaiHangxuatNnDao.update(entityDto);
	}

	@Override
	public void delete(long id) {
		tbsQtacVantaiHangxuatNnDao.delete(id);
	}

	@Override
	public TbsQtacVantaiHangxuatNn findById(Long id) {
		return tbsQtacVantaiHangxuatNnDao.findById(id);
	}

	@Override
	public List<TbsQtacVantaiHangxuatNn> findAll() {
		return tbsQtacVantaiHangxuatNnDao.findAll();
	}

	@Override
	public List<TbsQtacVantaiHangxuatNn> searchData(String mathongke, String macuakhaunn, int minRow, int maxRow) {
		return tbsQtacVantaiHangxuatNnDao.searchData(mathongke, macuakhaunn, minRow, maxRow);
	}

	@Override
	public long countTotal(String mathongke, String macuakhaunn) {
		return tbsQtacVantaiHangxuatNnDao.countTotal(mathongke, macuakhaunn);
	}
}
