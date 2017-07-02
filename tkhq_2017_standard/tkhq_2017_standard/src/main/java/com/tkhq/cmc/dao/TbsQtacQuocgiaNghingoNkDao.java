package com.tkhq.cmc.dao;

import java.util.List;

import com.tkhq.cmc.dto.TbsQtacQuocgiaNghingoDTO;
import com.tkhq.cmc.model.TbsQtacQuocgiaNghingoNk;

public interface TbsQtacQuocgiaNghingoNkDao {
	public void insert(TbsQtacQuocgiaNghingoNk entity);

	public void update(TbsQtacQuocgiaNghingoDTO entityDto);

	public void delete(long id);

	public TbsQtacQuocgiaNghingoNk findById(Long id);

	public List<TbsQtacQuocgiaNghingoNk> findAll();
	
	public List<TbsQtacQuocgiaNghingoNk> searchData(String mathongke, String luonglonnhat, int minRow, int maxRow);
	
	public long countTotal(String mathongke, String luonglonnhat);
}
