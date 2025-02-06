package com.jsp.springBoot1.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.jsp.springBoot1.dto.DummyDto;
import com.jsp.springBoot1.repository.DummyRepository;

@Repository
public class DummyDao {
	
	@Autowired
	DummyRepository dummyRepository;
	
	public String insert(DummyDto dummydto) {
		dummyRepository.save(dummydto);
		return "data inserted";
		
	}
}
