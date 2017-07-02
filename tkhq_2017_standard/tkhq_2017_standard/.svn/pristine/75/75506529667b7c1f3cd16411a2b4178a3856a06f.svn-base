package com.tkhq.cmc.dao;

import java.util.List;

import com.tkhq.cmc.dto.TbsQtacXuatNhapDTO;
import com.tkhq.cmc.model.TbsQtacVantaiHangxuatNn;

public interface TbsQtacVantaiHangxuatNnDao {
	public void insert(TbsQtacVantaiHangxuatNn entity);

	public void update(TbsQtacXuatNhapDTO entityDto);

	public void delete(long id);

	public TbsQtacVantaiHangxuatNn findById(Long id);

	public List<TbsQtacVantaiHangxuatNn> findAll();
	
	public List<TbsQtacVantaiHangxuatNn> searchData(String mathongke, String macuakhaunn, int minRow, int maxRow);
	
	public long countTotal(String mathongke, String macuakhaunn);
}
