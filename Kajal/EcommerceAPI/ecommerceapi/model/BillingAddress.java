package com.spring.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="BillingAddress")
public class BillingAddress {

	@Id
	@NotNull
	@Column(name="billingAddress_id")
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Integer billingAddress_id;
	
	@Column(name="address_details")
	private String address;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@NotNull
	@Column(name="zipcode")
	private Integer zipcode;
	
	@NotNull
	@Column(name="country")
	private String country;
	
	//Getters and setters method
	public Integer getBillingAddress_id() {
		return billingAddress_id;
	}
	public void setBillingAddress_id(Integer billingAddress_id) {
		this.billingAddress_id = billingAddress_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getZipcode() {
		return zipcode;
	}
	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
