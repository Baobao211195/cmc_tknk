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
import com.tkhq.cmc.dto.TbsQtacDongiaNhapkhauDTO;
import com.tkhq.cmc.model.TbsQtacDongiaNhapkhau;
import com.tkhq.cmc.services.TbsQtacDongiaNhapkhauService;
import com.tkhq.cmc.utils.Utils;

@RestController
public class TbsQtacDongiaNhapkhauRestController {
	
	@Autowired
	private TbsQtacDongiaNhapkhauService tbsQtacDongiaNhapkhauService;
	
	@RequestMapping(value="/tbsQtacDongiaNhapkhau", method=RequestMethod.GET)
	public ResponseEntity<TbsQtacDongiaNhapkhauDTO> getAllData (){
		
		TbsQtacDongiaNhapkhauDTO dto = new TbsQtacDongiaNhapkhauDTO();
		List<TbsQtacDongiaNhapkhau> listData = tbsQtacDongiaNhapkhauService.findAll();
		long totalCount = tbsQtacDongiaNhapkhauService.countTotal(Constants.EMPTY, Constants.EMPTY, Constants.EMPTY);
		dto.setContent(listData);
		dto.setTotalItems(totalCount);
		if(listData == null){
			return new ResponseEntity<TbsQtacDongiaNhapkhauDTO>(dto, HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<TbsQtacDongiaNhapkhauDTO>(dto, HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/tbsQtacDongiaNhapkhauById", method=RequestMethod.GET)
	public ResponseEntity<TbsQtacDongiaNhapkhau> getDataById(String id){
		TbsQtacDongiaNhapkhau dto = tbsQtacDongiaNhapkhauService.findById(Long.parseLong(id));
		if(dto == null){
			return new ResponseEntity<TbsQtacDongiaNhapkhau>(dto, HttpStatus.CONFLICT);
		}
		return new ResponseEntity<TbsQtacDongiaNhapkhau>(dto, HttpStatus.OK);
	}
	
	@RequestMapping(value="/delete/tbsQtacDongiaNhapkhau", method=RequestMethod.GET)
	public ResponseEntity<Integer> doDeleteData(String id){
		Long idDelete = Long.parseLong(id);
		TbsQtacDongiaNhapkhau dto = tbsQtacDongiaNhapkhauService.findById(idDelete);
		if(dto == null){
			return new ResponseEntity<Integer>(Constants.FAILED, HttpStatus.CONFLICT);
		}
		tbsQtacDongiaNhapkhauService.delete(idDelete);
		return new  ResponseEntity<Integer>(Constants.SUCCESS, HttpStatus.OK);
	}
	
	@RequestMapping(value="/add/tbsQtacDongiaNhapkhau", method=RequestMethod.POST)
	public ResponseEntity<Integer> doAddData(@RequestBody TbsQtacDongiaNhapkhau tbsqtacdntrigianhapkhau){
		try {
			tbsQtacDongiaNhapkhauService.insert(tbsqtacdntrigianhapkhau);
			return new  ResponseEntity<Integer>(Constants.SUCCESS, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<Integer>(Constants.FAILED, HttpStatus.CONFLICT);
		}
	}
	
	@RequestMapping(value="/update/tbsQtacDongiaNhapkhau", method=RequestMethod.POST)
	public ResponseEntity<Integer> doUpdateData(@RequestBody TbsQtacDongiaNhapkhauDTO paramDto){
		try {
			TbsQtacDongiaNhapkhau dto = tbsQtacDongiaNhapkhauService.findById(paramDto.getId());
			if (dto == null){
				return new ResponseEntity<Integer>(Constants.FAILED, HttpStatus.CONFLICT);
			}
			tbsQtacDongiaNhapkhauService.update(paramDto);
			return new  ResponseEntity<Integer>(Constants.SUCCESS, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<Integer>(Constants.FAILED, HttpStatus.CONFLICT);
		}
	}
	
	@RequestMapping(value="/search/tbsQtacDongiaNhapkhau", method=RequestMethod.POST)
	public ResponseEntity<TbsQtacDongiaNhapkhauDTO> SearchData(@RequestBody TbsQtacDongiaNhapkhauDTO tbsqtacdongianhapkhaudto){
		TbsQtacDongiaNhapkhauDTO dto = null;
		
		List<TbsQtacDongiaNhapkhau> listData = null;
		try {
			int minRow = (tbsqtacdongianhapkhaudto.getCurrentPage() - 1) * tbsqtacdongianhapkhaudto.getPageSize();
			int maxRow = tbsqtacdongianhapkhaudto.getPageSize();
			
			long totalCount = tbsQtacDongiaNhapkhauService.countTotal(tbsqtacdongianhapkhaudto.getMathongke(), 
																	Utils.escapeNull(tbsqtacdongianhapkhaudto.getDongialonnhat()),
																	Utils.escapeNull(tbsqtacdongianhapkhaudto.getDongianhonhat()));
			
			if (totalCount == 0) {
				dto = new TbsQtacDongiaNhapkhauDTO();
				dto.setContent(new ArrayList<TbsQtacDongiaNhapkhauDTO>());
				dto.setCurrentPage(Constants.CURRENT_PAGE);
				dto.setMaxPage(Constants.MAX_PAGE);
				dto.setPageSize(Constants.PAGE_SIZE_10);
				dto.setTotalItems(Constants.ZEZO);
				return new ResponseEntity<TbsQtacDongiaNhapkhauDTO>(dto, HttpStatus.ACCEPTED);
			}
			listData = tbsQtacDongiaNhapkhauService.searchData(tbsqtacdongianhapkhaudto.getMathongke(), 
																Utils.escapeNull(tbsqtacdongianhapkhaudto.getDongialonnhat()),
																Utils.escapeNull(tbsqtacdongianhapkhaudto.getDongianhonhat()),
															    minRow, maxRow);
			
			int maxPage = (int) Math.ceil(totalCount / Integer.valueOf(tbsqtacdongianhapkhaudto.getPageSize()));
			
			dto = new TbsQtacDongiaNhapkhauDTO();
			dto.setContent(listData);
	    	dto.setCurrentPage(tbsqtacdongianhapkhaudto.getCurrentPage());
	    	dto.setMaxPage(maxPage);
	    	dto.setPageSize(Integer.valueOf(Constants.PAGE_SIZE_10));
	    	dto.setTotalItems(totalCount);
	    	
			return new ResponseEntity<TbsQtacDongiaNhapkhauDTO>(dto, HttpStatus.OK);
		} catch (Exception e) {
			dto = new TbsQtacDongiaNhapkhauDTO();
			dto.setContent(new ArrayList<TbsQtacDongiaNhapkhauDTO>());
			return new ResponseEntity<TbsQtacDongiaNhapkhauDTO>(dto, HttpStatus.ACCEPTED);
		}
	}
}
