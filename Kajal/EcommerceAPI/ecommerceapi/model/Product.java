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
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import com.sun.istack.NotNull;
@Entity
@Table(name="Product")
public class Product {

	@Id
	@NotNull
	@Column(name="product_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer product_id;
	
	@Column(name="category")
	private String category;
	
	@Column(name="description")
	private String description;
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private double price;
	
	@Column(name="unit")
	private Integer unit;
	
	
	public Product() {
		
	}
	/**
	 * @param category
	 * @param description
	 * @param name
	 * @param price
	 * @param unit
	 */
	public Product(String category, String description, String name, double price, Integer unit) {
		super();
		this.category = category;
		this.description = description;
		this.name = name;
		this.price = price;
		this.unit = unit;
	}
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="product_id")
	private List<CartItem> cartItems;
	
	//Getters and setters method
	public Integer getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Integer getUnit() {
		return unit;
	}
	public void setUnit(Integer unit) {
		this.unit = unit;
	}
	public List<CartItem> getCartItems() {
		return cartItems;
	}
	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}
	
		
}
