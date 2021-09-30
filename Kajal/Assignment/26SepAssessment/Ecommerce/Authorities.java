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
@Table(name="Authorities")
public class Authorities {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="authorities_id")
	private Integer authorities_id;
	@Column(name="emailid")
	private String emailid;
	@Column(name="authorities")
	private String authorities;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="authorities_id")
	@OrderColumn(name="type")
	private List<Customer> customers;
	
	public Integer getAuthorities_id() {
		return authorities_id;
	}
	public void setAuthorities_id(Integer authorities_id) {
		this.authorities_id = authorities_id;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getauthorities() {
		return authorities;
	}
	public void setauthorities(String authorities) {
		this.authorities = authorities;
	
	}
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
}


