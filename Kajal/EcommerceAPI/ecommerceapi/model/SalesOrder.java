package com.spring.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="SalesOrder")
public class SalesOrder {

	@Id
	@NotNull
	@Column(name="salesOrder_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer salesOrder_id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="cart_Id")
	private Cart cart;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="Customer_id")
	private Customer customer;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="shippingAddress_id")
	private ShippingAddress shippingAddress;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="billingAddress_id")
	private BillingAddress billingAddress;

	public Integer getSalesOrder_id() {
		return salesOrder_id;
	}

	public void setSalesOrder_id(Integer salesOrder_id) {
		this.salesOrder_id = salesOrder_id;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public BillingAddress getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}
}
