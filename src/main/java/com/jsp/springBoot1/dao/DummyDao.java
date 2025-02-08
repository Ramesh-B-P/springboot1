package com.jsp.springBoot1.dao;
import java.util.List;
import java.util.Optional;

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
//	-------------------------- fetch --by ----id-------------------------------------
	public Object fetchbyid(DummyDto dummydto) {
		int id=dummydto.getId();
		Optional<DummyDto> o=dummyRepository.findById(id);
		DummyDto dto=o.get();
		return dto;
	}
//  -------------------------- delete ---by----id--------------------------------
	public String delbyid(DummyDto dummydto) {
		int id=dummydto.getId();
		Optional<DummyDto> o=dummyRepository.findById(id);
		DummyDto dto=o.get();
		dummyRepository.delete(dto);
		return "data deleted";
	
	}
	

	public List<DummyDto> fetchAll(){
		List<DummyDto> list= dummyRepository.findAll();
		if(list.isEmpty()) {
			return null;
		}else {
			return list;
		}
		
	}

}
