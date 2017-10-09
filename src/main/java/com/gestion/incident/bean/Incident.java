package com.gestion.incident.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
/**
 * @author Marwane
 *
 */
@Entity
public class Incident {
	
	@Id
	@Column(name = "IDINCIDENT")
	String idincident;
	@Column(name = "AUTEUR")
	String auteur;
	@Column(name = "INTITULE")
	String intitule;
	@Column(name = "CONSEQUENCE")
	String consequence;
	@JsonFormat(pattern="dd-MM-yyyy")
	@Column(name = "DATE_CREATION")
	Date date_creation;
	@Column(name = "NO_CLIENT")
	String no_client;
	
	@ManyToOne
	@JoinColumn(name = "NO_CLIENT", insertable=false, updatable=false)
	@JsonBackReference
	public Client client;
	
	public Incident(){
		
	}
	
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}


	public Incident(String idincident, String auteur, String intitule, String consequence, Date date_creation, String no_client) {
		this.idincident = idincident;
		this.auteur = auteur;
		this.intitule = intitule;
		this.consequence = consequence;
		this.date_creation = date_creation;
	//	this.no_client = no_client;
		
	}


	public String getIdincident() {
		return idincident;
	}


	public void setIdincident(String idincident) {
		this.idincident = idincident;
	}


	public String getAuteur() {
		return auteur;
	}


	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}


	public String getIntitule() {
		return intitule;
	}


	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}


	public String getConsequence() {
		return consequence;
	}


	public void setConsequence(String consequence) {
		this.consequence = consequence;
	}


	public Date getDate_creation() {
		return date_creation;
	}


	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}


	public String getNo_client() {
		return no_client;
	}


	public void setNo_client(String no_client) {
		this.no_client = no_client;
	}


	
	
	

}
