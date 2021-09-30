package com.databaseschema;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Customer_id")
	private Integer Customer_id;
	@Column(name="firstName")
	private String firstName;
	@Column(name="lastName")
	private String lastName;
	@Column(name="customerPhone")
	private String customerPhone;

	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	//Parameterized constructor
	public Customer(String firstName, String lastName, String customerPnone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.customerPhone = customerPhone;
	}

	@OneToMany(cascade =CascadeType.ALL)
	@JoinColumn(name="Customer_id")
	@OrderColumn(name="type")
	private List<SalesOrder> salesOrders;
	
	
	//Getters and setter method
	public Integer getCustomer_id() {
		return Customer_id;
	}
	public void setCustomer_id(Integer customer_id) {
		Customer_id = customer_id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public List<SalesOrder> getSalesOrders() {
		return salesOrders;
	}
	public void setSalesOrders(List<SalesOrder> salesOrders) {
		this.salesOrders = salesOrders;
	}
				
}