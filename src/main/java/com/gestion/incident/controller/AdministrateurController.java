package com.gestion.incident.controller;

import java.text.ParseException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.incident.bean.Administrateur;
import com.gestion.incident.service.AdministrateurService;

@RestController
@RequestMapping(value = "/rms")
public class AdministrateurController {
	
	@Autowired	
	private AdministrateurService adminservice;
	
	
	@RequestMapping("/administrateurs")
	public List<Administrateur> GetAllAdmins() throws ParseException{
		return adminservice.GetAllAdmins();
	}
	
	@RequestMapping("/administrateurs/nb")
	public int GetNumberAdmins(){
		return adminservice.NumberAdmins();
	}
	
	@RequestMapping("/administrateur/{idadmin}")
	public Administrateur GetClientById(@PathVariable String idadmin) {
		return adminservice.GetAdministrateurById(idadmin);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/administrateurs")
	public String AddAdministrateur(@RequestBody Administrateur admin){
		adminservice.AddAdministrateur(admin);
		return "l'admin a été ajouté avec succès";	
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/administrateurs")
	public String UpdateAdministrateur(@RequestBody Administrateur admin){
		adminservice.UpdateAdministrateur(admin);
		return "l'admin" +" "+admin.getIdadmin()+" "+ "a bien été mise à jour";
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/administrateurs/{idadmin}")
	public String DeleteAdministrateur(@PathVariable String idadmin){
		adminservice.DeleteAdministrateur(idadmin);
		return "l'admin a été supprimé avec succès";	
	}
	
	

}
