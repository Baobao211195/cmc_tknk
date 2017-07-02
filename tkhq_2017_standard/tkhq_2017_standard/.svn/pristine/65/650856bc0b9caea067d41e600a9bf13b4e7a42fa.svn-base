package com.tkhq.cmc.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import oracle.jdbc.internal.OracleTypes;

import org.hibernate.SessionFactory;
import org.hibernate.jdbc.ReturningWork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tkhq.cmc.dto.TbdSysFunctionsDTO;
import com.tkhq.cmc.utils.Utils;

@Repository
public class TbdSysFunctionsDAOImpl implements TbdSysFunctionsDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	public List<TbdSysFunctionsDTO> getAll() {
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<TbdSysFunctionsDTO>>() {

					public List<TbdSysFunctionsDTO> execute(Connection conn) {

						List<TbdSysFunctionsDTO> bc = new ArrayList<TbdSysFunctionsDTO>();
						try {

							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_NGUOIDUNG.ts_GetAllFunctions")
									+ "(?)}");

							
							callstatement.registerOutParameter(1, OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement
									.getObject(1);

							while (rs.next()) {								
								TbdSysFunctionsDTO dto= new TbdSysFunctionsDTO(
										rs.getInt("FUNCTION_ID"), 
										rs.getString("FUNCTION_NAME"),
										rs.getInt("PARENT_ID"), 
										rs.getString("PATH"),
										rs.getInt("WEB"));
								bc.add(dto);
							}
						} catch (SQLException ex) {
							return bc;
						}
						return bc;
					}
				});
	}

}
