package com.gestion.incident.repositories;

import org.springframework.data.repository.CrudRepository;

import com.gestion.incident.bean.Incident;

public interface IncidentRepository extends CrudRepository<Incident, String>{
	// on met les signatures des methodes qui n'existent pas dans le repository

}
