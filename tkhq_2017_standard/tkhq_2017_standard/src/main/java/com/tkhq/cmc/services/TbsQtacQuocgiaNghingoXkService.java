package com.tkhq.cmc.services;

import java.util.List;

import com.tkhq.cmc.dto.TbsQtacQuocgiaNghingoDTO;
import com.tkhq.cmc.model.TbsQtacQuocgiaNghingoXk;

public interface TbsQtacQuocgiaNghingoXkService {
	public void insert(TbsQtacQuocgiaNghingoXk entity);

	public void update(TbsQtacQuocgiaNghingoDTO entityDto);

	public void delete(long id);

	public TbsQtacQuocgiaNghingoXk findById(Long id);

	public List<TbsQtacQuocgiaNghingoXk> findAll();
	
	public List<TbsQtacQuocgiaNghingoXk> searchData(String mathongke, String luonglonnhat, int minRow, int maxRow);
	
	public long countTotal(String mathongke, String luonglonnhat);
}
