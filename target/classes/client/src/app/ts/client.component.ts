import { Component, OnInit } from '@angular/core';
import { ClientService } from '../service/client.service';
import { RouterModule, Router } from '@angular/router';
import { MatTooltipModule } from '@angular/material';
import { DialogClientComponent } from '../ts/dialog-client.component';
import { MatDialog } from  '@angular/material';

@Component({
  selector: 'client',
  templateUrl: '../views/client.component.html',
  styleUrls: ['../css/client.component.css']
})
export class ClientComponent implements OnInit {
clientsData :any;
id :any;

  constructor(private clientservice: ClientService, public dialog: MatDialog, private router: Router) { 

  }

  ngOnInit() {
  	this.clientservice.GetAllClient()
  		.subscribe(resClientData => this.clientsData = resClientData);
 // console.log(this.clientsData);
  }

  DeleteClientById(idclient: string){
  	this.clientservice.DeleteClientById(idclient);
  }


DialogSupp(idclient: string){
  this.id=idclient;
  console.log("l'id courant"+ this.id);
  //DialogSupp du service permet de faire appel a notre modal sup
  this.clientservice.DialogSupp(this.id);

   }      



}
