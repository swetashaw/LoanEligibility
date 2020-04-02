package com.example.loaneligibility.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Sweta
 *
 */
@Entity
@Table(name = "bank_constraint")
public class Bank_Constraint implements Serializable {

	/**
	 * default Serial id
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int constraintId;

	@ManyToOne(optional = true, cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	@JoinColumn(name = "status_id", referencedColumnName = "status_id")
	private Status status;
	@Column(name = "percentage_id")
	private double percentageId;
	public int getConstraintId() {
		return constraintId;
	}
	public void setConstraintId(int constraintId) {
		this.constraintId = constraintId;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public double getPercentageId() {
		return percentageId;
	}
	public void setPercentageId(double percentageId) {
		this.percentageId = percentageId;
	}
	
	

}
