package com.gestion.incident.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

//model class
@Entity
public class Client {

	@Id
	@Column(name = "ID")
	String idclient;
	@Column(name = "PRENOM")
	String prenom;
	@Column(name = "NOM")
	String nom;
	@Column(name = "SEXE")
	String sexe;
	@Column(name = "EMAIL")
	String email;
	@JsonFormat(pattern="dd-MM-yyyy")
	@Column(name = "DATE_NAISSANCE")
	Date date_naissance;
	@Column(name = "ENTREPRISE")
	String entreprise;
	@Column(name = "TELEPHONE")
	String telephone;
	
	
	public Client() {

	}

	public Client(String idclient, String prenom, String nom, String sexe, String email, Date date_naissance, String entreprise,
			String telephone) {
		this.idclient = idclient;
		this.prenom = prenom;
		this.nom = nom;
		this.sexe = sexe;
		this.email = email;
		this.date_naissance = date_naissance;
		this.entreprise = entreprise;
		this.telephone = telephone;
	}
	
	
	public String getId() {
		return idclient;
	}
	public void setId(String idclient) {
		this.idclient = idclient;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}
