package com.tkhq.cmc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.tkhq.cmc.model.Tbs_ChuyenDe;
import com.tkhq.cmc.utils.Utils;

@Repository
public class Tbs_ChuyenDeDAOImpl extends BaseDAO<String, Tbs_ChuyenDe> implements Tbs_ChuyenDeDAO{

	public void insertTbs_ChuyenDe(Tbs_ChuyenDe tbs_chuyende) throws Exception {
		try{
			this.persist(tbs_chuyende);
		}catch(Exception ex){
			throw ex;
		}
	}

	public Tbs_ChuyenDe findByMaCDe(String maCDe) {
		Criteria cr =  this.createCriteria();
		cr.add(Restrictions.eq("maCDe", maCDe));
		
		List results = cr.list();
		if(results.size() > 0)
			return (Tbs_ChuyenDe)results.get(0);
		else return null;			
	}

	public void updateTbs_chuyende(Tbs_ChuyenDe tbs_chuyende) {
		try{
			this.update(tbs_chuyende);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

	public void deleteByMaCDe(String maCDe) {
		Tbs_ChuyenDe entity = new Tbs_ChuyenDe();
		entity.setMaCDe(maCDe);
		try{
			this.delete(entity);
		}catch(Exception ex){
			ex.printStackTrace();
		}	
	}

	public List<Tbs_ChuyenDe> searchChuyenDe(String maCDe, String tenCDe,
			String maHang,String motaHH) {
		Criteria cr = this.getSession().createCriteria(Tbs_ChuyenDe.class);//this.createCriteria();
		if(!Utils.isEmpty(maCDe) && !"".equals(maCDe)){
			cr.add(Restrictions.ilike("maCDe", "%"+maCDe+"%"));
		}		
		if(!Utils.isEmpty(tenCDe) && !"".equals(tenCDe)){
			cr.add(Restrictions.ilike("tenCDe", "%"+tenCDe+"%"));
		}
		if(!Utils.isEmpty(maHang) && !"".equals(maHang)){
			cr.add(Restrictions.ilike("maHang", "%"+maHang+"%"));
		}		
		if(!Utils.isEmpty(motaHH) && !"".equals(motaHH)){
			cr.add(Restrictions.ilike("motaHH", "%"+motaHH+"%"));
		}
		List<Tbs_ChuyenDe> results = (List<Tbs_ChuyenDe>)cr.list();
		if(results.size() > 0)
			return results;
		else return null;	
	}
	

	public long countTotal(String maCDe, String tenCDe, String maHang,String motaHH) {
		Criteria cr = this.getSession().createCriteria(Tbs_ChuyenDe.class);//this.createCriteria();
		if(!Utils.isEmpty(maCDe) && !"".equals(maCDe)){
			cr.add(Restrictions.ilike("maCDe", "%"+maCDe+"%"));
		}		
		if(!Utils.isEmpty(tenCDe) && !"".equals(tenCDe)){
			cr.add(Restrictions.ilike("tenCDe", "%"+tenCDe+"%"));
		}
		if(!Utils.isEmpty(maHang) && !"".equals(maHang)){
			cr.add(Restrictions.ilike("maHang", "%"+maHang+"%"));
		}
		if(!Utils.isEmpty(motaHH) && !"".equals(motaHH)){
			cr.add(Restrictions.ilike("motaHH", "%"+motaHH+"%"));
		}
				
		cr.setProjection(Projections.rowCount());
		long count = (Long)cr.uniqueResult();
		if(count > 0)
			return count;
		else 
			return 0l;
	}

}
