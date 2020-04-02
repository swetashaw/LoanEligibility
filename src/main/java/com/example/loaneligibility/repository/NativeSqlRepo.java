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


	/*
	 * public List<Stock> getStocksByStockName(StringBuffer whereQuery) {
	 * 
	 * Query query = entityManager.createNativeQuery("Select * from stock where " +
	 * whereQuery, Stock.class);
	 * 
	 * return query.getResultList(); }
	 * 
	 * 
	 * public List<UserStocks> getUserStocksByStockId(StringBuffer whereQuery) {
	 * Query query =
	 * entityManager.createNativeQuery("Select * from user_stocks where " +
	 * whereQuery, UserStocks.class);
	 * 
	 * return query.getResultList();
	 * 
	 * }
	 */
}
