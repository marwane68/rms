import { Component, OnInit } from '@angular/core';
import { RouterModule, Router } from '@angular/router';

@Component({
  selector: 'accueil',
  templateUrl: '../views/accueil.component.html',
  styleUrls: ['../css/accueil.component.css']
})
export class AccueilComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit() {
  	// this.router.navigate(["/accueil/dashboard"]);
  }

}
