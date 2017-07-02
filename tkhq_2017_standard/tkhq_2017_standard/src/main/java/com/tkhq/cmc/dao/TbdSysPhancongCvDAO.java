package com.tkhq.cmc.dao;

import java.util.List;

import com.tkhq.cmc.dto.TbdSysPhancongCvDTO;
import com.tkhq.cmc.dto.TbdSysUserPhancongCvDTO;
import com.tkhq.cmc.model.TbdSysPhancongCv;

public interface TbdSysPhancongCvDAO {

	Integer createPhancong(TbdSysPhancongCvDTO entity);

	void deletePhancong(long status);

	TbdSysPhancongCv update(TbdSysPhancongCvDTO entity);

	List<TbdSysPhancongCvDTO> getAllPhancong();
	
	List<TbdSysPhancongCv> findByMaCV(String maCv);
	
	List<TbdSysPhancongCvDTO> search(String type,String maCv);
	
	void deleteList(String s);
	
	public List<TbdSysUserPhancongCvDTO> getListUserOfTongCuc ();
	
	public TbdSysPhancongCvDTO getPhanCongByStt (int stt, String typNhapxuat);
}
