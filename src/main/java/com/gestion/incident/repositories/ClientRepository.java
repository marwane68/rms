package com.gestion.incident.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gestion.incident.bean.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, String> {
	

}
