import { Component, OnInit } from '@angular/core';
import { IncidentService } from '../service/incident.service';
import { MatTooltipModule } from '@angular/material';

@Component({
  selector: 'incident',
  templateUrl: '../views/incident.component.html',
  styleUrls: ['../css/incident.component.css']
})
export class IncidentComponent implements OnInit {
incidentsData :any;

  constructor(private incidentservice: IncidentService) { 

  }

  ngOnInit() {
  	this.incidentservice.GetAllIncidents()
  		.subscribe(resIncidentsData => this.incidentsData = resIncidentsData);

  }

}
