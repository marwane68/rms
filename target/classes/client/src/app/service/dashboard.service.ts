import { Injectable } from '@angular/core';
import { Http,Response } from '@angular/http';
import { RouterModule, Router } from '@angular/router';


@Injectable()
export class DashboardService{

constructor(private http: Http){}


  getNumberClient(){
    return this.http.get("http://localhost:4200/rms/clients/nb")
    .map((response:Response) => response.json());
       
   }


  getNumberIncident(){
    return this.http.get("http://localhost:4200/rms/incidents/nb")
    .map((response:Response) => response.json());
       
   }


  getNumberAdmin(){
    return this.http.get("http://localhost:4200/rms/administrateurs/nb")
    .map((response:Response) => response.json());
       
   }




/*	
  getNumberClient(){

 this.http.post("http://localhost:4200/rms/clients/nb").subscribe(
          suc => {
            console.log(suc);   
        },
        err => {
            console.log(err );
            });
        }

        */
}