package com.tkhq.cmc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tkhq.cmc.dao.TbsQtacQuocgiaNghingoNkDao;
import com.tkhq.cmc.dto.TbsQtacQuocgiaNghingoDTO;
import com.tkhq.cmc.model.TbsQtacQuocgiaNghingoNk;

@Service("tbsQtacQuocgiaNghingoNkService")
@Transactional
public class TbsQtacQuocgiaNghingoNkServiceImpl implements TbsQtacQuocgiaNghingoNkService{
	
	@Autowired
	private TbsQtacQuocgiaNghingoNkDao tbsQtacQuocgiaNghingoNkDao;

	@Override 
	public void insert(TbsQtacQuocgiaNghingoNk entity) {
		tbsQtacQuocgiaNghingoNkDao.insert(entity);
	}

	@Override
	public void update(TbsQtacQuocgiaNghingoDTO entityDto) {
		tbsQtacQuocgiaNghingoNkDao.update(entityDto);
	}

	@Override
	public void delete(long id) {
		tbsQtacQuocgiaNghingoNkDao.delete(id);
		
	}

	@Override
	public TbsQtacQuocgiaNghingoNk findById(Long id) {
		return tbsQtacQuocgiaNghingoNkDao.findById(id);
	}

	@Override
	public List<TbsQtacQuocgiaNghingoNk> findAll() {
		
		return tbsQtacQuocgiaNghingoNkDao.findAll();
	}

	@Override
	public List<TbsQtacQuocgiaNghingoNk> searchData(String manuoc, String tennuoc, int minRow, int maxRow) {
		return tbsQtacQuocgiaNghingoNkDao.searchData(manuoc, tennuoc, minRow, maxRow);
	}

	@Override
	public long countTotal(String manuoc, String tennuoc) {
		return tbsQtacQuocgiaNghingoNkDao.countTotal(manuoc, tennuoc);
	}
}
