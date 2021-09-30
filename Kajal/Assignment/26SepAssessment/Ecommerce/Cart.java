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
@Table(name="Cart")
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cart_id")
	private Integer cart_Id;
	@Column(name="totalPrice")
	private Double totalPrice;
	
	@OneToMany(cascade =CascadeType.ALL)
	@JoinColumn(name="cart_id")
	@OrderColumn(name="type")
	private List<Customer> customers;
	
	@OneToMany(cascade =CascadeType.ALL)
	@JoinColumn(name="cart_id")
	@OrderColumn(name="type")
	private List<SalesOrder> salesOrders;
	

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="cart_id")
	@OrderColumn(name="type")
	private List<CartItem> cartItems;
	
	//Getters and setters
	public Integer getCart_Id() {
		return cart_Id;
	}
	public void setCart_Id(Integer cart_Id) {
		this.cart_Id = cart_Id;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	public List<SalesOrder> getSalesOrders() {
		return salesOrders;
	}
	public void setSalesOrders(List<SalesOrder> salesOrders) {
		this.salesOrders = salesOrders;
	}
}