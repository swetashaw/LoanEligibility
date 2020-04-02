package com.example.loaneligibility.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.loaneligibility.entity.CityStatus;
@Repository
public interface CityStatusRepo extends JpaRepository<CityStatus,Integer>{
	

}
