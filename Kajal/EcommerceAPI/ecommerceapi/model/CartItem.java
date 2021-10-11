package com.spring.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="CartItem")
public class CartItem {

	@Id
	@NotNull
	@Column(name="cartItem_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cartItem_id;
	
	@Column(name="quantity")
	private Integer quantity;
	
	@Column(name="price")
	private Double price;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="cart_Id")
	private Cart cart;
	
	public Integer getCartItem_id() {
		return cartItem_id;
	}
	public void setCartItem_id(Integer cartItem_id) {
		this.cartItem_id = cartItem_id;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	
}
