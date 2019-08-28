import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeeComponent } from './employee.component';
import { EmpComponent } from './emp/emp.component';
import { EmployeeCountComponent } from './employee/employee-count.component';
import { ColordirectiveDirective } from './colordirective.directive';
import { ChangecasedirectiveDirective } from './changecasedirective.directive';
import { DemodirectiveDirective } from './demodirective.directive';
import { PipedemoPipe } from './pipedemo.pipe';
import { EmployeefilterPipe } from './employee/employeefilter.pipe';


@NgModule({
  declarations: [
    AppComponent,
    EmployeeComponent,
    EmpComponent,
    EmployeeCountComponent,
    ColordirectiveDirective,
    ChangecasedirectiveDirective,
    DemodirectiveDirective,
    PipedemoPipe,
    EmployeefilterPipe,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
