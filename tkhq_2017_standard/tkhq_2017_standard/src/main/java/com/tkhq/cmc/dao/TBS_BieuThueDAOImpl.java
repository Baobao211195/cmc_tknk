package com.tkhq.cmc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.tkhq.cmc.dto.Tbs_BieuThueDTO;
import com.tkhq.cmc.model.Tbs_BieuThue;
import com.tkhq.cmc.utils.Utils;

@Repository
public class TBS_BieuThueDAOImpl extends BaseDAO<String, Tbs_BieuThue> implements TBS_BieuThueDAO {
	public static final int maxRowData = 10;

	public Tbs_BieuThue findById(Integer bieuThueId) {
		Criteria cr = this.createCriteria();
		cr.add(Restrictions.eq("bieuThueId", bieuThueId));
		List results = cr.list();
		if (results.size() > 0)
			return (Tbs_BieuThue) results.get(0);
		else
			return null;
	}

	public List<Tbs_BieuThue> findByName(String tenBieuThue) {
		Criteria cr = this.createCriteria();
		cr.add(Restrictions.eq("tenBieuThue", tenBieuThue));
		List<Tbs_BieuThue> results = cr.list();
		if (results.size() > 0)
			return results;
		else
			return null;
	}

	public void insertTbs_BieuThue(Tbs_BieuThue tbsBieuThue) throws Exception {
		try {
			this.persist(tbsBieuThue);
		} catch (Exception ex) {
			throw ex;
		}
	}

	public void updateTbs_BieuThue(Tbs_BieuThue tbsBieuThue) {
		try {
			this.update(tbsBieuThue);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void deleteById(Integer bieuThueId) {
		Tbs_BieuThue entity = new Tbs_BieuThue();
		entity.setBieuThueId(bieuThueId);
		try {
			this.delete(entity);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public List<Tbs_BieuThue> findAll() {
		Criteria cr = this.getSession().createCriteria(Tbs_BieuThue.class);
		cr.setMaxResults(maxRowData);
		List<Tbs_BieuThue> results = (List<Tbs_BieuThue>) cr.list();

		if (results.size() > 0)
			return results;
		else
			return null;
	}

	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	public Integer getSequence() {
		Criteria cr = this.createCriteria();
		cr.setProjection(Projections.projectionList().add(Projections.max("bieuThueId")));
		List results = cr.list();
		if (results.size() > 0) {
			Integer maxId = Integer.valueOf(results.get(0).toString());
			return maxId;
		} else {
			return null;
		}
	}

	public List<Tbs_BieuThue> searchBieuThue(String maBieuThue, String tenBieuThue, String maHS, int minRow,
			int maxRow) {
		Criteria cr = this.createCriteria();
		if (!Utils.isEmpty(maBieuThue)) {
			cr.add(Restrictions.like("maBieuThue", maBieuThue, MatchMode.ANYWHERE).ignoreCase());
			//cr.add(Restrictions.like("maBieuThue", "%" + maBieuThue + "%"));
		}
		if (!Utils.isEmpty(tenBieuThue)) {
			cr.add(Restrictions.like("tenBieuThue", tenBieuThue, MatchMode.ANYWHERE).ignoreCase());
			//cr.add(Restrictions.like("tenBieuThue", "%" + tenBieuThue + "%"));
		}
		if (!Utils.isEmpty(maHS)) {
			cr.add(Restrictions.like("maHS", maHS, MatchMode.ANYWHERE).ignoreCase());
			//cr.add(Restrictions.like("maHS", "%" + maHS + "%"));
		}

		cr.setFirstResult(minRow);
		cr.setMaxResults(maxRow);

		List<Tbs_BieuThue> results = (List<Tbs_BieuThue>) cr.list();
		if (results.size() > 0)
			return results;
		else
			return null;
	}

	public List<Tbs_BieuThue> searchBieuThue(Tbs_BieuThueDTO search) {

		Criteria cri = this.createCriteria();
		if (search.getMaBieuThue().isEmpty()) {
			cri.add(Restrictions.eqProperty("maBieuThue", search.getMaBieuThue()));
		}
		if (search.getMaHS().isEmpty()) {
			cri.add(Restrictions.eqProperty("maHS", search.getMaHS()));
		}
		if (search.getTenBieuThue().isEmpty()) {
			cri.add(Restrictions.eqProperty("tenBieuThue", search.getTenBieuThue()));
		}

		List<Tbs_BieuThue> results = (List<Tbs_BieuThue>) cri.list();

		if (results.size() != 0) {
			return results;
		} else
			return null;

	}

	public long countTotal(String maBieuThue, String tenBieuThue, String maHS) {
		Criteria cr = this.createCriteria();
		if (!Utils.isEmpty(maBieuThue)) {
			cr.add(Restrictions.ilike("maBieuThue", maBieuThue, MatchMode.END));
		}
		if (!Utils.isEmpty(tenBieuThue)) {
			cr.add(Restrictions.ilike("tenBieuThue", tenBieuThue, MatchMode.END));
		}
		if (!Utils.isEmpty(maHS)) {
			cr.add(Restrictions.ilike("maHS", maHS, MatchMode.END));
		}

		cr.setProjection(Projections.rowCount());
		long count = (Long) cr.uniqueResult();

		return count;
	}
}
