package com.tkhq.cmc.dao;

import java.util.List;

import com.tkhq.cmc.dto.TbsQtacDongiaXuatkhauDTO;
import com.tkhq.cmc.model.TbsQtacDongiaXuatkhau;

public interface TbsQtacDongiaXuatkhauDao {
	public void insert(TbsQtacDongiaXuatkhau entity);

	public void update(TbsQtacDongiaXuatkhauDTO entityDto);

	public void delete(long id);

	public TbsQtacDongiaXuatkhau findById(Long id);

	public List<TbsQtacDongiaXuatkhau> findAll();
	
	public List<TbsQtacDongiaXuatkhau> searchData(String mathongke, String dongialonnhat,String dongianhonhat, int minRow, int maxRow);
	
	public long countTotal(String mathongke, String dongialonnhat,String dongianhonhat);
}
