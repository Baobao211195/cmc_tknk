package com.tkhq.cmc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tkhq.cmc.dao.TbsQtacDongiaNhapkhauDao;
import com.tkhq.cmc.dto.TbsQtacDongiaNhapkhauDTO;
import com.tkhq.cmc.model.TbsQtacDongiaNhapkhau;

@Service("tbsQtacDongiaNhapkhauService")
@Transactional
public class TbsQtacDongiaNhapkhauServiceImpl implements TbsQtacDongiaNhapkhauService{
	
	@Autowired
	private TbsQtacDongiaNhapkhauDao tbsQtacDongiaNhapkhauDao;
	@Override
	public void insert(TbsQtacDongiaNhapkhau entity) {
		tbsQtacDongiaNhapkhauDao.insert(entity);
	}

	@Override
	public void update(TbsQtacDongiaNhapkhauDTO entityDto) {
		tbsQtacDongiaNhapkhauDao.update(entityDto);
		
	}

	@Override
	public void delete(long id) {
		tbsQtacDongiaNhapkhauDao.delete(id);
	}

	@Override
	public TbsQtacDongiaNhapkhau findById(Long id) {
		return tbsQtacDongiaNhapkhauDao.findById(id);
	}

	@Override
	public List<TbsQtacDongiaNhapkhau> findAll() {
		return tbsQtacDongiaNhapkhauDao.findAll();
	}

	@Override
	public List<TbsQtacDongiaNhapkhau> searchData(String mathongke, String dongialonnhat, String dongianhonhat,
			int minRow, int maxRow) {
		return tbsQtacDongiaNhapkhauDao.searchData(mathongke, dongialonnhat, dongianhonhat, minRow, maxRow);
	}

	@Override
	public long countTotal(String mathongke, String dongialonnhat, String dongianhonhat) {
		return tbsQtacDongiaNhapkhauDao.countTotal(mathongke, dongialonnhat, dongianhonhat);
	}
}
