package com.tkhq.cmc.controller.rest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tkhq.cmc.dto.TbdSysParametersDTO;
import com.tkhq.cmc.model.TbdSysparameters;
import com.tkhq.cmc.services.TbdSysParametersService;

@RestController
public class TbdSysParameterRestController {
	@Autowired
	private TbdSysParametersService parametersService;

	@RequestMapping(value = "/tbd_sys_parameters/", method = RequestMethod.GET)
	public ResponseEntity<List<TbdSysparameters>> getAllParameters() {
		System.out.println("get Parameters");
		List<TbdSysparameters> list = new ArrayList<TbdSysparameters>();
		System.out.println("Find all");
		list = parametersService.getAll();
		return new ResponseEntity<List<TbdSysparameters>>(list,
				HttpStatus.ACCEPTED);
	}

	@RequestMapping(value = "/tbd_sys_parameters/", method = RequestMethod.POST)
	public ResponseEntity<Integer> CreateParameters(
			@RequestBody TbdSysParametersDTO params) throws ParseException {
		System.out.println("Create");
		TbdSysparameters entity = new TbdSysparameters();
		entity.setGia_tri(params.getGia_tri());
		entity.setNguoi_capnhat(params.getNguoi_capnhat());
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date date = sdf1.parse(params.getNgay_capnhat());
		java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
		entity.setTen_thamSo(params.getTen_thamSo());
		entity.setNgay_capnhat(sqlStartDate);
		try {
			parametersService.InsertParameters(entity);
		} catch (Exception e) {
			return new ResponseEntity<Integer>(0, HttpStatus.CREATED);
		}
		return new ResponseEntity<Integer>(1, HttpStatus.CREATED);

	}

	@RequestMapping(value = "/tbd_sys_parameters/", method = RequestMethod.PUT)
	public ResponseEntity<Integer> UpdateParameter(
			@RequestBody TbdSysParametersDTO params) throws ParseException {
		System.out.println("Update");
		TbdSysparameters entity = parametersService.findParamById(params
				.getMa());
		if (entity == null) {
			return new ResponseEntity<Integer>(2, HttpStatus.OK);
		}
		entity.setGia_tri(params.getGia_tri());
		entity.setNguoi_capnhat(params.getNguoi_capnhat());
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date date = sdf1.parse(params.getNgay_capnhat());
		java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
		entity.setTen_thamSo(params.getTen_thamSo());
		entity.setNgay_capnhat(sqlStartDate);
		try {
			parametersService.UpdateParameters(entity);
		} catch (Exception e) {
			return new ResponseEntity<Integer>(0, HttpStatus.OK);
		}
		return new ResponseEntity<Integer>(1, HttpStatus.OK);

	}

	@RequestMapping(value = "/tbd_sys_parameters/{ma}", method = RequestMethod.DELETE)
	public ResponseEntity<Integer> DeleteParameter(@PathVariable("ma") int ma) {
		try {
			parametersService.DeleteParameters(ma);
		} catch (Exception e) {
			return new ResponseEntity<Integer>(0, HttpStatus.OK);
		}
		return new ResponseEntity<Integer>(1, HttpStatus.OK);

	}

	@RequestMapping(value = "/tbd_sys_parameters/Search/", method = RequestMethod.POST)
	public ResponseEntity<List<TbdSysparameters>> SearchParameters(
			@RequestBody TbdSysParametersDTO params) throws ParseException {

		List<TbdSysparameters> lst = new ArrayList<TbdSysparameters>();
		String ten_param = params.getTen_thamSo();
		String giatri = params.getGia_tri();
		String nguoi_capnhap = params.getNguoi_capnhat();
		String ngay_capnhap = params.getNgay_capnhat().toString();
		try {
			lst = parametersService.Search(ten_param, giatri, nguoi_capnhap,
					ngay_capnhap);
			return new ResponseEntity<List<TbdSysparameters>>(lst,
					HttpStatus.OK);
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();

		}
		return new ResponseEntity<List<TbdSysparameters>>(lst, HttpStatus.OK);

	}
}
