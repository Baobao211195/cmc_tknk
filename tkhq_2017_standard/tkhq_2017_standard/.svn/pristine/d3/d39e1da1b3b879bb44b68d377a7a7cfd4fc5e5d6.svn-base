package com.tkhq.cmc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tkhq.cmc.dao.TbsQtacCuakhauDbVnDao;
import com.tkhq.cmc.dto.TbsQtacCuakhauDbVnDto;
import com.tkhq.cmc.model.TbsQtacCuakhauDbVn;

@Service("tbsQtacCuakhauDbVnService")
@Transactional
public class TbsQtacCuakhauDbVnServiceImpl implements TbsQtacCuakhauDbVnService{
	
	
	@Autowired
	private TbsQtacCuakhauDbVnDao tbsQtacCuakhauDbVnDao;
	
	@Override
	public void insert(TbsQtacCuakhauDbVn entity) {
		tbsQtacCuakhauDbVnDao.insert(entity);
	}

	@Override
	public void update(TbsQtacCuakhauDbVnDto entityDto) {
		tbsQtacCuakhauDbVnDao.update(entityDto);
		
	}

	@Override
	public void delete(long id) {
		tbsQtacCuakhauDbVnDao.delete(id);
		
	}

	@Override
	public TbsQtacCuakhauDbVn findById(Long id) {
		return tbsQtacCuakhauDbVnDao.findById(id);
		
	}

	@Override
	public List<TbsQtacCuakhauDbVn> findAll() {
		return tbsQtacCuakhauDbVnDao.findAll();
	}

	@Override
	public List<TbsQtacCuakhauDbVn> searchData(String maCuaKhau, String maNuocDen, String maCKDen,
			String tenCuaKhau, String tenNuocDen, String tenCuaKhauDen, int minRow,int maxRow) {
		return tbsQtacCuakhauDbVnDao.searchData(maCuaKhau, maNuocDen,maCKDen, tenCuaKhau, tenNuocDen, tenCuaKhauDen, minRow, maxRow);
	}

	@Override
	public long countTotal(String maCuaKhau, String maNuocDen, String maCKDen, String tenCuaKhau, String tenNuocDen, String tenCuaKhauDen) {
		return tbsQtacCuakhauDbVnDao.countTotal(maCuaKhau, maNuocDen,maCKDen, tenCuaKhau, tenNuocDen, tenCuaKhauDen);
	}

	@Override
	public int insertList(List<TbsQtacCuakhauDbVn> listEntity) {
		return tbsQtacCuakhauDbVnDao.insertList(listEntity);
	}

}
