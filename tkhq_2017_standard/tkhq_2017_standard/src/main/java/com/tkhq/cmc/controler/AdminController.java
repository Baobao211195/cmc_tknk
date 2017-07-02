package com.tkhq.cmc.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/admin")
public class AdminController {

	@RequestMapping(value = "/danhsachNSD", method = RequestMethod.GET)
	public String danhsachNSD() {
		return "danhsachNSD";
	}

	@RequestMapping(value = "/danhsachNhomNSD", method = RequestMethod.GET)
	public String danhsachNhomNSD() {
		return "danhsachNhomNSD";
	}

	@RequestMapping(value = "/themnguoidung", method = RequestMethod.GET)
	public String themnguoidung() {
		return "themnguoidung";
	}

	@RequestMapping(value = "/themnhomNSD", method = RequestMethod.GET)
	public String themnhomNSD() {
		return "themnhomNSD";
	}

	@RequestMapping(value = "/quanlynhomNSD", method = RequestMethod.GET)
	public String quanlynhomNSD() {
		return "quanlynhomNSD";
	}

	@RequestMapping(value = "/pageReportChart", method = RequestMethod.GET)
	public String pageReportChart() {
		return "pageReportChart";
	}

	@RequestMapping(value = "/qlUserSDTK", method = RequestMethod.GET)
	public String qlUserSDTK() {
		return "qlUserSDTK";
	}

	@RequestMapping(value = "/EditUserSDTK", method = RequestMethod.GET)
	public String EditUserSDTK() {
		return "EditUserSDTK";
	}
	
	@RequestMapping(value="/phanquyenNSD",method = RequestMethod.GET)
	public String phanquyenNSD(){
		return "phanquyenNSD";
	}
	
	@RequestMapping(value="/phanquyenNSDchitiet",method = RequestMethod.GET)
	public String phanquyenNSDchitiet(){
		return "phanquyenNSDchitiet";
	}
	
	@RequestMapping(value="/profileNSD",method = RequestMethod.GET)
	public String profileNSD(){
		return "profileNSD";
	}
	
	@RequestMapping(value="/phancong",method = RequestMethod.GET)
	public String phancong(){
		return "phancong";
	}
}
