package com.tkhq.cmc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.tkhq.cmc.model.TbsMathkeNhomNk;

@Repository
public class Tbs_MathkeNhomNkDAOImpl extends BaseDAO<String, TbsMathkeNhomNk> implements Tbs_MathkeNhomNkDAO{

	public List<TbsMathkeNhomNk> getAll() {
		Criteria cr =  this.getSession().createCriteria(TbsMathkeNhomNk.class);		
		List<TbsMathkeNhomNk> results = (List<TbsMathkeNhomNk>)cr.list();
		
		if(results.size() > 0)
			return results;
		else
			return null;
	}

}
