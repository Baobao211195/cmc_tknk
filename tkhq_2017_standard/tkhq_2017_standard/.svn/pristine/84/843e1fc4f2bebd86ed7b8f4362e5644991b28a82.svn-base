package com.tkhq.cmc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.tkhq.cmc.common.Constants;
import com.tkhq.cmc.dto.TbsQtacXuatNhapDTO;
import com.tkhq.cmc.model.TbsQtacVantaiHangxuatNn;
import com.tkhq.cmc.utils.Utils;

@Repository
public class TbsQtacVantaiHangxuatNnDaoImpl extends BaseDAO<Long, TbsQtacVantaiHangxuatNn> implements TbsQtacVantaiHangxuatNnDao{

	@Override
	public void insert(TbsQtacVantaiHangxuatNn entity) {
		try{
			this.persist(entity);
		}catch(Exception ex){
			ex.printStackTrace();
		}	
		
	}

	@Override
	public void update(TbsQtacXuatNhapDTO entityDto) {
		TbsQtacVantaiHangxuatNn dtos = new TbsQtacVantaiHangxuatNn();
		dtos.setId(entityDto.getId());
		dtos.setMaphuongthucvanchuyen(entityDto.getMaphuongthucvanchuyen());
		dtos.setMacuakhaunn(entityDto.getMacuakhaunn());
		try{
			this.update(dtos);
		}catch(Exception ex){
			ex.printStackTrace();
		}	
		
	}

	@Override
	public void delete(long id) {
		TbsQtacVantaiHangxuatNn entity = new TbsQtacVantaiHangxuatNn();
		entity.setId(id);
		try{
			this.delete(entity);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public TbsQtacVantaiHangxuatNn findById(Long id) {
		Criteria cr =  this.createCriteria();
		cr.add(Restrictions.eq("id", id));
		List<TbsQtacVantaiHangxuatNn> results = cr.list();
		if(results != null){
			return (TbsQtacVantaiHangxuatNn)results.get(0);
		}
		return null;
	}

	@Override
	@SuppressWarnings({ "unchecked"})
	public List<TbsQtacVantaiHangxuatNn> findAll() {
		Criteria cr =  this.getSession().createCriteria(TbsQtacVantaiHangxuatNn.class);
		cr.setMaxResults(Constants.PAGE_SIZE_10);
		List<TbsQtacVantaiHangxuatNn> results = (List<TbsQtacVantaiHangxuatNn>)cr.list();
		return (results.size() > 0) ? results : null;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<TbsQtacVantaiHangxuatNn> searchData(String maphuongthucvanchuyen, String macuakhaunn, int minRow, int maxRow) {
		Criteria cr =  this.createCriteria();
		if(!Utils.isEmpty(maphuongthucvanchuyen) && !"".equals(maphuongthucvanchuyen)){
			cr.add(Restrictions.ilike("maphuongthucvanchuyen", maphuongthucvanchuyen + Constants.PERCENT_CHARACTER));
		}
		if(!Utils.isEmpty(macuakhaunn) && !"".equals(macuakhaunn)){
			cr.add(Restrictions.ilike("macuakhaunn", macuakhaunn + Constants.PERCENT_CHARACTER));
		}
		
		cr.setFirstResult(minRow);
		cr.setMaxResults(maxRow);
		List<TbsQtacVantaiHangxuatNn> results = (List<TbsQtacVantaiHangxuatNn>)cr.list();
		return (results.size() > 0) ? results : null;
	}

	@Override
	public long countTotal(String maphuongthucvanchuyen, String macuakhaunn) {
		Criteria cr =  this.createCriteria();
		
		if(!Utils.isEmpty(maphuongthucvanchuyen) && !"".equals(maphuongthucvanchuyen)){
			cr.add(Restrictions.ilike("maphuongthucvanchuyen", maphuongthucvanchuyen + Constants.PERCENT_CHARACTER));
		}
		if(!Utils.isEmpty(macuakhaunn) && !"".equals(macuakhaunn)){
			cr.add(Restrictions.ilike("macuakhaunn", macuakhaunn + Constants.PERCENT_CHARACTER));
		}
		
		cr.setProjection(Projections.rowCount());
		long count = (Long)cr.uniqueResult();
		
		return count;
	}

}
