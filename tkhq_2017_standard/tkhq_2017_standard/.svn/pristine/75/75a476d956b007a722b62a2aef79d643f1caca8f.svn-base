package com.tkhq.cmc.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.internal.OracleTypes;

import org.hibernate.SessionFactory;
import org.hibernate.jdbc.ReturningWork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tkhq.cmc.dto.RoleGroup;
import com.tkhq.cmc.model.Tbd_Sys_Functions;
import com.tkhq.cmc.utils.Utils;

@Repository
@Transactional
public class PhanQuyenNSDDAOImpl implements PhanQuyenNSDDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private static CallableStatement call = null;

	public List<RoleGroup> getListRoleByUserId(final int userId) {
		return sessionFactory.getCurrentSession().doReturningWork(new ReturningWork<List<RoleGroup>>() {

			public List<RoleGroup> execute(Connection connection) throws SQLException {

				// CallableStatement call = null;

				List<RoleGroup> roles = new ArrayList<RoleGroup>();

				call = connection
						.prepareCall("{call " + Utils.readProperties("PK_NGUOIDUNG.ts_GetByUserId") + "(?,?)}");
				call.setInt(1, userId);
				call.registerOutParameter(2, OracleTypes.CURSOR);
				call.execute();

				ResultSet result = (ResultSet) call.getObject(2);
				while (result.next()) {
					roles.add(new RoleGroup(result.getInt("FUNCTION_ID"),result.getString("FUNCTION_NAME")));
					
				}
				return roles;
			}
		});

	}

	public int updateRoleByGroup(final int groupId, final List<Tbd_Sys_Functions> roles) {

		return sessionFactory.getCurrentSession().doReturningWork(new ReturningWork<Integer>() {

			public Integer execute(Connection connection) {
				
				
				String s= compareListToString(roles);
				// String listGroup =compareListToString(groups);
				try {
					call = connection.prepareCall(
							"{call " + Utils.readProperties("PK_NGUOIDUNG.ts_UpdateRoleForGroupId") + "(?,?)}");

					call.setInt(1, groupId);
					call.setString(2, s);
					call.execute();
					return 1;
				} catch (Exception e) {
					return 0;
				}
			}
		});
	}

	public List<RoleGroup> getListRoleByGroupId(final int groupId) {
		return sessionFactory.getCurrentSession().doReturningWork(new ReturningWork<List<RoleGroup>>() {

			public List<RoleGroup> execute(Connection connection) throws SQLException {

				// CallableStatement call = null;

				List<RoleGroup> roles = new ArrayList<RoleGroup>();
				
				call = connection
						.prepareCall("{call " + Utils.readProperties("PK_NGUOIDUNG.ts_GetByGroupId") + "(?,?)}");
				call.setInt(1, groupId);
				call.registerOutParameter(2, OracleTypes.CURSOR);
				call.execute();

				ResultSet result = (ResultSet) call.getObject(2);
				while (result.next()) {
					roles.add(new RoleGroup(result.getInt("FUNCTION_ID"),result.getString("FUNCTION_NAME")));
				}
				return roles;
			}
		});
	}

	public int updateRoleByUserId(final int userId, final List<Tbd_Sys_Functions> roles) {
		return sessionFactory.getCurrentSession().doReturningWork(new ReturningWork<Integer>() {

			public Integer execute(Connection connection) throws SQLException {
				String s = compareListToString(roles);
				try {
					call = connection
							.prepareCall("{call " + Utils.readProperties("PK_NGUOIDUNG.ts_UpdateRoleForUserId") + "(?,?)}");
					call.setInt(1, userId);
					call.setString(2, s);
					call.execute();
					return 1;
				} catch (Exception e) {
					return 0;
				}
			}
		});
	}

	private String compareListToString(List<Tbd_Sys_Functions> list) {

		StringBuffer s = new StringBuffer();
		if(list.size()==0) return "";
		for (int i = 0; i < list.size() - 1; i++) {
			s.append(list.get(i).getFunctionId() + ",");
		}
		s.append(list.get(list.size() - 1).getFunctionId());
		
		return s.toString();
	}

	public String nameFunction(final int functionId) {
		
		return sessionFactory.getCurrentSession().doReturningWork(new ReturningWork<String>() {

			public String execute(Connection connection) throws SQLException {
				List<RoleGroup> roles = new ArrayList<RoleGroup>();
				
				call=connection
						.prepareCall("{call " + Utils.readProperties("PK_NGUOIDUNG.ts_GetFunctionName") + "(?,?)}");
				call.setInt(1, functionId);
				call.registerOutParameter(2, OracleTypes.CURSOR);
				call.execute();

				ResultSet result = (ResultSet) call.getObject(2);
				while (result.next()) {
					
					roles.add(new RoleGroup(result.getString("FUNCTION_NAME")));
				}
				return roles.get(0).getFunctionName();
				
			}
		});
	}

}
