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
@Table(name="Cart")
public class Cart {

	@Id
	@NotNull
	@Column(name="cart_Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cart_Id;
	
	@NotNull
	@Column(name="total_Price")
	private Double totalPrice;
	
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
		
}
