import { Component, OnInit } from '@angular/core';
import { RouterModule, Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {


constructor(private router: Router){

}

 ngOnInit() {
 	if(localStorage.login!=null){
 	    this.router.navigate(["/accueil/dashboard"]);
 	}else
 	this.router.navigate(["/authentification"]);
 	
    }
  title = 'app';
}
