package com.tkhq.cmc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.tkhq.cmc.model.Tbs_Dvt;
import com.tkhq.cmc.utils.Utils;

@Repository
public class TBS_DVTDAOImpl extends BaseDAO<String, Tbs_Dvt> implements TBS_DVTDAO{
	
	public TBS_DVTDAOImpl(){
		super();
	}

	public Tbs_Dvt findById(String maDvt) {
		//Criteria cr =  this.getSession().createCriteria(Tbs_Dvt.class);
		Criteria cr =  this.createCriteria();
		cr.add(Restrictions.eq("maDvt", maDvt));
		List results = cr.list();
		if(results.size() > 0)
			return (Tbs_Dvt)results.get(0);
		else return null;
	}

	public Tbs_Dvt findByName(String tenDvt) {
		// TODO Auto-generated method stub
		return null;
	}

	public void insertTBS_DVT(Tbs_Dvt tbsDvt) throws Exception {
		try{
			this.persist(tbsDvt);
		}catch(Exception ex){
			throw ex;
		}
	}

	public void updateTBS_DVT(Tbs_Dvt tbsDvt) {
		try{
			this.update(tbsDvt);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

	public void deleteById(String maDvt) {
		Tbs_Dvt entity = new Tbs_Dvt();
		entity.setMaDvt(maDvt);
		try{
			this.delete(entity);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

	public List<Tbs_Dvt> findAll() {
		Criteria cr =  this.getSession().createCriteria(Tbs_Dvt.class);
		List<Tbs_Dvt> results = (List<Tbs_Dvt>)cr.list();
		
		if(results.size() > 0)
			return results;
		else
			return null;
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long getSequence() {
		Criteria cr =  this.createCriteria();
		cr.setProjection(Projections.projectionList().add(Projections.max("maDvt")));
		List results = cr.list();
		if(results.size() > 0){
			Long maxId = Long.valueOf(results.get(0).toString());
			return maxId;
		}
		else{
			return 0L;
		}
	}

	@Override
	public long countTotal(String maDvt, String tenDvt) {
		Criteria cr =  this.createCriteria();
		
		if(!Utils.isEmpty(maDvt)){
			cr.add(Restrictions.ilike("maDvt", maDvt, MatchMode.END));
		}
		if(!Utils.isEmpty(tenDvt)){
			cr.add(Restrictions.ilike("tenDvt", tenDvt, MatchMode.END));
		}
		
		cr.setProjection(Projections.rowCount());
		long count = (Long)cr.uniqueResult();
		
		return count;
	}

	@Override
	public List<Tbs_Dvt> search(String maDvt, String tenDvt, int firstRow,
			int maxRow) {
		Criteria cr =  this.createCriteria();
		
		if(!Utils.isEmpty(maDvt)){
			cr.add(Restrictions.ilike("maDvt", maDvt, MatchMode.END));
		}
		if(!Utils.isEmpty(tenDvt)){
			cr.add(Restrictions.ilike("tenDvt", tenDvt, MatchMode.END));
		}
		
		cr.setFirstResult(firstRow);
		cr.setMaxResults(maxRow);
		
		List<Tbs_Dvt> results = (List<Tbs_Dvt>)cr.list();
		if(results.size() > 0)
			return results;
		else return null;
	}
	
}
