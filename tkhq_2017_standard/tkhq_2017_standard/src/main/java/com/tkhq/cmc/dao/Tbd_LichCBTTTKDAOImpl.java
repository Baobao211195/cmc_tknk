package com.tkhq.cmc.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.tkhq.cmc.model.TbdSysUsers;
import com.tkhq.cmc.model.Tbd_LichCB_TTTK;
import com.tkhq.cmc.utils.Utils;

@Repository
public class Tbd_LichCBTTTKDAOImpl extends BaseDAO<Integer, Tbd_LichCB_TTTK> implements Tbd_LichCBTTTKDAO{

	public List<Tbd_LichCB_TTTK> search(String namCB, String loaiLichCB) {
		Criteria cr = this.createCriteria();
		if (!Utils.isEmpty(namCB)) {
			cr.add(Restrictions.eq("namCB", namCB));
		}
		if (!Utils.isEmpty(loaiLichCB)) {
			cr.add(Restrictions.eq("loaiLichCB", loaiLichCB));
		}
		
		cr.addOrder(Order.asc("thangBC"));

		List<Tbd_LichCB_TTTK> results = (List<Tbd_LichCB_TTTK>) cr.list();
		if (results.size() > 0)
			return results;
		else
			return new ArrayList<Tbd_LichCB_TTTK>();
	}

	public void insertEntity(Tbd_LichCB_TTTK entity) throws Exception {
		try {
			this.persist(entity);
		} catch (Exception ex) {
			throw ex;
		}
	}

	public void updateEntity(Tbd_LichCB_TTTK entity) throws Exception {
		try {
			this.update(entity);
		} catch (Exception ex) {
			ex.printStackTrace();
		}	
	}

	public List<TbdSysUsers> getLstUser() {
		Criteria cr = this.getSession().createCriteria(TbdSysUsers.class);
		List<TbdSysUsers> results = (List<TbdSysUsers>) cr.list();
		if (results.size() > 0)
			return results;
		else
			return null;
	}

	public Tbd_LichCB_TTTK findById(Integer lichCBTTId) {
		Criteria cr = this.createCriteria();
		cr.add(Restrictions.eq("lichCBTTId", lichCBTTId));
		List results = cr.list();
		if (results.size() > 0)
			return (Tbd_LichCB_TTTK) results.get(0);
		else
			return null;
	}

}
