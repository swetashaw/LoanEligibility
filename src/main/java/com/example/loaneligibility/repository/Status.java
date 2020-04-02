/**
 * 
 */
package com.example.loaneligibility.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Sweta
 *
 */
@Repository
public interface Status extends JpaRepository<Status, Integer> {

}
