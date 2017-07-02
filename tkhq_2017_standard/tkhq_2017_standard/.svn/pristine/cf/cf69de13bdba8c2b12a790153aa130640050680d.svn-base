package com.tkhq.cmc.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.tkhq.cmc.model.TbdSysparameters;
import com.tkhq.cmc.utils.Utils;

@Repository
public class TbsSysParametersDAOImpl extends BaseDAO<String, TbdSysparameters>
		implements TbsSysParametersDAO {

	@Override
	public List<TbdSysparameters> getAll() {
		Criteria cr = this.getSession().createCriteria(TbdSysparameters.class);
		List<TbdSysparameters> results = (List<TbdSysparameters>) cr.list();

		if (results.size() > 0)
			return results;
		else
			return null;
	}

	@Override
	public void InsertParameters(TbdSysparameters paramters) throws Exception {
		try {
			this.persist(paramters);
		} catch (Exception ex) {
			throw ex;
		}
	}

	@Override
	public void DeleteParameters(int ma) {
		TbdSysparameters entity = new TbdSysparameters();
		entity.setMa(ma);
		try {
			this.delete(entity);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void UpdateParameters(TbdSysparameters paramters) {
		try {
			this.update(paramters);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public List<TbdSysparameters> Search(String ten_param, String giatri,
			String nguoi_capnhap, String ngay_capnhap) {
		Criteria cr = this.getSession().createCriteria(TbdSysparameters.class);

		if (!Utils.isEmpty(ten_param) && !"".equals(ten_param)) {
			cr.add(Restrictions.ilike("ten_thamSo", "%" + ten_param + "%"));
		}
		if (!Utils.isEmpty(giatri) && !"".equals(giatri)) {
			cr.add(Restrictions.ilike("gia_tri", "%" + giatri + "%"));
		}
		if (!Utils.isEmpty(nguoi_capnhap) && !"".equals(nguoi_capnhap)) {
			cr.add(Restrictions.ilike("nguoi_capnhat", "%" + nguoi_capnhap
					+ "%"));
		}
		if (!Utils.isEmpty(ngay_capnhap.toString()) && !"".equals(ngay_capnhap)) {
			SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date date = null;
			try {
				date = sdf1.parse(ngay_capnhap);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
			cr.add(Restrictions.eq("ngay_capnhat", sqlStartDate));
		}

		List<TbdSysparameters> results = (List<TbdSysparameters>) cr.list();
		if (results.size() > 0)
			return results;
		else
			return null;
	}

	@Override
	public TbdSysparameters findParamById(int ma) {
		Criteria cr = this.createCriteria();
		cr.add(Restrictions.eq("ma", ma));
		List results = cr.list();
		if (results.size() > 0)
			return (TbdSysparameters) results.get(0);
		else
			return null;
	}

}
