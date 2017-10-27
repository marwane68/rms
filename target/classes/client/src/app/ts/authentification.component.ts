import { Component } from '@angular/core';
import { Http,Response } from '@angular/http';
import { MatDialog } from  '@angular/material';
import { RouterModule, Router } from '@angular/router';
import { DialogAuthComponent } from './dialog-auth.component';
import { AuthentificationService } from '../service/authentification.service';

@Component({
  selector: 'authentification',
  templateUrl: '../views/authentification.component.html',
  styleUrls: ['../css/authentification.component.css']
})
export class AuthentificationComponent {
   
   User: any;
  
  constructor(private http: Http, public dialog: MatDialog, private router: Router, private authentificationservice: AuthentificationService) {

  	this.User = { login:'', password:'' }
   }

 Register(User) {
    console.log(this.User);
    this.authentificationservice.Authentification(User);
    }


}
