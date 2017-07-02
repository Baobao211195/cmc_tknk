package com.tkhq.cmc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.tkhq.cmc.common.Constants;
import com.tkhq.cmc.dto.TbsQtacDnTrigiaXuatkhauDTO;
import com.tkhq.cmc.model.TbsQtacDnTrigiaXuatkhau;
import com.tkhq.cmc.utils.Utils;

@Repository
public class TbsQtacDnTrigiaXuatkhauDaoImpl extends BaseDAO<Long, TbsQtacDnTrigiaXuatkhau> implements TbsQtacDnTrigiaXuatkhauDao {

	@Override
	public void insert(TbsQtacDnTrigiaXuatkhau entity) {
		try {
			this.persist(entity);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}

	@Override
	public void update(TbsQtacDnTrigiaXuatkhauDTO entityDto) {
		TbsQtacDnTrigiaXuatkhau dtos = new TbsQtacDnTrigiaXuatkhau();
		dtos.setId(entityDto.getId());
		dtos.setMasodn(entityDto.getMasodn());
		dtos.setTrigiaxuatkhau(entityDto.getTrigiaxuatkhau());
		dtos.setTenDn(entityDto.getTenDn());
		dtos.setTrangThai(0);
		dtos.setMoTa(entityDto.getMoTa());
		try{
			this.update(dtos);
		}catch(Exception ex){
			ex.printStackTrace();
		}	
		
	}

	@Override
	public void delete(long id) {
		TbsQtacDnTrigiaXuatkhau entity = new TbsQtacDnTrigiaXuatkhau();
		entity.setId(id);
		try{
			this.delete(entity);
		}catch(Exception ex){
		}
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public TbsQtacDnTrigiaXuatkhau findById(Long id) {
		Criteria cr =  this.createCriteria();
		cr.add(Restrictions.eq("id", id));
		List<TbsQtacDnTrigiaXuatkhau> results = cr.list();
		if(results != null){
			return (TbsQtacDnTrigiaXuatkhau)results.get(0);
		}
		return null;
	}

	
	@Override
	@SuppressWarnings("unchecked")
	public List<TbsQtacDnTrigiaXuatkhau> findAll() {
		Criteria cr =  this.getSession().createCriteria(TbsQtacDnTrigiaXuatkhau.class);
		cr.setMaxResults(Constants.PAGE_SIZE_10);
		List<TbsQtacDnTrigiaXuatkhau> results = (List<TbsQtacDnTrigiaXuatkhau>)cr.list();
		return (results.size() > 0) ? results : null;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<TbsQtacDnTrigiaXuatkhau> searchData(String masodn, double trigiaxuatkhau,String tenDn, int minRow, int maxRow) {
		Criteria cr =  this.createCriteria();
		if(!Utils.isEmpty(masodn) && !"".equals(masodn)){
			cr.add(Restrictions.ilike("masodn", masodn + Constants.PERCENT_CHARACTER));
		}
		
		if(!(trigiaxuatkhau == 0.0)){
			cr.add(Restrictions.eq("trigiaxuatkhau", trigiaxuatkhau));
		}
		
		if(!Utils.isEmpty(tenDn) && !"".equals(tenDn)){
			cr.add(Restrictions.ilike("tenDn", tenDn + Constants.PERCENT_CHARACTER));
		}
		
		cr.setFirstResult(minRow);
		cr.setMaxResults(maxRow);
		List<TbsQtacDnTrigiaXuatkhau> results = (List<TbsQtacDnTrigiaXuatkhau>)cr.list();
		return (results.size() > 0) ? results : null;
	}

	@Override
	public long countTotal(String masodn, double trigiaxuatkhau,String tenDn) {
		Criteria cr =  this.createCriteria();
		if(!Utils.isEmpty(masodn) && !"".equals(masodn)){
			cr.add(Restrictions.ilike("masodn", masodn + Constants.PERCENT_CHARACTER));
		}
		if(!(trigiaxuatkhau == 0.0)){
			cr.add(Restrictions.eq("trigiaxuatkhau", trigiaxuatkhau));
		}
		if(!Utils.isEmpty(tenDn) && !"".equals(tenDn)){
			cr.add(Restrictions.ilike("tenDn", tenDn + Constants.PERCENT_CHARACTER));
		}
		
		cr.setProjection(Projections.rowCount());
		long count = (Long)cr.uniqueResult();
		
		return count;
	}
	
	@Override
	public int insertList(List<TbsQtacDnTrigiaXuatkhau> listEntity){
		try{
			this.insertBatch(listEntity);
			return Constants.SUCCESS;
		}catch(Exception ex){
			return Constants.FAILED;
		}
		
	}
}
