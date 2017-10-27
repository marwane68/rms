package com.gestion.incident.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.incident.bean.Incident;
import com.gestion.incident.repositories.IncidentRepository;

@Service
public class IncidentService {
	
	@Autowired
	public IncidentRepository incidentRepository;

//les méthodes utilisées dans le controller par injection		
		public List<Incident> GetAllIncidents() {	
			return (List<Incident>)incidentRepository.findAll();
			}
			
		
		public Incident GetIncidentById(String Idincident) {
			return incidentRepository.findOne(Idincident);
			//lambda expression
			//return incidents.stream().filter((Incident c) -> c.getIdincident().equals(Id)).findFirst().get();
		}
		
		public String AddIncident(Incident incident){
			incidentRepository.save(incident);
			return "le client a été ajouter avec succès";
		}
		
		public void UpdateIncident(Incident incident){
		if(incidentRepository.exists(incident.getIdincident())){
			incidentRepository.save(incident);
		}
	}
		
		public void DeleteIncident(String idincident) {
			incidentRepository.delete(idincident);
			//clients.removeIf(incident -> incident.getIdincident().equals(idincident));
		}
		
		public int GetNumberIncidents(){
			ArrayList<Incident> ListIncident = (ArrayList<Incident>)incidentRepository.findAll();
			return ListIncident.size();
		}
	
	
	
	
}
