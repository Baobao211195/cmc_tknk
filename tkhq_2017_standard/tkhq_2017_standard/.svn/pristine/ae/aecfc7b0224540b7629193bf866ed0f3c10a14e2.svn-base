package com.tkhq.cmc.controller.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tkhq.cmc.common.Constants;
import com.tkhq.cmc.dto.TbsQtacLuongDTO;
import com.tkhq.cmc.model.TbsQtacLuongNhapkhau;
import com.tkhq.cmc.services.TbsQtacLuongNhapkhauService;
import com.tkhq.cmc.utils.Utils;

@RestController
public class TbsQtacLuongNhapkhauRestController {
	@Autowired
	private TbsQtacLuongNhapkhauService tbsQtacLuongNhapkhauService;
	
	@RequestMapping(value="/tbsQtacLuongNhapkhau", method=RequestMethod.GET)
	public ResponseEntity<TbsQtacLuongDTO> getAllData (){
		
		TbsQtacLuongDTO dto = new TbsQtacLuongDTO();
		List<TbsQtacLuongNhapkhau> listData = tbsQtacLuongNhapkhauService.findAll();
		long totalCount = tbsQtacLuongNhapkhauService.countTotal(Constants.EMPTY, Constants.EMPTY);
		dto.setContent(listData);
		dto.setTotalItems(totalCount);
		if(listData == null){
			return new ResponseEntity<TbsQtacLuongDTO>(dto, HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<TbsQtacLuongDTO>(dto, HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/tbsQtacLuongNhapkhauById", method=RequestMethod.GET)
	public ResponseEntity<TbsQtacLuongNhapkhau> getDataById(String id){
		TbsQtacLuongNhapkhau dto = tbsQtacLuongNhapkhauService.findById(Long.parseLong(id));
		if(dto == null){
			return new ResponseEntity<TbsQtacLuongNhapkhau>(dto, HttpStatus.CONFLICT);
		}
		return new ResponseEntity<TbsQtacLuongNhapkhau>(dto, HttpStatus.OK);
	}
	
	@RequestMapping(value="/delete/tbsQtacLuongNhapkhau", method=RequestMethod.GET)
	public ResponseEntity<Integer> doDeleteData(String id){
		Long idDelete = Long.parseLong(id);
		TbsQtacLuongNhapkhau dto = tbsQtacLuongNhapkhauService.findById(idDelete);
		if(dto == null){
			return new ResponseEntity<Integer>(Constants.FAILED, HttpStatus.CONFLICT);
		}
		tbsQtacLuongNhapkhauService.delete(idDelete);
		return new  ResponseEntity<Integer>(Constants.SUCCESS, HttpStatus.OK);
	}
	
	@RequestMapping(value="/add/tbsQtacLuongNhapkhau", method=RequestMethod.POST)
	public ResponseEntity<Integer> doAddData(@RequestBody TbsQtacLuongNhapkhau tbsqtacdntrigianhapkhau){
		try {
			tbsQtacLuongNhapkhauService.insert(tbsqtacdntrigianhapkhau);
			return new  ResponseEntity<Integer>(Constants.SUCCESS, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<Integer>(Constants.FAILED, HttpStatus.CONFLICT);
		}
	}
	
	@RequestMapping(value="/update/tbsQtacLuongNhapkhau", method=RequestMethod.POST)
	public ResponseEntity<Integer> doUpdateData(@RequestBody TbsQtacLuongDTO paramDto){
		try {
			TbsQtacLuongNhapkhau dto = tbsQtacLuongNhapkhauService.findById(paramDto.getId());
			if (dto == null){
				return new ResponseEntity<Integer>(Constants.FAILED, HttpStatus.CONFLICT);
			}
			tbsQtacLuongNhapkhauService.update(paramDto);
			return new  ResponseEntity<Integer>(Constants.SUCCESS, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<Integer>(Constants.FAILED, HttpStatus.CONFLICT);
		}
	}
	
	@RequestMapping(value="/search/tbsQtacLuongNhapkhau", method=RequestMethod.POST)
	public ResponseEntity<TbsQtacLuongDTO> SearchData(@RequestBody TbsQtacLuongDTO tbsqtacluongdto){
		
		TbsQtacLuongDTO dto = null;
		List<TbsQtacLuongNhapkhau> listData = null;
		try {
			int minRow = (tbsqtacluongdto.getCurrentPage() - 1) * tbsqtacluongdto.getPageSize();
			int maxRow = tbsqtacluongdto.getPageSize();
			
			long totalCount = tbsQtacLuongNhapkhauService.countTotal(tbsqtacluongdto.getMathongke(), 
																	Utils.escapeNull(tbsqtacluongdto.getLuonglonnhat()));
			if (totalCount == 0) {
				dto = new TbsQtacLuongDTO();
				dto.setContent(new ArrayList<TbsQtacLuongDTO>());
				dto.setCurrentPage(Constants.CURRENT_PAGE);
				dto.setMaxPage(Constants.MAX_PAGE);
				dto.setPageSize(Constants.PAGE_SIZE_10);
				dto.setTotalItems(Constants.ZEZO);
				return new ResponseEntity<TbsQtacLuongDTO>(dto, HttpStatus.ACCEPTED);
			}
			listData = tbsQtacLuongNhapkhauService.searchData(tbsqtacluongdto.getMathongke(), 
																Utils.escapeNull(tbsqtacluongdto.getLuonglonnhat()),
															    minRow, maxRow);
			int maxPage = (int) Math.ceil(totalCount / Integer.valueOf(tbsqtacluongdto.getPageSize()));
			dto = new TbsQtacLuongDTO();
			dto.setContent(listData);
	    	dto.setCurrentPage(tbsqtacluongdto.getCurrentPage());
	    	dto.setMaxPage(maxPage);
	    	dto.setPageSize(Integer.valueOf(Constants.PAGE_SIZE_10));
	    	dto.setTotalItems(totalCount);
	    	
			return new ResponseEntity<TbsQtacLuongDTO>(dto, HttpStatus.OK);
		} catch (Exception e) {
			dto = new TbsQtacLuongDTO();
			dto.setContent(new ArrayList<TbsQtacLuongDTO>());
			return new ResponseEntity<TbsQtacLuongDTO>(dto, HttpStatus.ACCEPTED);
		}
	}
}
