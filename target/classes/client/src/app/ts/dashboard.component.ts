import { Component, OnInit } from '@angular/core';
import { DashboardService } from '../service/dashboard.service';

@Component({
  selector: 'dashboard',
  templateUrl: '../views/dashboard.component.html',
  styleUrls: ['../css/dashboard.component.css']
})
export class DashboardComponent implements OnInit {

clientsNb: any;
incidentsNb: any;
adminsNb: any;

  constructor(private dashboardservice: DashboardService) { }

  ngOnInit() {
  	this.dashboardservice.getNumberClient()
  		.subscribe(resClientDataNb => this.clientsNb = resClientDataNb);

  	this.dashboardservice.getNumberIncident()
  		.subscribe(resIncidentDataNb => this.incidentsNb = resIncidentDataNb);

  	this.dashboardservice.getNumberIncident()
  		.subscribe(resAdminDataNb => this.adminsNb = resAdminDataNb);
  }

}
