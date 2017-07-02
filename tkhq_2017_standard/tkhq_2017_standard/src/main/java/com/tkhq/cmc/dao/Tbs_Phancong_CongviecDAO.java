package com.tkhq.cmc.dao;

import java.util.List;

import com.tkhq.cmc.dto.TbdSysPhancongCvDTO;
import com.tkhq.cmc.model.TbsPhancongCongviec;

public interface Tbs_Phancong_CongviecDAO {

	void create(TbsPhancongCongviec entity);

	void delete(long status);

	void update(TbsPhancongCongviec entity);

	List<TbsPhancongCongviec> getAll();

	Integer create(TbdSysPhancongCvDTO entity);
}
