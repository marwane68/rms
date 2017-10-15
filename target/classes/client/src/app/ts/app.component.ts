
import { Component } from '@angular/core';
import { Http,Response } from '@angular/http';

//interface User{
//    login:String;
//    password:String;
//    role:String;
//}

@Component({
  selector: 'auth',
  templateUrl: '../views/authentification.component.html',
  styleUrls: ['../css/authentification.component.css']
})

export class AuthComponent {

   login: String;
   password: String;
   role: String;
   User: any;

   constructor(private http: Http){

    this.User = {
      login:'',
      password:'',
      role:''
    }


   }

   GetAllClients(){
      this.http.get("http://localhost:4200/rms/clients").subscribe(
          (res: Response)=>{
            const clients = res.json();
            console.log(clients);
            }
          )
   }

    Register() : void {
      console.log(this.User.login);
      console.log(this.User.password);

      this.http.get("").subscribe()

    }
}