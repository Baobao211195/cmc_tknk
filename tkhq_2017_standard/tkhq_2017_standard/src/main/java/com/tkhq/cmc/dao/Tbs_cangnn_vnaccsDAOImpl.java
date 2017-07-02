package com.tkhq.cmc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.tkhq.cmc.model.Tbs_Cangnn_vnaccs;
import com.tkhq.cmc.utils.Utils;


@Repository
public class Tbs_cangnn_vnaccsDAOImpl extends BaseDAO<String, Tbs_Cangnn_vnaccs> 
implements Tbs_cangnn_vnaccsDAO{

	public void insertTbs_Cangnn(Tbs_Cangnn_vnaccs tbs_cangnn_vnaccs)
			throws Exception {
		try{
			this.persist(tbs_cangnn_vnaccs);
		}catch(Exception ex){
			throw ex;
		}	
		
	}
	
	public List<Tbs_Cangnn_vnaccs> findAll() {		
		Criteria cr =  this.getSession().createCriteria(Tbs_Cangnn_vnaccs.class);	
		List<Tbs_Cangnn_vnaccs> results = ((List<Tbs_Cangnn_vnaccs>)cr.list());
		
		if(results.size() > 0)
			return results;
		else			
		return null;
	}

	public Tbs_Cangnn_vnaccs findByMaCang(String maCang) {
		
		Criteria cr =  this.createCriteria();
		cr.add(Restrictions.eq("maCang", maCang));
		
		List results = cr.list();
		if(results.size() > 0)
			return (Tbs_Cangnn_vnaccs)results.get(0);
		else return null;			
	}

	public void updateTbs_cangnn(Tbs_Cangnn_vnaccs tbs_cangnn_vnaccs) {
		try{
			this.update(tbs_cangnn_vnaccs);
		}catch(Exception ex){
			ex.printStackTrace();
		}		
	}

	public void deleteByMaCang(String maCang) {
		Tbs_Cangnn_vnaccs entity = new Tbs_Cangnn_vnaccs();
		entity.setMaCang(maCang);
		try{
			this.delete(entity);
		}catch(Exception ex){
			ex.printStackTrace();
		}		
	}

	public List<Tbs_Cangnn_vnaccs> searchCangNN(String maCang, String tenNuoc,
			String tenTP, String maNuoc) {
		
		Criteria cr = this.getSession().createCriteria(Tbs_Cangnn_vnaccs.class);//this.createCriteria();
		if(!Utils.isEmpty(maCang) && !"".equals(maCang)){
			cr.add(Restrictions.ilike("maCang", "%"+maCang+"%"));
		}		
		if(!Utils.isEmpty(tenNuoc) && !"".equals(tenNuoc)){
			cr.add(Restrictions.ilike("tenNuoc", "%"+tenNuoc+"%"));
		}
		if(!Utils.isEmpty(tenTP) && !"".equals(tenTP)){
			cr.add(Restrictions.ilike("tenTP", "%"+tenTP+"%"));
		}
		if(!Utils.isEmpty(maNuoc) && !"".equals(maNuoc)){
			cr.add(Restrictions.ilike("maNuoc", "%"+maNuoc+"%"));
		}
		
		List<Tbs_Cangnn_vnaccs> results = (List<Tbs_Cangnn_vnaccs>)cr.list();
		if(results.size() > 0)
			return results;
		else return null;	
	}

	public long countTotal(String maCang, String tenNuoc, String tenTP,
			String maNuoc) {
		Criteria cr = this.getSession().createCriteria(Tbs_Cangnn_vnaccs.class);//this.createCriteria();
		if(!Utils.isEmpty(maCang) && !"".equals(maCang)){
			cr.add(Restrictions.ilike("maCang", "%"+maCang+"%"));
		}
		
		if(!Utils.isEmpty(tenNuoc) && !"".equals(tenNuoc)){
			cr.add(Restrictions.ilike("tenNuoc", "%"+tenNuoc+"%"));
		}
		if(!Utils.isEmpty(tenTP) && !"".equals(tenTP)){
			cr.add(Restrictions.ilike("tenTP", "%"+tenTP+"%"));
		}
		if(!Utils.isEmpty(maNuoc) && !"".equals(maNuoc)){
			cr.add(Restrictions.ilike("maNuoc", "%"+maNuoc+"%"));
		}		
		
		cr.setProjection(Projections.rowCount());
		long count = (Long)cr.uniqueResult();
		if(count > 0)
			return count;
		else 
			return 0l;
	}
}
