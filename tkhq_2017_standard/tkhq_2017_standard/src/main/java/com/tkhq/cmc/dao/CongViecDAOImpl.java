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

import com.tkhq.cmc.dto.CongViecDTO;
import com.tkhq.cmc.dto.HTRaXoatSanPhamTKDTO;
import com.tkhq.cmc.utils.Utils;

@Repository
public class CongViecDAOImpl implements CongViecDAO{

	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public List<CongViecDTO> getListCongViec() {
		return sessionFactory.getCurrentSession().doReturningWork(
			new ReturningWork<List<CongViecDTO>>() {

				public List<CongViecDTO> execute(Connection con) throws SQLException {
					List<CongViecDTO> listDto = new ArrayList<CongViecDTO>();;
					CallableStatement callStm = con.prepareCall(new StringBuilder()
														.append("{call ")
														.append(Utils.readProperties("PK_LOG_TODO.GET_TODO"))
														.append("(?,?)}").toString());
					
					callStm.setString(1, Utils.getPrincipalLogin().getUsername());
					callStm.registerOutParameter(2, OracleTypes.CURSOR);
					
					callStm.execute();
					
					ResultSet rs = (ResultSet) callStm.getObject(2);
					CongViecDTO dto = null;
					while (rs.next()) {
						dto = new CongViecDTO();
						dto.setM_id(rs.getInt("m_id"));
						dto.setMa_hq(rs.getString("ma_hq"));
						dto.setMa_lh(rs.getString("ma_lh"));
						dto.setNamdk(rs.getInt("namdk"));
						dto.setSo_tk_vnacss(rs.getString("SO_TK_VNACCS"));
						dto.setLydo_nghingo(rs.getString("LYDO_NGHINGO"));
						dto.setTen_hang(rs.getString("TEN_HANG"));
						dto.setSttthang(rs.getInt("STTTHANG"));
						dto.setTrang_thai(rs.getString("TRANGTHAI"));
						listDto.add(dto);
					}
					return listDto;
				}
			});
	}
}
