package com.example.loaneligibility.Validator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.loaneligibility.exception.ReadProperties;

@Component
public class ValidateEligibility {

	@Autowired
	ReadProperties readProp;

	public int calculateAge(Date dob) {
		DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		int d1 = Integer.parseInt(formatter.format(dob));
		int d2 = Integer.parseInt(formatter.format(new Date()));
		int age = (d2 - d1) / 10000;
		return age;

	}

	public boolean ageEligibility(int age, int duration) {
		int total = age + duration;

		if (total < readProp.getAgeConstraint()) {
			return false;
		}
		return true;

	}

	public boolean validateEMI(double monthlyExpense, double expectedAmount, double monthlyIncome, int duration) {
		int totalMonths = duration * 12;
		double emi = expectedAmount / totalMonths;
		if (emi < monthlyIncome - monthlyExpense) {
			return true;
		}
		return false;
	}

}
