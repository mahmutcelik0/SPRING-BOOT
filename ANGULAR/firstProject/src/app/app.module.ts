import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { CommonModule } from '@angular/common';
import { AppComponent } from './app.component';
import { MyFirstComponentComponent } from './my-first-component/my-first-component.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { NgForExampleComponent } from './ng-for-example/ng-for-example.component';

@NgModule({
  declarations: [
    AppComponent,
    MyFirstComponentComponent,
    DataBindingComponent,
    NgForExampleComponent
  ],
  imports: [
    BrowserModule,
    CommonModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
