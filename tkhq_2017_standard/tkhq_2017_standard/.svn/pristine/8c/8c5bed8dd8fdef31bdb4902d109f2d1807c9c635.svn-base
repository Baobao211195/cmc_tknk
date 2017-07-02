package com.tkhq.cmc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tkhq.cmc.dao.TbsQtacTrigiaNhapkhauDao;
import com.tkhq.cmc.dto.TbsQtacTrigiaDTO;
import com.tkhq.cmc.model.TbsQtacTrigiaNhapkhau;

@Service("tbsQtacTrigiaNhapkhauService")
@Transactional
public class TbsQtacTrigiaNhapkhauServiceImpl implements TbsQtacTrigiaNhapkhauService{

	@Autowired
	private TbsQtacTrigiaNhapkhauDao tbsQtacTrigiaNhapkhauDao;

	@Override
	public void insert(TbsQtacTrigiaNhapkhau entity) {
		tbsQtacTrigiaNhapkhauDao.insert(entity);
	}

	@Override
	public void update(TbsQtacTrigiaDTO entityDto) {
		tbsQtacTrigiaNhapkhauDao.update(entityDto);
	}

	@Override
	public void delete(long id) {
		tbsQtacTrigiaNhapkhauDao.delete(id);
	}

	@Override
	public TbsQtacTrigiaNhapkhau findById(Long id) {
		return tbsQtacTrigiaNhapkhauDao.findById(id);
	}

	@Override
	public List<TbsQtacTrigiaNhapkhau> findAll() {
		return tbsQtacTrigiaNhapkhauDao.findAll();
	}

	@Override
	public List<TbsQtacTrigiaNhapkhau> searchData(String mathongke, String luonglonnhat, int minRow, int maxRow) {
		return tbsQtacTrigiaNhapkhauDao.searchData(mathongke, luonglonnhat, minRow, maxRow);
	}

	@Override
	public long countTotal(String mathongke, String luonglonnhat) {
		return tbsQtacTrigiaNhapkhauDao.countTotal(mathongke, luonglonnhat);
	}
}
