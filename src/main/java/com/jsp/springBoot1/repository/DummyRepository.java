package com.jsp.springBoot1.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jsp.springBoot1.dto.DummyDto;

public interface DummyRepository extends JpaRepository<DummyDto, Integer>{

}
