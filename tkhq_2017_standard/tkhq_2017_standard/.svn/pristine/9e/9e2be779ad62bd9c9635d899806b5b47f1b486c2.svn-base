package com.tkhq.cmc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.tkhq.cmc.model.Tbs_Mahs_dkgh;
import com.tkhq.cmc.utils.Utils;

@Repository
public class Tbs_Mahs_dkghDAOImpl extends BaseDAO<String, Tbs_Mahs_dkgh> implements Tbs_Mahs_dkghDAO{
	public static final int maxRowData = 10;

	public Tbs_Mahs_dkgh findById(Long STT) {
		Criteria cr =  this.createCriteria();
		cr.add(Restrictions.eq("STT", STT));
		List results = cr.list();
		if(results.size() > 0)
			return (Tbs_Mahs_dkgh)results.get(0);
		else return null;		
	}
//
//	public List<Tbs_BieuThue> findByName(String tenBieuThue) {
//		Criteria cr =  this.createCriteria();
//		cr.add(Restrictions.eq("tenBieuThue", tenBieuThue));
//		List<Tbs_BieuThue> results = cr.list();
//		if(results.size() > 0)
//			return results;
//		else return null;
//	}
//
	public void insertTbs_Mahs_dkgh(Tbs_Mahs_dkgh tbsBieuThue) throws Exception {
		try{
			this.persist(tbsBieuThue);
		}catch(Exception ex){
			throw ex;
		}	
	}

	public void updateTbs_Mahs_dkgh(Tbs_Mahs_dkgh tbsBieuThue) {
		try{
			this.update(tbsBieuThue);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

	public void deleteById(Long sTT) {
		Tbs_Mahs_dkgh entity = new Tbs_Mahs_dkgh();
		entity.setSTT(sTT);
		try{
			this.delete(entity);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

	public List<Tbs_Mahs_dkgh> findAll() {
		Criteria cr =  this.getSession().createCriteria(Tbs_Mahs_dkgh.class);
		cr.setMaxResults(maxRowData);
		List<Tbs_Mahs_dkgh> results = (List<Tbs_Mahs_dkgh>)cr.list();
		
		if(results.size() > 0)
			return results;
		else
			return null;
	}

//	public void deleteAll() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	public Integer getSequence(){
//		Criteria cr =  this.createCriteria();
//		cr.setProjection(Projections.projectionList().add(Projections.max("bieuThueId")));
//		List results = cr.list();
//		if(results.size() > 0){
//			Integer maxId = 0;
//			return maxId;
//		}
//		else{
//			return null;
//		}
//	}
//	
//	public List<Tbs_BieuThue> searchBieuThue(String maBieuThue, String tenBieuThue, String maHS, int minRow, int maxRow){
//		Criteria cr =  this.createCriteria();
//		if(!Utils.isEmpty(maBieuThue)){
//			cr.add(Restrictions.ilike("maBieuThue", maBieuThue, MatchMode.END));
//		}
//		if(!Utils.isEmpty(tenBieuThue)){
//			cr.add(Restrictions.ilike("tenBieuThue", tenBieuThue, MatchMode.END));
//		}
//		if(!Utils.isEmpty(maHS)){
//			cr.add(Restrictions.ilike("maHS", maHS, MatchMode.END));
//		}
//		
//		cr.setFirstResult(minRow);
//		cr.setMaxResults(maxRow);
//		
//		List<Tbs_BieuThue> results = (List<Tbs_BieuThue>)cr.list();
//		if(results.size() > 0)
//			return results;
//		else return null;
//	}
//	
//	public long countTotal(String maBieuThue, String tenBieuThue, String maHS){
//		Criteria cr =  this.createCriteria();
//		if(!Utils.isEmpty(maBieuThue)){
//			cr.add(Restrictions.eq("maBieuThue", maBieuThue));
//		}
//		if(!Utils.isEmpty(tenBieuThue)){
//			cr.add(Restrictions.eq("tenBieuThue", tenBieuThue));
//		}
//		if(!Utils.isEmpty(maHS)){
//			cr.add(Restrictions.eq("maHS", maHS));
//		}
//		
//		cr.setProjection(Projections.rowCount());
//		long count = (Long)cr.uniqueResult();
//		
//		return count;
//	}
}
