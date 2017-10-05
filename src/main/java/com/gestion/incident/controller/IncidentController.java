package com.gestion.incident.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//l'annotation fait parti de spring MVC qui permet d'indiquer à spring que cette classe jouera le rôle du controller
@RestController
public class IncidentController {

	@RequestMapping("/")
	public String hello(){
		return "Hello world";
	}
	
}
