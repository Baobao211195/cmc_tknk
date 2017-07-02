package com.tkhq.cmc.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.ParameterMode;

import org.hibernate.Query;
import org.hibernate.jdbc.Work;

import com.tkhq.cmc.dto.CucHQDTO;
import com.tkhq.cmc.utils.Utils;

import oracle.jdbc.driver.OracleTypes;

public class DonviHQDAOImpl extends BaseDAO<String, CucHQDTO> implements DonviHQDAO {

	@SuppressWarnings("unchecked")
	public List<CucHQDTO> getAllCucHQ() {
		final List<CucHQDTO> cuHqdtos = new ArrayList<CucHQDTO>();
		getSession().doWork(new Work() {

			public void execute(Connection connection) throws SQLException {
				CallableStatement call = connection.prepareCall("{?= call " + Utils.readProperties("GETALL_CUCHQ"));
				call.registerOutParameter(1, OracleTypes.CURSOR);

				call.executeQuery();
				ResultSet rs = (ResultSet) call.getObject(2);

				while (rs.next()) {
					CucHQDTO cuHqdto = new CucHQDTO();
					cuHqdto.setMa(rs.getString("ma"));
					cuHqdto.setTen(rs.getString("ten"));

					cuHqdtos.add(cuHqdto);

					System.out.println(cuHqdto.getMa());

				}
			}
		});
		return cuHqdtos;
	}
}
