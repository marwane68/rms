package com.gestion.incident.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.incident.bean.Client;
import com.gestion.incident.exception.IncidentException;
import com.gestion.incident.repositories.ClientRepository;


@Service
public class ClientService {

	@Autowired
	public ClientRepository clientRepository;
	

//déclaration des attributs	
	//Calendar calendar = new GregorianCalendar(2014, 9, 31);
	//Date next_date = calendar.getTime();

	
//les méthodes utilisées dans le controller par injection		
	public List<Client> GetAllClients() {	
		return (List<Client>)clientRepository.findAll();
		}
		
	
	public Client GetClientById(String Idclient) {
		return clientRepository.findOne(Idclient);
		//lambda expression
		//return clients.stream().filter((Client c) -> c.getId().equals(Id)).findFirst().get();
	}
	
	public String AddClient(Client client) throws IncidentException{
		if(clientRepository.exists((client.getId()))){
			throw new IncidentException("le client existe déja");
		}else
		clientRepository.save(client);
		return "le client a été ajouter avec succès";
	}
	
	public void UpdateClient(Client client) throws IncidentException{
	if(clientRepository.exists(client.getId())){
		clientRepository.save(client);
	}else 
		throw new IncidentException("le client n'existe pas pour une mise à jour");
}
	

	public void DeleteClient(String idclient) throws IncidentException {
		if(clientRepository.exists(idclient)){
		clientRepository.delete(idclient);
		}else
			throw new IncidentException("l'id du client à supprimer n'existe pas");
		//clients.removeIf(client -> client.getId().equals(idclient));
	}
	
	public int NumberClients(){
		ArrayList<Client> ListClient = (ArrayList<Client>)clientRepository.findAll();
		return ListClient.size();
	}
	
}
