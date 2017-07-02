package com.tkhq.cmc.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.jdbc.Work;
import org.springframework.stereotype.Repository;

import com.tkhq.cmc.model.TbdSysGroups;
import com.tkhq.cmc.utils.Utils;

@Repository
public class Tbd_Sys_GroupsDAOImpl extends BaseDAO<String, TbdSysGroups>
		implements Tbd_Sys_GroupsDAO {

	public List<TbdSysGroups> getAllGroups() {

		Criteria cr = this.getSession().createCriteria(TbdSysGroups.class);
		List<TbdSysGroups> results = ((List<TbdSysGroups>) cr.addOrder(Order.desc("groupId")).list());
		if (results.size() > 0)
			return results;
		else
			return null;
	}

	public void insertNewGroup(TbdSysGroups tbdSysGroups) throws Exception {
		try {
			this.persist(tbdSysGroups);
		} catch (Exception ex) {
			throw ex;
		}
	}

	public TbdSysGroups findGroupsById(Integer groupId) {
		Criteria cr = this.createCriteria();
		cr.add(Restrictions.eq("groupId", groupId));

		List results = cr.list();
		if (results.size() > 0)
			return (TbdSysGroups) results.get(0);
		else
			return null;
	}

	public void updateTbd_sysGroups(TbdSysGroups tbdSysGroups) {
		try {
			this.update(tbdSysGroups);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void deleteById(final Integer groupId) {
		 this.getSession().doWork(new Work() {
			@Override
			public void execute(Connection conn) throws SQLException {
				try {
					CallableStatement callstatement = conn.prepareCall("{call "
							+ Utils.readProperties("PK_NGUOIDUNG.ts_DeleteGroup")
							+ "(?)}");
					callstatement.setInt(1, groupId);
					callstatement.execute();
				} catch (SQLException ex) {
				}
			}
		});
	}

	public TbdSysGroups findGroupsByCode(String groupCode) {
		Criteria cr = this.createCriteria();
		cr.add(Restrictions.eq("groupCode", groupCode));

		List results = cr.list();
		if (results.size() > 0)
			return (TbdSysGroups) results.get(0);
		else
			return null;
	}

	@Override
	public List<TbdSysGroups> searchGroup(String groupCode, String groupName) {
		Criteria cr = this.createCriteria();

		if (!"".equals(groupName)) {
			cr.add(Restrictions.ilike("groupName", "%" + groupName + "%"));
		}
		if (!"".equals(groupCode)) {
			cr.add(Restrictions.ilike("groupCode", "%" + groupCode + "%"));
		}
		List<TbdSysGroups> results = ((List<TbdSysGroups>) cr.addOrder(Order.desc("groupId")).list());
		if (results.size() > 0)
			return results;
		else
			return null;
	}

}
