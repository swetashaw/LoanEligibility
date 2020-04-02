package com.example.loaneligibility.repository;	
import java.sql.ResultSet;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.example.loaneligibility.entity.CityStatus;
import com.example.loaneligibility.entity.Status;

/**
 * @author sweta	
 *
 */

@Repository
public class NativeSqlRepo {

    @PersistenceContext
    EntityManager entityManager;


	

	public List<CityStatus> getCityStaus(int pincode) {

		Query query = entityManager.createNativeQuery("select  * from City_Status where pin_code='" 
		+ pincode+"'",CityStatus.class);
		return   query.getResultList();
	}
	  
	public List<Status> getStaus(int stausId) {
		Query query = entityManager.createNativeQuery("Select * from STATUS  where status_id= '" 
		+ stausId+"'",Status.class); 
      
		return    query.getResultList();
	}
	  
	 
}
