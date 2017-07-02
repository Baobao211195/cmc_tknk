package com.tkhq.cmc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.tkhq.cmc.common.Constants;
import com.tkhq.cmc.dto.TbsQtacXuatNhapDTO;
import com.tkhq.cmc.model.TbsQtacVantaiHangxuatVn;
import com.tkhq.cmc.utils.Utils;

@Repository
public class TbsQtacVantaiHangxuatVnDaoImpl extends BaseDAO<Long, TbsQtacVantaiHangxuatVn> implements TbsQtacVantaiHangxuatVnDao{

	@Override
	public void insert(TbsQtacVantaiHangxuatVn entity) {
		try{
			this.persist(entity);
		}catch(Exception ex){
			ex.printStackTrace();
		}	
		
	}

	@Override
	public void update(TbsQtacXuatNhapDTO entityDto) {
		TbsQtacVantaiHangxuatVn dtos = new TbsQtacVantaiHangxuatVn();
		dtos.setId(entityDto.getId());
		dtos.setMaphuongthucvanchuyen(entityDto.getMaphuongthucvanchuyen());
		dtos.setMacuakhauvn(entityDto.getMacuakhauvn());
		try{
			this.update(dtos);
		}catch(Exception ex){
			ex.printStackTrace();
		}	
		
	}

	@Override
	public void delete(long id) {
		TbsQtacVantaiHangxuatVn entity = new TbsQtacVantaiHangxuatVn();
		entity.setId(id);
		try{
			this.delete(entity);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public TbsQtacVantaiHangxuatVn findById(Long id) {
		Criteria cr =  this.createCriteria();
		cr.add(Restrictions.eq("id", id));
		List<TbsQtacVantaiHangxuatVn> results = cr.list();
		if(results != null){
			return (TbsQtacVantaiHangxuatVn)results.get(0);
		}
		return null;
	}

	@Override
	@SuppressWarnings({ "unchecked"})
	public List<TbsQtacVantaiHangxuatVn> findAll() {
		Criteria cr =  this.getSession().createCriteria(TbsQtacVantaiHangxuatVn.class);
		cr.setMaxResults(Constants.PAGE_SIZE_10);
		List<TbsQtacVantaiHangxuatVn> results = (List<TbsQtacVantaiHangxuatVn>)cr.list();
		return (results.size() > 0) ? results : null;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<TbsQtacVantaiHangxuatVn> searchData(String maphuongthucvanchuyen, String macuakhauvn, int minRow, int maxRow) {
		Criteria cr =  this.createCriteria();
		if(!Utils.isEmpty(maphuongthucvanchuyen) && !"".equals(maphuongthucvanchuyen)){
			cr.add(Restrictions.ilike("maphuongthucvanchuyen", maphuongthucvanchuyen + Constants.PERCENT_CHARACTER));
		}
		if(!Utils.isEmpty(macuakhauvn) && !"".equals(macuakhauvn)){
			cr.add(Restrictions.ilike("macuakhauvn", macuakhauvn + Constants.PERCENT_CHARACTER));
		}
		cr.setFirstResult(minRow);
		cr.setMaxResults(maxRow);
		List<TbsQtacVantaiHangxuatVn> results = (List<TbsQtacVantaiHangxuatVn>)cr.list();
		return (results.size() > 0) ? results : null;
	}

	@Override
	public long countTotal(String maphuongthucvanchuyen, String macuakhauvn) {
		Criteria cr =  this.createCriteria();
		if(!Utils.isEmpty(maphuongthucvanchuyen) && !"".equals(maphuongthucvanchuyen)){
			cr.add(Restrictions.ilike("maphuongthucvanchuyen", maphuongthucvanchuyen + Constants.PERCENT_CHARACTER));
		}
		if(!Utils.isEmpty(macuakhauvn) && !"".equals(macuakhauvn)){
			cr.add(Restrictions.ilike("macuakhauvn", macuakhauvn + Constants.PERCENT_CHARACTER));
		}
		cr.setProjection(Projections.rowCount());
		long count = (Long)cr.uniqueResult();
		
		return count;
	}

}
