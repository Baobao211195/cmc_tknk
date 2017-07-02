package com.tkhq.cmc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tkhq.cmc.dao.TbsQtacLuongNhapkhauDao;
import com.tkhq.cmc.dto.TbsQtacLuongDTO;
import com.tkhq.cmc.model.TbsQtacLuongNhapkhau;

@Service("tbsQtacLuongNhapkhauService")
@Transactional
public class TbsQtacLuongNhapkhauServiceImpl implements TbsQtacLuongNhapkhauService{
	
	@Autowired
	private TbsQtacLuongNhapkhauDao tbsQtacLuongNhapkhauDao;
	
	@Override
	public void insert(TbsQtacLuongNhapkhau entity) {
		tbsQtacLuongNhapkhauDao.insert(entity);
	}

	@Override
	public void update(TbsQtacLuongDTO entityDto) {
		tbsQtacLuongNhapkhauDao.update(entityDto);
		
	}

	@Override
	public void delete(long id) {
		tbsQtacLuongNhapkhauDao.delete(id);
	}

	@Override
	public TbsQtacLuongNhapkhau findById(Long id) {
		return tbsQtacLuongNhapkhauDao.findById(id);
	}

	@Override
	public List<TbsQtacLuongNhapkhau> findAll() {
		return tbsQtacLuongNhapkhauDao.findAll();
	}

	@Override
	public List<TbsQtacLuongNhapkhau> searchData(String mathongke, String luonglonnhat, int minRow, int maxRow) {
		return tbsQtacLuongNhapkhauDao.searchData(mathongke, luonglonnhat, minRow, maxRow);
	}

	@Override
	public long countTotal(String mathongke, String luonglonnhat) {
		return tbsQtacLuongNhapkhauDao.countTotal(mathongke, luonglonnhat);
	}
}
