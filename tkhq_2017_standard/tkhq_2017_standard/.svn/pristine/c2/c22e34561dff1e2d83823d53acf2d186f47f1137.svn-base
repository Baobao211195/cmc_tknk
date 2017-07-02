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

import com.tkhq.cmc.dto.ImportFilePhiCauTrucDto;
import com.tkhq.cmc.utils.Utils;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class ImportFilePhiCauTrucDAOIplm implements ImportFilePhiCauTrucDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<ImportFilePhiCauTrucDto> getListFilePhiCauTruc(final String chuDe, final String typeNhapXuat) {
		
		return sessionFactory.getCurrentSession().doReturningWork(
			new ReturningWork<List<ImportFilePhiCauTrucDto>>() {

				public List<ImportFilePhiCauTrucDto> execute(Connection con) throws SQLException {
					List<ImportFilePhiCauTrucDto> listFileDto = new ArrayList<ImportFilePhiCauTrucDto>();
					CallableStatement callStm = con.prepareCall(new StringBuilder()
													.append("{call ")
													.append(Utils.readProperties("PK_FILE_PHI_CAUTRUC.ts_readFilePhiCauTruc"))
													.append("(?,?,?)}").toString());
					callStm.setString(1, chuDe);
					callStm.setString(2, typeNhapXuat);
					callStm.registerOutParameter(3, OracleTypes.CURSOR);
					
					callStm.execute();
					
					ResultSet rs = (ResultSet) callStm.getObject(3);
					ImportFilePhiCauTrucDto dto = null;
					while (rs.next()) {
						dto = new ImportFilePhiCauTrucDto();
						dto.setFileId(rs.getInt("FILE_ID"));
						dto.setFileName(rs.getString("FILE_NAME"));
						dto.setUpdateLoadDate(rs.getString("NGAY_TAILEN"));
						dto.setFileDescription(rs.getString("FILE_DESCRIPTION"));
						dto.setUpdateLoadDate(rs.getString("NGAY_TAILEN"));
						dto.setNguoiTaiLen(rs.getString("NGUOI_TAILEN"));

						listFileDto.add(dto);
					}
					return listFileDto;
				}
			});
	}

	public ImportFilePhiCauTrucDto getFilePhiCauTrucById(final int fileId) {
		
		return sessionFactory.getCurrentSession().doReturningWork(
			new ReturningWork<ImportFilePhiCauTrucDto>() {

				public ImportFilePhiCauTrucDto execute(Connection con) throws SQLException {
					CallableStatement callStm = con.prepareCall(new StringBuilder()
													.append("{call ")
													.append(Utils.readProperties("PK_FILE_PHI_CAUTRUC.ts_readFilePhiCauTrucById"))
													.append("(?,?)}").toString());
					callStm.setInt(1, fileId);
					callStm.registerOutParameter(2, OracleTypes.CURSOR);
					
					callStm.execute();
					
					ResultSet rs = (ResultSet) callStm.getObject(2);
					ImportFilePhiCauTrucDto fileDto = null;
					while (rs.next()) {
						fileDto = new ImportFilePhiCauTrucDto();
						fileDto.setFileId(rs.getInt("FILE_ID"));
						fileDto.setFileUrl(rs.getString("FILE_URL"));
						fileDto.setFileName(rs.getString("FILE_NAME"));
						fileDto.setFileDescription(rs.getString("FILE_DESCRIPTION"));
						fileDto.setUpdateLoadDate(rs.getString("NGAY_TAILEN"));
					}
					return fileDto;
				}
			});
	}

	public int deleteFilePhiCauTruc(final int fileId) {

		return sessionFactory.getCurrentSession().doReturningWork(new ReturningWork<Integer>() {

			public Integer execute(Connection con) throws SQLException {
				CallableStatement callStm = con.prepareCall("{call "
						+ Utils.readProperties("PK_FILE_PHI_CAUTRUC.ts_deleteFilePhiCauTrucById")
						+ "(?)}");
				callStm.setInt(1, fileId);

				return callStm.executeUpdate();
			}
			
		});
	}

	public ImportFilePhiCauTrucDto downloadFilePhiCauTrucById(final int fileId) {
		return sessionFactory.getCurrentSession().doReturningWork(
			new ReturningWork<ImportFilePhiCauTrucDto>() {

				public ImportFilePhiCauTrucDto execute(Connection con) throws SQLException {
					CallableStatement callStm = con.prepareCall(new StringBuilder()
													.append("{call ")
													.append(Utils.readProperties("PK_FILE_PHI_CAUTRUC.ts_downloadFilePhiCauTrucById"))
													.append("(?,?)}").toString());
					callStm.setInt(1, fileId);
					callStm.registerOutParameter(2, OracleTypes.CURSOR);

					callStm.execute();

					ResultSet rs = (ResultSet) callStm.getObject(2);
					ImportFilePhiCauTrucDto fileDto = null;
					while (rs.next()) {
						fileDto = new ImportFilePhiCauTrucDto();
						fileDto.setFileId(rs.getInt("FILE_ID"));
						fileDto.setFileUrl(rs.getString("FILE_URL"));
					}
					return fileDto;
				}
			});
	}

	public int upLoadFilePhiCauTruc(final ImportFilePhiCauTrucDto importFilePhiCauTrucDto) {
		
		return sessionFactory.getCurrentSession().doReturningWork(
			new ReturningWork<Integer>() {

				public Integer execute(Connection con) throws SQLException {
					CallableStatement callStm = con.prepareCall("{call "
							+ Utils.readProperties("PK_FILE_PHI_CAUTRUC.ts_uploadFilePhiCauTruc")
							+ "(?,?,?,?,?,?)}");
					try {
						callStm.setString(1, importFilePhiCauTrucDto.getFileTitle());
						callStm.setString(2, importFilePhiCauTrucDto.getFileUrl());
						callStm.setString(3, importFilePhiCauTrucDto.getFileName());
						callStm.setString(4, importFilePhiCauTrucDto.getTypeNhapXuat());
						callStm.setString(5, importFilePhiCauTrucDto.getFileDescription());
						callStm.setString(6, importFilePhiCauTrucDto.getNguoiTaiLen());

						return callStm.executeUpdate();
					} catch (SQLException e) {
						return 0;
					}
				
				}
			});
	}
}
