package com.tkhq.cmc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tkhq.cmc.dao.ImportFilePhiCauTrucDAO;
import com.tkhq.cmc.dto.ImportFilePhiCauTrucDto;

@Service
@Transactional
public class ImportFilePhiCauTrucServiceImpl implements ImportFilePhiCauTrucService{

	@Autowired
	ImportFilePhiCauTrucDAO importFilePhiCauTrucDAO;

	public List<ImportFilePhiCauTrucDto> getListFilePhiCauTruc(String chuDe, String typeNhapXuat) {
		return importFilePhiCauTrucDAO.getListFilePhiCauTruc(chuDe, typeNhapXuat);
	}

	public ImportFilePhiCauTrucDto getFilePhiCauTrucById(int fileId) {
		return importFilePhiCauTrucDAO.getFilePhiCauTrucById(fileId);
	}

	public int deleteFilePhiCauTruc(int fileId) {
		return importFilePhiCauTrucDAO.deleteFilePhiCauTruc(fileId);
	}

	public ImportFilePhiCauTrucDto downloadFilePhiCauTrucById(int fileId) {
		return importFilePhiCauTrucDAO.downloadFilePhiCauTrucById(fileId);
	}

	public int upLoadFilePhiCauTruc(ImportFilePhiCauTrucDto importFilePhiCauTrucDto) {
		return importFilePhiCauTrucDAO.upLoadFilePhiCauTruc(importFilePhiCauTrucDto);
	}

}
