package com.example.loaneligibility.dto.request;

import java.util.Date;

public class CustomerInfoReqDto {
	
	private Date dateOfBirth;
	
	private double monthlyIncome;
	
	private double monthlyExpenses;
	
	private int pinCode;
	 
	private int durationOfMortgage;
	
	private double expectedLoanAmount;

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public double getMonthlyIncome() {
		return monthlyIncome;
	}

	public void setMonthlyIncome(double monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}

	public double getMonthlyExpenses() {
		return monthlyExpenses;
	}

	public void setMonthlyExpenses(double monthlyExpenses) {
		this.monthlyExpenses = monthlyExpenses;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public int getDurationOfMortgage() {
		return durationOfMortgage;
	}

	public void setDurationOfMortgage(int durationOfMortgage) {
		this.durationOfMortgage = durationOfMortgage;
	}

	public double getExpectedLoanAmount() {
		return expectedLoanAmount;
	}

	public void setExpectedLoanAmount(double expectedLoanAmount) {
		this.expectedLoanAmount = expectedLoanAmount;
	}
	
	
	

}
