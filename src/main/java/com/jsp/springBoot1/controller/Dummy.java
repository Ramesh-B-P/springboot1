package com.jsp.springBoot1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springBoot1.dto.DummyDto;
import com.jsp.springBoot1.service.DummyService;


@RestController
@RequestMapping("/d")
public class Dummy {
	@Autowired
	DummyService dummyService;
   @PostMapping
   public String insert(@RequestBody DummyDto dummyDto) {
//		System.out.println(dummydto);
//		return "data inserted";
		return dummyService.insert(dummyDto);
	}
   

}
