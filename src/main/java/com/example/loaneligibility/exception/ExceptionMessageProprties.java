package com.example.loaneligibility.exception;
/**
 *  class for reading the exception message and error code from property file
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:messages.properties")
public class ExceptionMessageProprties {

	@Value("${com.project.exception.message}")
	private String genericErr;

	@Value("${com.project.exception.errorcode}")
	private Integer errCode;
	
	@Value("${com.project.exception.messageeligible}")
	private String eligible;

	@Value("${com.project.exception.errorcodeeligible}")
	private Integer eligibleErrCode;

	public String getGenericErr() {
		return genericErr;
	}

	public void setGenericErr(String genericErr) {
		this.genericErr = genericErr;
	}

	public Integer getErrCode() {
		return errCode;
	}

	public void setErrCode(Integer errCode) {
		this.errCode = errCode;
	}

	public String getEligible() {
		return eligible;
	}

	public void setEligible(String eligible) {
		this.eligible = eligible;
	}

	public Integer getEligibleErrCode() {
		return eligibleErrCode;
	}

	public void setEligibleErrCode(Integer eligibleErrCode) {
		this.eligibleErrCode = eligibleErrCode;
	}

	

}
