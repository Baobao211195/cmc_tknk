package com.tkhq.cmc.dao;

import java.util.List;

import com.tkhq.cmc.dto.TbsQtacXuatNhapDTO;
import com.tkhq.cmc.model.TbsQtacXuatxuHangnhap;

public interface TbsQtacXuatxuHangnhapDao {
	public void insert(TbsQtacXuatxuHangnhap entity);

	public void update(TbsQtacXuatNhapDTO entityDto);

	public void delete(long id);

	public TbsQtacXuatxuHangnhap findById(Long id);

	public List<TbsQtacXuatxuHangnhap> findAll();
	
	public List<TbsQtacXuatxuHangnhap> searchData(String mathongke, String manuoc, int minRow, int maxRow);
	
	public long countTotal(String mathongke, String manuoc);
}
