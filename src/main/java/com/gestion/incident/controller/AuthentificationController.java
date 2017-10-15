package com.gestion.incident.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.incident.bean.Authentification;
import com.gestion.incident.exception.IncidentException;
import com.gestion.incident.service.AuthentificationService;

@RestController
@RequestMapping(value = "/rms")
public class AuthentificationController {
	
	@Autowired	
	private AuthentificationService authentificationservice;
	
	
	@RequestMapping("/authentifications")
	public List<Authentification> GetAllAuthentifications() {
		return authentificationservice.GetAllAuthentifications();
	}
	
	@RequestMapping("/authentification/{login}")
	public Authentification GetAuthentificationByLogin(@PathVariable String login) {
		return authentificationservice.GetAuthentificationByLogin(login);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/authentifications")
	public String AddAuthentification(@RequestBody Authentification auth){
		authentificationservice.AddAuthentification(auth);
		return "le login a été ajouté avec succès";	
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/authentifications")
	public String UpdateAuthentification(@RequestBody Authentification auth){
		authentificationservice.UpdateAuthentification(auth);
		return "le login" +" "+auth.getLogin()+" "+ "a bien été mise à jour";
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/authentifications/{login}")
	public String DeleteAuthentification(@PathVariable String login){
		authentificationservice.DeleteAuthentification(login);
		return "le login" +" "+login+" "+"a été supprimé avec succès";
	}
	
	@RequestMapping(value = "/auth", method = RequestMethod.POST, headers = "Accept=application/json")
	public void authentifier(final HttpServletRequest request, @RequestBody final Authentification user) throws IncidentException {
		final Authentification authentification = authentificationservice.authentifier(user.getLogin(), user.getPassword()); 
		if (authentification != null) {
			request.getSession().setAttribute("user", authentification);
			System.out.println("connécté");
		} else {
			request.getSession().removeAttribute("user");
			System.out.println("deconnécté");
		}
	}
	
	@RequestMapping(value = "/deconnexion", method = RequestMethod.GET)
	public void authentifier(final HttpServletRequest request) {
		request.getSession().removeAttribute("user");
	}

}
