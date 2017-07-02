package com.tkhq.cmc.dao;

import java.util.List;

import com.tkhq.cmc.dto.TbsQtacXuatNhapDTO;
import com.tkhq.cmc.model.TbsQtacVantaiHangxuatVn;

public interface TbsQtacVantaiHangxuatVnDao {
	public void insert(TbsQtacVantaiHangxuatVn entity);

	public void update(TbsQtacXuatNhapDTO entityDto);

	public void delete(long id);

	public TbsQtacVantaiHangxuatVn findById(Long id);

	public List<TbsQtacVantaiHangxuatVn> findAll();
	
	public List<TbsQtacVantaiHangxuatVn> searchData(String mathongke, String macuakhauvn, int minRow, int maxRow);
	
	public long countTotal(String mathongke, String macuakhauvn);
}
