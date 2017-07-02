package com.tkhq.cmc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tkhq.cmc.dao.TbsQtacXuatxuHangnhapDao;
import com.tkhq.cmc.dto.TbsQtacXuatNhapDTO;
import com.tkhq.cmc.model.TbsQtacXuatxuHangnhap;

@Service("tbsQtacXuatxuHangnhapService")
@Transactional
public class TbsQtacXuatxuHangnhapServiceImpl implements TbsQtacXuatxuHangnhapService {

	@Autowired
	private TbsQtacXuatxuHangnhapDao tbsQtacXuatxuHangnhapDao;
	
	@Override
	public void insert(TbsQtacXuatxuHangnhap entity) {
		tbsQtacXuatxuHangnhapDao.insert(entity);
	}

	@Override
	public void update(TbsQtacXuatNhapDTO entityDto) {
		tbsQtacXuatxuHangnhapDao.update(entityDto);
	}

	@Override
	public void delete(long id) {
		tbsQtacXuatxuHangnhapDao.delete(id);
	}

	@Override
	public TbsQtacXuatxuHangnhap findById(Long id) {
		return tbsQtacXuatxuHangnhapDao.findById(id);
	}

	@Override
	public List<TbsQtacXuatxuHangnhap> findAll() {
		return tbsQtacXuatxuHangnhapDao.findAll();
	}

	@Override
	public List<TbsQtacXuatxuHangnhap> searchData(String mathongke, String manuoc, int minRow, int maxRow) {
		return tbsQtacXuatxuHangnhapDao.searchData(mathongke, manuoc, minRow, maxRow);
	}

	@Override
	public long countTotal(String mathongke, String manuoc) {
		return tbsQtacXuatxuHangnhapDao.countTotal(mathongke, manuoc);
	}
}
