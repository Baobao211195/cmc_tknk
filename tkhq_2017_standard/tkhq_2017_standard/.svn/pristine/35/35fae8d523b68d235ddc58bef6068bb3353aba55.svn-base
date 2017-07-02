package com.tkhq.cmc.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.jdbc.Work;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tkhq.cmc.model.TbdSysLogSession;
import com.tkhq.cmc.utils.Utils;

@Repository
@Transactional
public class TbdSysLogSessionDAOImpl extends BaseDAO<Long, TbdSysLogSession> implements TbdSysLogSessionDAO {

	public void insert(final String username) throws Exception {
		this.getSession().doWork(new Work() {

			@Override
			public void execute(Connection connection) throws SQLException {
				try {
					CallableStatement call = connection
							.prepareCall("{call " + Utils.readProperties("PK_NGUOIDUNG.ts_insertLogSession") + "(?)}");
					call.setString(1, username);
					call.execute();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	@SuppressWarnings("unchecked")
	public List<TbdSysLogSession> getAll() {
		Criteria cri = this.getSession().createCriteria(TbdSysLogSession.class);
		List<TbdSysLogSession> list = cri.list();

		if (list.size() > 0) {
			return list;
		} else
			return null;
	}

	public void update(TbdSysLogSession entity) {
		try {
			this.update(entity);
		} catch (Exception e) {

		}
	}

	@SuppressWarnings("unchecked")
	public void updateNewLogUser(final String username) throws Exception {
		this.getSession().doWork(new Work() {
			
			@Override
			public void execute(Connection connection) throws SQLException {
				try {
					CallableStatement call = connection.prepareCall("{call " + Utils.readProperties("PK_NGUOIDUNG.ts_updateLogSession") + "(?)}");
					call.setString(1, username);
					call.execute();
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				
			}
		});
	}

	@SuppressWarnings("unchecked")
	public List<TbdSysLogSession> search(String username) {
		Criteria cri = this.getSession().createCriteria(TbdSysLogSession.class);

		if (Utils.isEmpty(username) || "".equals(username)) {
			cri.add(Restrictions.ilike("tenDangNhap", "%" + username + "%"));
		}

		List<TbdSysLogSession> list = cri.list();
		if (list.size() > 0) {
			return list;
		} else
			return null;
	}

}
