package com.example.loaneligibility.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.loaneligibility.Validator.ValidateEligibility;
import com.example.loaneligibility.dto.request.CustomerInfoReqDto;
import com.example.loaneligibility.dto.response.CustomerLoanEligibilityResponse;
import com.example.loaneligibility.exception.ExceptionMessageProprties;

@Service
public class LoanEligibilityService {
	
	
	@Autowired
	ValidateEligibility validateEligiblity;	
	
	@Autowired
	ExceptionMessageProprties exceptionMsgProp;

	public CustomerLoanEligibilityResponse calculateEligibility(CustomerInfoReqDto customerInfo) {
		CustomerLoanEligibilityResponse response = new CustomerLoanEligibilityResponse();
		Date Dob = customerInfo.getDateOfBirth();
		int duration = customerInfo.getDurationOfMortgage();
		double expectedAmount = customerInfo.getExpectedLoanAmount();
		double monthlyExpense = customerInfo.getMonthlyExpenses();
		double monthlyIncome = customerInfo.getMonthlyIncome();
		int pincode = customerInfo.getPinCode();
		int age=validateEligiblity.calculateAge(Dob);
		
		if(validateEligiblity.ageEligibility(age,duration)) {
			response.setMessage(exceptionMsgProp.getGenericErr());
			response.setStatusCode(exceptionMsgProp.getErrCode());
			return response;
		}
		
		return response;
	}

	
	
	
}
