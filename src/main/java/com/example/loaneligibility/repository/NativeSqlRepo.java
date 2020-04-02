package com.example.loaneligibility.repository;	
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

/**
 * @author sweta	
 *
 */

@Repository
public class NativeSqlRepo {

    @PersistenceContext
    EntityManager entityManager;


	
	
	 
}
