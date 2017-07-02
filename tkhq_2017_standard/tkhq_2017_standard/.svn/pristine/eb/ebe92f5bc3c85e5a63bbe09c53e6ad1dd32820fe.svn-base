package com.tkhq.cmc.dao;

import java.util.List;

import com.tkhq.cmc.dto.TbsQtacTrigiaDTO;
import com.tkhq.cmc.model.TbsQtacTrigiaNhapkhau;

public interface TbsQtacTrigiaNhapkhauDao {

	public void insert(TbsQtacTrigiaNhapkhau entity);

	public void update(TbsQtacTrigiaDTO entityDto);

	public void delete(long id);

	public TbsQtacTrigiaNhapkhau findById(Long id);

	public List<TbsQtacTrigiaNhapkhau> findAll();
	
	public List<TbsQtacTrigiaNhapkhau> searchData(String mathongke, String luonglonnhat, int minRow, int maxRow);
	
	public long countTotal(String mathongke, String luonglonnhat);
}	
