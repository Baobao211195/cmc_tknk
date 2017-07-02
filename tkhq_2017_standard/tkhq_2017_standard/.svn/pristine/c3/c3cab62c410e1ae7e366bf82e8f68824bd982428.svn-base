package com.tkhq.cmc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.tkhq.cmc.common.Constants;
import com.tkhq.cmc.dto.TbsQtacQuocgiaNghingoDTO;
import com.tkhq.cmc.model.TbsQtacQuocgiaNghingoNk;
import com.tkhq.cmc.utils.Utils;

@Repository
public class TbsQtacQuocgiaNghingoNkDaoImpl extends BaseDAO<Long, TbsQtacQuocgiaNghingoNk> implements TbsQtacQuocgiaNghingoNkDao{

	@Override
	public void insert(TbsQtacQuocgiaNghingoNk entity) {
		try{
			this.persist(entity);
		}catch(Exception ex){
			ex.printStackTrace();
		}	
		
	}

	@Override
	public void update(TbsQtacQuocgiaNghingoDTO entityDto) {
		TbsQtacQuocgiaNghingoNk dtos = new TbsQtacQuocgiaNghingoNk();
		dtos.setId(entityDto.getId());
		dtos.setManuoc(entityDto.getManuoc());
		dtos.setTennuoc(entityDto.getTennuoc());
		try{
			this.update(dtos);
		}catch(Exception ex){
			ex.printStackTrace();
		}	
		
	}

	@Override
	public void delete(long id) {
		TbsQtacQuocgiaNghingoNk entity = new TbsQtacQuocgiaNghingoNk();
		entity.setId(id);
		try{
			this.delete(entity);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public TbsQtacQuocgiaNghingoNk findById(Long id) {
		Criteria cr =  this.createCriteria();
		cr.add(Restrictions.eq("id", id));
		List<TbsQtacQuocgiaNghingoNk> results = cr.list();
		if(results != null){
			return (TbsQtacQuocgiaNghingoNk)results.get(0);
		}
		return null;
	}

	@Override
	@SuppressWarnings({ "unchecked"})
	public List<TbsQtacQuocgiaNghingoNk> findAll() {
		Criteria cr =  this.getSession().createCriteria(TbsQtacQuocgiaNghingoNk.class);
		cr.setMaxResults(Constants.PAGE_SIZE_10);
		List<TbsQtacQuocgiaNghingoNk> results = (List<TbsQtacQuocgiaNghingoNk>)cr.list();
		return (results.size() > 0) ? results : null;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<TbsQtacQuocgiaNghingoNk> searchData(String manuoc, String tennuoc, int minRow, int maxRow) {
		Criteria cr =  this.createCriteria();
		if(!Utils.isEmpty(manuoc) && !"".equals(manuoc)){
			cr.add(Restrictions.ilike("manuoc", manuoc + Constants.PERCENT_CHARACTER));
		}
		if(!Utils.isEmpty(tennuoc) && !"".equals(tennuoc)){
			cr.add(Restrictions.ilike("tennuoc", tennuoc + Constants.PERCENT_CHARACTER));
		}
		cr.setFirstResult(minRow);
		cr.setMaxResults(maxRow);
		List<TbsQtacQuocgiaNghingoNk> results = (List<TbsQtacQuocgiaNghingoNk>)cr.list();
		return (results.size() > 0) ? results : null;
	}

	@Override
	public long countTotal(String manuoc, String tennuoc) {
		Criteria cr =  this.createCriteria();
		if(!Utils.isEmpty(manuoc) && !"".equals(manuoc)){
			cr.add(Restrictions.ilike("manuoc", manuoc + Constants.PERCENT_CHARACTER));
		}
		if(!Utils.isEmpty(tennuoc) && !"".equals(tennuoc)){
			cr.add(Restrictions.ilike("tennuoc", tennuoc + Constants.PERCENT_CHARACTER));
		}
		cr.setProjection(Projections.rowCount());
		long count = (Long)cr.uniqueResult();
		
		return count;
	}

}
