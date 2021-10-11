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

import org.hibernate.annotations.Cascade;

import com.sun.istack.NotNull;

@Entity
@Table(name="ShippingAddress")
public class ShippingAddress {

	@Id
	@NotNull
	@Column(name="shippingAddress_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer shippingAddress_id;
	
	@Column(name="address")
	private String address;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name = "zipcode")
	private Integer zipcode;
	
	@Column(name="country")
	private String country;
	
	//Getters and setters
	public Integer getShippingAddress_id() {
		return shippingAddress_id;
	}
	public void setShippingAddress_id(Integer shippingAddress_id) {
		this.shippingAddress_id = shippingAddress_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
