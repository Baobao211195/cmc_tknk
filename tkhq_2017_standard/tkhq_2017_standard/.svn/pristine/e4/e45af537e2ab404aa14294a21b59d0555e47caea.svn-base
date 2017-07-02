package com.tkhq.cmc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tkhq.cmc.dao.TbsQtacTrigiaXuatkhauDao;
import com.tkhq.cmc.dto.TbsQtacTrigiaDTO;
import com.tkhq.cmc.model.TbsQtacTrigiaXuatkhau;

@Service("tbsQtacTrigiaXuatkhauService")
@Transactional
public class TbsQtacTrigiaXuatkhauServiceImpl implements TbsQtacTrigiaXuatkhauService{

	@Autowired
	private TbsQtacTrigiaXuatkhauDao TbsQtacTrigiaXuatkhauDao;

	@Override
	public void insert(TbsQtacTrigiaXuatkhau entity) {
		TbsQtacTrigiaXuatkhauDao.insert(entity);
	}

	@Override
	public void update(TbsQtacTrigiaDTO entityDto) {
		TbsQtacTrigiaXuatkhauDao.update(entityDto);
	}

	@Override
	public void delete(long id) {
		TbsQtacTrigiaXuatkhauDao.delete(id);
	}

	@Override
	public TbsQtacTrigiaXuatkhau findById(Long id) {
		return TbsQtacTrigiaXuatkhauDao.findById(id);
	}

	@Override
	public List<TbsQtacTrigiaXuatkhau> findAll() {
		return TbsQtacTrigiaXuatkhauDao.findAll();
	}

	@Override
	public List<TbsQtacTrigiaXuatkhau> searchData(String mathongke, String luonglonnhat, int minRow, int maxRow) {
		return TbsQtacTrigiaXuatkhauDao.searchData(mathongke, luonglonnhat, minRow, maxRow);
	}

	@Override
	public long countTotal(String mathongke, String luonglonnhat) {
		return TbsQtacTrigiaXuatkhauDao.countTotal(mathongke, luonglonnhat);
	}

}
