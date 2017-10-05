package com.gestion.incident.controller;

import java.text.ParseException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.incident.bean.Client;
import com.gestion.incident.service.ClientService;

@RestController
public class ClientController {
	
	@Autowired	
	private ClientService clientservice;
	
	
	@RequestMapping("/clients")
	public List<Client> GetAllClients() throws ParseException{
		return clientservice.GetAllClients();
	}
	
	@RequestMapping("/client/{id}")
	public Client GetClientById(@PathVariable String id) {
		return clientservice.GetClientById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/clients")
	public String AddClient(@RequestBody Client client){
		clientservice.AddClient(client);
		return "le client a été ajouté avec succès";	
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/clients/{id}")
	public String UpdateClient(@RequestBody Client client, @PathVariable String id){
		clientservice.UpdateClient(client, id);
		return "le client"+ id +"a bien été mise à jour";
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/clients/{id}")
	public String DeleteClient(@PathVariable String id){
		clientservice.DeleteClient(id);
		return "le client a été supprimé avec succès";	
	}
	

}
