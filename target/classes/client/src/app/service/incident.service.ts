import { Injectable } from '@angular/core';
import { Http,Response } from '@angular/http';
import 'rxjs/add/operator/map';
import { DialogAuthComponent } from '../ts/dialog-auth.component';
import { RouterModule, Router } from '@angular/router';
import { MatDialog } from  '@angular/material';


@Injectable()
export class IncidentService{


constructor(private http: Http, public dialog: MatDialog, private router: Router){
	
	}
	


GetAllIncidents(){
 return this.http.get("http://localhost:4200/rms/incidents")
    .map((response:Response) => response.json());
       
   }     

}
	