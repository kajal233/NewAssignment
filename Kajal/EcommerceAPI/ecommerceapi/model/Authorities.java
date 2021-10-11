package com.spring.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="authorities")
public class Authorities {

	@Id
	@NotNull
	@Column(name="authority_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer authority_id;
	
	@Column(name="email_id")
	private String emailid;
	
	@Column(name="authorities")
	private String authorities;
	
	
	public Integer getAuthority_id() {
		return authority_id;
	}
	public void setAuthority_id(Integer authority_id) {
		this.authority_id = authority_id;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getAuthorities() {
		return authorities;
	}
	public void setAuthorities(String authorities) {
		this.authorities = authorities;
	}
	
}
