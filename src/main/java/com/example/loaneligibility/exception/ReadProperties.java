package com.example.loaneligibility.exception;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:constraint.properties")
public class ReadProperties {
	
	@Value("${com.project.cut_off_age}")
	private int ageConstraint;

	public int getAgeConstraint() {
		return ageConstraint;
	}

	public void setAgeConstraint(int ageConstraint) {
		this.ageConstraint = ageConstraint;
	}
	
	

}
