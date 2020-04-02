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

	

}
