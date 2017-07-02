package com.tkhq.cmc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.tkhq.cmc.model.TBS_cuakhaunn_vnaccs;
import com.tkhq.cmc.model.TbsDvtVnaccs;
import com.tkhq.cmc.model.Tbs_BieuThue;
import com.tkhq.cmc.utils.Utils;

@Repository
public class TbsDvtVnaccsDAOImpl extends BaseDAO<String, TbsDvtVnaccs> implements TbsDvtVnaccsDAO{
	public static final int maxRow = 22;
	
	public List<TbsDvtVnaccs> findAll() {
		Criteria cr =  this.getSession().createCriteria(TbsDvtVnaccs.class);
//		cr.setMaxResults(maxRow);
		List<TbsDvtVnaccs> results = (List<TbsDvtVnaccs>)cr.list();
		
		if(results.size() > 0)
			return results;
		else
			return null;
	}
	
	public void insertTbsDvtVnaccs(TbsDvtVnaccs tbsDvtVnaccs) throws Exception {
		try{
			this.persist(tbsDvtVnaccs);
		}catch(Exception ex){
			throw ex;
		}	
	}
	
	public TbsDvtVnaccs findById(String maDvt) {
		Criteria cr =  this.createCriteria();
		cr.add(Restrictions.eq("maDvt", maDvt));
		List results = cr.list();
		if(results.size() > 0)
			return (TbsDvtVnaccs)results.get(0);
		else return null;		
	}
	
	public void updateTbsDvtVnaccs(TbsDvtVnaccs tbsDvtVnaccs) {
		try{
			this.update(tbsDvtVnaccs);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

	public void deleteByMaDvt(String maDvt) {
		TbsDvtVnaccs entity = new TbsDvtVnaccs();
		entity.setMaDvt(maDvt);
		try{
			this.delete(entity);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public List<TbsDvtVnaccs> searchTbsDvtVnaccs(String maDvt, String tenDvt,
			String tenDvtv, String tenDvtUni, int minRow, int maxRow){
		Criteria cr = this.getSession().createCriteria(TbsDvtVnaccs.class);
		if(!Utils.isEmpty(maDvt) && !"".equals(maDvt)){
			cr.add(Restrictions.ilike("maDvt", "%"+maDvt+"%"));
		}
		if(!Utils.isEmpty(tenDvt) && !"".equals(tenDvt)){
			cr.add(Restrictions.ilike("tenDvt", "%"+tenDvt+"%"));
		}
		if(!Utils.isEmpty(tenDvtv) && !"".equals(tenDvtv)){
			cr.add(Restrictions.ilike("tenDvtv", "%"+tenDvtv+"%"));
		}
		if(!Utils.isEmpty(tenDvtUni) && !"".equals(tenDvtUni)){
			cr.add(Restrictions.ilike("tenDvtUni", "%"+tenDvtUni+"%"));
		}		
		
		cr.setFirstResult(minRow);
		cr.setMaxResults(maxRow);
		
		List<TbsDvtVnaccs> results = (List<TbsDvtVnaccs>)cr.list();
		if(results.size() > 0)
			return results;
		else return null;
	}
	
	public long countTotal(String maDvt, String tenDvt, String tenDvtv, String tenDvtUni){
		Criteria cr = this.getSession().createCriteria(TbsDvtVnaccs.class);//this.createCriteria();
		if(!Utils.isEmpty(maDvt) && !"".equals(maDvt)){
			cr.add(Restrictions.ilike("maDvt", "%"+maDvt+"%"));
		}
		if(!Utils.isEmpty(tenDvt) && !"".equals(tenDvt)){
			cr.add(Restrictions.ilike("tenDvt", "%"+tenDvt+"%"));
		}
		if(!Utils.isEmpty(tenDvtv) && !"".equals(tenDvtv)){
			cr.add(Restrictions.ilike("tenDvtv", "%"+tenDvtv+"%"));
		}
		if(!Utils.isEmpty(tenDvtUni) && !"".equals(tenDvtUni)){
			cr.add(Restrictions.ilike("tenDvtUni", "%"+tenDvtUni+"%"));
		}			
		
		cr.setProjection(Projections.rowCount());
		long count = (Long)cr.uniqueResult();
		if(count > 0)
			return count;
		else 
			return 0l;
	}
	
}
