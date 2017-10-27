import { Component, OnInit, Inject, Injector } from '@angular/core';
import { ClientService } from '../service/client.service';
import { MatDialogRef } from  '@angular/material';
import { RouterModule, Router } from '@angular/router';
import { MAT_DIALOG_DATA } from  '@angular/material';


@Component({
  selector: 'dialog-client',
  templateUrl: '../views/dialog-client.component.html',
  styleUrls: ['../css/dialog-client.component.css']
})
export class DialogClientComponent implements OnInit {
	private clientservice: ClientService;
	idclient :any;

  constructor(injector: Injector, @Inject(MAT_DIALOG_DATA) public data: string, private router: Router) { 
  	//breaks temporarly circular dependency
  		setTimeout(() => this.clientservice = injector.get(ClientService));

   }

  ngOnInit() {
  }

  confirmer(){
  	this.idclient = this.clientservice.getDataId();
  	this.clientservice.DeleteClientById(this.idclient);this.router.navigate(["/accueil/incident"]);
    window.location.reload();

  }

}
