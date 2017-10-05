package com.gestion.incident.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.incident.bean.Client;
import com.gestion.incident.repositories.ClientRepository;


@Service
public class ClientService {

	@Autowired
	public ClientRepository clientRepository;

//déclaration des attributs	
	Calendar calendar = new GregorianCalendar(2014, 9, 31);
	Date next_date = calendar.getTime();

	private List<Client> clients = new ArrayList<Client>(Arrays.asList(
			new Client("75","marwane","EL ATRASSI","M","atrassi68@gmail.com",next_date,"scalian","0312615616"),
			new Client("458","manal","EL IMADI","M","atrcdscds8@gmail.com",next_date,"capgemini","0312534561"),
			new Client("55","asmaa","EL BELKACEMI","M","atcdcdvgtres68@gmail.com",next_date,"rms","0312645120")
			));
	
	//les méthodes utilisées dans le controller par injection	
	//public List<Client> GetAllClients() {
	//	return clients;
	//}
	
	public List<Client> GetAllClients() {	
		return (List<Client>)clientRepository.findAll();
		}
		
	
	public Client GetClientById(String Id) {
		return clients.stream().filter((Client c) -> c.getId().equals(Id)).findFirst().get();
	}
	
	public String AddClient(Client client){
		clients.add(client);
		return "le client a été ajouter avec succès";
	}
	
	public void UpdateClient(Client client, String id){
		for(int i=0; i < clients.size(); i++){
			Client cli = clients.get(i);
				if(cli.getId().equals(id)){
					clients.set(i, client);				
				}
		}
	}

	public void DeleteClient(String id) {
		clients.removeIf(client -> client.getId().equals(id));
	}
	
}
