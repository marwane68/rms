package com.gestion.incident.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Authentification {
	
	@Id
	@Column(name = "LOGIN")
	String login;
	@Column(name = "PASSWORD")
	String password;
	@Column(name = "ROLE")
	String role;
	
	public Authentification(){
		
	}
	
	public Authentification(String login, String password, String role) {
		super();
		this.login = login;
		this.password = password;
		this.role = role;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	

}
