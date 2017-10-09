package com.gestion.incident.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gestion.incident.bean.Administrateur;


@Repository
public interface AdministrateurRepository extends CrudRepository<Administrateur, String> {
	

}
