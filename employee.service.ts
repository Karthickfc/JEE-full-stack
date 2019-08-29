import { Injectable } from '@angular/core';
import { HttpClient  } from "@angular/common/http";
import { Employee } from './employee';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  employees:Employee[];

  constructor(private http:HttpClient) {
    this.populateEmployees().subscribe(data=>this.employees=data,error=>console.log(error));
   }

  populateEmployees():Observable<Employee[]>{
   return this.http.get<Employee[]>("../../assets/employees.json");

  }
  getEmployees():Employee[]{
    return this.employees;
  }
  addEmployee(employee:Employee){
    this.employees.push(employee);
  }
  deleteEmployee(code){
    this.employees=this.employees.filter(emp=>emp.code!=code);
  }
}
