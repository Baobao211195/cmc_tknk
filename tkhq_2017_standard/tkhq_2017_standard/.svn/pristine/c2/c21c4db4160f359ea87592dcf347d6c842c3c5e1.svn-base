package com.tkhq.global.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.jdbc.ReturningWork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tkhq.cmc.utils.Utils;
import com.tkhq.global.model.NghiepVuThayDoiToKhai;

//import oracle.jdbc.internal.OracleTypes;

import oracle.jdbc.OracleTypes;

@Repository
@Transactional
public class NghiepVuThayDoiToKhaiDaoImpl implements NghiepVuThayDoiToKhaiDao {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public List<NghiepVuThayDoiToKhai> getAllNghiepVuThaydoi() {

		return sessionFactory.getCurrentSession().doReturningWork(new ReturningWork<List<NghiepVuThayDoiToKhai>>() {

			@Override
			public List<NghiepVuThayDoiToKhai> execute(Connection conn)
					throws SQLException {
				CallableStatement statement = null;
				List<NghiepVuThayDoiToKhai> list = new ArrayList<NghiepVuThayDoiToKhai>();
				statement = conn.prepareCall("{call " + Utils.readProperties("GETALL_NghiepVuThayDoiToKhai") + "(?)}");
				statement.registerOutParameter(1, OracleTypes.CURSOR);
				statement.execute();
				ResultSet rs = (ResultSet)statement.getObject(1);
				while(rs.next()){
					NghiepVuThayDoiToKhai record = new NghiepVuThayDoiToKhai(rs.getString("ma"), rs.getString("ten"));
					list.add(record);
				}				
				return list;
			}
		});
	}

}
