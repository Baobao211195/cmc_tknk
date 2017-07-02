package com.tkhq.cmc.services;

import java.util.List;

import com.tkhq.cmc.dto.TbsQtacDnTrigiaXuatkhauDTO;
import com.tkhq.cmc.model.TbsQtacDnTrigiaXuatkhau;

public interface TbsQtacDnTrigiaXuatkhauService {
	public void insert(TbsQtacDnTrigiaXuatkhau entity);

	public void update(TbsQtacDnTrigiaXuatkhauDTO entityDto);

	public void delete(long id);

	public TbsQtacDnTrigiaXuatkhau findById(Long id);

	public List<TbsQtacDnTrigiaXuatkhau> findAll();
	
	public List<TbsQtacDnTrigiaXuatkhau> searchData(String masodn, double trigiaxuatkhau,String tenDn, int minRow, int maxRow);
	
	public long countTotal(String masodn, double trigiaxuatkhau,String tenDn);
	
	public int insertList(List<TbsQtacDnTrigiaXuatkhau> listEntity);
}
