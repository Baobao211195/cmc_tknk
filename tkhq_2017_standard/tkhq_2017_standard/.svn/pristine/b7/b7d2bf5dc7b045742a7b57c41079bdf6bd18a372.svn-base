package com.tkhq.cmc.services;

import java.util.List;

import com.tkhq.cmc.dto.HTRaXoatSanPhamTKDTO;

public interface HTRaXoatSanPhamTKService {
	
	public List<HTRaXoatSanPhamTKDTO> getListDanhMucBaoCao(String typeNhapXuat);
	
	public HTRaXoatSanPhamTKDTO getDanhMucBaoCaoByMaBC (String typeNhapXuat, String maBc);
	
	public List<HTRaXoatSanPhamTKDTO> getListCongChucQuanLy(String typeNhapXuat);
	
	public List<HTRaXoatSanPhamTKDTO> getListThongTinXuLy(String typeNhapXuat);
	
	public HTRaXoatSanPhamTKDTO getThongTinXuLyByMaBaoCao(HTRaXoatSanPhamTKDTO paramDto);
	
	public int insertThongTinXuLy(HTRaXoatSanPhamTKDTO hTRaXoatSanPhamTKDTO) throws Exception;
	
	public int updateThongTinXuLy(String maBaoCao, String lyDo, String ky, String thang, String nam, String typeNhapXuat, String trangThai, String tenCongChucQuanLy) throws Exception;
	
	
	public List<HTRaXoatSanPhamTKDTO> getThongTinXuLy(String nhx);
	
	public int doApproval(String approval, String maBC, String ky, String thang, String nam, String nhx, String trangthai,
			String lydoPD);
}
