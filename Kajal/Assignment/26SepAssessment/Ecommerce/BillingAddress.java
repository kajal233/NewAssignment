package com.databaseschema;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name="BillingAddress")
public class BillingAddress {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Integer billingAddress_id;
	private String address;
	private String city;
	private String state;
	private Integer zipcode;
	private String country;
	
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="billingAddress_id")
	@OrderColumn(name="type")
	private List<Customer> customer;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="billingAddress_id")
	@OrderColumn(name="type")
	private List<SalesOrder> salesOrders;
	
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
	public List<Customer> getCustomer() {
		return customer;
	}
	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}
	public List<SalesOrder> getSalesOrders() {
		return salesOrders;
	}
	public void setSalesOrders(List<SalesOrder> salesOrders) {
		this.salesOrders = salesOrders;
	}
}