package com.tkhq.cmc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.tkhq.cmc.common.Constants;
import com.tkhq.cmc.dto.TbsQtacLuongDTO;
import com.tkhq.cmc.model.TbsQtacLuongXuatkhau;
import com.tkhq.cmc.utils.Utils;

@Repository
public class TbsQtacLuongXuatkhauDaoImpl extends BaseDAO<String, TbsQtacLuongXuatkhau> implements TbsQtacLuongXuatkhauDao {

	@Override
	public void insert(TbsQtacLuongXuatkhau entity) {
		try{
			this.persist(entity);
		}catch(Exception ex){
			ex.printStackTrace();
		}	
		
	}

	@Override
	public void update(TbsQtacLuongDTO entityDto) {
		TbsQtacLuongXuatkhau dtos = new TbsQtacLuongXuatkhau();
		dtos.setId(entityDto.getId());
		dtos.setMathongke(entityDto.getMathongke());
		dtos.setLuonglonnhat(Double.valueOf(entityDto.getLuonglonnhat()));
		try{
			this.update(dtos);
		}catch(Exception ex){
			ex.printStackTrace();
		}	
		
	}

	@Override
	public void delete(long id) {
		TbsQtacLuongXuatkhau entity = new TbsQtacLuongXuatkhau();
		entity.setId(id);
		try{
			this.delete(entity);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public TbsQtacLuongXuatkhau findById(Long id) {
		Criteria cr =  this.createCriteria();
		cr.add(Restrictions.eq("id", id));
		List<TbsQtacLuongXuatkhau> results = cr.list();
		if(results != null){
			return (TbsQtacLuongXuatkhau)results.get(0);
		}
		return null;
	}

	@Override
	@SuppressWarnings({ "unchecked"})
	public List<TbsQtacLuongXuatkhau> findAll() {
		Criteria cr =  this.getSession().createCriteria(TbsQtacLuongXuatkhau.class);
		cr.setMaxResults(Constants.PAGE_SIZE_10);
		List<TbsQtacLuongXuatkhau> results = (List<TbsQtacLuongXuatkhau>)cr.list();
		return (results.size() > 0) ? results : null;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<TbsQtacLuongXuatkhau> searchData(String mathongke, String luonglonnhat, int minRow, int maxRow) {
		Criteria cr =  this.createCriteria();
		if(!Utils.isEmpty(mathongke) && !"".equals(mathongke)){
			cr.add(Restrictions.ilike("mathongke", mathongke + Constants.PERCENT_CHARACTER));
		}
		if(!Utils.isEmpty(luonglonnhat) && !"".equals(luonglonnhat)){
			cr.add(Restrictions.eq("luonglonnhat", Double.parseDouble(luonglonnhat)));
		}
		cr.setFirstResult(minRow);
		cr.setMaxResults(maxRow);
		List<TbsQtacLuongXuatkhau> results = (List<TbsQtacLuongXuatkhau>)cr.list();
		return (results.size() > 0) ? results : null;
	}

	@Override
	public long countTotal(String mathongke, String luonglonnhat) {
		Criteria cr =  this.createCriteria();
		if(!Utils.isEmpty(mathongke) && !"".equals(mathongke)){
			cr.add(Restrictions.ilike("mathongke", mathongke + Constants.PERCENT_CHARACTER));
		}
		if(!Utils.isEmpty(luonglonnhat) && !"".equals(luonglonnhat)){
			cr.add(Restrictions.eq("luonglonnhat", Double.parseDouble(luonglonnhat)));
		}
		cr.setProjection(Projections.rowCount());
		long count = (Long)cr.uniqueResult();
		
		return count;
	}

}
