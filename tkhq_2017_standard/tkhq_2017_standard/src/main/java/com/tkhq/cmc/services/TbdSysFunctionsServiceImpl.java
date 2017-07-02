package com.tkhq.cmc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tkhq.cmc.dao.TbdSysFunctionsDAO;
import com.tkhq.cmc.dto.TbdSysFunctionsDTO;

@Service
@Transactional
public class TbdSysFunctionsServiceImpl implements TbdSysFunctionsService {
	@Autowired
	TbdSysFunctionsDAO tbdSysFunctionDao;

	public List<TbdSysFunctionsDTO> getAll() {
		return tbdSysFunctionDao.getAll();
	}

}
