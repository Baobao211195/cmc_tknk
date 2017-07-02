package com.tkhq.cmc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tkhq.cmc.dao.PHANHE_PBTKDAO;
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

@Service
@Transactional
public class PHANHE_PBTKServiceImpl implements PHANHE_PBTKService {

	@Autowired
	PHANHE_PBTKDAO baocaoDAO;
	
	public List<TMBCXKHH20TDTO> ts_BCXKHH20T(String maHQ, int thang, int nam, String loai_BC) {
		
		return baocaoDAO.ts_BCXKHH20T(maHQ, thang, nam, loai_BC);
		
	}
	
	public List<TMBCNKHH20TDTO> ts_BCNKHH20T(String maHQ,int thang, int nam, String loai_BC) {
		
		return baocaoDAO.ts_BCNKHH20T(maHQ, thang, nam, loai_BC);
	}

	public List<BCNKHTDTK017KDTO> ts_BCNKHTDTK017K(String maHQ, int ky, int thang, int nam, String loai_BC) {
		return baocaoDAO.ts_BCNKHTDTK017K(maHQ, ky, thang, nam, loai_BC);
	}
	
	public List<BCNKHTDTK017K1DTO> ts_BCNKHTDTK017K1(String maHQ, int ky, int thang, int nam) {
		return baocaoDAO.ts_BCNKHTDTK017K1(maHQ, ky, thang, nam);
	}
	
	public List<BCXKHH015KDTO> ts_BCXKHH015K(String maHQ, int ky, int thang, int nam, String loai_BC) {
		return baocaoDAO.ts_BCXKHH015K(maHQ, ky, thang, nam, loai_BC);
	}
	
	public List<BCNKHH015KDTO> ts_BCNKHH015K(String maHQ, int ky, int thang, int nam, String loai_BC) {
		return baocaoDAO.ts_BCNKHH015K(maHQ, ky, thang, nam, loai_BC);
	}
	
	public List<BCXNKTTP022TDTO> ts_BCXNKTTP022T(String maHQ, int thang, int nam, String loai_BC) {
		return baocaoDAO.ts_BCXNKTTP022T(maHQ, thang, nam, loai_BC);
	}
	
	public List<BCXKNUOCMHCY023TDTO> ts_BCXKNUOCMHCY023T(String maHQ, int thang, int nam, String loai_BC) {
		return baocaoDAO.ts_BCXKNUOCMHCY023T(maHQ, thang, nam, loai_BC);
	}
	
	public List<BCNKNUOCMHCY024TDTO> ts_BCNKNUOCMHCY024T(String maHQ, int thang, int nam, String loai_BC) {
		return baocaoDAO.ts_BCNKNUOCMHCY024T(maHQ, thang, nam, loai_BC);
	}
	
	public List<BCXKHHPTVT025HDTO> ts_BCXKHHPTVT025H(String maHQ,int ky, int nam, String loai_BC) {
		return baocaoDAO.ts_BCXKHHPTVT025H(maHQ, ky, nam, loai_BC);
	}
	
	public List<BCNKHHPTVT026HDTO> ts_BCNKHHPTVT026H(String maHQ,int ky, int nam, String loai_BC) {
		return baocaoDAO.ts_BCNKHHPTVT026H(maHQ, ky, nam, loai_BC);
	}

	public List<BCXNKHHTT19TDTO> ts_BCXKHHTT18T(String maHQ, int thang,
			int nam, String loai_BC) {
		return baocaoDAO.ts_BCXKHHTT18T(maHQ, thang, nam, loai_BC);
	}

	public List<BCXNKHHTT19TDTO> ts_BCNKHHTT19T(String maHQ, int thang,
			int nam, String loai_BC) {
		return baocaoDAO.ts_BCNKHHTT19T(maHQ, thang, nam, loai_BC);
	}
	
	public List<BCHTX27HDTO> ts_BCHTX27H(String maHQ, int ky,int nam,String loai_BC) {
		return baocaoDAO.ts_BCHTX27H(maHQ, ky, nam,loai_BC);
	}

	public List<BCUSBXKHHDTO> Ts_BCUSBXKHH(String maHQ, int thang, int nam,
			String loai_BC) {
		return baocaoDAO.Ts_BCUSBXKHH(maHQ, thang, nam, loai_BC);
	}

	public List<BCUSBXKHHDTO> Ts_BCUSBNKHH(String maHQ, int thang, int nam,
			String loai_BC) {
		return baocaoDAO.Ts_BCUSBNKHH(maHQ, thang, nam, loai_BC);
	}
	
	public List<BGHHNKTT55DTO> ts_BGHHNKTT55(String maHQ,int ky, int thang, int nam) {
		return baocaoDAO.ts_BGHHNKTT55(maHQ, ky, thang, nam);	
	}
	
	public List<BCNKHHCOUDDTO> ts_BCNKHHCOUD(String maHQ, int quy, int nam) {
		return baocaoDAO.ts_BCNKHHCOUD(maHQ, quy, nam);
	}
	
	public List<BCXNKTLHDNDTO> ts_BCXNKTLHDN(String maCuc,String maHQ, int thang, int nam) {
		return baocaoDAO.ts_BCXNKTLHDN(maCuc,maHQ, thang, nam);
	}


	public List<BCSLDNTTTPDTO> ts_BCSLDNTTTP(String maHQ, int nam) {
		return baocaoDAO.ts_BCSLDNTTTP(maHQ, nam);
	}
	
	public List<BCXKTDNCYDTO> ts_BCXKTDNCY(String maCuc, int thang, int nam) {
		return baocaoDAO.ts_BCXKTDNCY(maCuc, thang, nam);
	}
	
	public List<BCNKTDNCYDTO> ts_BCNKTDNCY(String maCuc, int thang, int nam) {
		return baocaoDAO.ts_BCNKTDNCY(maCuc, thang, nam);
	}
	
	public List<BCXKMHCYTINHDTO> ts_BCXKMHCYTINH(String tinhTP, int thang, int nam) {
		return baocaoDAO.ts_BCXKMHCYTINH(tinhTP, thang, nam);
	}
	
	public List<BCXNKHHTNLHDTO> ts_BCXNKHHTNLH(String maCuc, int thang, int nam,int ma_nlh) {
		return baocaoDAO.ts_BCXNKHHTNLH(maCuc, thang, nam, ma_nlh);
	}
	
	public List<BCXKNUOCMHCYTINHDTO> ts_BCXKNUOCMHCYTINH(String tinhTP, int thang, int nam) {
		return baocaoDAO.ts_BCXKNUOCMHCYTINH(tinhTP, thang, nam);
	}
	
	public List<BCXKHHCUCHQDTO> ts_BCXKHHCUCHQ(String maCuc, int thang, int nam) {
		return baocaoDAO.ts_BCXKHHCUCHQ(maCuc, thang, nam);
	}
	
	public List<BCNKHHCUCHQDTO> ts_BCNKHHCUCHQ(String maCuc, int thang, int nam) {
		return baocaoDAO.ts_BCNKHHCUCHQ(maCuc, thang, nam);
	}
	
	public List<BCXKHHTTTCHQDTO> ts_BCXKHHTTTCHQ(String maHQ, int thang,
			int nam, String loai_BC) {
		return baocaoDAO.ts_BCXKHHTTTCHQ(maHQ, thang, nam, loai_BC);
	}
	
	public List<BCXKHHTTTCHQDTO> ts_BCNKHHTTTCHQ(String maHQ, int thang,
			int nam, String loai_BC) {
		return baocaoDAO.ts_BCNKHHTTTCHQ(maHQ, thang, nam, loai_BC);
	}
	
	public List<BCXKMHCYTPTVTTCHQDTO> ts_BCXKMHCYTPTVTTCHQ(int ky, int thang,
			int nam) {
		return baocaoDAO.ts_BCXKMHCYTPTVTTCHQ(ky, thang, nam);
	}
	
	public List<BCXKMHCYTPTVTTCHQDTO> ts_BCNKMHCYTPTVTTCHQ(int ky, int thang,
			int nam) {
		return baocaoDAO.ts_BCNKMHCYTPTVTTCHQ(ky, thang, nam);
	}
	
	public List<BCXKMHCYTPTVTTCHQQUYDTO> ts_BCXKMHCYTPTVTTCHQQUY(int quy,int nam) {
		return baocaoDAO.ts_BCXKMHCYTPTVTTCHQQUY(quy, nam);
	}
	
	public List<BCXKMHCYTPTVTTCHQQUYDTO> ts_BCNKMHCYTPTVTTCHQQUY(int quy,int nam) {
		return baocaoDAO.ts_BCNKMHCYTPTVTTCHQQUY(quy, nam);
	}

	public List<TTGXKPTVTDTO> ts_TTGXKTPTVT(String maHQ, int quy, int nam) {
		return baocaoDAO.ts_TTGXKTPTVT(maHQ, quy, nam);
	}
	
	public List<TTGXKPTVTDTO> ts_TTGNKTPTVT(String maHQ, int quy, int nam) {
		return baocaoDAO.ts_TTGNKTPTVT(maHQ, quy, nam);
	}
	
	public List<BCTTXNKTCCHQDTO> ts_BCTTXNKTCCHQ(int nam) {
		return baocaoDAO.ts_BCTTXNKTCCHQ(nam);
	}
	
	public List<BCTGNKCHIUTHUECUCHQDTO> ts_BCTGNKCHIUTHUECUCHQ(String maCuc, int thang, int nam) {
		return baocaoDAO.ts_BCTGNKCHIUTHUECUCHQ(maCuc, thang, nam);
	}
	
	public List<BCTGNKCHIUTHUECUCHQDTO> ts_BCTGXKCHIUTHUECUCHQ(String maCuc, int thang, int nam) {
		return baocaoDAO.ts_BCTGXKCHIUTHUECUCHQ(maCuc, thang, nam);
	}
}
