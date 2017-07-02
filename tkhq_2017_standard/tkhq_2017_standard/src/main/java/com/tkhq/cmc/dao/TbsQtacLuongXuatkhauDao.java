package com.tkhq.cmc.dao;

import java.util.List;

import com.tkhq.cmc.dto.TbsQtacLuongDTO;
import com.tkhq.cmc.model.TbsQtacLuongXuatkhau;

public interface TbsQtacLuongXuatkhauDao {
	public void insert(TbsQtacLuongXuatkhau entity);

	public void update(TbsQtacLuongDTO entityDto);

	public void delete(long id);

	public TbsQtacLuongXuatkhau findById(Long id);

	public List<TbsQtacLuongXuatkhau> findAll();
	
	public List<TbsQtacLuongXuatkhau> searchData(String mathongke, String luonglonnhat, int minRow, int maxRow);
	
	public long countTotal(String mathongke, String luonglonnhat);
}
