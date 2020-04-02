package com.example.loaneligibility.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CityStatus extends JpaRepository<CityStatus,Integer>{
	

}
