package com.tkhq.cmc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.tkhq.cmc.model.Tbs_lhxnk;
@Repository
public class Tbs_lhxnkDAOImpl extends BaseDAO<String, Tbs_lhxnk> implements Tbs_lhxnkDAO {

	public List<Tbs_lhxnk> getAll() {
		Criteria cr =  this.getSession().createCriteria(Tbs_lhxnk.class);		
		List<Tbs_lhxnk> results = (List<Tbs_lhxnk>)cr.list();
		
		if(results.size() > 0)
			return results;
		else
			return null;
	}

}
