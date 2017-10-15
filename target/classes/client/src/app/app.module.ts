import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { RouterModule, Routes } from '@angular/router';
import { HttpModule } from '@angular/http';
import { MatDialogModule } from  '@angular/material';
import { AppComponent } from './app.component';
import { MatButtonModule } from  '@angular/material';
import { FormsModule } from '@angular/forms';
import { AuthentificationComponent } from './ts/authentification.component';
import { DialogAuthComponent } from './ts/dialog-auth.component';
import { AccueilComponent } from './ts/accueil.component';


const appRoutes: Routes = [
  { path: 'authentification', component: AuthentificationComponent },
  { path: 'accueil', component: AccueilComponent },
//{ path: 'hero/:id',      component: HeroDetailComponent },
//{ path: '**', component: PageNotFoundComponent }
];


@NgModule({
  declarations: [
    AppComponent,
    AuthentificationComponent,
    DialogAuthComponent,
    AccueilComponent
  ],
  entryComponents: [DialogAuthComponent],
  imports: [
    BrowserModule,
    HttpModule,
    FormsModule,
    BrowserAnimationsModule,
    MatDialogModule,
    MatButtonModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
