import { Component, OnInit } from '@angular/core';
import { AdministrateurService } from '../service/administrateur.service';
import { MatTooltipModule } from '@angular/material';

@Component({
  selector: 'administrateur',
  templateUrl: '../views/administrateur.component.html',
  styleUrls: ['../css/administrateur.component.css']
})
export class AdministrateurComponent implements OnInit {
adminsData :any;

  constructor(private administrateurservice: AdministrateurService) { 

  }

  ngOnInit() {
  	this.administrateurservice.GetAllAdmins()
  		.subscribe(resAdminsData => this.adminsData = resAdminsData);

  }

}
