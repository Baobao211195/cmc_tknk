package com.tkhq.cmc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.tkhq.cmc.dto.TbdSysPhancongCvDTO;
import com.tkhq.cmc.model.TbsPhancongCongviec;

@Repository

public class Tbs_Phancong_CongviecImpl extends BaseDAO<Long, TbsPhancongCongviec> implements Tbs_Phancong_CongviecDAO {

	public void create(TbsPhancongCongviec entity) {

		try {
			this.persist(entity);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete(long status) {
		TbsPhancongCongviec entity = new TbsPhancongCongviec();
		entity.setStt(status);
		try {
			this.delete(entity);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void update(TbsPhancongCongviec entity) {
		try {
			this.update(entity);
			;
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	@SuppressWarnings("unchecked")
	public List<TbsPhancongCongviec> getAll() {
		Criteria cri = this.getSession().createCriteria(TbsPhancongCongviec.class);
		List<TbsPhancongCongviec> result = cri.list();

		if (result.size() > 0) {
			return result;
		} else {
			return null;
		}
	}


	public Integer create(TbdSysPhancongCvDTO entity) {
		int result = 0;
		try {
			TbsPhancongCongviec phancong = new TbsPhancongCongviec();
			this.update(phancong);
			result = 1;
		} catch (Exception e) {
			result =0;
		}
		return result;
	}

}
