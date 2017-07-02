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

import com.tkhq.cmc.dto.BCT_BO_NGANH_NUOC_TRIGIADTO;
import com.tkhq.cmc.dto.BCT_BO_NGANH_TGXN_CATRA;
import com.tkhq.cmc.dto.BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO;
import com.tkhq.cmc.utils.Utils;

@Repository
public class BaoCaoTheoBoNganh01DAOImpl implements BaoCaoTheoBoNganh01DAO {
	
	@Autowired
	private SessionFactory sessionFactory;	
	public List<BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO> TS_TGXN_MOTSO_MATHANG(final String maHQ ,final int thang, final int nam, final String loaiXN){
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO>>() {

					public List<BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO> execute(Connection conn) {

						List<BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO> bc = new ArrayList<BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO>();
						try {

							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BC_THEO_BO_NGANH_01.TS_TONG_TGNHAP_MOTSO_MATHANG")
									+ "(?,?,?,?,?)}");
							
							callstatement.setString(1, maHQ);
							callstatement.setInt(2, thang);
							callstatement.setInt(3, nam);
							callstatement.setString(4, loaiXN);
							callstatement.registerOutParameter(5,
									OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement
									.getObject(5);	
							
							while (rs.next()) {
								BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO entity = 
										new BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO(loaiXN, thang, nam, 
												rs.getString("NUOC_XX"), "", "", "", 0, rs.getDouble("TRIGIA_USD_TK"));
								bc.add(entity);
							}
						} catch (SQLException ex) {
							System.out.println(ex.getMessage()+"||"+ex);
							return bc;
						} 
						return bc;
					}
				});
	}
	
	public List<BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO> TS_TGXN_MOTSO_MATHANG01(final String maHQ ,final int thang, final int nam, final String loaiXN){
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO>>() {

					public List<BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO> execute(Connection conn) {

						List<BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO> bc = new ArrayList<BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO>();
						try {

							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BC_THEO_BO_NGANH_01.TS_TONG_TGNHAP_MOTSO_MATHANG01")
									+ "(?,?,?,?,?)}");
							
							callstatement.setString(1, maHQ);
							callstatement.setInt(2, thang);
							callstatement.setInt(3, nam);
							callstatement.setString(4, loaiXN);
							callstatement.registerOutParameter(5,
									OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement
									.getObject(5);	
							
							while (rs.next()) {
								BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO entity = 
										new BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO(loaiXN, thang, nam, 
												rs.getString("NUOC_XX"), "", "", "", 0, rs.getDouble("TRIGIA_USD_TK"));
								bc.add(entity);
							}
						} catch (SQLException ex) {
							System.out.println(ex.getMessage()+"||"+ex);
							return bc;
						} 
						return bc;
					}
				});
	}
	
	public List<BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO> TS_TGXUAT_TUIXACH_THITRUONG(final String maHQ ,final int thang, final int nam, final String loaiXN){
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO>>() {

					public List<BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO> execute(Connection conn) {

						List<BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO> bc = new ArrayList<BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO>();
						try {

							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BC_THEO_BO_NGANH_01.TS_TGXUAT_TUIXACH_THITRUONG")
									+ "(?,?,?,?,?)}");
							
							callstatement.setString(1, maHQ);
							callstatement.setInt(2, thang);
							callstatement.setInt(3, nam);
							callstatement.setString(4, loaiXN);
							callstatement.registerOutParameter(5,
									OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement
									.getObject(5);	
							
							while (rs.next()) {
								BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO entity = 
										new BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO(loaiXN, thang, nam, 
												"", rs.getString("NUOC_NK"), "", "", 0, rs.getDouble("TRIGIA_USD_TK"));
								bc.add(entity);
							}
						} catch (SQLException ex) {
							System.out.println(ex.getMessage()+"||"+ex);
							return bc;
						} 
						return bc;
					}
				});
	}
	
	public List<BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO> TS_TGXUAT_TUIXACH_HS(final String maHQ ,final int thang, final int nam, final String loaiXN){
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO>>() {

					public List<BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO> execute(Connection conn) {

						List<BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO> bc = new ArrayList<BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO>();
						try {

							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BC_THEO_BO_NGANH_01.TS_TGXUAT_TUIXACH_HS")
									+ "(?,?,?,?,?)}");
							
							callstatement.setString(1, maHQ);
							callstatement.setInt(2, thang);
							callstatement.setInt(3, nam);
							callstatement.setString(4, loaiXN);
							callstatement.registerOutParameter(5,
									OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement
									.getObject(5);	
							
							while (rs.next()) {
								BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO entity = 
										new BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO(loaiXN, thang, nam, 
												"", rs.getString("NUOC_NK"), "", "", 0, rs.getDouble("TRIGIA_USD_TK"));
								bc.add(entity);
							}
						} catch (SQLException ex) {
							System.out.println(ex.getMessage()+"||"+ex);
							return bc;
						} 
						return bc;
					}
				});
	}
	
	public List<BCT_BO_NGANH_NUOC_TRIGIADTO> TS_TGXUAT_TUIXACH_THITRUONG_HS(final String maHQ ,final int thang, final int nam, final String loaiXN){
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCT_BO_NGANH_NUOC_TRIGIADTO>>() {

					public List<BCT_BO_NGANH_NUOC_TRIGIADTO> execute(Connection conn) {

						List<BCT_BO_NGANH_NUOC_TRIGIADTO> bc = new ArrayList<BCT_BO_NGANH_NUOC_TRIGIADTO>();
						try {

							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BC_THEO_BO_NGANH_01.TS_TGXUAT_TUIXACH_THITRUONG_HS")
									+ "(?,?,?,?,?)}");
							
							callstatement.setString(1, maHQ);
							callstatement.setInt(2, thang);
							callstatement.setInt(3, nam);
							callstatement.setString(4, loaiXN);
							callstatement.registerOutParameter(5,
									OracleTypes.CURSOR);

							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement
									.getObject(5);	
							
							while (rs.next()) {
								BCT_BO_NGANH_NUOC_TRIGIADTO entity = 
										new BCT_BO_NGANH_NUOC_TRIGIADTO();
								entity.setTHANG_BC(thang);
								entity.setNAM_BC(nam);
								entity.setNUOC_NK(rs.getString("NUOC_NK"));
								entity.setMA_HANGKB(rs.getString("MA_HANGKB"));
								entity.setTRIGIA_USD_TK(rs.getDouble("TRIGIA_USD_TK"));
								bc.add(entity);
							}
						} catch (SQLException ex) {
							System.out.println(ex.getMessage()+"||"+ex);
							return bc;
						} 
						return bc;
					}
				});
	}
	
	public List<BCT_BO_NGANH_TGXN_CATRA> TS_TGXUAT_CATRA(final String maHQ ,final int thang, final int nam, final String loaiXN){
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCT_BO_NGANH_TGXN_CATRA>>() {

					public List<BCT_BO_NGANH_TGXN_CATRA> execute(Connection conn) {

						List<BCT_BO_NGANH_TGXN_CATRA> bc = new ArrayList<BCT_BO_NGANH_TGXN_CATRA>();
						try {

							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BC_THEO_BO_NGANH_01.TS_TGXUAT_CATRA")
									+ "(?,?,?,?,?)}");
							
							callstatement.setString(1, maHQ);
							callstatement.setInt(2, thang);
							callstatement.setInt(3, nam);
							callstatement.setString(4, loaiXN);
							callstatement.registerOutParameter(5,OracleTypes.CURSOR);
							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement.getObject(5);	
							
							while (rs.next()) {
								BCT_BO_NGANH_TGXN_CATRA entity = new BCT_BO_NGANH_TGXN_CATRA();
								entity.setTHANG_BC(thang);
								entity.setNAM_BC(nam);
								entity.setTEN_NNK(rs.getString("TEN_NNK"));
								entity.setMA_HANGKB(rs.getString("MA_HANGKB"));
								entity.setTRIGIA_USD_TK(rs.getDouble("TRIGIA_USD_TK"));
								entity.setTEN_DV(rs.getString("TEN_DV"));
								entity.setMA_DV(rs.getString("MA_DV"));
								entity.setNGAY_DK(rs.getDate("NGAY_DK"));
								entity.setTEN_DVT(rs.getString("TEN_DVT"));
								entity.setLUONG(rs.getDouble("LUONG"));
								entity.setDE_XUAT_KHAC(rs.getString("DE_XUAT_KHAC"));
								bc.add(entity);
							}
						} catch (SQLException ex) {
							System.out.println(ex.getMessage()+"||"+ex);
							return bc;
						} 
						return bc;
					}
				});
	}
	
	public List<BCT_BO_NGANH_TGXN_CATRA> TS_TGNHAP_CATRA(final String maHQ ,final int thang, final int nam, final String loaiXN){
		return sessionFactory.getCurrentSession().doReturningWork(
				new ReturningWork<List<BCT_BO_NGANH_TGXN_CATRA>>() {

					public List<BCT_BO_NGANH_TGXN_CATRA> execute(Connection conn) {

						List<BCT_BO_NGANH_TGXN_CATRA> bc = new ArrayList<BCT_BO_NGANH_TGXN_CATRA>();
						try {

							CallableStatement callstatement = conn.prepareCall("{call "
									+ Utils.readProperties("PK_BC_THEO_BO_NGANH_01.TS_TGNHAP_CATRA")
									+ "(?,?,?,?,?)}");
							
							callstatement.setString(1, maHQ);
							callstatement.setInt(2, thang);
							callstatement.setInt(3, nam);
							callstatement.setString(4, loaiXN);
							callstatement.registerOutParameter(5,OracleTypes.CURSOR);
							callstatement.execute();

							ResultSet rs = (ResultSet) callstatement.getObject(5);	
							
							while (rs.next()) {
								BCT_BO_NGANH_TGXN_CATRA entity = new BCT_BO_NGANH_TGXN_CATRA();
								entity.setTHANG_BC(thang);
								entity.setNAM_BC(nam);
								entity.setTEN_NXX(rs.getString("TEN_NXX"));
								entity.setMA_HANGKB(rs.getString("MA_HANGKB"));
								entity.setTRIGIA_USD_TK(rs.getDouble("TRIGIA_USD_TK"));
								entity.setTEN_DV(rs.getString("TEN_DV"));
								entity.setMA_DV(rs.getString("MA_DV"));
								entity.setNGAY_DK(rs.getDate("NGAY_DK"));
								entity.setTEN_DVT(rs.getString("TEN_DVT"));
								entity.setLUONG(rs.getDouble("LUONG"));
								bc.add(entity);
							}
						} catch (SQLException ex) {
							System.out.println(ex.getMessage()+"||"+ex);
							return bc;
						} 
						return bc;
					}
				});
	}
	
}
