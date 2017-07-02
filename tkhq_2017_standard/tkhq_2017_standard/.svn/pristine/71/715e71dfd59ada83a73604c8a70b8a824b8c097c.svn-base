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

import com.tkhq.cmc.dto.BCHTX27HDTO;
import com.tkhq.cmc.dto.BCNKHH015KDTO;
import com.tkhq.cmc.dto.BCNKHHCOUDDTO;
import com.tkhq.cmc.dto.BCNKHHCUCHQDTO;
import com.tkhq.cmc.dto.BCNKHHPTVT026HDTO;
import com.tkhq.cmc.dto.BCNKHTDTK017K1DTO;
import com.tkhq.cmc.dto.BCNKHTDTK017KDTO;
import com.tkhq.cmc.dto.BCNKNUOCMHCY024TDTO;
import com.tkhq.cmc.dto.BCNKTDNCYDTO;
import com.tkhq.cmc.dto.BCSLDNTTTPDTO;
import com.tkhq.cmc.dto.BCTGNKCHIUTHUECUCHQDTO;
import com.tkhq.cmc.dto.BCTTXNKTCCHQDTO;
import com.tkhq.cmc.dto.BCUSBXKHHDTO;
import com.tkhq.cmc.dto.BCXKHH015KDTO;
import com.tkhq.cmc.dto.BCXKHHCUCHQDTO;
import com.tkhq.cmc.dto.BCXKHHPTVT025HDTO;
import com.tkhq.cmc.dto.BCXKHHTTTCHQDTO;
import com.tkhq.cmc.dto.BCXKMHCYTINHDTO;
import com.tkhq.cmc.dto.BCXKMHCYTPTVTTCHQDTO;
import com.tkhq.cmc.dto.BCXKMHCYTPTVTTCHQQUYDTO;
import com.tkhq.cmc.dto.BCXKNUOCMHCY023TDTO;
import com.tkhq.cmc.dto.BCXKNUOCMHCYTINHDTO;
import com.tkhq.cmc.dto.BCXKTDNCYDTO;
import com.tkhq.cmc.dto.BCXNKHHTNLHDTO;
import com.tkhq.cmc.dto.BCXNKHHTT19TDTO;
import com.tkhq.cmc.dto.BCXNKTLHDNDTO;
import com.tkhq.cmc.dto.BCXNKTTP022TDTO;
import com.tkhq.cmc.dto.BGHHNKTT55DTO;
import com.tkhq.cmc.dto.TMBCNKHH20TDTO;
import com.tkhq.cmc.dto.TMBCXKHH20TDTO;
import com.tkhq.cmc.dto.TTGXKPTVTDTO;
import com.tkhq.cmc.utils.Utils;

@Repository
public class PHANHE_PBTKDAOImpl implements PHANHE_PBTKDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public List<TMBCXKHH20TDTO> ts_BCXKHH20T(final String maHQ,
			final int thang, final int nam, final String loai_BC) {

		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<TMBCXKHH20TDTO>>() {

					public List<TMBCXKHH20TDTO> execute(Connection conn) {

						List<TMBCXKHH20TDTO> bc = new ArrayList<TMBCXKHH20TDTO>();
						try {

							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BAOCAO_QD15.ts_BCXKHH20T")
									+ "(?,?,?,?,?)}");

							callstatement.setString(1, maHQ);
							callstatement.setInt(2, thang);
							callstatement.setInt(3, nam);
							callstatement.setString(4, loai_BC);
							callstatement.registerOutParameter(5,
									OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement
									.getObject(5);

							while (rs.next()) {

								TMBCXKHH20TDTO entity = new TMBCXKHH20TDTO(
										thang, nam, loai_BC, rs.getInt("STT"),
										rs.getInt("SAPXEP"), rs
												.getString("TEN_NHOM"), rs
												.getString("TEN_HANG"), rs
												.getString("TEN_DVT"), rs
												.getDouble("LUONG_KY"), rs
												.getDouble("TRIGIA_KY"), rs
												.getDouble("LUONG_LK"), rs
												.getDouble("TRIGIA_LK"));

								bc.add(entity);
							}
						} catch (SQLException ex) {
							return bc;
						}
						return bc;
					}
				});
	}

	public List<TMBCNKHH20TDTO> ts_BCNKHH20T(final String maHQ,
			final int thang, final int nam, final String loai_BC) {

		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<TMBCNKHH20TDTO>>() {

					public List<TMBCNKHH20TDTO> execute(Connection conn)
							throws SQLException {

						List<TMBCNKHH20TDTO> bc = new ArrayList<TMBCNKHH20TDTO>();
						try {
							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BAOCAO_QD15.ts_BCNKHH20T")
									+ "(?,?,?,?,?)}");

							callstatement.setString(1, maHQ);
							callstatement.setInt(2, thang);
							callstatement.setInt(3, nam);
							callstatement.setString(4, loai_BC);
							callstatement.registerOutParameter(5,
									OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement
									.getObject(5);

							while (rs.next()) {

								TMBCNKHH20TDTO entity = new TMBCNKHH20TDTO(
										thang, nam, loai_BC, rs.getInt("STT"),
										rs.getInt("SAPXEP"), rs
												.getString("TEN_NHOM"), rs
												.getString("TEN_HANG"), rs
												.getString("TEN_DVT"), rs
												.getDouble("LUONG_KY"), rs
												.getDouble("TRIGIA_KY"), rs
												.getDouble("LUONG_LK"), rs
												.getDouble("TRIGIA_LK"));

								bc.add(entity);
							}
						} catch (SQLException ex) {
							return bc;
						}
						return bc;
					}
				});
	}

	public List<BCNKHTDTK017KDTO> ts_BCNKHTDTK017K(final String maHQ,
			final int ky, final int thang, final int nam, final String loai_BC) {
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCNKHTDTK017KDTO>>() {

					public List<BCNKHTDTK017KDTO> execute(Connection conn)
							throws SQLException {

						List<BCNKHTDTK017KDTO> bc = new ArrayList<BCNKHTDTK017KDTO>();
						try {
							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BAOCAO_QD15.ts_BCNKHTDTK017K")
									+ "(?,?,?,?,?,?)}");

							callstatement.setString(1, maHQ);
							callstatement.setInt(2, ky);
							callstatement.setInt(3, thang);
							callstatement.setInt(4, nam);
							callstatement.setString(5, loai_BC);
							callstatement.registerOutParameter(6,
									OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement
									.getObject(6);

							while (rs.next()) {

								BCNKHTDTK017KDTO entity = new BCNKHTDTK017KDTO(
										loai_BC,
										rs.getLong("KY"), rs.getLong("THANG"),
										rs.getLong("NAM"),
										rs.getLong("SAPXEP"), rs
												.getString("CHUONG"), rs
												.getString("TEN_NHOM"), rs
												.getString("TEN_HANG"), rs
												.getDouble("TRIGIA_KY"), rs
												.getDouble("TRIGIA_LK"), rs
												.getDouble("HNTQ1_KY"), rs
												.getDouble("HNTQ1_LK"), rs
												.getDouble("HNTQ2_KY"), rs
												.getDouble("HNTQ2_LK"), rs
												.getDouble("HNTQ3_KY"), rs
												.getDouble("HNTQ3_LK"), rs
												.getDouble("HNTQ4_KY"), rs
												.getDouble("HNTQ4_LK"), rs
												.getDouble("TONG_HNTQ_KY"), rs
												.getDouble("TONG_HNTQ_LK"));

								bc.add(entity);
							}
						} catch (SQLException ex) {
							return bc;
						}
						return bc;
					}
				});
	}
	
	public List<BCNKHTDTK017K1DTO> ts_BCNKHTDTK017K1(final String maHQ,
			final int ky, final int thang, final int nam) {
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCNKHTDTK017K1DTO>>() {

					public List<BCNKHTDTK017K1DTO> execute(Connection conn)
							throws SQLException {

						List<BCNKHTDTK017K1DTO> bc = new ArrayList<BCNKHTDTK017K1DTO>();
						try {
							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BAOCAO_QD15.ts_BCNKHTDTK017K1")
									+ "(?,?,?,?,?)}");

							callstatement.setString(1, maHQ);
							callstatement.setInt(2, ky);
							callstatement.setInt(3, thang);
							callstatement.setInt(4, nam);
							callstatement.registerOutParameter(5,
									OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement
									.getObject(5);

							while (rs.next()) {

								BCNKHTDTK017K1DTO entity = new BCNKHTDTK017K1DTO(
										rs.getString("MA_HS"),
										rs.getString("TEN_HANG"),
										rs.getDouble("TRIGIA_KY"),
										rs.getDouble("TRIGIA_LK"));

								bc.add(entity);
							}
						} catch (SQLException ex) {
							return bc;
						}
						return bc;
					}
				});
	}

	public List<BCXKHH015KDTO> ts_BCXKHH015K(final String maHQ, final int ky,
			final int thang, final int nam, final String loai_BC) {
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCXKHH015KDTO>>() {

					public List<BCXKHH015KDTO> execute(Connection conn)
							throws SQLException {

						List<BCXKHH015KDTO> bc = new ArrayList<BCXKHH015KDTO>();
						try {
							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BAOCAO_QD15.ts_BCXKHH015K")
									+ "(?,?,?,?,?,?)}");

							callstatement.setString(1, maHQ);
							callstatement.setInt(2, ky);
							callstatement.setInt(3, thang);
							callstatement.setInt(4, nam);
							callstatement.setString(5, loai_BC);
							callstatement.registerOutParameter(6,
									OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement
									.getObject(6);

							while (rs.next()) {

								BCXKHH015KDTO entity = new BCXKHH015KDTO(ky,
										thang, nam, loai_BC, rs.getLong("STT"),
										rs.getLong("SAPXEP"), rs
												.getString("TEN_NHOM"), rs
												.getString("TEN_HANG"), rs
												.getString("TEN_DVT"), rs
												.getDouble("LUONG_KY"), rs
												.getDouble("TRIGIA_KY"), rs
												.getDouble("LUONG_LK"), rs
												.getDouble("TRIGIA_LK"));

								bc.add(entity);
							}
						} catch (SQLException ex) {
							return bc;
						}
						return bc;
					}
				});
	}

	public List<BCNKHH015KDTO> ts_BCNKHH015K(final String maHQ, final int ky,
			final int thang, final int nam, final String loai_BC) {
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCNKHH015KDTO>>() {

					public List<BCNKHH015KDTO> execute(Connection conn)
							throws SQLException {

						List<BCNKHH015KDTO> bc = new ArrayList<BCNKHH015KDTO>();
						try {
							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BAOCAO_QD15.ts_BCNKHH015K")
									+ "(?,?,?,?,?,?)}");

							callstatement.setString(1, maHQ);
							callstatement.setInt(2, ky);
							callstatement.setInt(3, thang);
							callstatement.setInt(4, nam);
							callstatement.setString(5, loai_BC);
							callstatement.registerOutParameter(6,
									OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement
									.getObject(6);

							while (rs.next()) {

								BCNKHH015KDTO entity = new BCNKHH015KDTO(ky,
										thang, nam, loai_BC, rs.getLong("STT"),
										rs.getLong("SAPXEP"), rs
												.getString("TEN_NHOM"), rs
												.getString("TEN_HANG"), rs
												.getString("TEN_DVT"), rs
												.getDouble("LUONG_KY"), rs
												.getDouble("TRIGIA_KY"), rs
												.getDouble("LUONG_LK"), rs
												.getDouble("TRIGIA_LK"));

								bc.add(entity);
							}
						} catch (SQLException ex) {
							return bc;
						}
						return bc;
					}
				});
	}

	public List<BCXNKTTP022TDTO> ts_BCXNKTTP022T(final String maHQ,
			final int thang, final int nam, final String loai_BC) {
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCXNKTTP022TDTO>>() {

					public List<BCXNKTTP022TDTO> execute(Connection conn)
							throws SQLException {

						List<BCXNKTTP022TDTO> bc = new ArrayList<BCXNKTTP022TDTO>();
						try {
							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BAOCAO_QD15.TS_BCXNKTTP022T")
									+ "(?,?,?,?,?)}");

							callstatement.setString(1, maHQ);
							callstatement.setInt(2, thang);
							callstatement.setInt(3, nam);
							callstatement.setString(4, loai_BC);
							callstatement.registerOutParameter(5,
									OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement
									.getObject(5);

							while (rs.next()) {

								BCXNKTTP022TDTO entity = new BCXNKTTP022TDTO(
										thang, nam, loai_BC, rs
												.getString("MATINHTP"), rs
												.getString("TENTINHTP"), rs
												.getDouble("TRIGIA_KY_XK"), rs
												.getDouble("TRIGIA_LK_XK"), rs
												.getDouble("TRIGIA_KY_NK"), rs
												.getDouble("TRIGIA_LK_NK"));

								bc.add(entity);
							}
						} catch (SQLException ex) {
							return bc;
						}
						return bc;
					}
				});
	}

	public List<BCXNKHHTT19TDTO> ts_BCXKHHTT18T(final String maHQ,
			final int thang, final int nam, final String loai_BC) {
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCXNKHHTT19TDTO>>() {

					public List<BCXNKHHTT19TDTO> execute(Connection conn)
							throws SQLException {

						List<BCXNKHHTT19TDTO> bc = new ArrayList<BCXNKHHTT19TDTO>();
						try {
							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BAOCAO_QD15.ts_BCXKHHTT18T")
									+ "(?,?,?,?,?)}");

							callstatement.setString(1, maHQ);							
							callstatement.setInt(2, thang);
							callstatement.setInt(3, nam);
							callstatement.setString(4, loai_BC);
							callstatement.registerOutParameter(5,
									OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement
									.getObject(5);

							while (rs.next()) {

								BCXNKHHTT19TDTO entity = new BCXNKHHTT19TDTO(
										rs.getLong("THANG"), rs.getLong("NAM"),
										rs.getString("NHX"), loai_BC, rs
												.getLong("STT"), rs
												.getLong("SAPXEP"), rs
												.getString("TEN_NHOM"), rs
												.getString("TEN_HANG"), rs
												.getString("TEN_DVT"), rs
												.getDouble("LUONG_KY"), rs
												.getDouble("TRIGIA_KY"), rs
												.getDouble("LUONG_LK"), rs
												.getDouble("TRIGIA_LK"));

								bc.add(entity);
							}
						} catch (SQLException ex) {
							return bc;
						}
						return bc;
					}
				});
	}

	public List<BCXNKHHTT19TDTO> ts_BCNKHHTT19T(final String maHQ,
			final int thang, final int nam, final String loai_BC) {
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCXNKHHTT19TDTO>>() {

					public List<BCXNKHHTT19TDTO> execute(Connection conn)
							throws SQLException {

						List<BCXNKHHTT19TDTO> bc = new ArrayList<BCXNKHHTT19TDTO>();
						try {
							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BAOCAO_QD15.ts_BCNKHHTT19T")
									+ "(?,?,?,?,?)}");

							callstatement.setString(1, maHQ);
							callstatement.setInt(2, thang);
							callstatement.setInt(3, nam);
							callstatement.setString(4, loai_BC);
							callstatement.registerOutParameter(5,
									OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement
									.getObject(5);

							while (rs.next()) {

								BCXNKHHTT19TDTO entity = new BCXNKHHTT19TDTO(
										rs.getLong("THANG"), rs.getLong("NAM"),
										rs.getString("NHX"), loai_BC, rs
												.getLong("STT"), rs
												.getLong("SAPXEP"), rs
												.getString("TEN_NHOM"), rs
												.getString("TEN_HANG"), rs
												.getString("TEN_DVT"), rs
												.getDouble("LUONG_KY"), rs
												.getDouble("TRIGIA_KY"), rs
												.getDouble("LUONG_LK"), rs
												.getDouble("TRIGIA_LK"));

								bc.add(entity);
							}
						} catch (SQLException ex) {
							return bc;
						}
						return bc;
					}
				});
	}
	
	public List<BCXKNUOCMHCY023TDTO> ts_BCXKNUOCMHCY023T(final String maHQ, final int thang,
			final int nam, final String loai_BC) {
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCXKNUOCMHCY023TDTO>>() {

					public List<BCXKNUOCMHCY023TDTO> execute(Connection conn)
							throws SQLException {
						
						List<BCXKNUOCMHCY023TDTO> bc = new ArrayList<BCXKNUOCMHCY023TDTO>();
						try{
						CallableStatement callstatement = conn.prepareCall("{call "
								+ Utils.readProperties("PK_BAOCAO_QD15.TS_BCXKNUOCMHCY023T")
								+ "(?,?,?,?,?)}");

						callstatement.setString(1, maHQ);
						callstatement.setInt(2, thang);
						callstatement.setInt(3, nam);
						callstatement.setString(4, loai_BC);
						callstatement.registerOutParameter(5,
								OracleTypes.CURSOR);
						
						
						callstatement.execute();

						ResultSet rs = (ResultSet) callstatement.getObject(5);

						while (rs.next()) {

							BCXKNUOCMHCY023TDTO entity = new BCXKNUOCMHCY023TDTO(
									thang,nam,loai_BC,
									rs.getInt("STT"),
									rs.getString("TEN_NUOC"),
									rs.getString("TEN_HANG"),
									rs.getString("TEN_DVT"),
									rs.getDouble("LUONG_KY"),
									rs.getDouble("TRIGIA_KY"), 
									rs.getDouble("LUONG_LK"), 
									rs.getDouble("TRIGIA_LK"),
									rs.getDouble("TONGTG_KY"),
									rs.getDouble("TONGTG_LK"));

							bc.add(entity);
						}
						} catch (SQLException ex) {
							return bc;
						}
						return bc;
					}
				});
	}
	
	public List<BCNKNUOCMHCY024TDTO> ts_BCNKNUOCMHCY024T(final String maHQ, final int thang,
			final int nam, final String loai_BC) {
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCNKNUOCMHCY024TDTO>>() {

					public List<BCNKNUOCMHCY024TDTO> execute(Connection conn)
							throws SQLException {
						
						List<BCNKNUOCMHCY024TDTO> bc = new ArrayList<BCNKNUOCMHCY024TDTO>();
						try{
						CallableStatement callstatement = conn.prepareCall("{call "
								+ Utils.readProperties("PK_BAOCAO_QD15.TS_BCNKNUOCMHCY024T")
								+ "(?,?,?,?,?)}");

						callstatement.setString(1, maHQ);
						callstatement.setInt(2, thang);
						callstatement.setInt(3, nam);
						callstatement.setString(4, loai_BC);
						callstatement.registerOutParameter(5,
								OracleTypes.CURSOR);
						
						
						callstatement.execute();

						ResultSet rs = (ResultSet) callstatement.getObject(5);

						while (rs.next()) {

							BCNKNUOCMHCY024TDTO entity = new BCNKNUOCMHCY024TDTO(
									thang,nam,loai_BC,
									rs.getInt("STT"),
									rs.getString("TEN_NUOC"),
									rs.getString("TEN_HANG"),
									rs.getString("TEN_DVT"),
									rs.getDouble("LUONG_KY"),
									rs.getDouble("TRIGIA_KY"), 
									rs.getDouble("LUONG_LK"), 
									rs.getDouble("TRIGIA_LK"),
									rs.getDouble("TONGTG_KY"),
									rs.getDouble("TONGTG_LK"));

							bc.add(entity);
						}
						} catch (SQLException ex) {
							return bc;
						}
						return bc;
					}
				});
	}
	
	public List<BCXKHHPTVT025HDTO> ts_BCXKHHPTVT025H(final String maHQ, final int ky,
			final int nam, final String loai_BC) {
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCXKHHPTVT025HDTO>>() {

					public List<BCXKHHPTVT025HDTO> execute(Connection conn)
							throws SQLException {
						
						List<BCXKHHPTVT025HDTO> bc = new ArrayList<BCXKHHPTVT025HDTO>();
						try{
						CallableStatement callstatement = conn.prepareCall("{call "
								+ Utils.readProperties("PK_BAOCAO_QD15.ts_BCXKHHPTVT025H")
								+ "(?,?,?,?,?)}");

						callstatement.setString(1, maHQ);
						callstatement.setInt(2, ky);
						callstatement.setInt(3, nam);
						callstatement.setString(4, loai_BC);
						callstatement.registerOutParameter(5,
								OracleTypes.CURSOR);
						
						
						callstatement.execute();

						ResultSet rs = (ResultSet) callstatement.getObject(5);

						while (rs.next()) {

							BCXKHHPTVT025HDTO entity = new BCXKHHPTVT025HDTO(
									ky,nam,loai_BC,
									rs.getString("MA_NHOM"),
									rs.getString("TEN_HANG"),
									rs.getString("TEN_DVT"),
									rs.getString("TEN_NUOC"),
									rs.getString("MA_PTVT"),
									rs.getString("TEN_PTVT"),
									rs.getDouble("LUONG"),
									rs.getDouble("TRIGIA_USD"));

							bc.add(entity);
						}
						} catch (SQLException ex) {
							return bc;
						}
						return bc;
					}
				});
	}
	
	public List<BCNKHHPTVT026HDTO> ts_BCNKHHPTVT026H(final String maHQ, final int ky,
			final int nam, final String loai_BC) {
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCNKHHPTVT026HDTO>>() {

					public List<BCNKHHPTVT026HDTO> execute(Connection conn)
							throws SQLException {
						
						List<BCNKHHPTVT026HDTO> bc = new ArrayList<BCNKHHPTVT026HDTO>();
						try{
						CallableStatement callstatement = conn.prepareCall("{call "
								+ Utils.readProperties("PK_BAOCAO_QD15.ts_BCNKHHPTVT026H")
								+ "(?,?,?,?,?)}");

						callstatement.setString(1, maHQ);
						callstatement.setInt(2, ky);
						callstatement.setInt(3, nam);
						callstatement.setString(4, loai_BC);
						callstatement.registerOutParameter(5,
								OracleTypes.CURSOR);
						
						
						callstatement.execute();

						ResultSet rs = (ResultSet) callstatement.getObject(5);

						while (rs.next()) {

							BCNKHHPTVT026HDTO entity = new BCNKHHPTVT026HDTO(
									ky,nam,loai_BC,
									rs.getString("MA_NHOM"),
									rs.getString("TEN_HANG"),
									rs.getString("TEN_DVT"),
									rs.getString("TEN_NUOC"),
									rs.getString("MA_PTVT"),
									rs.getString("TEN_PTVT"),
									rs.getDouble("LUONG"),
									rs.getDouble("TRIGIA_USD"));

							bc.add(entity);
						}
						} catch (SQLException ex) {
							return bc;
						}
						return bc;
					}
				});
	}
	
	public List<BCHTX27HDTO> ts_BCHTX27H(final String maHQ, final int ky,final int nam, 
			final String loai_BC) {
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCHTX27HDTO>>() {

					public List<BCHTX27HDTO> execute(Connection conn)
							throws SQLException {
						
						List<BCHTX27HDTO> bc = new ArrayList<BCHTX27HDTO>();
						try{
						CallableStatement callstatement = conn.prepareCall("{call "
								+ Utils.readProperties("PK_BAOCAO_QD15.ts_BCHTX27H")
								+ "(?,?,?,?,?)}");

						callstatement.setString(1, maHQ);
						callstatement.setInt(2, ky);
						callstatement.setInt(3, nam);
						callstatement.setString(4, loai_BC);
						callstatement.registerOutParameter(5,
								OracleTypes.CURSOR);
						
						
						callstatement.execute();

						ResultSet rs = (ResultSet) callstatement.getObject(5);

						while (rs.next()) {

							BCHTX27HDTO entity = new BCHTX27HDTO(
									rs.getInt("KY"),
									rs.getInt("NAM"),
									loai_BC,
									rs.getInt("STT"),
									rs.getInt("SAPXEP"),
									rs.getString("TEN_NHOM"),
									rs.getString("TEN_HANG"),
									rs.getString("TEN_DVT"),
									rs.getDouble("LUONG_KY"),
									rs.getDouble("TRIGIA_KY"),
									rs.getDouble("LUONG_LK"),
									rs.getDouble("TRIGIA_LK"));

							bc.add(entity);
						}
						} catch (SQLException ex) {
							System.out.println(ex);
							return bc;
						}
						return bc;
					}
				});
	}

	
	public List<BCUSBXKHHDTO> Ts_BCUSBXKHH(final String maHQ, final int thang, final int nam,
			final String loai_BC) {
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCUSBXKHHDTO>>() {

					public List<BCUSBXKHHDTO> execute(Connection conn)
							throws SQLException {

						List<BCUSBXKHHDTO> bc = new ArrayList<BCUSBXKHHDTO>();
						try {
							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BAOCAO_TCHQ.Ts_BCUSBXKHH")
									+ "(?,?,?,?,?)}");

							callstatement.setString(1, maHQ);
							callstatement.setInt(2, thang);
							callstatement.setInt(3, nam);
							callstatement.setString(4, loai_BC);
							callstatement.registerOutParameter(5, OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement.getObject(5);

							while (rs.next()) {

								BCUSBXKHHDTO entity = new BCUSBXKHHDTO(
										rs.getInt("THANG"), 
										rs.getInt("NAM"),
										rs.getInt("STT"),
										rs.getInt("SAPXEP"), 
										rs.getString("TEN_NHOM"), 
										rs.getString("TEN_HANG"), 
										rs.getString("TEN_DVT"), 
										rs.getDouble("LUONG_KY"), 
										rs.getDouble("TRIGIA_KY"), 
										rs.getDouble("LUONG_LK"), 
										rs.getDouble("TRIGIA_LK"),
										rs.getDouble("LUONG_KY_TT"), 
										rs.getDouble("TRIGIA_KY_TT"), 
										rs.getDouble("LUONG_LK_NT"), 
										rs.getDouble("TRIGIA_LK_NT"),
										rs.getDouble("LUONG_KY_SS"), 
										rs.getDouble("TRIGIA_KY_SS"), 
										rs.getDouble("LUONG_LK_SS"), 
										rs.getDouble("TRIGIA_LK_SS"));
								
								bc.add(entity);
							}
						} catch (SQLException ex) {
							return bc;
						}
						return bc;
					}
				});
	}

	public List<BCUSBXKHHDTO> Ts_BCUSBNKHH(final String maHQ, final int thang, final int nam,
			final String loai_BC) {
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCUSBXKHHDTO>>() {

					public List<BCUSBXKHHDTO> execute(Connection conn)
							throws SQLException {

						List<BCUSBXKHHDTO> bc = new ArrayList<BCUSBXKHHDTO>();
						try {
							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BAOCAO_TCHQ.Ts_BCUSBNKHH")
									+ "(?,?,?,?,?)}");

							callstatement.setString(1, maHQ);
							callstatement.setInt(2, thang);
							callstatement.setInt(3, nam);
							callstatement.setString(4, loai_BC);
							callstatement.registerOutParameter(5, OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement.getObject(5);

							while (rs.next()) {

								BCUSBXKHHDTO entity = new BCUSBXKHHDTO(
										rs.getInt("THANG"), 
										rs.getInt("NAM"),
										rs.getInt("STT"),
										rs.getInt("SAPXEP"), 
										rs.getString("TEN_NHOM"), 
										rs.getString("TEN_HANG"), 
										rs.getString("TEN_DVT"), 
										rs.getDouble("LUONG_KY"), 
										rs.getDouble("TRIGIA_KY"), 
										rs.getDouble("LUONG_LK"), 
										rs.getDouble("TRIGIA_LK"),
										rs.getDouble("LUONG_KY_TT"), 
										rs.getDouble("TRIGIA_KY_TT"), 
										rs.getDouble("LUONG_LK_NT"), 
										rs.getDouble("TRIGIA_LK_NT"),
										rs.getDouble("LUONG_KY_SS"), 
										rs.getDouble("TRIGIA_KY_SS"), 
										rs.getDouble("LUONG_LK_SS"), 
										rs.getDouble("TRIGIA_LK_SS"));
								
								bc.add(entity);
							}
						} catch (SQLException ex) {
							return bc;
						}
						return bc;
					}
				});
	}
	
	

	public List<BCSLDNTTTPDTO> ts_BCSLDNTTTP(final String maHQ, final int nam) {
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCSLDNTTTPDTO>>() {

					public List<BCSLDNTTTPDTO> execute(Connection conn)
							throws SQLException {

						List<BCSLDNTTTPDTO> bc = new ArrayList<BCSLDNTTTPDTO>();
						try {
							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BAOCAO_TCHQ.Ts_BCSLDNTTTP")
									+ "(?,?,?)}");

							callstatement.setString(1, maHQ);
							callstatement.setInt(2, nam);
							callstatement.registerOutParameter(3, OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement.getObject(3);

							while (rs.next()) {

								BCSLDNTTTPDTO entity = new BCSLDNTTTPDTO(
										rs.getString("Ma_Tinh"), 
										rs.getString("TENTINHTP"),
										rs.getLong("SO_LUONG"),
										rs.getLong("NAM"));
								
								bc.add(entity);
							}
						} catch (SQLException ex) {
							return bc;
						}
						return bc;
					}
				});
	}

	public List<BGHHNKTT55DTO> ts_BGHHNKTT55(final String maHQ, final int ky, final int thang, final int nam){
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BGHHNKTT55DTO>>() {
					public List<BGHHNKTT55DTO> execute(Connection conn)
							throws SQLException {

						List<BGHHNKTT55DTO> bc = new ArrayList<BGHHNKTT55DTO>();
						try {
							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BAOCAO_BTC.ts_BGHHNKTT55")
									+ "(?,?,?,?,?)}");

							callstatement.setString(1, maHQ);
							callstatement.setInt(2, ky);
							callstatement.setInt(3, thang);
							callstatement.setInt(4, nam);
							callstatement.registerOutParameter(5, OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement.getObject(5);

							while (rs.next()) {

								BGHHNKTT55DTO entity = new BGHHNKTT55DTO(
										rs.getInt("KY"), 
										rs.getInt("THANG"),
										rs.getInt("NAM"),
										rs.getInt("KY_TRUOC"), 
										rs.getInt("THANG_TRUOC"), 
										rs.getInt("NAM_TRUOC"),
										rs.getString("TEN_NUOC"), 
										rs.getString("CHUONG"), 
										rs.getString("TEN_CHUONG"), 
										rs.getString("MA_HS4SO"), 
										rs.getString("TEN_HANG4SO"), 
										rs.getString("MA_HS6SO"), 
										rs.getString("TEN_HANG6SO"),
										rs.getString("MA_HANGKB"),
										rs.getString("TEN_HANG"), 
										rs.getString("TEN_DVT"), 
										rs.getDouble("LUONG"), 
										rs.getDouble("TRIGIA"),
										rs.getDouble("LUONG_KYTRUOC"), 
										rs.getDouble("TRIGIA_KYTRUOC"));
								
								bc.add(entity);
							}
						} catch (SQLException ex) {
							return bc;
						}
						return bc;
					}
				});
	}
	
	public List<BCNKHHCOUDDTO> ts_BCNKHHCOUD(final String maHQ, final int quy, final int nam){
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCNKHHCOUDDTO>>() {

					public List<BCNKHHCOUDDTO> execute(Connection conn)
							throws SQLException {

						List<BCNKHHCOUDDTO> bc = new ArrayList<BCNKHHCOUDDTO>();
						try {
							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BAOCAO_BTC.ts_BCNKHHCOUD")
									+ "(?,?,?,?)}");

							callstatement.setString(1, maHQ);
							callstatement.setInt(2, quy);
							callstatement.setInt(3, nam);
							callstatement.registerOutParameter(4, OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement.getObject(4);

							while (rs.next()) {

								BCNKHHCOUDDTO entity = new BCNKHHCOUDDTO(
										
										rs.getInt("QUY"),
										rs.getInt("NAM"),
										rs.getString("MA_HANG"), 
										rs.getString("TEN_NUOC"), 										
										rs.getDouble("TRIGIA_DB"), 
										rs.getDouble("TYLE_DB"), 
										rs.getDouble("TRIGIA_TT"), 
										rs.getDouble("TYLE_TT"),
										rs.getDouble("TRIGIA_KH"), 
										rs.getDouble("TYLE_KH"));
								
								bc.add(entity);
							}
						} catch (SQLException ex) {
							return bc;
						}
						return bc;
					}
				});
	}
	
	public List<BCXNKTLHDNDTO> ts_BCXNKTLHDN(final String maCuc,final String maHQ, final int thang, final int nam){
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCXNKTLHDNDTO>>() {

					public List<BCXNKTLHDNDTO> execute(Connection conn)
							throws SQLException {

						List<BCXNKTLHDNDTO> bc = new ArrayList<BCXNKTLHDNDTO>();
						try {
							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BAOCAO_SLCHQ.ts_BCXNKTLHDN")
									+ "(?,?,?,?,?)}");

							callstatement.setString(1, maCuc);
							callstatement.setString(2, maHQ);
							callstatement.setInt(3, thang);							
							callstatement.setInt(4, nam);
							callstatement.registerOutParameter(5, OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement.getObject(5);

							while (rs.next()) {

								BCXNKTLHDNDTO entity = new BCXNKTLHDNDTO(
										rs.getInt("THANG"), 
										rs.getInt("NAM"),
										rs.getString("MA_CUC"), 
										rs.getString("TEN_CUC"), 
										rs.getString("MA_HQ"), 
										rs.getString("TEN_HQ"),
										rs.getDouble("TRIGIA_XK"), 
										rs.getDouble("TRIGIA_NK"), 
										rs.getInt("MA_NHOM_LHDN"),
										rs.getString("TEN_NHOM_LHDN"));
								
								bc.add(entity);
							}
						} catch (SQLException ex) {
							return bc;
						}
						return bc;
					}
				});
	}
	
	public List<BCXKTDNCYDTO> ts_BCXKTDNCY(final String maCuc, final int thang, final int nam){
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCXKTDNCYDTO>>() {

					public List<BCXKTDNCYDTO> execute(Connection conn)
							throws SQLException {

						List<BCXKTDNCYDTO> bc = new ArrayList<BCXKTDNCYDTO>();
						try {
							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BAOCAO_SLCHQ.ts_BCXKTDNCY")
									+ "(?,?,?,?)}");

							callstatement.setString(1, maCuc);							
							callstatement.setInt(2, thang);							
							callstatement.setInt(3, nam);
							callstatement.registerOutParameter(4, OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement.getObject(4);

							while (rs.next()) {

								BCXKTDNCYDTO entity = new BCXKTDNCYDTO(
										rs.getInt("THANG"), 
										rs.getInt("NAM"),
										rs.getString("TEN_CUC"),
										rs.getString("MA_DV"), 
										rs.getString("TEN_DV"), 
										rs.getDouble("TRI_GIA"), 
										rs.getInt("NHOM")
										);
								
								bc.add(entity);
							}
						} catch (SQLException ex) {
							return bc;
						}
						return bc;
					}
				});
	}
	
	public List<BCNKTDNCYDTO> ts_BCNKTDNCY(final String maCuc, final int thang, final int nam){
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCNKTDNCYDTO>>() {

					public List<BCNKTDNCYDTO> execute(Connection conn)
							throws SQLException {

						List<BCNKTDNCYDTO> bc = new ArrayList<BCNKTDNCYDTO>();
						try {
							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BAOCAO_SLCHQ.ts_BCNKTDNCY")
									+ "(?,?,?,?)}");

							callstatement.setString(1, maCuc);							
							callstatement.setInt(2, thang);							
							callstatement.setInt(3, nam);
							callstatement.registerOutParameter(4, OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement.getObject(4);

							while (rs.next()) {

								BCNKTDNCYDTO entity = new BCNKTDNCYDTO(
										rs.getInt("THANG"), 
										rs.getInt("NAM"),
										rs.getString("TEN_CUC"),
										rs.getString("MA_DV"), 
										rs.getString("TEN_DV"), 
										rs.getDouble("TRI_GIA"), 
										rs.getInt("NHOM")
										);
								
								bc.add(entity);
							}
						} catch (SQLException ex) {
							return bc;
						}
						return bc;
					}
				});
	}
	
	public List<BCXKMHCYTINHDTO> ts_BCXKMHCYTINH(final String tinTP, final int thang, final int nam){
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCXKMHCYTINHDTO>>() {

					public List<BCXKMHCYTINHDTO> execute(Connection conn)
							throws SQLException {

						List<BCXKMHCYTINHDTO> bc = new ArrayList<BCXKMHCYTINHDTO>();
						try {
							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BAOCAO_SLCHQ.ts_BCXKMHCYTINH")
									+ "(?,?,?,?)}");

							callstatement.setString(1, tinTP);							
							callstatement.setInt(2, thang);							
							callstatement.setInt(3, nam);
							callstatement.registerOutParameter(4, OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement.getObject(4);

							while (rs.next()) {

								BCXKMHCYTINHDTO entity = new BCXKMHCYTINHDTO(
										rs.getInt("THANG"), 
										rs.getInt("NAM"),
										rs.getString("TEN_TINHTP"),
										rs.getInt("STT"), 
										rs.getInt("SAPXEP"), 
										rs.getString("TEN_NHOM"), 
										rs.getString("TEN_HANG"),
										rs.getString("TEN_DVT"),
										rs.getDouble("LUONG"),
										rs.getDouble("TRIGIA"),
										rs.getDouble("LUONG_KYTRUOC"),
										rs.getDouble("TRIGIA_KYTRUOC"),
										rs.getDouble("LUONG_LK"),
										rs.getDouble("TRIGIA_LK"),
										rs.getDouble("LUONG_LK_KYTRUOC"),
										rs.getDouble("TRIGIA_LK_KYTRUOC")
										);
								
								bc.add(entity);
							}
						} catch (SQLException ex) {
							return bc;
						}
						return bc;
					}
				});
	}
	
	public List<BCXNKHHTNLHDTO> ts_BCXNKHHTNLH(final String maCuc, final int thang, final int nam, final int ma_nlh){
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCXNKHHTNLHDTO>>() {

					public List<BCXNKHHTNLHDTO> execute(Connection conn)
							throws SQLException {

						List<BCXNKHHTNLHDTO> bc = new ArrayList<BCXNKHHTNLHDTO>();
						try {
							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BAOCAO_SLCHQ.ts_BCXNKHHTNLH")
									+ "(?,?,?,?,?)}");

							callstatement.setString(1, maCuc);							
							callstatement.setInt(2, thang);							
							callstatement.setInt(3, nam);
							callstatement.setInt(4, ma_nlh);
							callstatement.registerOutParameter(5, OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement.getObject(5);

							while (rs.next()) {

								BCXNKHHTNLHDTO entity = new BCXNKHHTNLHDTO(
										rs.getInt("THANG"), 
										rs.getInt("NAM"),
										rs.getString("TEN_NHOM_LH"),					
										rs.getString("TEN_CUC"), 
										rs.getString("MA_HQ"),
										rs.getString("TEN_HQ"),
										rs.getDouble("TONG_SOTK_XK"),
										rs.getDouble("TONG_SOTK_NK"),
										rs.getDouble("TONG_TRIGIA_XK"),
										rs.getDouble("TONG_TRIGIA_NK")										
										);
								
								bc.add(entity);
							}
						} catch (SQLException ex) {
							return bc;
						}
						return bc;
					}
				});
	}
	
	public List<BCXKNUOCMHCYTINHDTO> ts_BCXKNUOCMHCYTINH(final String tinhTP, final int thang, final int nam){
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCXKNUOCMHCYTINHDTO>>() {

					public List<BCXKNUOCMHCYTINHDTO> execute(Connection conn)
							throws SQLException {

						List<BCXKNUOCMHCYTINHDTO> bc = new ArrayList<BCXKNUOCMHCYTINHDTO>();
						try {
							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BAOCAO_SLCHQ.ts_BCXKNUOCMHCYTINH")
									+ "(?,?,?,?)}");

							callstatement.setString(1, tinhTP);							
							callstatement.setInt(2, thang);							
							callstatement.setInt(3, nam);
							callstatement.registerOutParameter(4, OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement.getObject(4);

							while (rs.next()) {

								BCXKNUOCMHCYTINHDTO entity = new BCXKNUOCMHCYTINHDTO(
										rs.getInt("THANG"), 
										rs.getInt("NAM"),
										rs.getString("TEN_TINHTP"),					
										rs.getString("MA_NUOC"), 
										rs.getString("TEN_NUOC"),
										rs.getInt("STT"),
										rs.getInt("SAPXEP"),
										rs.getString("TEN_NHOM"), 
										rs.getString("TEN_HANG"),
										rs.getString("TEN_DVT"),
										rs.getDouble("LUONG"),
										rs.getDouble("TRIGIA"),
										rs.getDouble("LUONG_LK"),
										rs.getDouble("TRIGIA_LK")										
										);
								
								bc.add(entity);
							}
						} catch (SQLException ex) {
							return bc;
						}
						return bc;
					}
				});
	}
	
	public List<BCXKHHCUCHQDTO> ts_BCXKHHCUCHQ(final String maCuc, final int thang, final int nam){
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCXKHHCUCHQDTO>>() {

					public List<BCXKHHCUCHQDTO> execute(Connection conn)
							throws SQLException {

						List<BCXKHHCUCHQDTO> bc = new ArrayList<BCXKHHCUCHQDTO>();
						try {
							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BAOCAO_SLCHQ.ts_BCXKHHCUCHQ")
									+ "(?,?,?,?)}");

							callstatement.setString(1, maCuc);							
							callstatement.setInt(2, thang);							
							callstatement.setInt(3, nam);
							callstatement.registerOutParameter(4, OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement.getObject(4);

							while (rs.next()) {

								BCXKHHCUCHQDTO entity = new BCXKHHCUCHQDTO(
										rs.getInt("THANG"), 
										rs.getInt("NAM"),
										rs.getString("TEN_CUC"),					
										rs.getInt("STT"),
										rs.getInt("SAPXEP"),
										rs.getString("TEN_NHOM"), 
										rs.getString("TEN_HANG"),
										rs.getString("TEN_DVT"),
										rs.getDouble("LUONG_KY"),
										rs.getDouble("TRIGIA_KY"),
										rs.getDouble("LUONG_LK"),
										rs.getDouble("TRIGIA_LK"),
										rs.getDouble("LUONG_LK_NAMTRUOC"),
										rs.getDouble("TRIGIA_LK_NAMTRUOC"),
										rs.getDouble("LUONG_KY_KH"),
										rs.getDouble("TRIGIA_KY_KH"),
										rs.getDouble("LUONG_LK_KH"),
										rs.getDouble("TRIGIA_LK_KH"),
										rs.getDouble("LUONG_LK_NAMTRUOC_KH"),
										rs.getDouble("TRIGIA_LK_NAMTRUOC_KH")
										);
								
								bc.add(entity);
							}
						} catch (SQLException ex) {
							return bc;
						}
						return bc;
					}
				});
	}
	
	public List<BCNKHHCUCHQDTO> ts_BCNKHHCUCHQ(final String maCuc, final int thang, final int nam){
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCNKHHCUCHQDTO>>() {

					public List<BCNKHHCUCHQDTO> execute(Connection conn)
							throws SQLException {

						List<BCNKHHCUCHQDTO> bc = new ArrayList<BCNKHHCUCHQDTO>();
						try {
							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BAOCAO_SLCHQ.ts_BCNKHHCUCHQ")
									+ "(?,?,?,?)}");

							callstatement.setString(1, maCuc);							
							callstatement.setInt(2, thang);							
							callstatement.setInt(3, nam);
							callstatement.registerOutParameter(4, OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement.getObject(4);

							while (rs.next()) {

								BCNKHHCUCHQDTO entity = new BCNKHHCUCHQDTO(
										rs.getInt("THANG"), 
										rs.getInt("NAM"),
										rs.getString("TEN_CUC"),					
										rs.getInt("STT"),
										rs.getInt("SAPXEP"),
										rs.getString("TEN_NHOM"), 
										rs.getString("TEN_HANG"),
										rs.getString("TEN_DVT"),
										rs.getDouble("LUONG_KY"),
										rs.getDouble("TRIGIA_KY"),
										rs.getDouble("LUONG_LK"),
										rs.getDouble("TRIGIA_LK"),
										rs.getDouble("LUONG_LK_NAMTRUOC"),
										rs.getDouble("TRIGIA_LK_NAMTRUOC"),
										rs.getDouble("LUONG_KY_KH"),
										rs.getDouble("TRIGIA_KY_KH"),
										rs.getDouble("LUONG_LK_KH"),
										rs.getDouble("TRIGIA_LK_KH"),
										rs.getDouble("LUONG_LK_NAMTRUOC_KH"),
										rs.getDouble("TRIGIA_LK_NAMTRUOC_KH")
										);
								
								bc.add(entity);
							}
						} catch (SQLException ex) {
							return bc;
						}
						return bc;
					}
				});
	}
	
	public List<BCXKHHTTTCHQDTO> ts_BCXKHHTTTCHQ(final String maHQ,
			final int thang, final int nam, final String loai_BC) {
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCXKHHTTTCHQDTO>>() {

					public List<BCXKHHTTTCHQDTO> execute(Connection conn)
							throws SQLException {

						List<BCXKHHTTTCHQDTO> bc = new ArrayList<BCXKHHTTTCHQDTO>();
						try {
							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BAOCAO_TCHQ.ts_BCXKHHTTTCHQ")
									+ "(?,?,?,?,?)}");

							callstatement.setString(1, maHQ);							
							callstatement.setInt(2, thang);
							callstatement.setInt(3, nam);
							callstatement.setString(4, loai_BC);
							callstatement.registerOutParameter(5,
									OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement
									.getObject(5);

							while (rs.next()) {

								BCXKHHTTTCHQDTO entity = new BCXKHHTTTCHQDTO(
										rs.getLong("THANG"), rs.getLong("NAM"),
										rs.getString("NHX"), loai_BC, rs
												.getLong("STT"), rs
												.getLong("SAPXEP"), rs
												.getString("TEN_NHOM"), rs
												.getString("TEN_HANG"), rs
												.getString("TEN_DVT"), rs
												.getDouble("LUONG_KY"), rs
												.getDouble("TRIGIA_KY"), rs
												.getDouble("LUONG_LK"), rs
												.getDouble("TRIGIA_LK"),rs
												.getDouble("LUONG_KYTRUOC"), rs
												.getDouble("TRIGIA_KYTRUOC"), rs
												.getDouble("LUONG_LK_KYTRUOC"), rs
												.getDouble("TRIGIA_LK_KYTRUOC"));

								bc.add(entity);
							}
						} catch (SQLException ex) {
							return bc;
						}
						return bc;
					}
				});
	}
	
	public List<BCXKHHTTTCHQDTO> ts_BCNKHHTTTCHQ(final String maHQ,
			final int thang, final int nam, final String loai_BC) {
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCXKHHTTTCHQDTO>>() {

					public List<BCXKHHTTTCHQDTO> execute(Connection conn)
							throws SQLException {

						List<BCXKHHTTTCHQDTO> bc = new ArrayList<BCXKHHTTTCHQDTO>();
						try {
							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BAOCAO_TCHQ.ts_BCNKHHTTTCHQ")
									+ "(?,?,?,?,?)}");

							callstatement.setString(1, maHQ);							
							callstatement.setInt(2, thang);
							callstatement.setInt(3, nam);
							callstatement.setString(4, loai_BC);
							callstatement.registerOutParameter(5,
									OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement
									.getObject(5);

							while (rs.next()) {

								BCXKHHTTTCHQDTO entity = new BCXKHHTTTCHQDTO(
										rs.getLong("THANG"), rs.getLong("NAM"),
										rs.getString("NHX"), loai_BC, rs
												.getLong("STT"), rs
												.getLong("SAPXEP"), rs
												.getString("TEN_NHOM"), rs
												.getString("TEN_HANG"), rs
												.getString("TEN_DVT"), rs
												.getDouble("LUONG_KY"), rs
												.getDouble("TRIGIA_KY"), rs
												.getDouble("LUONG_LK"), rs
												.getDouble("TRIGIA_LK"),rs
												.getDouble("LUONG_KYTRUOC"), rs
												.getDouble("TRIGIA_KYTRUOC"), rs
												.getDouble("LUONG_LK_KYTRUOC"), rs
												.getDouble("TRIGIA_LK_KYTRUOC"));

								bc.add(entity);
							}
						} catch (SQLException ex) {
							return bc;
						}
						return bc;
					}
				});
	}
	
	public List<BCXKMHCYTPTVTTCHQDTO> ts_BCXKMHCYTPTVTTCHQ(final int ky,
			final int thang, final int nam) {
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCXKMHCYTPTVTTCHQDTO>>() {

					public List<BCXKMHCYTPTVTTCHQDTO> execute(Connection conn)
							throws SQLException {

						List<BCXKMHCYTPTVTTCHQDTO> bc = new ArrayList<BCXKMHCYTPTVTTCHQDTO>();
						try {
							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BAOCAO_TCHQ.ts_BCXKMHCYTPTVTTCHQ")
									+ "(?,?,?,?)}");

							callstatement.setInt(1, ky);							
							callstatement.setInt(2, thang);
							callstatement.setInt(3, nam);
							callstatement.registerOutParameter(4,
									OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement
									.getObject(4);

							while (rs.next()) {

								BCXKMHCYTPTVTTCHQDTO entity = new BCXKMHCYTPTVTTCHQDTO(
										rs.getInt("KY"),
										rs.getInt("THANG"),
										rs.getInt("NAM"),
										rs.getString("MA_PTVT"),
										rs.getString("TEN_PTVT"),
										rs.getInt("STT"), 
										rs.getInt("SAPXEP"),
										rs.getString("TEN_NHOM"),
										rs.getString("TEN_HANG"),
										rs.getString("TEN_DVT"),
										rs.getDouble("LUONG_KY"),
										rs.getDouble("TRIGIA_KY"),
										rs.getDouble("LUONG_LK"),
										rs.getDouble("TRIGIA_LK"));
										

								bc.add(entity);
							}
						} catch (SQLException ex) {
							return bc;
						}
						return bc;
					}
				});
	}

	public List<BCXKMHCYTPTVTTCHQDTO> ts_BCNKMHCYTPTVTTCHQ(final int ky,
			final int thang, final int nam) {
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCXKMHCYTPTVTTCHQDTO>>() {

					public List<BCXKMHCYTPTVTTCHQDTO> execute(Connection conn)
							throws SQLException {

						List<BCXKMHCYTPTVTTCHQDTO> bc = new ArrayList<BCXKMHCYTPTVTTCHQDTO>();
						try {
							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BAOCAO_TCHQ.ts_BCNKMHCYTPTVTTCHQ")
									+ "(?,?,?,?)}");

							callstatement.setInt(1, ky);							
							callstatement.setInt(2, thang);
							callstatement.setInt(3, nam);
							callstatement.registerOutParameter(4,
									OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement
									.getObject(4);

							while (rs.next()) {

								BCXKMHCYTPTVTTCHQDTO entity = new BCXKMHCYTPTVTTCHQDTO(
										rs.getInt("KY"),
										rs.getInt("THANG"),
										rs.getInt("NAM"),
										rs.getString("MA_PTVT"),
										rs.getString("TEN_PTVT"),
										rs.getInt("STT"), 
										rs.getInt("SAPXEP"),
										rs.getString("TEN_NHOM"),
										rs.getString("TEN_HANG"),
										rs.getString("TEN_DVT"),
										rs.getDouble("LUONG_KY"),
										rs.getDouble("TRIGIA_KY"),
										rs.getDouble("LUONG_LK"),
										rs.getDouble("TRIGIA_LK"));
										

								bc.add(entity);
							}
						} catch (SQLException ex) {
							return bc;
						}
						return bc;
					}
				});
	}
	
	public List<BCXKMHCYTPTVTTCHQQUYDTO> ts_BCXKMHCYTPTVTTCHQQUY(final int quy, final int nam) {
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCXKMHCYTPTVTTCHQQUYDTO>>() {

					public List<BCXKMHCYTPTVTTCHQQUYDTO> execute(Connection conn)
							throws SQLException {

						List<BCXKMHCYTPTVTTCHQQUYDTO> bc = new ArrayList<BCXKMHCYTPTVTTCHQQUYDTO>();
						try {
							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BAOCAO_TCHQ.ts_BCXKMHCYTPTVTTCHQQUY")
									+ "(?,?,?)}");

							callstatement.setInt(1, quy);							
							callstatement.setInt(2, nam);
							callstatement.registerOutParameter(3,
									OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement
									.getObject(3);

							while (rs.next()) {

								BCXKMHCYTPTVTTCHQQUYDTO entity = new BCXKMHCYTPTVTTCHQQUYDTO(
										rs.getInt("QUY"),
										rs.getInt("NAM"),
										rs.getString("MA_PTVT"),
										rs.getString("TEN_PTVT"),
										rs.getInt("STT"), 
										rs.getInt("SAPXEP"),
										rs.getString("TEN_NHOM"),
										rs.getString("TEN_HANG"),
										rs.getString("TEN_DVT"),
										rs.getDouble("LUONG_KY"),
										rs.getDouble("TRIGIA_KY"),
										rs.getDouble("LUONG_LK"),
										rs.getDouble("TRIGIA_LK"));
										

								bc.add(entity);
							}
						} catch (SQLException ex) {
							return bc;
						}
						return bc;
					}
				});
	}
	
	public List<BCXKMHCYTPTVTTCHQQUYDTO> ts_BCNKMHCYTPTVTTCHQQUY(final int quy, final int nam) {
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCXKMHCYTPTVTTCHQQUYDTO>>() {

					public List<BCXKMHCYTPTVTTCHQQUYDTO> execute(Connection conn)
							throws SQLException {

						List<BCXKMHCYTPTVTTCHQQUYDTO> bc = new ArrayList<BCXKMHCYTPTVTTCHQQUYDTO>();
						try {
							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BAOCAO_TCHQ.ts_BCNKMHCYTPTVTTCHQQUY")
									+ "(?,?,?)}");

							callstatement.setInt(1, quy);							
							callstatement.setInt(2, nam);
							callstatement.registerOutParameter(3,
									OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement
									.getObject(3);

							while (rs.next()) {

								BCXKMHCYTPTVTTCHQQUYDTO entity = new BCXKMHCYTPTVTTCHQQUYDTO(
										rs.getInt("QUY"),
										rs.getInt("NAM"),
										rs.getString("MA_PTVT"),
										rs.getString("TEN_PTVT"),
										rs.getInt("STT"), 
										rs.getInt("SAPXEP"),
										rs.getString("TEN_NHOM"),
										rs.getString("TEN_HANG"),
										rs.getString("TEN_DVT"),
										rs.getDouble("LUONG_KY"),
										rs.getDouble("TRIGIA_KY"),
										rs.getDouble("LUONG_LK"),
										rs.getDouble("TRIGIA_LK"));
										

								bc.add(entity);
							}
						} catch (SQLException ex) {
							return bc;
						}
						return bc;
					}
				});
	}

	public List<TTGXKPTVTDTO> ts_TTGXKTPTVT(final String maHQ, final int quy, final int nam) {
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<TTGXKPTVTDTO>>() {

					public List<TTGXKPTVTDTO> execute(Connection conn)
							throws SQLException {

						List<TTGXKPTVTDTO> list = new ArrayList<TTGXKPTVTDTO>();
						TTGXKPTVTDTO entity = new TTGXKPTVTDTO();
						Double tongLuong = 0D, tongTrigia = 0D, tongLuongLuyke = 0D, tongTrigiaLuyke = 0D;
						
						try {
							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BAOCAO_TCHQ.ts_TTGXKTPTVT")
									+ "(?,?,?,?)}");

							callstatement.setString(1, maHQ);							
							callstatement.setInt(2, quy);
							callstatement.setInt(3, nam);
							callstatement.registerOutParameter(4, OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement.getObject(4);

							while (rs.next()) {
								entity = new TTGXKPTVTDTO();
								entity.setLoai(rs.getString("NHOM_PTVT"));
								entity.setTotalLuong(rs.getDouble("totalLuong"));
								entity.setTotalTrigia(rs.getDouble("totalTrigia"));
								entity.setTotalLuongLuyke(rs.getDouble("totalLuongLuyke"));
								entity.setTotalTrigiaLuyke(rs.getDouble("totalTrigiaLuyke"));
								
								tongLuong += entity.getTotalLuong();
								tongTrigia += entity.getTotalTrigia();
								tongLuongLuyke += entity.getTotalLuongLuyke();
								tongTrigiaLuyke += entity.getTotalTrigiaLuyke();
								
								list.add(entity);
							}
							
							entity = new TTGXKPTVTDTO();
							entity.setLoai("Tổng cộng");
							entity.setTotalLuong(tongLuong);
							entity.setTotalTrigia(tongTrigia);
							entity.setTotalLuongLuyke(tongLuongLuyke);
							entity.setTotalTrigiaLuyke(tongTrigiaLuyke);
							list.add(entity);
						} catch (SQLException ex) {
							ex.printStackTrace();
							return list;
						}
						return list;
					}
				});
	}
	
	public List<TTGXKPTVTDTO> ts_TTGNKTPTVT(final String maHQ, final int quy, final int nam) {
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<TTGXKPTVTDTO>>() {

					public List<TTGXKPTVTDTO> execute(Connection conn)
							throws SQLException {

						List<TTGXKPTVTDTO> list = new ArrayList<TTGXKPTVTDTO>();
						TTGXKPTVTDTO entity = new TTGXKPTVTDTO();
						Double tongLuong = 0D, tongTrigia = 0D, tongLuongLuyke = 0D, tongTrigiaLuyke = 0D;
						
						try {
							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BAOCAO_TCHQ.ts_TTGNKTPTVT")
									+ "(?,?,?,?)}");

							callstatement.setString(1, maHQ);							
							callstatement.setInt(2, quy);
							callstatement.setInt(3, nam);
							callstatement.registerOutParameter(4, OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement.getObject(4);

							while (rs.next()) {
								entity = new TTGXKPTVTDTO();
								entity.setLoai(rs.getString("NHOM_PTVT"));
								entity.setTotalLuong(rs.getDouble("totalLuong"));
								entity.setTotalTrigia(rs.getDouble("totalTrigia"));
								entity.setTotalLuongLuyke(rs.getDouble("totalLuongLuyke"));
								entity.setTotalTrigiaLuyke(rs.getDouble("totalTrigiaLuyke"));
								
								tongLuong += entity.getTotalLuong();
								tongTrigia += entity.getTotalTrigia();
								tongLuongLuyke += entity.getTotalLuongLuyke();
								tongTrigiaLuyke += entity.getTotalTrigiaLuyke();
								
								list.add(entity);
							}
							
							entity = new TTGXKPTVTDTO();
							entity.setLoai("Tổng cộng");
							entity.setTotalLuong(tongLuong);
							entity.setTotalTrigia(tongTrigia);
							entity.setTotalLuongLuyke(tongLuongLuyke);
							entity.setTotalTrigiaLuyke(tongTrigiaLuyke);
							list.add(entity);
						} catch (SQLException ex) {
							ex.printStackTrace();
							return list;
						}
						return list;
					}
				});
	}
	
	public List<BCTTXNKTCCHQDTO> ts_BCTTXNKTCCHQ(final int nam) {
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCTTXNKTCCHQDTO>>() {

					public List<BCTTXNKTCCHQDTO> execute(Connection conn)
							throws SQLException {

						List<BCTTXNKTCCHQDTO> bc = new ArrayList<BCTTXNKTCCHQDTO>();
						try {
							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BAOCAO_TCHQ.ts_BCTTXNKTCCHQ")
									+ "(?,?)}");
						
							callstatement.setInt(1, nam);
							callstatement.registerOutParameter(2,
									OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement
									.getObject(2);

							while (rs.next()) {

								BCTTXNKTCCHQDTO entity = new BCTTXNKTCCHQDTO(
										rs.getInt("NAM"),
										rs.getString("MA_CUC"),
										rs.getString("TEN_CUC"),
										rs.getString("MA_HQ"), 
										rs.getString("TEN_HQ"),
										rs.getLong("SO_LUONG_DN"),
										rs.getLong("SO_LUONG_TK"),
										rs.getDouble("TRIGIA_XNK"));
								
								bc.add(entity);
							}
						} catch (SQLException ex) {
							return bc;
						}
						return bc;
					}
				});
	}
	
	public List<BCTGNKCHIUTHUECUCHQDTO> ts_BCTGNKCHIUTHUECUCHQ(final String maCuc,final int thang,final int nam) {
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCTGNKCHIUTHUECUCHQDTO>>() {

					public List<BCTGNKCHIUTHUECUCHQDTO> execute(Connection conn)
							throws SQLException {

						List<BCTGNKCHIUTHUECUCHQDTO> bc = new ArrayList<BCTGNKCHIUTHUECUCHQDTO>();
						try {
							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BAOCAO_TCHQ.ts_BCTGNKCHIUTHUECUCHQ")
									+ "(?,?,?,?)}");
						
							callstatement.setString(1, maCuc);
							callstatement.setInt(2, thang);
							callstatement.setInt(3, nam);
							callstatement.registerOutParameter(4,
									OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement
									.getObject(4);

							while (rs.next()) {

								BCTGNKCHIUTHUECUCHQDTO entity = new BCTGNKCHIUTHUECUCHQDTO(
										rs.getInt("THANG"),
										rs.getInt("NAM"), 
										rs.getString("MA_CUC"), 
										rs.getString("TEN_CUC"),
										rs.getInt("STT"), 
										rs.getInt("SAPXEP"), 
										rs.getString("TEN_NHOM"), 
										rs.getString("TEN_HANG"), 
										rs.getString("TEN_DVT"),
										rs.getDouble("LUONG_KY_CHUNG"),
										rs.getDouble("TRIGIA_KY_CHUNG"),
										rs.getDouble("LUONG_KY_CHUNG_THANGTRUOC"),
										rs.getDouble("TRIGIA_KY_CHUNG_THANGTRUOC"),
										rs.getDouble("LUONG_KY_CHIUTHUE"),
										rs.getDouble("TRIGIA_KY_CHIUTHUE"),
										rs.getDouble("LUONG_KY_CHIUTHUE_THANGTRUOC"),
										rs.getDouble("TRIGIA_KY_CHIUTHUE_THANGTRUOC"),
										rs.getDouble("LUONG_LK_CHUNG"),
										rs.getDouble("TRIGIA_LK_CHUNG"),
										rs.getDouble("LUONG_LK_CHUNG_NAMTRUOC"),
										rs.getDouble("TRIGIA_LK_CHUNG_NAMTRUOC"),
										rs.getDouble("LUONG_LK_CHIUTHUE"),
										rs.getDouble("TRIGIA_LK_CHIUTHUE"),
										rs.getDouble("LUONG_LK_CHIUTHUE_NAMTRUOC"),
										rs.getDouble("TRIGIA_LK_CHIUTHUE_NAMTRUOC"),
										rs.getDouble("THUE_XNK_THANG"),
										rs.getDouble("THUE_VA_THANG"),
										rs.getDouble("THUE_TD_THANG"),
										rs.getDouble("THUE_MT_THANG"),
										rs.getDouble("THUE_TV_THANG"),
										rs.getDouble("THUE_CLG_THANG"),
										rs.getDouble("THUE_XNK_THANGTRUOC"),
										rs.getDouble("THUE_VA_THANGTRUOC"),
										rs.getDouble("THUE_TD_THANGTRUOC"),
										rs.getDouble("THUE_MT_THANGTRUOC"),
										rs.getDouble("THUE_TV_THANGTRUOC"),
										rs.getDouble("THUE_CLG_THANGTRUOC"),
										rs.getDouble("THUE_XNK_LK"),
										rs.getDouble("THUE_VA_LK"),
										rs.getDouble("THUE_TD_LK"),
										rs.getDouble("THUE_MT_LK"),
										rs.getDouble("THUE_TV_LK"),
										rs.getDouble("THUE_CLG_LK"),
										rs.getDouble("THUE_XNK_LK_NAMTRUOC"),
										rs.getDouble("THUE_VA_LK_NAMTRUOC"),
										rs.getDouble("THUE_TD_LK_NAMTRUOC"),
										rs.getDouble("THUE_MT_LK_NAMTRUOC"),
										rs.getDouble("THUE_TV_LK_NAMTRUOC"),
										rs.getDouble("THUE_CLG_LK_NAMTRUOC"));
								bc.add(entity);
							}
						} catch (SQLException ex) {
							return bc;
						}
						return bc;
					}
				});
	}
	
	public List<BCTGNKCHIUTHUECUCHQDTO> ts_BCTGXKCHIUTHUECUCHQ(final String maCuc,final int thang,final int nam) {
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCTGNKCHIUTHUECUCHQDTO>>() {

					public List<BCTGNKCHIUTHUECUCHQDTO> execute(Connection conn)
							throws SQLException {

						List<BCTGNKCHIUTHUECUCHQDTO> bc = new ArrayList<BCTGNKCHIUTHUECUCHQDTO>();
						try {
							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BAOCAO_TCHQ.ts_BCTGXKCHIUTHUECUCHQ")
									+ "(?,?,?,?)}");
						
							callstatement.setString(1, maCuc);
							callstatement.setInt(2, thang);
							callstatement.setInt(3, nam);
							callstatement.registerOutParameter(4,
									OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement
									.getObject(4);

							while (rs.next()) {

								BCTGNKCHIUTHUECUCHQDTO entity = new BCTGNKCHIUTHUECUCHQDTO(
										rs.getInt("THANG"),
										rs.getInt("NAM"), 
										rs.getString("MA_CUC"), 
										rs.getString("TEN_CUC"),
										rs.getInt("STT"), 
										rs.getInt("SAPXEP"), 
										rs.getString("TEN_NHOM"), 
										rs.getString("TEN_HANG"), 
										rs.getString("TEN_DVT"),
										rs.getDouble("LUONG_KY_CHUNG"),
										rs.getDouble("TRIGIA_KY_CHUNG"),
										rs.getDouble("LUONG_KY_CHUNG_THANGTRUOC"),
										rs.getDouble("TRIGIA_KY_CHUNG_THANGTRUOC"),
										rs.getDouble("LUONG_KY_CHIUTHUE"),
										rs.getDouble("TRIGIA_KY_CHIUTHUE"),
										rs.getDouble("LUONG_KY_CHIUTHUE_THANGTRUOC"),
										rs.getDouble("TRIGIA_KY_CHIUTHUE_THANGTRUOC"),
										rs.getDouble("LUONG_LK_CHUNG"),
										rs.getDouble("TRIGIA_LK_CHUNG"),
										rs.getDouble("LUONG_LK_CHUNG_NAMTRUOC"),
										rs.getDouble("TRIGIA_LK_CHUNG_NAMTRUOC"),
										rs.getDouble("LUONG_LK_CHIUTHUE"),
										rs.getDouble("TRIGIA_LK_CHIUTHUE"),
										rs.getDouble("LUONG_LK_CHIUTHUE_NAMTRUOC"),
										rs.getDouble("TRIGIA_LK_CHIUTHUE_NAMTRUOC"),
										rs.getDouble("THUE_XNK_THANG"),
										rs.getDouble("THUE_VA_THANG"),
										rs.getDouble("THUE_TD_THANG"),
										rs.getDouble("THUE_MT_THANG"),
										rs.getDouble("THUE_TV_THANG"),
										rs.getDouble("THUE_CLG_THANG"),
										rs.getDouble("THUE_XNK_THANGTRUOC"),
										rs.getDouble("THUE_VA_THANGTRUOC"),
										rs.getDouble("THUE_TD_THANGTRUOC"),
										rs.getDouble("THUE_MT_THANGTRUOC"),
										rs.getDouble("THUE_TV_THANGTRUOC"),
										rs.getDouble("THUE_CLG_THANGTRUOC"),
										rs.getDouble("THUE_XNK_LK"),
										rs.getDouble("THUE_VA_LK"),
										rs.getDouble("THUE_TD_LK"),
										rs.getDouble("THUE_MT_LK"),
										rs.getDouble("THUE_TV_LK"),
										rs.getDouble("THUE_CLG_LK"),
										rs.getDouble("THUE_XNK_LK_NAMTRUOC"),
										rs.getDouble("THUE_VA_LK_NAMTRUOC"),
										rs.getDouble("THUE_TD_LK_NAMTRUOC"),
										rs.getDouble("THUE_MT_LK_NAMTRUOC"),
										rs.getDouble("THUE_TV_LK_NAMTRUOC"),
										rs.getDouble("THUE_CLG_LK_NAMTRUOC"));
								bc.add(entity);
							}
						} catch (SQLException ex) {
							return bc;
						}
						return bc;
					}
				});
	}
}
