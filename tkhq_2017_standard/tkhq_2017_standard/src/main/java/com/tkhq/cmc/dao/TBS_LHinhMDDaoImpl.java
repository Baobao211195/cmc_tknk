package com.tkhq.cmc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.tkhq.cmc.model.Tbs_LHinhMD;
import com.tkhq.cmc.utils.Utils;

@Repository
public class TBS_LHinhMDDaoImpl extends BaseDAO<Integer, Tbs_LHinhMD> implements TBS_LHinhMDDAO{

	public Tbs_LHinhMD findById(Integer lhinhMDId) {
		Criteria cr =  this.createCriteria();
		cr.add(Restrictions.eq("lhinhMDId", lhinhMDId));
		List results = cr.list();
		if(results.size() > 0)
			return (Tbs_LHinhMD)results.get(0);
		else return null;
	}

	public void insertEntity(Tbs_LHinhMD tbsLhinhMD) throws Exception {
		try{
			this.persist(tbsLhinhMD);
		}catch(Exception ex){
			throw ex;
		}	
	}
	
	public void updateEntity(Tbs_LHinhMD tbsLhinhMD) throws Exception {
		try{
			this.update(tbsLhinhMD);
		}catch(Exception ex){
			throw ex;
		}
	}

	public void deleteById(Integer lhinhMDId) {
		Tbs_LHinhMD entity = new Tbs_LHinhMD();
		entity.setLhinhMDId(lhinhMDId);
		try{
			this.delete(entity);
		}catch(Exception ex){
			ex.printStackTrace();
		}	
	}

	public List<Tbs_LHinhMD> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public List<Tbs_LHinhMD> search(String nhomLH, String maLH, String tenLH,
			String tenVT, int firstRow, int maxRow) {
		Criteria cr =  this.createCriteria();
		if(!Utils.isEmpty(nhomLH)){
			cr.add(Restrictions.eq("nhomLH", nhomLH));
		}
		if(!Utils.isEmpty(maLH)){
			cr.add(Restrictions.ilike("maLH", maLH, MatchMode.END));
		}
		if(!Utils.isEmpty(tenLH)){
			cr.add(Restrictions.ilike("tenLH", tenLH, MatchMode.END));
		}
		
		if(!Utils.isEmpty(tenVT)){
			cr.add(Restrictions.ilike("tenVT", tenVT, MatchMode.END));
		}
		
		cr.setFirstResult(firstRow);
		cr.setMaxResults(maxRow);
		
		List<Tbs_LHinhMD> results = (List<Tbs_LHinhMD>)cr.list();
		if(results.size() > 0)
			return results;
		else return null;
	}

	public long countTotal(String nhomLH, String maLH, String tenLH, String tenVT) {
		Criteria cr =  this.createCriteria();
		
		if(!Utils.isEmpty(nhomLH)){
			cr.add(Restrictions.eq("nhomLH", nhomLH));
		}
		if(!Utils.isEmpty(maLH)){
			cr.add(Restrictions.ilike("maLH", maLH, MatchMode.END));
		}
		if(!Utils.isEmpty(tenLH)){
			cr.add(Restrictions.ilike("tenLH", tenLH, MatchMode.END));
		}
		
		if(!Utils.isEmpty(tenVT)){
			cr.add(Restrictions.ilike("tenVT", tenVT, MatchMode.END));
		}
		
		cr.setProjection(Projections.rowCount());
		long count = (Long)cr.uniqueResult();
		
		return count;
	}

}
