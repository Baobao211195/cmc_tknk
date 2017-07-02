package com.tkhq.cmc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tkhq.cmc.dao.TbsQtacLuongXuatkhauDao;
import com.tkhq.cmc.dto.TbsQtacLuongDTO;
import com.tkhq.cmc.model.TbsQtacLuongXuatkhau;
import com.tkhq.cmc.model.TbsQtacLuongXuatkhau;

@Service("tbsQtacLuongXuatkhauService")
@Transactional
public class TbsQtacLuongXuatkhauServiceImpl implements TbsQtacLuongXuatkhauService{

	@Autowired
	private TbsQtacLuongXuatkhauDao tbsQtacLuongXuatkhauDao;
	
	@Override
	public void insert(TbsQtacLuongXuatkhau entity) {
		tbsQtacLuongXuatkhauDao.insert(entity);
	}

	@Override
	public void update(TbsQtacLuongDTO entityDto) {
		tbsQtacLuongXuatkhauDao.update(entityDto);
		
	}

	@Override
	public void delete(long id) {
		tbsQtacLuongXuatkhauDao.delete(id);
	}

	@Override
	public TbsQtacLuongXuatkhau findById(Long id) {
		return tbsQtacLuongXuatkhauDao.findById(id);
	}

	@Override
	public List<TbsQtacLuongXuatkhau> findAll() {
		return tbsQtacLuongXuatkhauDao.findAll();
	}

	@Override
	public List<TbsQtacLuongXuatkhau> searchData(String mathongke, String luonglonnhat, int minRow, int maxRow) {
		return tbsQtacLuongXuatkhauDao.searchData(mathongke, luonglonnhat, minRow, maxRow);
	}

	@Override
	public long countTotal(String mathongke, String luonglonnhat) {
		return tbsQtacLuongXuatkhauDao.countTotal(mathongke, luonglonnhat);
	}

}
