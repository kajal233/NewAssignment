package com.example.demo;

public class person {
	
	private Integer id;
	private String name;
	private String email;
	private String address;
	
	//Constructor
	public person()
	{
		super();
	}
	
	//parameterize constructor
	public person(Integer id,String name,String email,String address)
	{
		super();
		this.id=id;
		this.name=name;
		this.email=email;
		this.address=address;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	//Name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//Email
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//Address
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
