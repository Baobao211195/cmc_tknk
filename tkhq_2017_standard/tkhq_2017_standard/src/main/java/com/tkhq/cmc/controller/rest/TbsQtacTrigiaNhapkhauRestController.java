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
import com.tkhq.cmc.dto.TbsQtacTrigiaDTO;
import com.tkhq.cmc.model.TbsQtacTrigiaNhapkhau;
import com.tkhq.cmc.services.TbsQtacTrigiaNhapkhauService;
import com.tkhq.cmc.utils.Utils;

@RestController
public class TbsQtacTrigiaNhapkhauRestController {
	
	@Autowired
	private TbsQtacTrigiaNhapkhauService tbsQtacTrigiaNhapkhauService;
	
	@RequestMapping(value="/tbsQtacTrigiaNhapkhau", method=RequestMethod.GET)
	public ResponseEntity<TbsQtacTrigiaDTO> getAllData (){
		
		TbsQtacTrigiaDTO dto = new TbsQtacTrigiaDTO();
		List<TbsQtacTrigiaNhapkhau> listData = tbsQtacTrigiaNhapkhauService.findAll();
		long totalCount = tbsQtacTrigiaNhapkhauService.countTotal(Constants.EMPTY, Constants.EMPTY);
		dto.setContent(listData);
		dto.setTotalItems(totalCount);
		if(listData == null){
			return new ResponseEntity<TbsQtacTrigiaDTO>(dto, HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<TbsQtacTrigiaDTO>(dto, HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/tbsQtacTrigiaNhapkhauById", method=RequestMethod.GET)
	public ResponseEntity<TbsQtacTrigiaNhapkhau> getDataById(String id){
		TbsQtacTrigiaNhapkhau dto = tbsQtacTrigiaNhapkhauService.findById(Long.parseLong(id));
		if(dto == null){
			return new ResponseEntity<TbsQtacTrigiaNhapkhau>(dto, HttpStatus.CONFLICT);
		}
		return new ResponseEntity<TbsQtacTrigiaNhapkhau>(dto, HttpStatus.OK);
	}
	
	@RequestMapping(value="/delete/tbsQtacTrigiaNhapkhau", method=RequestMethod.GET)
	public ResponseEntity<Integer> doDeleteData(String id){
		Long idDelete = Long.parseLong(id);
		TbsQtacTrigiaNhapkhau dto = tbsQtacTrigiaNhapkhauService.findById(idDelete);
		if(dto == null){
			return new ResponseEntity<Integer>(Constants.FAILED, HttpStatus.CONFLICT);
		}
		tbsQtacTrigiaNhapkhauService.delete(idDelete);
		return new  ResponseEntity<Integer>(Constants.SUCCESS, HttpStatus.OK);
	}
	
	@RequestMapping(value="/add/tbsQtacTrigiaNhapkhau", method=RequestMethod.POST)
	public ResponseEntity<Integer> doAddData(@RequestBody TbsQtacTrigiaNhapkhau tbsqtacdntrigianhapkhau){
		try {
			tbsQtacTrigiaNhapkhauService.insert(tbsqtacdntrigianhapkhau);
			return new  ResponseEntity<Integer>(Constants.SUCCESS, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<Integer>(Constants.FAILED, HttpStatus.CONFLICT);
		}
	}
	
	@RequestMapping(value="/update/tbsQtacTrigiaNhapkhau", method=RequestMethod.POST)
	public ResponseEntity<Integer> doUpdateData(@RequestBody TbsQtacTrigiaDTO paramDto){
		try {
			TbsQtacTrigiaNhapkhau dto = tbsQtacTrigiaNhapkhauService.findById(paramDto.getId());
			if (dto == null){
				return new ResponseEntity<Integer>(Constants.FAILED, HttpStatus.CONFLICT);
			}
			tbsQtacTrigiaNhapkhauService.update(paramDto);
			return new  ResponseEntity<Integer>(Constants.SUCCESS, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<Integer>(Constants.FAILED, HttpStatus.CONFLICT);
		}
	}
	
	@RequestMapping(value="/search/tbsQtacTrigiaNhapkhau", method=RequestMethod.POST)
	public ResponseEntity<TbsQtacTrigiaDTO> SearchData(@RequestBody TbsQtacTrigiaDTO tbsqtacluongdto){
		TbsQtacTrigiaDTO dto = null;
		List<TbsQtacTrigiaNhapkhau> listData = null;
		try {
			int minRow = (tbsqtacluongdto.getCurrentPage() - 1) * tbsqtacluongdto.getPageSize();
			int maxRow = tbsqtacluongdto.getPageSize();
			
			long totalCount = tbsQtacTrigiaNhapkhauService.countTotal(tbsqtacluongdto.getMathongke(), 
																	Utils.escapeNull(tbsqtacluongdto.getTrigiatinhthue()));
			if (totalCount == 0) {

				dto = new TbsQtacTrigiaDTO();
				dto.setContent(new ArrayList<TbsQtacTrigiaDTO>());
				dto.setCurrentPage(Constants.CURRENT_PAGE);
				dto.setMaxPage(Constants.MAX_PAGE);
				dto.setPageSize(Constants.PAGE_SIZE_10);
				dto.setTotalItems(Constants.ZEZO);
				
				return new ResponseEntity<TbsQtacTrigiaDTO>(dto, HttpStatus.ACCEPTED);
			}
			listData = tbsQtacTrigiaNhapkhauService.searchData(tbsqtacluongdto.getMathongke(), 
																Utils.escapeNull(tbsqtacluongdto.getTrigiatinhthue()),
															    minRow, maxRow);
			int maxPage = (int) Math.ceil(totalCount / Integer.valueOf(tbsqtacluongdto.getPageSize()));
			dto = new TbsQtacTrigiaDTO();
			dto.setContent(listData);
	    	dto.setCurrentPage(tbsqtacluongdto.getCurrentPage());
	    	dto.setMaxPage(maxPage);
	    	dto.setPageSize(Integer.valueOf(Constants.PAGE_SIZE_10));
	    	dto.setTotalItems(totalCount);
			return new ResponseEntity<TbsQtacTrigiaDTO>(dto, HttpStatus.OK);
			
		} catch (Exception e) {
			dto = new TbsQtacTrigiaDTO();
			dto.setContent(new ArrayList<TbsQtacTrigiaDTO>());
			return new ResponseEntity<TbsQtacTrigiaDTO>(dto, HttpStatus.NO_CONTENT);
		}
	}

}
