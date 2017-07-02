package com.tkhq.cmc.services;

import java.util.List;

import com.tkhq.cmc.dto.TbsQtacCuakhauDbVnDto;
import com.tkhq.cmc.model.TbsQtacCuakhauDbVn;

public interface TbsQtacCuakhauDbVnService {
	public void insert(TbsQtacCuakhauDbVn entity);

	public void update(TbsQtacCuakhauDbVnDto entityDto);

	public void delete(long id);

	public TbsQtacCuakhauDbVn findById(Long id);

	public List<TbsQtacCuakhauDbVn> findAll();
	
	public List<TbsQtacCuakhauDbVn> searchData(String maCuaKhau, String maNuocDen, String maCKDen,
			String tenCuaKhau, String tenNuocDen, String tenCuaKhauDen, int minRow,int maxRow);
	
	public long countTotal(String maCuaKhau, String maNuocDen, String maCKDen, String tenCuaKhau, String tenNuocDen, String tenCuaKhauDen) ;
	
	public int insertList(List<TbsQtacCuakhauDbVn> listEntity);
}
