package com.jsp.springBoot1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springBoot1.dao.DummyDao;
import com.jsp.springBoot1.dto.DummyDto;
@Service
public class DummyService {
	
	@Autowired
	DummyDao dummyDao;
	public String insert(DummyDto dummyDto) {
		return dummyDao.insert(dummyDto);
		
	}
	public Object fetchbyid(DummyDto dummydto) {
		return dummyDao.fetchbyid(dummydto);
	}
	public String delbyid(DummyDto dummydto) {
		return dummyDao.delbyid(dummydto);
	}
	
	public Object fetchAll() {
		return dummyDao.fetchAll();
	}
	
	
}
