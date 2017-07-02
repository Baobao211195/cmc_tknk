package com.tkhq.global.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.jdbc.ReturningWork;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tkhq.cmc.utils.Utils;
import com.tkhq.global.model.UserInfo;
import com.tkhq.global.model.phanhoi.PhanHoiBaocao;
import com.tkhq.global.model.phanhoi.PostPhanHoiMessage;

import oracle.jdbc.OracleTypes;

@Repository
@Transactional
public class PhanHoiBaocaoDaoImpl extends GlobalBaseDao implements PhanHoiBaocaoDao{

	@Override
	public List<UserInfo> getManagers(final String username) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().doReturningWork(new ReturningWork<List<UserInfo>>() {

			@Override
			public List<UserInfo> execute(Connection conn) throws SQLException {
				CallableStatement statement = null;

				statement = conn.prepareCall("{call " + Utils.readProperties("GET_MANAGERS") + "(?,?)}");
				statement.setString(1, username);
				statement.registerOutParameter(2, OracleTypes.CURSOR);
				statement.execute();
				ResultSet rs = (ResultSet) statement.getObject(2);
				List<UserInfo> list = new ArrayList<UserInfo>();
				String usernameTmp;
				while (rs.next()) {
					usernameTmp = rs.getString("USER_NAME_PA1");
					if(usernameTmp != null)
						list.add(new UserInfo(usernameTmp));
					usernameTmp = rs.getString("USER_NAME_PA2");
					if(usernameTmp != null)
						list.add(new UserInfo(usernameTmp));	
					usernameTmp = rs.getString("USER_NAME_PA3");
					if(usernameTmp != null)
						list.add(new UserInfo(usernameTmp)); 
				}
				rs.close();
				rs = null;
				return list;
			}
		});
	}
	
	@Override
	public List<PhanHoiBaocao> getDSPhanHoi(final int loai_bc) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().doReturningWork(new ReturningWork<List<PhanHoiBaocao>>() {

			@Override
			public List<PhanHoiBaocao> execute(Connection conn) throws SQLException {
				CallableStatement statement = null;

				statement = conn.prepareCall("{call " + Utils.readProperties("GET_DSPHANHOI") + "(?,?)}");
				statement.setInt(1, loai_bc);
				statement.registerOutParameter(2, OracleTypes.CURSOR);
				statement.execute();
				ResultSet rs = (ResultSet) statement.getObject(2);
				List<PhanHoiBaocao> list = new ArrayList<PhanHoiBaocao>();
				while (rs.next()) {
					list.add(new PhanHoiBaocao(rs.getInt("loai_bc"),
							rs.getString("USER_PHANHOI"), rs.getString("NOIDUNG_PHANHOI"),rs.getString("THOIGIAN_TAO"))); 
				}
				rs.close();
				rs = null;
				return list;
			}
		});
	}

	@Override
	public PostPhanHoiMessage postPhanHoi(final PhanHoiBaocao phanhoi) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().doReturningWork(new ReturningWork<PostPhanHoiMessage>() {

			@Override
			public PostPhanHoiMessage execute(Connection conn) {
			
				CallableStatement statement = null;
				PostPhanHoiMessage msg = new PostPhanHoiMessage();
				try{
					statement = conn.prepareCall("{call " + Utils.readProperties("SAVE_PHANHOI") + "(?,?,?)}");
					statement.setInt(1, phanhoi.getLoai_bc());
					statement.setString(2, phanhoi.getUsername());
					statement.setString(3, phanhoi.getNoidung());
					int count = statement.executeUpdate();
					if(count <1){
						msg.setError_code("0");
						msg.setError_mes("NOT_INSERTED");
					}
					msg.setError_code("1");
					msg.setError_mes("COMPLETED");
				}catch(SQLException ex){
					msg.setError_code("-1");
					msg.setError_mes("FAILURE");
					
				}
			
				return msg;
			}
		});
	}

}
