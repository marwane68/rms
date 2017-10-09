package com.gestion.incident.bean;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

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
	@Column(name = "NO_RESPONSABLE")
	String no_responsable;
	
	@OneToMany(targetEntity = Incident.class, cascade = CascadeType.ALL, mappedBy = "client",fetch=FetchType.LAZY)
	@JsonManagedReference
	public Set<Incident> incidents = new HashSet<Incident>(0);
	
	public Client() {

	}

	public Client(String idclient, String prenom, String nom, String sexe, String email, Date date_naissance, String entreprise,
			String telephone, String no_responsable) {
		this.idclient = idclient;
		this.prenom = prenom;
		this.nom = nom;
		this.sexe = sexe;
		this.email = email;
		this.date_naissance = date_naissance;
		this.entreprise = entreprise;
		this.telephone = telephone;
		this.no_responsable = no_responsable;
	}
	
	
	public Collection<Incident> getIncidents() {
		return incidents;
	}

	public void setIncidents(Set<Incident> incidents) {
		this.incidents = incidents;
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

	public String getNo_responsable() {
		return no_responsable;
	}

	public void setNo_responsable(String no_responsable) {
		this.no_responsable = no_responsable;
	}

	
}
