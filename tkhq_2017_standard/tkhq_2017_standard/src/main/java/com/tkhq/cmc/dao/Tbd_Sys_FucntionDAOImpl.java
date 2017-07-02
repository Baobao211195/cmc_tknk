package com.tkhq.cmc.dao;

import java.util.List;

import org.hibernate.Criteria;

import com.tkhq.cmc.model.Tbd_Sys_Functions;

public class Tbd_Sys_FucntionDAOImpl extends BaseDAO<Integer, Tbd_Sys_Functions> implements Tbd_Sys_FucntionDAO {

	public void add(Tbd_Sys_Functions function) throws Exception{
		try {
			this.persist(function);
		} catch (Exception ex) {
			ex.getMessage();
		}
	}

	public void delete(int id) {
		
		
	}

	public List<Tbd_Sys_Functions> findByGroup(int groupId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Tbd_Sys_Functions> findByAll() {
		Criteria cri = this.getSession().createCriteria(Tbd_Sys_Functions.class);
		List<Tbd_Sys_Functions> result = cri.list();
		return result;
	}

	
}
