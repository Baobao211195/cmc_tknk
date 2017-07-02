package com.tkhq.cmc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.tkhq.cmc.model.TbsMathkeNhomNk;
import com.tkhq.cmc.model.TbsMathkeNhomXk;

@Repository
public class Tbs_MathkeNhomXkDAOImpl extends BaseDAO<String, TbsMathkeNhomXk> implements  Tbs_MathkeNhomXkDAO{

	public List<TbsMathkeNhomXk> getAll() {
		Criteria cr =  this.getSession().createCriteria(TbsMathkeNhomXk.class);		
		List<TbsMathkeNhomXk> results = (List<TbsMathkeNhomXk>)cr.list();
		
		if(results.size() > 0)
			return results;
		else
			return null;
	}

}
