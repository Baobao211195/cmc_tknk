package com.tkhq.cmc.dao;

import java.util.List;

import com.tkhq.cmc.dto.TbsQtacDnTrigiaNhapkhauDTO;
import com.tkhq.cmc.model.TbsQtacDnTrigiaNhapkhau;

public interface TbsQtacDnTrigiaNhapkhauDao {
	public void insert(TbsQtacDnTrigiaNhapkhau entity);

	public void update(TbsQtacDnTrigiaNhapkhauDTO entityDto);

	public void delete(long id);

	public TbsQtacDnTrigiaNhapkhau findById(Long id);

	public List<TbsQtacDnTrigiaNhapkhau> findAll();
	
	public List<TbsQtacDnTrigiaNhapkhau> searchData(String masodn, double trigianhapkhau,String tenDn, int minRow, int maxRow);
	public long countTotal(String masodn, double trigianhapkhau,String tenDn);
	
	public int insertList(List<TbsQtacDnTrigiaNhapkhau> listEntity);
}
