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
@Table(name="Customer")
public class Customer {

	@Id
	@NotNull
	@Column(name="Customer_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Customer_id;
	
	@NotNull
	@Column(name="firstName")
	private String firstName;
	
	@NotNull
	@Column(name="lastName")
	private String lastName;
	
	@NotNull
	@Column(name="customerPnone")
	private String customerPnone;

	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	//Parameterized constructor
	public Customer(String firstName, String lastName, String customerPnone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.customerPnone = customerPnone;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="shippingAddress_id")
	private ShippingAddress shippingAddress;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="billingAddress_id")
	private BillingAddress billingAddress;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id")
	private User user;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="cart_Id")
	private Cart cart;
	
	
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
	public String getCustomerPnone() {
		return customerPnone;
	}
	public void setCustomerPnone(String customerPnone) {
		this.customerPnone = customerPnone;
	}

	public BillingAddress getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}

	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	
				
}
