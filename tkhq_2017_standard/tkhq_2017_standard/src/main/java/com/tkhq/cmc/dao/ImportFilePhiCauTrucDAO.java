package com.tkhq.cmc.dao;

import java.util.List;

import com.tkhq.cmc.dto.ImportFilePhiCauTrucDto;

public interface ImportFilePhiCauTrucDAO {
	
	public List<ImportFilePhiCauTrucDto> getListFilePhiCauTruc (String chuDe, String typeNhapXuat);
	
	public ImportFilePhiCauTrucDto getFilePhiCauTrucById(int fileId);
	
	public int deleteFilePhiCauTruc(int fileId);
	
	public ImportFilePhiCauTrucDto downloadFilePhiCauTrucById (int fileId);
	
	public int upLoadFilePhiCauTruc (ImportFilePhiCauTrucDto importFilePhiCauTrucDto);

}
