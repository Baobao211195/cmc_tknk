package com.tkhq.cmc.dao;

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

import com.tkhq.cmc.dto.Tbd_Sys_LockUsersDTO;
import com.tkhq.cmc.utils.Utils;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class TbdSysLockUserDAOImpl  implements TbdSysLockUserDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Tbd_Sys_LockUsersDTO> findAll() {
		return sessionFactory.getCurrentSession().doReturningWork(
			new ReturningWork<List<Tbd_Sys_LockUsersDTO>>() {

				public List<Tbd_Sys_LockUsersDTO> execute(Connection con) throws SQLException {
					List<Tbd_Sys_LockUsersDTO> listFileDto = new ArrayList<Tbd_Sys_LockUsersDTO>();
					CallableStatement callStm = con.prepareCall(new StringBuilder()
													.append("{call ")
													.append(Utils.readProperties("PK_TBD_SYS_LOCKUSERS.getListLockUsers"))
													.append("(?)}").toString());
					callStm.registerOutParameter(1, OracleTypes.CURSOR);
					
					callStm.execute();
					
					ResultSet rs = (ResultSet) callStm.getObject(1);
					Tbd_Sys_LockUsersDTO dto = null;
					while (rs.next()) {
						dto = new Tbd_Sys_LockUsersDTO();
						dto.setWorkStation(rs.getString("WORKSTATION"));
						dto.setUsersName(rs.getString("USERSNAME"));
						dto.setMaThongKe(rs.getString("MA_THKE"));
						dto.setTenHangKt(rs.getString("TENHANG_KT"));
						dto.setTypeXuatNhap(rs.getString("NHX"));
						dto.setManHinhKt(rs.getString("MAN_HINHKT"));

						listFileDto.add(dto);
					}
					return listFileDto;
				}
			});
	}

	@Override
	public Tbd_Sys_LockUsersDTO fildByName(final String userName) {
		return sessionFactory.getCurrentSession().doReturningWork(
			new ReturningWork<Tbd_Sys_LockUsersDTO>() {

				public Tbd_Sys_LockUsersDTO execute(Connection con) throws SQLException {
					CallableStatement callStm = con.prepareCall(new StringBuilder()
													.append("{call ")
													.append(Utils.readProperties("PK_TBD_SYS_LOCKUSERS.getLockUserByName"))
													.append("(?,?)}").toString());
					callStm.setString(1, userName);
					callStm.registerOutParameter(2, OracleTypes.CURSOR);
					
					callStm.execute();
					
					ResultSet rs = (ResultSet) callStm.getObject(2);
					Tbd_Sys_LockUsersDTO dto = null;
					while (rs.next()) {
						dto = new Tbd_Sys_LockUsersDTO();
						dto.setWorkStation(rs.getString("WORKSTATION"));
						dto.setUsersName(rs.getString("USERSNAME"));
						dto.setMaThongKe(rs.getString("MA_THKE"));
						dto.setTenHangKt(rs.getString("TENHANG_KT"));
						dto.setTypeXuatNhap(rs.getString("NHX"));
						dto.setManHinhKt(rs.getString("MAN_HINHKT"));
					}
					return dto;
				}
			});
	}

	@Override
	public int deleteByName(final String userName) {
		return sessionFactory.getCurrentSession().doReturningWork(
			new ReturningWork<Integer>() {

				public Integer execute(Connection con) throws SQLException {
					CallableStatement callStm = con.prepareCall(new StringBuilder()
													.append("{call ")
													.append(Utils.readProperties("PK_TBD_SYS_LOCKUSERS.deleteLockUserByName"))
													.append("(?)}").toString());
					try {
						callStm.setString(1, userName);
						return callStm.executeUpdate();
					} catch (SQLException e){
						return 0;
					}
					
				}
			});
	}
}
