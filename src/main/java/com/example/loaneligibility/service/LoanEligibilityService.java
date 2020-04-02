package com.example.loaneligibility.service;

import org.springframework.stereotype.Service;

import com.example.loaneligibility.dto.response.CustomerLoanEligibilityResponse;

@Service
public class LoanEligibilityService {

	public CustomerLoanEligibilityResponse calculateEligibility() {
		CustomerLoanEligibilityResponse response=new CustomerLoanEligibilityResponse();
		
		return response;
	}

}
