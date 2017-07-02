package com.tkhq.cmc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.tkhq.cmc.common.Constants;
import com.tkhq.cmc.dto.TbsQtacDongiaNhapkhauDTO;
import com.tkhq.cmc.model.TbsQtacDongiaNhapkhau;
import com.tkhq.cmc.utils.Utils;

@Repository
public class TbsQtacDongiaNhapkhauDaoImpl extends BaseDAO<Long, TbsQtacDongiaNhapkhau> implements TbsQtacDongiaNhapkhauDao{

	@Override
	public void insert(TbsQtacDongiaNhapkhau entity) {
		try{
			this.persist(entity);
		}catch(Exception ex){
			ex.printStackTrace();
		}	
		
	}

	@Override
	public void update(TbsQtacDongiaNhapkhauDTO entityDto) {
		TbsQtacDongiaNhapkhau dtos = new TbsQtacDongiaNhapkhau();
		dtos.setId(entityDto.getId());
		dtos.setMathongke(entityDto.getMathongke());
		dtos.setDongialonnhat(Double.valueOf(entityDto.getDongialonnhat()));
		dtos.setDongianhonhat(Double.valueOf(entityDto.getDongianhonhat()));
		try{
			this.update(dtos);
		}catch(Exception ex){
			ex.printStackTrace();
		}	
		
	}

	@Override
	public void delete(long id) {
		TbsQtacDongiaNhapkhau entity = new TbsQtacDongiaNhapkhau();
		entity.setId(id);
		try{
			this.delete(entity);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public TbsQtacDongiaNhapkhau findById(Long id) {
		Criteria cr =  this.createCriteria();
		cr.add(Restrictions.eq("id", id));
		List<TbsQtacDongiaNhapkhau> results = cr.list();
		if(results != null){
			return (TbsQtacDongiaNhapkhau)results.get(0);
		}
		return null;
	}

	@Override
	@SuppressWarnings({ "unchecked"})
	public List<TbsQtacDongiaNhapkhau> findAll() {
		Criteria cr =  this.getSession().createCriteria(TbsQtacDongiaNhapkhau.class);
		cr.setMaxResults(Constants.PAGE_SIZE_10);
		List<TbsQtacDongiaNhapkhau> results = (List<TbsQtacDongiaNhapkhau>)cr.list();
		return (results.size() > 0) ? results : null;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<TbsQtacDongiaNhapkhau> searchData(String mathongke, String dongialonnhat, String dongianhonhat,
			int minRow, int maxRow) {
		Criteria cr =  this.createCriteria();
		if(!Utils.isEmpty(mathongke) && !"".equals(mathongke)){
			cr.add(Restrictions.ilike("mathongke", mathongke + Constants.PERCENT_CHARACTER));
		}
		if(!Utils.isEmpty(dongialonnhat) && !"".equals(dongialonnhat)){
			cr.add(Restrictions.eq("dongialonnhat", Double.parseDouble(dongialonnhat)));
		}
		
		if(!Utils.isEmpty(dongianhonhat) && !"".equals(dongianhonhat)){
			cr.add(Restrictions.eq("dongianhonhat", Double.parseDouble(dongianhonhat)));
		}
		
		cr.setFirstResult(minRow);
		cr.setMaxResults(maxRow);
		List<TbsQtacDongiaNhapkhau> results = (List<TbsQtacDongiaNhapkhau>)cr.list();
		return (results.size() > 0) ? results : null;
	}

	@Override
	public long countTotal(String mathongke, String dongialonnhat, String dongianhonhat) {
		Criteria cr =  this.createCriteria();
		if(!Utils.isEmpty(mathongke) && !"".equals(mathongke)){
			cr.add(Restrictions.ilike("mathongke", mathongke + Constants.PERCENT_CHARACTER));
		}
		if(!Utils.isEmpty(dongialonnhat) && !"".equals(dongialonnhat)){
			cr.add(Restrictions.eq("dongialonnhat", Double.parseDouble(dongialonnhat)));
		}
		
		if(!Utils.isEmpty(dongianhonhat) && !"".equals(dongianhonhat)){
			cr.add(Restrictions.eq("dongianhonhat", Double.parseDouble(dongianhonhat)));
		}
		cr.setProjection(Projections.rowCount());
		long count = (Long)cr.uniqueResult();
		
		return count;
	}
}
