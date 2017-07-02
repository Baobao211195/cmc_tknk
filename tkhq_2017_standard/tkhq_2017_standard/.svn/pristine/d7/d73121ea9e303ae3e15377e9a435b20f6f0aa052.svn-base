package com.tkhq.cmc.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tkhq.cmc.dao.TbsQtacVantaiHangxuatVnDao;
import com.tkhq.cmc.dto.TbsQtacXuatNhapDTO;
import com.tkhq.cmc.model.TbsQtacVantaiHangxuatVn;


@Service("tbsQtacVantaiHangxuatVnService")
@Transactional
public class TbsQtacVantaiHangxuatVnServiceImpl implements TbsQtacVantaiHangxuatVnService{
	
	@Autowired
	private TbsQtacVantaiHangxuatVnDao tbsQtacVantaiHangxuatVnDao;
	
	@Override
	public void insert(TbsQtacVantaiHangxuatVn entity) {
		tbsQtacVantaiHangxuatVnDao.insert(entity);
	}

	@Override
	public void update(TbsQtacXuatNhapDTO entityDto) {
		tbsQtacVantaiHangxuatVnDao.update(entityDto);
	}

	@Override
	public void delete(long id) {
		tbsQtacVantaiHangxuatVnDao.delete(id);
	}

	@Override
	public TbsQtacVantaiHangxuatVn findById(Long id) {
		return tbsQtacVantaiHangxuatVnDao.findById(id);
	}

	@Override
	public List<TbsQtacVantaiHangxuatVn> findAll() {
		return tbsQtacVantaiHangxuatVnDao.findAll();
	}

	@Override
	public List<TbsQtacVantaiHangxuatVn> searchData(String mathongke, String macuakhauvn, int minRow, int maxRow) {
		return tbsQtacVantaiHangxuatVnDao.searchData(mathongke, macuakhauvn, minRow, maxRow);
	}

	@Override
	public long countTotal(String mathongke, String macuakhauvn) {
		return tbsQtacVantaiHangxuatVnDao.countTotal(mathongke, macuakhauvn);
	}
}
