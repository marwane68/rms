package com.gestion.incident.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.incident.bean.Administrateur;
import com.gestion.incident.repositories.AdministrateurRepository;


@Service
public class AdministrateurService {

	@Autowired
	public AdministrateurRepository adminRepository;

//déclaration des attributs	
	//Calendar calendar = new GregorianCalendar(2014, 9, 31);
	//Date next_date = calendar.getTime();

	
//les méthodes utilisées dans le controller par injection		
	public List<Administrateur> GetAllAdmins() {	
		return (List<Administrateur>)adminRepository.findAll();
		}
		
	
	public Administrateur GetAdministrateurById(String Idadmin) {
		return adminRepository.findOne(Idadmin);
		//lambda expression
		//return clients.stream().filter((Client c) -> c.getId().equals(Id)).findFirst().get();
	}
	
	public String AddAdministrateur(Administrateur admin){
		adminRepository.save(admin);
		return "le client a été ajouter avec succès";
	}
	
	public void UpdateAdministrateur(Administrateur admin){
	if(adminRepository.exists(admin.getIdadmin())){
		adminRepository.save(admin);
	}
}
	
	public void DeleteAdministrateur(String idadmin) {
		adminRepository.delete(idadmin);
		//clients.removeIf(client -> client.getId().equals(idclient));
	}
	
}
