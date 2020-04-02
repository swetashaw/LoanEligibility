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
@Table(name = "city_status")
public class CityStatus implements Serializable {
	
	/**
	 * default Serial id
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="pin_code")
	private int pincode;
	
	@Column(name="city")
	private String city;
	
	
	@ManyToOne(optional=true,
	cascade= {CascadeType.ALL},fetch=FetchType.EAGER)
	@JoinColumn(name="status_id", referencedColumnName="status_id")
	private Status status;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}
	

	
	
	
	
	

	

}
