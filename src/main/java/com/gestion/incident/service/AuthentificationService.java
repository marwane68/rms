package com.gestion.incident.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.incident.bean.Authentification;
import com.gestion.incident.repositories.AuthentificationRepository;


@Service
public class AuthentificationService {

	@Autowired
	public AuthentificationRepository authentificationRepository;

	
//les méthodes utilisées dans le controller par injection		
	public List<Authentification> GetAllAuthentifications() {	
		return (List<Authentification>)authentificationRepository.findAll();
		}
		
	
	public Authentification GetAuthentificationByLogin(String login) {
		return authentificationRepository.findOne(login);
	}
	
	public String AddAuthentification(Authentification authentification){
		authentificationRepository.save(authentification);
		return "le login a été ajouter avec succès";
	}
	
	public void UpdateAuthentification(Authentification authentification){
	if(authentificationRepository.exists(authentification.getLogin())){
		authentificationRepository.save(authentification);
	}
}
	
	public void DeleteAuthentification(String login) {
		authentificationRepository.delete(login);
	}
	
	public Authentification authentifier(String login, String password){
		if(authentificationRepository.exists(login)){
			final Authentification user = authentificationRepository.findOne(login);
				if(user.getPassword().equals(password))
					return user;
		}
		return null;
	}
	
}
