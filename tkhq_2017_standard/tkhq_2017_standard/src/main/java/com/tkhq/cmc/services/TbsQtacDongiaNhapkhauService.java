package com.tkhq.cmc.services;

import java.util.List;

import com.tkhq.cmc.dto.TbsQtacDongiaNhapkhauDTO;
import com.tkhq.cmc.model.TbsQtacDongiaNhapkhau;

public interface TbsQtacDongiaNhapkhauService {
	public void insert(TbsQtacDongiaNhapkhau entity);

	public void update(TbsQtacDongiaNhapkhauDTO entityDto);

	public void delete(long id);

	public TbsQtacDongiaNhapkhau findById(Long id);

	public List<TbsQtacDongiaNhapkhau> findAll();
	
	public List<TbsQtacDongiaNhapkhau> searchData(String mathongke, String dongialonnhat,String dongianhonhat, int minRow, int maxRow);
	
	public long countTotal(String mathongke, String dongialonnhat,String dongianhonhat);
}
