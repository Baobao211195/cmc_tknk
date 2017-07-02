package com.tkhq.cmc.dao;

import java.util.List;

import com.tkhq.cmc.dto.TbsQtacXuatNhapDTO;
import com.tkhq.cmc.model.TbsQtacVantaiHangnhapNn;

public interface TbsQtacVantaiHangnhapNnDao {
	public void insert(TbsQtacVantaiHangnhapNn entity);

	public void update(TbsQtacXuatNhapDTO entityDto);

	public void delete(long id);

	public TbsQtacVantaiHangnhapNn findById(Long id);

	public List<TbsQtacVantaiHangnhapNn> findAll();
	
	public List<TbsQtacVantaiHangnhapNn> searchData(String mathongke, String macuakhaunn, int minRow, int maxRow);
	
	public long countTotal(String mathongke, String macuakhaunn);
}
