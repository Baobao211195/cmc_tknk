package com.tkhq.cmc.controller.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tkhq.cmc.common.JasperExport;
import com.tkhq.cmc.common.Constants.ExportType;
import com.tkhq.cmc.dto.BCT_BO_NGANH_DNXNK_TRIGIADTO;
import com.tkhq.cmc.dto.BCT_BO_NGANH_DSDNXKT_MAHS_THITRUONGDTO;
import com.tkhq.cmc.dto.BCT_BO_NGANH_DSDNXNKDTO;
import com.tkhq.cmc.dto.BCT_BO_NGANH_DSDNXNT_MATHANGDTO;
import com.tkhq.cmc.dto.BCT_BO_NGANH_DSDNXNT_THITRUONGDTO;
import com.tkhq.cmc.dto.BCT_BO_NGANH_DSDNXN_MSMH_THUYSANDTO;
import com.tkhq.cmc.dto.BCT_BO_NGANH_MAHANGKB_TRIGIADTO;
import com.tkhq.cmc.dto.BCT_BO_NGANH_NHAPKHAU_CHITIET_MATHANG;
import com.tkhq.cmc.dto.BCT_BO_NGANH_NUOC_TRIGIADTO;
import com.tkhq.cmc.dto.BCT_BO_NGANH_TGHHLH_TAIXUATDTO;
import com.tkhq.cmc.dto.BCT_BO_NGANH_TGHHT_THITRUONGDTO;
import com.tkhq.cmc.dto.BCT_BO_NGANH_TGHHXKT_MAHS_THITRUONGDTO;
import com.tkhq.cmc.dto.BCT_BO_NGANH_TGHH_VIETNAM_CHAUMYDTO;
import com.tkhq.cmc.dto.BCT_BO_NGANH_TGNK_PHANMEMDTO;
import com.tkhq.cmc.dto.BCT_BO_NGANH_TGXK_GIAYDEP_LH_DOANHNGHIEPDTO;
import com.tkhq.cmc.dto.BCT_BO_NGANH_TGXK_TUIXACH_LH_DOANHNGHIEPDTO;
import com.tkhq.cmc.dto.BCT_BO_NGANH_TGXNT_DONGTIEN_THANHTOANDTO;
import com.tkhq.cmc.dto.BCT_BO_NGANH_TGXN_MH_CAFEDTO;
import com.tkhq.cmc.dto.BCT_BO_NGANH_TGXK_MH_HATTIEUDTO;
import com.tkhq.cmc.dto.BCT_BO_NGANH_TGXN_MOTSO_MAHANGKBDTO;
import com.tkhq.cmc.dto.BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO;
import com.tkhq.cmc.dto.BCT_BO_NGANH_TGXN_MSMH_THUYSANDTO;
import com.tkhq.cmc.dto.BCT_BO_NGANH_TGXN_THEO_NGOAITEDTO;
import com.tkhq.cmc.dto.TMBCXKHH20TDTO;
import com.tkhq.cmc.services.BaoCaoTheoBoNganhService;
import com.tkhq.cmc.services.Tbd_sys_userService;

@RestController
/*@RequestMapping(value = "BaoCaoTheoBoNganh")*/
@RequestMapping(value = "pbtk")
public class BaoCaoTheoBoNganhRestController {
	@Autowired
	BaoCaoTheoBoNganhService baocaoService;

	@Autowired
	Tbd_sys_userService userService;
	
	/*4.1.	Trị giá xuất khẩu hàng hóa sang một số thị trường */
	@RequestMapping(value = "/TongTGHHXKTheoThiTruong", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_TGHHXK_THEO_THITRUONG(String maHQ, int quy,
			int nam, int maThiTruong, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(0, 0, quy, nam, "", "TongTGHHXKTheoThiTruong");
		String loaiXN = "X";
		List<BCT_BO_NGANH_TGHHT_THITRUONGDTO> list = baocaoService
				.TS_TGHH_THEO_THITRUONG(maHQ, quy, nam, maThiTruong, loaiXN);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_TGHHT_THITRUONG", listData, param,
				type, hasRole);
	}
	
	/*4.2.	Trị giá nhập khẩu hàng hóa có xuất xứ từ  một số thị trường */
	@RequestMapping(value = "/TongTGHHNKTheoThiTruong", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_TGHHNK_THEO_THITRUONG(String maHQ, int quy,
			int nam, int maThiTruong, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(0, 0, quy, nam, "", "TongTGHHNKTheoThiTruong");
		String loaiXN = "N";
		List<BCT_BO_NGANH_TGHHT_THITRUONGDTO> list = baocaoService
				.TS_TGHH_THEO_THITRUONG(maHQ, quy, nam, maThiTruong, loaiXN);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_TGHHT_THITRUONG", listData, param,
				type, hasRole);
	}
	
	/*4.3.	Danh sách doanh nghiệp xuất khẩu hàng hóa sang một số thị trường */
	@RequestMapping(value = "/DSDoanhNghiepXKTheoThiTruong", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_DSDNXK_THEO_THITRUONG(String maHQ, int quy,
			int nam, int maThiTruong, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(0, 0, quy, nam, "", "DSDoanhNghiepXKTheoThiTruong");
		String loaiXN = "X";
		List<BCT_BO_NGANH_DSDNXNT_THITRUONGDTO> list = baocaoService
				.TS_DSDNXN_THEO_THITRUONG(maHQ, quy, nam, maThiTruong, loaiXN);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_DSDNXNT_THITRUONG", listData, param,
				type, hasRole);
	}
	
	/*4.4.	Danh sách doanh nghiệp nhập khẩu hàng hóa có xuất xứ từ  một số thị trường */
	@RequestMapping(value = "/DSDoanhNghiepNKTheoThiTruong", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_DSDNNK_THEO_THITRUONG(String maHQ, int quy,
			int nam, int maThiTruong, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(0, 0, quy, nam, "", "DSDoanhNghiepNKTheoThiTruong");
		String loaiXN = "N";
		List<BCT_BO_NGANH_DSDNXNT_THITRUONGDTO> list = baocaoService
				.TS_DSDNXN_THEO_THITRUONG(maHQ, quy, nam, maThiTruong, loaiXN);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_DSDNXNT_THITRUONG", listData, param,
				type, hasRole);
	}
	
	/*4.5.	Trị giá xuất khẩu Việt Nam - Châu Mỹ */
	@RequestMapping(value = "/TongTGHHXKChauMy", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_TGHHXK_CHAUMY(String maHQ, int thang,
			int nam, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(0, thang, 0, nam, "", "TongTGHHXKChauMy");
		String loaiXN = "X";
		List<BCT_BO_NGANH_TGHH_VIETNAM_CHAUMYDTO> list = baocaoService
				.TS_TGHH_VIETNAM_CHAUMY(maHQ, thang, nam, loaiXN);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_TGHH_CHAUMY", listData, param,
				type, hasRole);
	}
	
	/*4.6.	Trị giá nhập khẩu Việt Nam - Châu Mỹ */
	@RequestMapping(value = "/TongTGHHNKChauMy", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_TGHHNK_CHAUMY(String maHQ, int thang,
			int nam, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(0, thang, 0, nam, "", "TongTGHHNKChauMy");
		String loaiXN = "N";
		List<BCT_BO_NGANH_TGHH_VIETNAM_CHAUMYDTO> list = baocaoService
				.TS_TGHH_VIETNAM_CHAUMY(maHQ, thang, nam, loaiXN);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_TGHH_CHAUMY", listData, param,
				type, hasRole);
	}
	
	/*4.7.	Trị giá xuất khẩu hàng hóa loại hình tái xuất  */
	@RequestMapping(value = "/TongTGHHXKLHTaiXuat", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_TGHHXKLH_TAIXUAT(String maHQ, int thang,
			int nam, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(0, thang, 0, nam, "", "TongTGHHXKLHTaiXuat");
		String loaiXN = "X";
		List<BCT_BO_NGANH_TGHHLH_TAIXUATDTO> list = baocaoService
				.TS_TGHH_LH_TAIXUAT(maHQ, thang, nam, loaiXN);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
 		return JasperExport.ExportReport("BCT_BO_NGANH_TGHHLH_TAIXUAT", listData, param,
				type, hasRole);
	}
	
	/*4.8.	Trị giá nhập khẩu hàng hóa loại hình tái xuất */
	@RequestMapping(value = "/TongTGHHNKLHTaiXuat", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_TGHHNKLH_TAIXUAT(String maHQ, int thang,
			int nam, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(0, thang, 0, nam, "", "TongTGHHNKLHTaiXuat");
		String loaiXN = "N";
		List<BCT_BO_NGANH_TGHHLH_TAIXUATDTO> list = baocaoService
				.TS_TGHH_LH_TAIXUAT(maHQ, thang, nam, loaiXN);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
 		return JasperExport.ExportReport("BCT_BO_NGANH_TGHHLH_TAIXUAT", listData, param,
				type, hasRole);
	}
	
	/*4.9.	Xuất khẩu mặt hàng… theo mã HS của Việt Nam sang thị trường… */ 
	@RequestMapping(value = "/TriGiaHHXKTheoMaHsThiTruong", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_TGHHXK_THEO_MAHS_THITRUONG(String maHQ, int tuNam,
			int denNam,String maTHKE, int maThiTruong, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(0, 0, 0, 0, "", "DSTriGiaHHXKTheoMaHsThiTruong");
		
		List<BCT_BO_NGANH_TGHHXKT_MAHS_THITRUONGDTO> list = baocaoService
				.TS_TGHHXK_THEO_MAHS_THITRUONG(maHQ, tuNam, denNam, maTHKE, maThiTruong);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list, hasRole);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_TGHHXK_THEO_MAHS_THITRUONG", listData, param,
				type, hasRole);
	}
	
	/*4.10.	Danh sách các doanh nghiệp xuất khẩu mặt hàng… theo mã HS của Việt Nam sang thị trường… */
	@RequestMapping(value = "/DSDoanhNghiepXKTheoMaHsThiTruong", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_DSDNXK_THEO_MAHS_THITRUONG(String maHQ, int tuNam,
			int denNam,String maTHKE, int maThiTruong, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(0, 0, 0, 0, "", "DSDoanhNghiepXKTheoMaHsThiTruong");
		
		List<BCT_BO_NGANH_DSDNXKT_MAHS_THITRUONGDTO> list = baocaoService
				.TS_DSDNXK_THEO_MAHS_THITRUONG(maHQ, tuNam, denNam, maTHKE, maThiTruong);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_DSDNXKT_MAHS_THITRUONG", listData, param,
				type, hasRole);
	}
	
	/*4.11.	Nhập khẩu chi tiết mặt hàng*/
	@RequestMapping(value = "/NhapKhauChiTietMatHang", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_NHAPKHAU_CHITIET_MATHANG(String maHQ, String tuNgay,
			String denNgay,String maTHKE, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(0, 0, 0, 0, "", "NhapKhauChiTietMatHang");
		
		List<BCT_BO_NGANH_NHAPKHAU_CHITIET_MATHANG> list = baocaoService
				.TS_NHAPKHAU_CHITIET_MATHANG(maHQ, tuNgay, denNgay, maTHKE);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_NHAPKHAU_CHITIET_MATHANG", listData, param,
				type, hasRole);
	}
	
	/*4.12.	Danh sách các doanh nghiệp nhập khẩu mặt hàng */
	@RequestMapping(value = "/DSDoanhNghiepNKTheoMatHang", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_DSDNNK_THEO_MATHANG(String maHQ, String tuNgay,
			String denNgay,String maTHKE, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(0, 0, 0, 0, "", "DSDoanhNghiepNKTheoMatHang");
		List<BCT_BO_NGANH_DSDNXNT_MATHANGDTO> list = baocaoService
				.TS_DSDNXN_THEO_MATHANG(maHQ, tuNgay, denNgay, maTHKE);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_DSDNNKT_MATHANG", listData, param,
				type, hasRole);
	}
	
	/*4.13.	Trị giá xuất khẩu một số mặt hàng  */
	@RequestMapping(value = "/TriGiaXKMotSoMatHang", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_TGXK_MOTSO_MATHANG(String maHQ, int thang, int nam, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(0, thang, 0, nam, "", "TriGiaXKMotSoMatHang");
		String loaiXN = "X";
		List<BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO> list = baocaoService
				.TS_TGXN_MOTSO_MATHANG(maHQ, thang, nam, loaiXN);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_TGXN_MOTSO_MATHANG", listData, param,
				type, hasRole);
	}
	
	/*4.14.	Trị giá nhập khẩu một số mặt hàng  */
	@RequestMapping(value = "/TriGiaNKMotSoMatHang", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_TGNK_MOTSO_MATHANG(String maHQ, int thang, int nam, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(0, thang, 0, nam, "", "TriGiaNKMotSoMatHang");
		String loaiXN = "N";
		List<BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO> list = baocaoService
				.TS_TGXN_MOTSO_MATHANG(maHQ, thang, nam, loaiXN);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_TGXN_MOTSO_MATHANG", listData, param,
				type, hasRole);
	}
	
	/*4.15.	Trị giá xuất khẩu một số mặt hàng thủy sản */
	@RequestMapping(value = "/TriGiaXKMatHangThuySan", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_TGXK_MSMH_THUYSAN(String maHQ, int ky, int thang, int nam, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(ky, thang, 0, nam, "", "TriGiaXKMatHangThuySan");
		String loaiXN = "X";
		List<BCT_BO_NGANH_TGXN_MSMH_THUYSANDTO> list = baocaoService
				.TS_TGXN_MSMH_THUYSAN(maHQ, ky, thang, nam, loaiXN);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_TGXN_MSMH_THUYSAN", listData, param,
				type, hasRole);
	}
	
	/*4.17.	Trị giá nhập khẩu một số mặt hàng thủy sản */
	@RequestMapping(value = "/TriGiaNKMatHangThuySan", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_TGNK_MSMH_THUYSAN(String maHQ, int ky, int thang, int nam, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(ky, thang, 0, nam, "", "TriGiaNKMatHangThuySan");
		String loaiXN = "N";
		List<BCT_BO_NGANH_TGXN_MSMH_THUYSANDTO> list = baocaoService
				.TS_TGXN_MSMH_THUYSAN(maHQ, ky, thang, nam, loaiXN);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_TGXN_MSMH_THUYSAN", listData, param,
				type, hasRole);
	}
	
	/*4.16.	Danh sách doanh nghiệp xuất khẩu một số mặt hàng thủy sản */
	@RequestMapping(value = "/DSDoanhNghiepXKMatHangThuySan", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_DSDNXK_MSMH_THUYSAN(String maHQ, int ky, int thang, int nam, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(ky, thang, 0, nam, "", "DSDoanhNghiepXKMatHangThuySan");
		String loaiXN = "X";
		List<BCT_BO_NGANH_DSDNXN_MSMH_THUYSANDTO> list = baocaoService
				.TS_DSDNXN_MSMH_THUYSAN(maHQ, ky, thang, nam, loaiXN);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_DSDNXN_MSMH_THUYSAN", listData, param,
				type, hasRole);
	}
	
	/*4.18.	Danh sách doanh nghiệp nhập khẩu một số mặt hàng thủy sản */
	@RequestMapping(value = "/DSDoanhNghiepNKMatHangThuySan", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_DSDNNK_MSMH_THUYSAN(String maHQ, int ky, int thang, int nam, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(ky, thang, 0, nam, "", "DSDoanhNghiepNKMatHangThuySan");
		String loaiXN = "N";
		List<BCT_BO_NGANH_DSDNXN_MSMH_THUYSANDTO> list = baocaoService
				.TS_DSDNXN_MSMH_THUYSAN(maHQ, ky, thang, nam, loaiXN);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_DSDNXN_MSMH_THUYSAN", listData, param,
				type, hasRole);
	}
	
	/*4.19.	Trị giá xuất nhập khẩu các mặt hàng CNTT và truyền thông */
	@RequestMapping(value = "/TriGiaXNKMotSoMaHang", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_TGXN_MOTSO_MAHANGKB(String maHQ, int nam, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(0, 0, 0, nam, "", "TriGiaXNKMotSoMaHang");
		List<BCT_BO_NGANH_TGXN_MOTSO_MAHANGKBDTO> list = baocaoService
				.TS_TGXN_MOTSO_MAHANGKB(maHQ, nam);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_TGXN_MOTSO_MAHANGKB", listData, param,
				type, hasRole);
	}
	
	/*4.20.	Trị giá nhập khẩu phần mềm */
	@RequestMapping(value = "/TriGiaNKPhanMem", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_TGNK_PHANMEM(String maHQ, int nam, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(0, 0, 0, nam, "", "TriGiaNKPhanMem");
		List<BCT_BO_NGANH_TGNK_PHANMEMDTO> list = baocaoService
				.TS_TGNK_PHANMEM(maHQ, nam);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_TGNK_PHANMEM", listData, param,
				type, hasRole);
	}
	
	/*4.21.	Trị giá nhập khẩu phần mềm của một số doanh nghiệp lớn */
	@RequestMapping(value = "/TriGiaNKPhanMemTheoDoanhNghiep", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_TGNK_PMT_DOANHNGHIEP(String maHQ, int nam, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(0, 0, 0, nam, "", "TriGiaNKPhanMemTheoDoanhNghiep");
		List<BCT_BO_NGANH_DNXNK_TRIGIADTO> list = baocaoService
				.TS_TGNK_PMT_DOANHNGHIEP(maHQ, nam);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_TGNK_PMT_DOANHNGHIEP", listData, param,
				type, hasRole);
	}
	
	/*4.22.	Trị giá xuất khẩu theo đồng tiền thanh toán */
	@RequestMapping(value = "/TriGiaXKTheoDongTienTT", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_TGXK_THEO_DONGTIENTT(String maHQ, String tuNgay,
			String denNgay, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(0, 0, 0, 0, "", "TriGiaXKTheoDongTienTT");
		String loaiXN = "X";
		List<BCT_BO_NGANH_TGXNT_DONGTIEN_THANHTOANDTO> list = baocaoService
				.TS_TGXN_THEO_DONGTIENTT(maHQ, tuNgay, denNgay, loaiXN);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_TGXN_THEO_DONGTIENTT", listData, param,
				type, hasRole);
	}
	
	/*4.23.	Trị giá nhập khẩu theo đồng tiền thanh toán */
	@RequestMapping(value = "/TriGiaNKTheoDongTienTT", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_TGNK_THEO_DONGTIENTT(String maHQ, String tuNgay,
			String denNgay, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(0, 0, 0, 0, "", "TriGiaNKTheoDongTienTT");
		String loaiXN = "N";
		List<BCT_BO_NGANH_TGXNT_DONGTIEN_THANHTOANDTO> list = baocaoService
				.TS_TGXN_THEO_DONGTIENTT(maHQ, tuNgay, denNgay, loaiXN);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_TGXN_THEO_DONGTIENTT", listData, param,
				type, hasRole);
	}
	
	/*4.26.	Thống kê xuất khẩu, nhập khẩu các loại ngoại tệ */
	@RequestMapping(value = "/TriGiaXNKTheoNgoaiTe", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_TGXN_THEO_NGOAITE(String maHQ, String tuNgay,
			String denNgay, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(0, 0, 0, 0, "", "TriGiaXNKTheoNgoaiTe");
		List<BCT_BO_NGANH_TGXN_THEO_NGOAITEDTO> list = baocaoService
				.TS_TGXN_THEO_NGOAITE(maHQ, tuNgay, denNgay);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_TGXN_THEO_NGOAITE", listData, param,
				type, hasRole);
	}
	
	/*4.27.	Trị giá xuất khẩu mặt hàng cà phê tháng…/ */
	@RequestMapping(value = "/TriGiaXKMatHangCafe", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_TGXK_MH_CAFE(String maHQ, int thang,
			int nam, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(0, thang, 0, nam, "", "TriGiaXKMatHangCafe");
		String loaiXN = "X";
		List<BCT_BO_NGANH_TGXN_MH_CAFEDTO> list = baocaoService
				.TS_TGXN_MH_CAFE(maHQ, thang, nam, loaiXN);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_TGXK_MH_CAFE", listData, param,
				type, hasRole);
	}
	
	/*4.28.	Trị giá nhập khẩu mặt hàng cà phê tháng…/ */
	@RequestMapping(value = "/TriGiaNKMatHangCafe", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_TGNK_MH_CAFE(String maHQ, int thang,
			int nam, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(0, thang, 0, nam, "", "TriGiaNKMatHangCafe");
		String loaiXN = "N";
		List<BCT_BO_NGANH_TGXN_MH_CAFEDTO> list = baocaoService
				.TS_TGXN_MH_CAFE(maHQ, thang, nam, loaiXN);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_TGNK_MH_CAFE", listData, param,
				type, hasRole);
	}
	
	/*4.29.	Danh sách doanh nghiệp thực hiện xuất khẩu cà phê  */
	@RequestMapping(value = "/DSDoanhNghiepXNKCaFe", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_DSDNXK_MH_CAFE(String maHQ, int tuThang,
			int tuNam, int denThang, int denNam, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(0, 0, 0, 0, "", "DSDoanhNghiepXNKCaFe");
		List<BCT_BO_NGANH_DSDNXNKDTO> list = baocaoService
				.TS_DSDNXK_MH_CAFE(maHQ, tuThang, tuNam, denThang, denNam);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_DSDNXK_CAFE", listData, param,
				type, hasRole);
	}
	
	/*4.30.	Số liệu xuất khẩu mặt hàng hạt tiêu (theo HS) tháng …/…  */
	@RequestMapping(value = "/TriGiaXKMatHangHatTieu", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_TGXK_MH_HATTIEU(String maHQ, int thang,
			int nam, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(0, thang, 0, nam, "", "TriGiaXKMatHangHatTieu");
		List<BCT_BO_NGANH_TGXK_MH_HATTIEUDTO> list = baocaoService
				.TS_TGXK_MH_HATTIEU(maHQ, thang, nam);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_TGXK_MH_HATTIEU", listData, param,
				type, hasRole);
	}
	
	/*4.31.	Số liệu xuất khẩu mặt hàng hạt tiêu (theo doanh nghiệp) tháng…/…  */
	@RequestMapping(value = "/TriGiaXKHatTieuTheoDoanhNghiep", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_TGXK_MH_HATTIEU_THEO_DN(String maHQ, int thang,
			int nam, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(0, thang, 0, nam, "", "TriGiaXKHatTieuTheoDoanhNghiep");
		List<BCT_BO_NGANH_DNXNK_TRIGIADTO> list = baocaoService
				.TS_TGXK_MH_HATTIEU_THEO_DN(maHQ, thang, nam);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_TGXK_MH_HATTIEU_THEO_DN", listData, param,
				type, hasRole);
	}
	
	/*4.32.	Trị giá xuất khẩu giày dép (theo trị trường) tháng…/…  */
	@RequestMapping(value = "/TriGiaXKGiayDepTheoThiTruong", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_TGXK_GIAYDEP_THEO_THITRUONG(String maHQ, int thang,
			int nam, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(0, thang, 0, nam, "", "TriGiaXKGiayDepTheoThiTruong");
		List<BCT_BO_NGANH_NUOC_TRIGIADTO> list = baocaoService
				.TS_TGXK_GIAYDEP_THEO_THITRUONG(maHQ, thang, nam);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_TGXK_GIAYDEP_THEO_THITRUONG", listData, param,
				type, hasRole);
	}
	
	/*4.33.	Trị giá xuất khẩu giày dép (theo trị trường và HS) tháng…/…  */
	@RequestMapping(value = "/TriGiaXKGiayDepTheoThiTruongHS", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_TGXK_GIAYDEP_THITRUONG_HS(String maHQ, int thang,
			int nam, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(0, thang, 0, nam, "", "TriGiaXKGiayDepTheoThiTruongHS");
		List<BCT_BO_NGANH_NUOC_TRIGIADTO> list = baocaoService
				.TS_TGXK_GIAYDEP_THITRUONG_HS(maHQ, thang, nam);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_TGXK_GIAYDEP_THITRUONG_HS", listData, param,
				type, hasRole);
	}
	
	/*4.34.	Trị giá xuất khẩu giày dép (theo HS) tháng…/…  */
	@RequestMapping(value = "/TriGiaXKGiayDepTheoHS", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_TGXK_GIAYDEP_THEO_HS(String maHQ, int thang,
			int nam, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(0, thang, 0, nam, "", "TriGiaXKGiayDepTheoHS");
		List<BCT_BO_NGANH_MAHANGKB_TRIGIADTO> list = baocaoService
				.TS_TGXK_GIAYDEP_THEO_HS(maHQ, thang, nam);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_TS_TGXK_GIAYDEP_THEO_HS", listData, param,
				type, hasRole);
	}
	
	/*4.35.	Trị giá xuất khẩu giày dép (theo loại hình doanh nghiệp) tháng…/…  */
	@RequestMapping(value = "/TriGiaXKGiayDepTheoLHDoanhNghiep", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_TGXK_GIAYDEP_LH_DOANHNGHIEP(String maHQ, int thang,
			int nam, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(0, thang, 0, nam, "", "TriGiaXKGiayDepTheoHS");
		List<BCT_BO_NGANH_TGXK_GIAYDEP_LH_DOANHNGHIEPDTO> list = baocaoService
				.TS_TGXK_GIAYDEP_LH_DOANHNGHIEP(maHQ, thang, nam);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_TS_TGXK_GIAYDEP_LH_DOANHNGHIEP", listData, param,
				type, hasRole);
	}
	
	/*4.39.	Trị giá xuất khẩu túi xách (theo loại hình doanh nghiệp) tháng…/…  */
	@RequestMapping(value = "/TriGiaXKTuiXachTheoLHDoanhNghiep", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_TGXK_TUIXACH_LH_DOANHNGHIEP(String maHQ, int thang,
			int nam, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(0, thang, 0, nam, "", "TriGiaXKTuiXachTheoLHDoanhNghiep");
		List<BCT_BO_NGANH_TGXK_TUIXACH_LH_DOANHNGHIEPDTO> list = baocaoService
				.TS_TGXK_TUIXACH_LH_DOANHNGHIEP(maHQ, thang, nam);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_TS_TGXK_TUIXACH_LH_DOANHNGHIEP", listData, param,
				type, hasRole);
	}
}
