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
import com.gestion.incident.exception.IncidentException;
import com.gestion.incident.service.ClientService;

@RestController
@RequestMapping(value = "/rms")
public class ClientController {
	
	@Autowired	
	private ClientService clientservice;
	
	
	@RequestMapping("/clients")
	public List<Client> GetAllClients() throws ParseException{
		return clientservice.GetAllClients();
	}
	
	@RequestMapping("/clients/nb")
	public int GetNumberClients(){
		return clientservice.NumberClients();
	}
	
	@RequestMapping("/client/{idclient}")
	public Client GetClientById(@PathVariable String idclient) {
		return clientservice.GetClientById(idclient);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/clients")
	public String AddClient(@RequestBody Client client) throws IncidentException{
		clientservice.AddClient(client);
		return "le client a été ajouté avec succès";	
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/clients")
	public String UpdateClient(@RequestBody Client client) throws IncidentException{
		clientservice.UpdateClient(client);
		return "le client" +" "+client.getId()+" "+ "a bien été mise à jour";
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/clients/{idclient}")
	public String DeleteClient(@PathVariable String idclient) throws IncidentException{
		clientservice.DeleteClient(idclient);
		return "le client a été supprimé avec succès";
	}
	

}
