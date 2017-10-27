import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { RouterModule, Routes } from '@angular/router';
import { HttpModule } from '@angular/http';
import { MatDialogModule, MatTableModule, MatTabsModule, MatTooltipModule, MatButtonModule } from '@angular/material';
import { CdkTableModule } from '@angular/cdk/table';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';

//Import des components
import { AuthentificationComponent } from './ts/authentification.component';
import { DialogAuthComponent } from './ts/dialog-auth.component';
import { AccueilComponent } from './ts/accueil.component';
import { LeftSidebarComponent } from './ts/left-sidebar.component';
import { HighSideBarComponent } from './ts/high-side-bar.component';
import { ClientComponent } from './ts/client.component';
import { IncidentComponent } from './ts/incident.component';
import { AdministrateurComponent } from './ts/administrateur.component';
import { DashboardComponent } from './ts/dashboard.component';
import { DialogClientComponent } from './ts/dialog-client.component';

//Import des services
import { AuthentificationService } from './service/authentification.service';
import { ClientService } from './service/client.service';
import { IncidentService } from './service/incident.service';
import { AdministrateurService } from './service/administrateur.service';
import { DashboardService } from './service/dashboard.service';
import { UpdateClientComponent } from './update-client/update-client.component';





const appRoutes: Routes = [
  { path: 'authentification', component: AuthentificationComponent },
  { path: 'accueil', component: AccueilComponent, children: [
      { path: 'dashboard', component: DashboardComponent },
      { path: 'client', component: ClientComponent },
      { path: 'administrateur', component: AdministrateurComponent },
      { path: 'incident', component: IncidentComponent }
    ] },
 // { path: 'client', component: ClientComponent },
  
//{ path: 'hero/:id',      component: HeroDetailComponent },
//{ path: '**', component: PageNotFoundComponent }
];


@NgModule({
  declarations: [
    AppComponent,
    AuthentificationComponent,
    DialogAuthComponent,
    AccueilComponent,
    LeftSidebarComponent,
    HighSideBarComponent,
    ClientComponent,
    IncidentComponent,
    AdministrateurComponent,
    DashboardComponent,
    DialogClientComponent,
    UpdateClientComponent
  ],
  entryComponents: [DialogAuthComponent, DialogClientComponent],
  imports: [
    BrowserModule,
    HttpModule,
    FormsModule,
    BrowserAnimationsModule,
    MatDialogModule,
    MatTooltipModule,
    MatButtonModule,
    MatTableModule,
    MatTabsModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [AuthentificationService, ClientService, IncidentService, AdministrateurService, DashboardService],
  bootstrap: [AppComponent]
})
export class AppModule { }
