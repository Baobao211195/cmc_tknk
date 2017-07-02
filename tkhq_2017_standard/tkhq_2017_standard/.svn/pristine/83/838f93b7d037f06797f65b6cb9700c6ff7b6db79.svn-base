package com.tkhq.cmc.dao;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.tkhq.cmc.common.Constants;
import com.tkhq.cmc.dto.TbsQtacCuakhauDbVnDto;
import com.tkhq.cmc.model.TbsQtacCuakhauDbVn;
import com.tkhq.cmc.utils.Utils;

@Repository
public class TbsQtacCuakhauDbVnDaoImpl extends BaseDAO<Long, TbsQtacCuakhauDbVn> implements TbsQtacCuakhauDbVnDao{
	
	@Override
	@SuppressWarnings({ "unchecked"})
	public TbsQtacCuakhauDbVn findById(Long id) {
		Criteria cr =  this.createCriteria();
		cr.add(Restrictions.eq("id", id));
		List<TbsQtacCuakhauDbVn> results = cr.list();
		if(results != null){
			return (TbsQtacCuakhauDbVn)results.get(0);
		}
		return null;
	}
	
	@Override
	@SuppressWarnings({ "unchecked"})
	public List<TbsQtacCuakhauDbVn> findAll() {
		Criteria cr =  this.getSession().createCriteria(TbsQtacCuakhauDbVn.class);
		cr.setMaxResults(Constants.PAGE_SIZE_10);
		List<TbsQtacCuakhauDbVn> results = (List<TbsQtacCuakhauDbVn>)cr.list();
		return (results.size() > 0) ? results : null;
	}
	

	@Override
	public List<TbsQtacCuakhauDbVn> searchData(String maCuaKhau, String maNuocDen, String maCKDen,
									String tenCuaKhau, String tenNuocDen, String tenCuaKhauDen, int minRow,int maxRow) {
		Criteria cr =  this.createCriteria();
		
		if(!Utils.isEmpty(maCuaKhau) && !"".equals(maCuaKhau)){
			cr.add(Restrictions.ilike("macuakhau", maCuaKhau + Constants.PERCENT_CHARACTER));
		}
		if(!Utils.isEmpty(maNuocDen) && !"".equals(maNuocDen)){
			cr.add(Restrictions.ilike("manuocden", maNuocDen + Constants.PERCENT_CHARACTER));
		}
		if(!Utils.isEmpty(maCKDen) && !"".equals(maCKDen)){
			cr.add(Restrictions.ilike("macuakhauden", maCKDen + Constants.PERCENT_CHARACTER));
		}
		
		if(!Utils.isEmpty(tenCuaKhau) && !"".equals(tenCuaKhau)){
			cr.add(Restrictions.ilike("tenCuaKhau", tenCuaKhau + Constants.PERCENT_CHARACTER));
		}
		
		if(!Utils.isEmpty(tenNuocDen) && !"".equals(tenNuocDen)){
			cr.add(Restrictions.ilike("tenNuocDen", tenNuocDen + Constants.PERCENT_CHARACTER));
		}
		
		if(!Utils.isEmpty(tenCuaKhauDen) && !"".equals(tenCuaKhauDen)){
			cr.add(Restrictions.ilike("tenCuaKhauDen", tenCuaKhauDen + Constants.PERCENT_CHARACTER));
		}
		cr.addOrder(Order.asc("macuakhau"));
		
		cr.setFirstResult(minRow);
		cr.setMaxResults(maxRow);
		@SuppressWarnings("unchecked")
		List<TbsQtacCuakhauDbVn> results = (List<TbsQtacCuakhauDbVn>)cr.list();
		return (results.size() > 0) ? results : null;
	}
	
	@Override
	public long countTotal(String maCuaKhau, String maNuocDen, String maCKDen,
						String tenCuaKhau, String tenNuocDen, String tenCuaKhauDen) {
		Criteria cr =  this.createCriteria();
		if(!Utils.isEmpty(maCuaKhau) && !"".equals(maCuaKhau)){
			cr.add(Restrictions.ilike("macuakhau", maCuaKhau + Constants.PERCENT_CHARACTER));
		}
		if(!Utils.isEmpty(maNuocDen) && !"".equals(maNuocDen)){
			cr.add(Restrictions.ilike("manuocden", maNuocDen + Constants.PERCENT_CHARACTER));
		}
		if(!Utils.isEmpty(maCKDen) && !"".equals(maCKDen)){
			cr.add(Restrictions.ilike("macuakhauden", maCKDen + Constants.PERCENT_CHARACTER));
		}
		
		if(!Utils.isEmpty(tenCuaKhau) && !"".equals(tenCuaKhau)){
			cr.add(Restrictions.ilike("tenCuaKhau", tenCuaKhau + Constants.PERCENT_CHARACTER));
		}
		
		if(!Utils.isEmpty(tenNuocDen) && !"".equals(tenNuocDen)){
			cr.add(Restrictions.ilike("tenNuocDen", tenNuocDen + Constants.PERCENT_CHARACTER));
		}
		
		if(!Utils.isEmpty(tenCuaKhauDen) && !"".equals(tenCuaKhauDen)){
			cr.add(Restrictions.ilike("tenCuaKhauDen", tenCuaKhauDen + Constants.PERCENT_CHARACTER));
		}
		
		cr.setProjection(Projections.rowCount());
		long count = (Long)cr.uniqueResult();
		
		return count;
	}
	
	@Override
	public void insert(TbsQtacCuakhauDbVn entity) {
		try{
			this.persist(entity);
		}catch(Exception ex){
		}	
	}
	
	@Override
	public int insertList(List<TbsQtacCuakhauDbVn> listEntity){
		try {
			this.insertBatch(listEntity);
			return Constants.SUCCESS;
		} catch (Exception e) {
			return Constants.FAILED;
		}
	}

	public void update(TbsQtacCuakhauDbVnDto entityDto) {
		TbsQtacCuakhauDbVn dtos = new TbsQtacCuakhauDbVn();
		dtos.setId(entityDto.getId());
		dtos.setMacuakhau(entityDto.getMacuakhau());
		dtos.setManuocden(entityDto.getManuocden());
		dtos.setMacuakhauden(entityDto.getMacuakhauden());
		dtos.setTenCuaKhau(entityDto.getTenCuaKhau());
		dtos.setTenNuocDen(entityDto.getTenNuocDen());
		dtos.setTenCuaKhauDen(entityDto.getTenCuaKhauDen());
		dtos.setMoTa(entityDto.getMoTa());
		dtos.setTrangThai(0);
		try{
			this.update(dtos);
		}catch(Exception ex){
			ex.printStackTrace();
		}	
	}

	@Override
	public void delete(long id) {
		TbsQtacCuakhauDbVn entity = new TbsQtacCuakhauDbVn();
		entity.setId(id);
		try{
			this.delete(entity);
		}catch(Exception ex){
		}
	}

}
