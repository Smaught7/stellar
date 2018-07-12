import './rxjs-extensions';

import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule }   from '@angular/forms';
import { HttpModule }    from '@angular/http';
import { ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';

import { AppComponent }         from './app.component';
import { HomeComponent }   from './home/home.component';
import { SearchComponent }      from './search/search.component';



@NgModule({
  imports: [
    BrowserModule,
	ReactiveFormsModule,
    FormsModule,
    HttpModule,
    AppRoutingModule
  ],
  declarations: [
    AppComponent,
    HomeComponent,
    SearchComponent
  ],
  providers: [

  ],
  bootstrap: [ AppComponent ]
})

export class AppModule { }


