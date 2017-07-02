package com.tkhq.cmc.services;

import java.util.List;

import com.tkhq.cmc.dto.TbsQtacLuongDTO;
import com.tkhq.cmc.model.TbsQtacLuongNhapkhau;

public interface TbsQtacLuongNhapkhauService {
	public void insert(TbsQtacLuongNhapkhau entity);

	public void update(TbsQtacLuongDTO entityDto);

	public void delete(long id);

	public TbsQtacLuongNhapkhau findById(Long id);

	public List<TbsQtacLuongNhapkhau> findAll();

	public List<TbsQtacLuongNhapkhau> searchData(String mathongke, String luonglonnhat, int minRow, int maxRow);

	public long countTotal(String mathongke, String luonglonnhat);
}
