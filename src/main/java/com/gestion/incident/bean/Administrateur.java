package com.gestion.incident.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Administrateur {
	
	@Id
	@Column(name = "IDADMIN")
	String idadmin;
	@Column(name = "IDROOT")
	String idroot;
	@Column(name = "NOM")
	String nom;
	@Column(name = "PRENOM")
	String prenom;
	@Column(name = "EMAIL")
	String email;
	@JsonFormat(pattern="dd-MM-yyyy")
	@Column(name = "DATE_NAISSANCE")
	Date date_naissance;
	@Column(name = "PAYS")
	String pays;
	@Column(name = "TELEPHONE")
	String telephone;

	
	
	public Administrateur(String idadmin, String idroot, String nom, String prenom, String email, Date date_naissance,
			String pays, String telephone) {
		this.idadmin = idadmin;
		this.idroot = idroot;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.date_naissance = date_naissance;
		this.pays = pays;
		this.telephone = telephone;
	}
	
	public Administrateur(){
		
	}
	
	
	public String getIdadmin() {
		return idadmin;
	}
	public void setIdadmin(String idadmin) {
		this.idadmin = idadmin;
	}
	public String getIdroot() {
		return idroot;
	}
	public void setIdroot(String idroot) {
		this.idroot = idroot;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	

}
