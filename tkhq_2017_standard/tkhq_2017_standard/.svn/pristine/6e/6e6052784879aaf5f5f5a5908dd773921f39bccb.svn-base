package com.tkhq.cmc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.tkhq.cmc.model.Tbs_TinhTP;
import com.tkhq.cmc.utils.Utils;

@Repository
public class TBS_TinhTPDAOImpl extends BaseDAO<String, Tbs_TinhTP> implements TBS_TinhTPDAO{

	public Tbs_TinhTP findById(String maTinhTP) {
		Criteria cr =  this.createCriteria();
		cr.add(Restrictions.eq("maTinhTP", maTinhTP));
		List results = cr.list();
		if(results.size() > 0)
			return (Tbs_TinhTP)results.get(0);
		else return null;
	}

	public List<Tbs_TinhTP> findByName(String maTinhTP, String tenTinhTP, int firstRow, int maxRow) {
		Criteria cr =  this.createCriteria();
		
		if(!Utils.isEmpty(maTinhTP)){
			cr.add(Restrictions.ilike("maTinhTP", maTinhTP, MatchMode.ANYWHERE));
		}
		if(!Utils.isEmpty(tenTinhTP)){
			cr.add(Restrictions.ilike("tenTinhTP", tenTinhTP, MatchMode.ANYWHERE));
		}
		
		cr.addOrder(Order.asc("maTinhTP"));
		
		cr.setFirstResult(firstRow);
		cr.setMaxResults(maxRow);
		
		List<Tbs_TinhTP> results = (List<Tbs_TinhTP>)cr.list();
		if(results.size() > 0)
			return results;
		else return null;
	}

	public void insertTbs_TinhTP(Tbs_TinhTP tbsTinhTP) throws Exception {
		try{
			this.persist(tbsTinhTP);
			System.out.println("Object has been added: " + tbsTinhTP);
		}catch(Exception ex){
			throw ex;
		}	
	}

	public void updateTbs_TinhTP(Tbs_TinhTP tbsTinhTP) throws Exception {
		try{
			this.update(tbsTinhTP);
		}catch(Exception ex){
			throw ex;
		}	
	}

	public void deleteById(String maTinhTP) throws Exception {
		Tbs_TinhTP entity = new Tbs_TinhTP();
		entity.setMaTinhTP(maTinhTP);
		try{
			this.delete(entity);
		}catch(Exception ex){
			ex.printStackTrace();
		}	
	}

	public List<Tbs_TinhTP> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public long countTotal(String maTinhTP, String tenTinhTP) {
		Criteria cr =  this.createCriteria();
		
		if(!Utils.isEmpty(maTinhTP)){
			cr.add(Restrictions.ilike("maTinhTP", maTinhTP, MatchMode.END));
		}
		if(!Utils.isEmpty(tenTinhTP)){
			cr.add(Restrictions.ilike("tenTinhTP", tenTinhTP, MatchMode.END));
		}
		
		cr.setProjection(Projections.rowCount());
		long count = (Long)cr.uniqueResult();
		
		return count;
	}

	public long getSequence() {
		Criteria cr =  this.createCriteria();
		cr.setProjection(Projections.projectionList().add(Projections.max("maTinhTP")));
		List results = cr.list();
		if(results.size() > 0){
			Integer maxId = Integer.valueOf(results.get(0).toString());
			return maxId;
		}
		else{
			return 0L;
		}
	}

}
