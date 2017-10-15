import { Component, OnInit } from '@angular/core';
import { Http,Response } from '@angular/http';
import { MatDialog } from  '@angular/material';
import { RouterModule, Router } from '@angular/router';
//import { MatDialog } from  '@angular/material';
import { DialogAuthComponent } from './dialog-auth.component';

@Component({
  selector: 'app-authentification',
  templateUrl: '../views/authentification.component.html',
  styleUrls: ['../css/authentification.component.css']
})
export class AuthentificationComponent implements OnInit {
   

   login: String;
   password: String;
   role: String;
   User: any;
  
  constructor(private http: Http, public dialog: MatDialog, private router: Router) {

  	this.User = {
      login:'',
      password:''
    }
   
   }

  ngOnInit() {
  }


 Register() {
     this.http.post("http://localhost:4200/rms/auth", this.User).subscribe(
          suc => {
            console.log(suc);
           this.router.navigate(["/accueil"]);
        },
        err => {
            console.log(err );
            let dialogRef = this.dialog.open(DialogAuthComponent, {
                width: '1000 px',
                data: 'mot de passe ou login incorrect'
            });

        }

        )

    }


}
