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
import javax.persistence.criteria.CriteriaBuilder.In;

import com.sun.istack.NotNull;


@Entity
@Table(name="User")
public class User {

	@Id
	@NotNull
	@Column(name="user_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer user_id;
	
	@Column(name="emailid")
	private String emailid;
	
	@Column(name="password")
	private String password;
	
	@Column(name="enabled")
	private String enabled;
	
	
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEnabled() {
		return enabled;
	}
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	
}

