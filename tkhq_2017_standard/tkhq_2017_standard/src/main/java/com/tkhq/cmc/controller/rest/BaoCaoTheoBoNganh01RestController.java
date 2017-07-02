package com.tkhq.cmc.controller.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tkhq.cmc.common.JasperExport;
import com.tkhq.cmc.dto.BCT_BO_NGANH_NUOC_TRIGIADTO;
import com.tkhq.cmc.dto.BCT_BO_NGANH_TGXN_CATRA;
import com.tkhq.cmc.dto.BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO;
import com.tkhq.cmc.services.BaoCaoTheoBoNganh01Service;
import com.tkhq.cmc.services.Tbd_sys_userService;

@RestController
@RequestMapping(value = "pbtk")
public class BaoCaoTheoBoNganh01RestController {
	@Autowired
	BaoCaoTheoBoNganh01Service baocaoService;

	@Autowired
	Tbd_sys_userService userService;
		
	/*4.41.	Tổng trị giá nhập khẩu một số hàng hóa 4104-4115  */
	@RequestMapping(value = "/TongTriGiaNKMotSoMatHang", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_TONG_TGNK_MOTSO_MATHANG(String maHQ, int thang, int nam, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(0, thang, 0, nam, "", "TongTriGiaNKMotSoMatHang");
		String loaiXN = "N";
		List<BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO> list = baocaoService
				.TS_TGXN_MOTSO_MATHANG(maHQ, thang, nam, loaiXN);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_TGXN_MOTSO_MATHANG_01", listData, param, type, hasRole);
	}
	
	/*4.40.	Tổng trị giá nhập khẩu một số hàng hóa 845310; 845320;845380;845390  */
	@RequestMapping(value = "/TongTriGiaNKMotSoMatHang01", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_TONG_TGNK_MOTSO_MATHANG01(String maHQ, int thang, int nam, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(0, thang, 0, nam, "", "TongTriGiaNKMotSoMatHang01");
		String loaiXN = "N";
		List<BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO> list = baocaoService
				.TS_TGXN_MOTSO_MATHANG01(maHQ, thang, nam, loaiXN);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_TGXN_MOTSO_MATHANG_02", listData, param,type, hasRole);
	}
	
	/*4.36.	Trị giá xuất khẩu túi xách (theo thị trường)  */
	@RequestMapping(value = "/TriGiaXKTuiXachTheoThiTruong", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_TGXUAT_TUIXACH_THITRUONG(String maHQ, int thang, int nam, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(0, thang, 0, nam, "", "TriGiaXKTuiXachTheoThiTruong");
		String loaiXN = "X";
		List<BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO> list = baocaoService
				.TS_TGXUAT_TUIXACH_THITRUONG(maHQ, thang, nam, loaiXN);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_TGXUAT_TUIXACH_THITRUONG", listData, param,type, hasRole);
	}
	
	/*4.38.	Trị giá xuất khẩu túi xách (theo HS)  */
	@RequestMapping(value = "/TriGiaXKTuiXachTheoHS", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_TGXUAT_TUIXACH_HS(String maHQ, int thang, int nam, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(0, thang, 0, nam, "", "TriGiaXKTuiXachTheoHS");
		String loaiXN = "X";
		List<BCT_BO_NGANH_TGXN_MOTSO_MATHANGDTO> list = baocaoService
				.TS_TGXUAT_TUIXACH_HS(maHQ, thang, nam, loaiXN);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_TGXUAT_TUIXACH_HS", listData, param,type, hasRole);
	}
	
	/*4.37.	Trị giá xuất khẩu túi xách (theo thị trường và HS)  */
	@RequestMapping(value = "/TriGiaXKTuiXachTheoThiTruongHS", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_TGXUAT_TUIXACH_THITRUONG_HS(String maHQ, int thang, int nam, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(0, thang, 0, nam, "", "TongTGHHXKTheoThiTruong");
		String loaiXN = "X";
		List<BCT_BO_NGANH_NUOC_TRIGIADTO> list = baocaoService
				.TS_TGXUAT_TUIXACH_THITRUONG_HS(maHQ, thang, nam, loaiXN);

		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(
				list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_TGXUAT_TUIXACH_THITRUONG_HS", listData, param,type, hasRole);
	}
	
	/*4.42.	Báo cáo tình hình xuất khẩu cá tra  */
	@RequestMapping(value = "/BaoCaoXKCaTra", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_TGXUAT_CATRA(String maHQ, int thang, int nam, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(0, thang, 0, nam, "", "BaoCaoXKCaTra");
		String loaiXN = "X";
		List<BCT_BO_NGANH_TGXN_CATRA> list = baocaoService.TS_TGXUAT_CATRA(maHQ, thang, nam, loaiXN);
		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_XK_CATRA", listData, param,type, hasRole);
	}
	
	/*4.43.	Báo cáo tình hình nhập khẩu cá tra  */
	@RequestMapping(value = "/BaoCaoNKCaTra", method = RequestMethod.GET)
	public ResponseEntity<byte[]> TS_TGNHAP_CATRA(String maHQ, int thang, int nam, @RequestParam(value="type",required=false) String type) {
		boolean hasRole = userService.checkRoleBieu(0, thang, 0, nam, "", "BaoCaoNKCaTra");
		String loaiXN = "N";
		List<BCT_BO_NGANH_TGXN_CATRA> list = baocaoService.TS_TGNHAP_CATRA(maHQ, thang, nam, loaiXN);
		JRBeanCollectionDataSource listData = new JRBeanCollectionDataSource(list);
		Map<String, Object> param = new HashMap<String, Object>();
		return JasperExport.ExportReport("BCT_BO_NGANH_NK_CATRA", listData, param,type, hasRole);
	}
}
