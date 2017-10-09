package com.gestion.incident.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gestion.incident.bean.Authentification;

@Repository
public interface AuthentificationRepository extends CrudRepository<Authentification, String> {


	
	

}
