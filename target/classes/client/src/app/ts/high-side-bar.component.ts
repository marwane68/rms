import { Component, OnInit } from '@angular/core';
import { RouterModule, Router } from '@angular/router';
import { AuthentificationService } from '../service/authentification.service';

@Component({
  selector: 'high-side-bar',
  templateUrl: '../views/high-side-bar.component.html',
  styleUrls: ['../css/high-side-bar.component.css']
})
export class HighSideBarComponent implements OnInit {
dataConnection: any;

  constructor(private authentificationservice: AuthentificationService, private router: Router) { }

  ngOnInit() {
	this.dataConnection = this.authentificationservice.getDataLogin();
  }

  deconnexion(){
  	this.authentificationservice.Deconnexion();

  }

}
