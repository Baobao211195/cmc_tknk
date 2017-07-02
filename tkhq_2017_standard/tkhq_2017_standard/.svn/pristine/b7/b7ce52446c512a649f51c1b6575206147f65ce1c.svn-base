package com.tkhq.cmc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tkhq.cmc.dao.TbsQtacQuocgiaNghingoXkDao;
import com.tkhq.cmc.dto.TbsQtacQuocgiaNghingoDTO;
import com.tkhq.cmc.model.TbsQtacQuocgiaNghingoXk;

@Service("tbsQtacQuocgiaNghingoXkService")
@Transactional
public class TbsQtacQuocgiaNghingoXkServiceImpl implements TbsQtacQuocgiaNghingoXkService{

	@Autowired
	private TbsQtacQuocgiaNghingoXkDao TbsQtacQuocgiaNghingoXkDao;

	@Override 
	public void insert(TbsQtacQuocgiaNghingoXk entity) {
		TbsQtacQuocgiaNghingoXkDao.insert(entity);
	}

	@Override
	public void update(TbsQtacQuocgiaNghingoDTO entityDto) {
		TbsQtacQuocgiaNghingoXkDao.update(entityDto);
	}

	@Override
	public void delete(long id) {
		TbsQtacQuocgiaNghingoXkDao.delete(id);
		
	}

	@Override
	public TbsQtacQuocgiaNghingoXk findById(Long id) {
		return TbsQtacQuocgiaNghingoXkDao.findById(id);
	}

	@Override
	public List<TbsQtacQuocgiaNghingoXk> findAll() {
		
		return TbsQtacQuocgiaNghingoXkDao.findAll();
	}

	@Override
	public List<TbsQtacQuocgiaNghingoXk> searchData(String manuoc, String tennuoc, int minRow, int maxRow) {
		return TbsQtacQuocgiaNghingoXkDao.searchData(manuoc, tennuoc, minRow, maxRow);
	}

	@Override
	public long countTotal(String manuoc, String tennuoc) {
		return TbsQtacQuocgiaNghingoXkDao.countTotal(manuoc, tennuoc);
	}
}
