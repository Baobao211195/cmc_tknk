package com.tkhq.cmc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.tkhq.cmc.model.TBS_cuakhaunn_vnaccs;
import com.tkhq.cmc.model.Tbs_BieuThue;
import com.tkhq.cmc.utils.Utils;

@Repository
public class TBS_cuakhaunn_vnaccsDAOImpl extends BaseDAO<String, TBS_cuakhaunn_vnaccs> implements TBS_cuakhaunn_vnaccsDAO{
	public static final int maxRow = 22;
	
	public List<TBS_cuakhaunn_vnaccs> findAll() {
		Criteria cr =  this.getSession().createCriteria(TBS_cuakhaunn_vnaccs.class);
//		cr.setMaxResults(maxRow);
		List<TBS_cuakhaunn_vnaccs> results = (List<TBS_cuakhaunn_vnaccs>)cr.list();
		
		if(results.size() > 0)
			return results;
		else
			return null;
	}
	
	public void insertTbs_Cuakhaunn(TBS_cuakhaunn_vnaccs tbs_cuakhaunn_vnaccs) throws Exception {
		try{
			this.persist(tbs_cuakhaunn_vnaccs);
		}catch(Exception ex){
			throw ex;
		}	
	}
	
	public TBS_cuakhaunn_vnaccs findById(String maCang) {
		Criteria cr =  this.createCriteria();
		cr.add(Restrictions.eq("maCang", maCang));
		List results = cr.list();
		if(results.size() > 0)
			return (TBS_cuakhaunn_vnaccs)results.get(0);
		else return null;		
	}
	
	public void updateTbs_cuakhaunn(TBS_cuakhaunn_vnaccs tbs_cuakhaunn_vnaccs) {
		try{
			this.update(tbs_cuakhaunn_vnaccs);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

	public void deleteByMaCang(String maCang) {
		TBS_cuakhaunn_vnaccs entity = new TBS_cuakhaunn_vnaccs();
		entity.setMaCang(maCang);
		try{
			this.delete(entity);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public List<TBS_cuakhaunn_vnaccs> searchCuaKhauNN(String maCang, String loaiCang, String tenNuoc, 
			String tenTP, String maNuoc, int minRow, int maxRow){
		Criteria cr = this.getSession().createCriteria(TBS_cuakhaunn_vnaccs.class);//this.createCriteria();
		if(!Utils.isEmpty(maCang) && !"".equals(maCang)){
			cr.add(Restrictions.ilike("maCang", "%"+maCang+"%"));
		}
		if(!Utils.isEmpty(loaiCang) && !"".equals(loaiCang)){
			cr.add(Restrictions.ilike("loaiCang", "%"+loaiCang+"%"));
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
		
//		if((Utils.isEmpty(maCang) || "".equals(maCang)) && 
//			(Utils.isEmpty(loaiCang) || "".equals(loaiCang)) &&
//			(Utils.isEmpty(tenNuoc) || "".equals(tenNuoc))){
//			
////			cr.setMaxResults(maxRow);						
//		}
		
		cr.setFirstResult(minRow);
		cr.setMaxResults(maxRow);
		
		List<TBS_cuakhaunn_vnaccs> results = (List<TBS_cuakhaunn_vnaccs>)cr.list();
		if(results.size() > 0)
			return results;
		else return null;
	}
	
	public long countTotal(String maCang, String loaiCang, String tenNuoc, String tenTP, String maNuoc){
		Criteria cr = this.getSession().createCriteria(TBS_cuakhaunn_vnaccs.class);//this.createCriteria();
		if(!Utils.isEmpty(maCang) && !"".equals(maCang)){
			cr.add(Restrictions.ilike("maCang", "%"+maCang+"%"));
		}
		if(!Utils.isEmpty(loaiCang) && !"".equals(loaiCang)){
			cr.add(Restrictions.ilike("loaiCang", "%"+loaiCang+"%"));
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
