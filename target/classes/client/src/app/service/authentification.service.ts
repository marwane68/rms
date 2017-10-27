import { Injectable } from '@angular/core';
import { Http,Response } from '@angular/http';
import { DialogAuthComponent } from '../ts/dialog-auth.component';
import { RouterModule, Router } from '@angular/router';
import { MatDialog } from  '@angular/material';


@Injectable()
export class AuthentificationService{
user: any;
sharedData: any;

constructor(private http: Http, public dialog: MatDialog, private router: Router){
	this.sharedData = {
      login:''
      }
  }
	


Authentification(user){
 this.http.post("http://localhost:4200/rms/auth", user).subscribe(
          suc => {
            console.log(suc);
            console.log(user);
            localStorage.setItem("login", user.login);
            this.router.navigate(["/accueil/dashboard"]);
        },
        err => {
            console.log(err );
            let dialogRef = this.dialog.open(DialogAuthComponent, {
                data: 'mot de passe ou login incorrect'
            });
        }

        )

}

Deconnexion(){
  console.log('deconnexion en cours de'+' '+ localStorage.getItem("login"));
   return this.http.get("http://localhost:4200/rms/deconnexion").subscribe(
         suc => {
          localStorage.removeItem("login");
          console.log('deconnexion succès');
          this.router.navigate(["/authentification"]);
         },
         err => {
           console.log(err);
        });
    
}


getDataLogin(){
  this.sharedData.login = localStorage.login;
	return this.sharedData.login;
}
	
}