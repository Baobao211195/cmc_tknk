package com.tkhq.cmc.dao;

import java.util.List;

import org.eclipse.jdt.internal.compiler.impl.Constant;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.tkhq.cmc.common.Constants;
import com.tkhq.cmc.model.TbsCapnhatTygia;
import com.tkhq.cmc.model.Tbs_BieuThue;
import com.tkhq.cmc.utils.Utils;

@Repository
public class TbsCapnhatTygiaDAOImpl extends BaseDAO<String, TbsCapnhatTygia> implements TbsCapnhatTygiaDAO{
	public static final int maxRow = 10;
	public static final int maxRowData = 10;

	public TbsCapnhatTygia findById(Long tygiaId) {
		Criteria cr =  this.createCriteria();
		cr.add(Restrictions.eq("tygiaId", tygiaId));
		List results = cr.list();
		if(results.size() > 0)
			return (TbsCapnhatTygia)results.get(0);
		else return null;		
	}

	public void insertTbsCapnhatTygia(TbsCapnhatTygia tbsCapnhatTygia) throws Exception {
		try{
			this.persist(tbsCapnhatTygia);
		}catch(Exception ex){
			throw ex;
		}	
	}

	public void updateTbsCapnhatTygia(TbsCapnhatTygia tbsCapnhatTygia) {
		try{
			this.update(tbsCapnhatTygia);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

	public void deleteById(Long tygiaId) {
		TbsCapnhatTygia entity = new TbsCapnhatTygia();
		entity.setTygiaId(tygiaId);
		try{
			this.delete(entity);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

	public List<TbsCapnhatTygia> findAll() {
		Criteria cr =  this.getSession().createCriteria(TbsCapnhatTygia.class);
		cr.setMaxResults(maxRowData);
		List<TbsCapnhatTygia> results = (List<TbsCapnhatTygia>)cr.list();
		
		if(results.size() > 0)
			return results;
		else
			return null;
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	
//	public Integer getSequence(){
//		Criteria cr =  this.createCriteria();
//		cr.setProjection(Projections.projectionList().add(Projections.max("tygiaId")));
//		List results = cr.list();
//		if(results.size() > 0){
//			Integer maxId = 0;
//			return maxId;
//		}
//		else{
//			return null;
//		}
//	}
	
	public List<TbsCapnhatTygia> searchTygia(String ngay, String maNt, int minRow, int maxRow) throws Exception{
		Criteria cr =  this.createCriteria();
		try{
			if(!Utils.isEmpty(ngay) && !"".equals(ngay)){
				cr.add(Restrictions.eq("ngay", Utils.getSqlDate(Utils.convertStringtoDate(ngay, Constants.DATE_FORMAT_6))));
			}
			if(!Utils.isEmpty(maNt) && !"".equals(maNt)){
				cr.add(Restrictions.ilike("maNt", "%"+maNt+"%"));
			}
			
			cr.addOrder(Order.asc("maNt"));
			
			cr.setFirstResult(minRow);
			cr.setMaxResults(maxRow);
			
			List<TbsCapnhatTygia> results = (List<TbsCapnhatTygia>)cr.list();
			if(results.size() > 0)
				return results;
			else return null;
		}catch(Exception ex){
			throw ex;
		}
	}
	
	public long countTotal(String ngay, String maNt) throws Exception{
		Criteria cr =  this.createCriteria();
		long count = 0;
		try{
			if(!Utils.isEmpty(ngay) && !"".equals(ngay)){
				cr.add(Restrictions.eq("ngay", Utils.getSqlDate(Utils.convertStringtoDate(ngay, Constants.DATE_FORMAT_6))));
			}
			if(!Utils.isEmpty(maNt) && !"".equals(maNt)){
				cr.add(Restrictions.ilike("maNt", "%"+maNt+"%"));
			}
			
			cr.setProjection(Projections.rowCount());
			count = (Long)cr.uniqueResult();
		}
		catch(Exception ex){
			throw ex;
		}
		
		return count;
	}
}
