import { Injectable } from '@angular/core';
import { Http,Response } from '@angular/http';
import 'rxjs/add/operator/map';
import { DialogClientComponent } from '../ts/dialog-client.component';
import { RouterModule, Router } from '@angular/router';
import { MatDialog } from  '@angular/material';


@Injectable()
export class ClientService{
idclient :any;

constructor(private http: Http, public dialog: MatDialog, private router: Router){
	
	}
	


GetAllClient(){
 return this.http.get("http://localhost:4200/rms/clients")
    .map((response:Response) => response.json());
       
   }

DeleteClientById(idclient: string){
	console.log("http://localhost:4200/rms/clients/"+ idclient);
	return this.http.delete("http://localhost:4200/rms/clients/"+ idclient)
		.map((response:Response) => response.json()).subscribe((res) => {});

	}

DialogSupp(idclient: string){
	this.idclient = idclient;
    let dialogRef = this.dialog.open(DialogClientComponent, {
            data: 'voulez-vous vraiment supprimer le client'+" "+idclient +"?"
           });

   }

//pass data via shared service
getDataId(){
  return this.idclient;
}    


}
	