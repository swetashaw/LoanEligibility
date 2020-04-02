package com.example.loaneligibility.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.loaneligibility.dto.request.CustomerInfoReqDto;
import com.example.loaneligibility.dto.response.CustomerLoanEligibilityResponse;
import com.example.loaneligibility.service.LoanEligibilityService;

@RestController
public class LoanEligibilityController {

	@Autowired
	LoanEligibilityService loanEligibilityService;

	@PostMapping("/CustomerEligibility")
	public ResponseEntity<CustomerLoanEligibilityResponse> checkEligibility(
			@RequestBody CustomerInfoReqDto customerInfo) {
		CustomerLoanEligibilityResponse customerLoanEligibilityResponse = new CustomerLoanEligibilityResponse();
		customerLoanEligibilityResponse = loanEligibilityService.calculateEligibility(customerInfo);
		return ResponseEntity.status(HttpStatus.OK).body(customerLoanEligibilityResponse);

	}

}
