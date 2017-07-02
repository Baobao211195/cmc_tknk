package com.tkhq.cmc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tkhq.cmc.dao.TbsQtacDongiaXuatkhauDao;
import com.tkhq.cmc.dto.TbsQtacDongiaXuatkhauDTO;
import com.tkhq.cmc.model.TbsQtacDongiaXuatkhau;

@Service("tbsQtacDongiaXuatkhauService")
@Transactional
public class TbsQtacDongiaXuatkhauServiceImpl implements TbsQtacDongiaXuatkhauService{

	@Autowired
	private TbsQtacDongiaXuatkhauDao tbsQtacDongiaXuatkhauDao;
	
	@Override
	public void insert(TbsQtacDongiaXuatkhau entity) {
		tbsQtacDongiaXuatkhauDao.insert(entity);
	}

	@Override
	public void update(TbsQtacDongiaXuatkhauDTO entityDto) {
		tbsQtacDongiaXuatkhauDao.update(entityDto);
		
	}

	@Override
	public void delete(long id) {
		tbsQtacDongiaXuatkhauDao.delete(id);
	}

	@Override
	public TbsQtacDongiaXuatkhau findById(Long id) {
		return tbsQtacDongiaXuatkhauDao.findById(id);
	}

	@Override
	public List<TbsQtacDongiaXuatkhau> findAll() {
		return tbsQtacDongiaXuatkhauDao.findAll();
	}

	@Override
	public List<TbsQtacDongiaXuatkhau> searchData(String mathongke, String dongialonnhat, String dongianhonhat,
			int minRow, int maxRow) {
		return tbsQtacDongiaXuatkhauDao.searchData(mathongke, dongialonnhat, dongianhonhat, minRow, maxRow);
	}

	@Override
	public long countTotal(String mathongke, String dongialonnhat, String dongianhonhat) {
		return tbsQtacDongiaXuatkhauDao.countTotal(mathongke, dongialonnhat, dongianhonhat);
	}
}
