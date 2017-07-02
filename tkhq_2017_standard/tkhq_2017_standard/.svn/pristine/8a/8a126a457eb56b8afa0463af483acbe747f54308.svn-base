package com.tkhq.cmc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tkhq.cmc.dao.TbsQtacXuatxuHangxuatDao;
import com.tkhq.cmc.dto.TbsQtacXuatNhapDTO;
import com.tkhq.cmc.model.TbsQtacXuatxuHangxuat;

@Service("tbsQtacXuatxuHangxuatService")
@Transactional
public class TbsQtacXuatxuHangxuatServiceImpl implements TbsQtacXuatxuHangxuatService{
	
	@Autowired
	private TbsQtacXuatxuHangxuatDao tbsQtacXuatxuHangxuatDao;
	
	@Override
	public void insert(TbsQtacXuatxuHangxuat entity) {
		tbsQtacXuatxuHangxuatDao.insert(entity);
	}

	@Override
	public void update(TbsQtacXuatNhapDTO entityDto) {
		tbsQtacXuatxuHangxuatDao.update(entityDto);
	}

	@Override
	public void delete(long id) {
		tbsQtacXuatxuHangxuatDao.delete(id);
	}

	@Override
	public TbsQtacXuatxuHangxuat findById(Long id) {
		return tbsQtacXuatxuHangxuatDao.findById(id);
	}

	@Override
	public List<TbsQtacXuatxuHangxuat> findAll() {
		return tbsQtacXuatxuHangxuatDao.findAll();
	}

	@Override
	public List<TbsQtacXuatxuHangxuat> searchData(String mathongke, String manuoc, int minRow, int maxRow) {
		return tbsQtacXuatxuHangxuatDao.searchData(mathongke, manuoc, minRow, maxRow);
	}

	@Override
	public long countTotal(String mathongke, String manuoc) {
		return tbsQtacXuatxuHangxuatDao.countTotal(mathongke, manuoc);
	}
}
