/**
 * 
 */
package com.example.loaneligibility.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.loaneligibility.entity.Status;

/**
 * @author Sweta
 *
 */
@Repository
public interface StatusRepo extends JpaRepository<Status,Integer> {

}
