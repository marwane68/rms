package com.gestion.incident.controller;

import java.text.ParseException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.incident.bean.Incident;
import com.gestion.incident.service.IncidentService;
/**
 * @author Marwane
 *
 */
@RestController
public class IncidentController {
	
	@Autowired	
	private IncidentService incidentservice;
	
	
	@RequestMapping("/incidents")
	public List<Incident> GetAllIncidents() throws ParseException{
		return incidentservice.GetAllIncidents();
	}
	
	@RequestMapping("/incident/{id}")
	public Incident GetIncidentById(@PathVariable String idincident) {
		return incidentservice.GetIncidentById(idincident);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/incidents")
	public String AddIncident(@RequestBody Incident incident){
		incidentservice.AddIncident(incident);
		return "l'incident a été ajouté avec succès";	
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/incidents")
	public String UpdateIncident(@RequestBody Incident incident){
		incidentservice.UpdateIncident(incident);
		return "l'incident" +" "+incident.getIdincident()+" "+ "a bien été mise à jour";
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/incidents/{id}")
	public String DeleteClient(@PathVariable String idincident){
		incidentservice.DeleteIncident(idincident);
		return "l'incident a été supprimé avec succès";	
	}
	

}
