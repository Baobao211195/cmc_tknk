package com.tkhq.cmc.dao;

import java.util.List;

import com.tkhq.cmc.dto.TbsQtacXuatNhapDTO;
import com.tkhq.cmc.model.TbsQtacXuatxuHangxuat;

public interface TbsQtacXuatxuHangxuatDao {
	public void insert(TbsQtacXuatxuHangxuat entity);

	public void update(TbsQtacXuatNhapDTO entityDto);

	public void delete(long id);

	public TbsQtacXuatxuHangxuat findById(Long id);

	public List<TbsQtacXuatxuHangxuat> findAll();
	
	public List<TbsQtacXuatxuHangxuat> searchData(String mathongke, String manuoc, int minRow, int maxRow);
	
	public long countTotal(String mathongke, String manuoc);
}
