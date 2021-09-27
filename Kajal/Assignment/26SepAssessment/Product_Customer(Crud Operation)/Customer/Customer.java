package com.hibernate;

public class Customer {
 

//this is called property
private int id;
private String customerName;
private String customerAddress;
private int mobileno;

public Customer() {
}

public Customer(String customerName, String customerAddress, int mobileno) {
	super();

	this.customerName = customerName;
	this.customerAddress= customerAddress;
	this.mobileno = mobileno;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public String getCustomerAddress() {
	return customerAddress;
}

public void setCustomerAddress(String customerAddress) {
	this.customerAddress =customerAddress;
}

public int getMobileno() {
	return mobileno;
}

public void setMobileno(int mobileno) {
	this.mobileno = mobileno;
}

}
