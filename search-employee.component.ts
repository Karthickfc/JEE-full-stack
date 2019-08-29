import { Component, OnInit } from '@angular/core';
import { Employee } from './employee';
import { EmployeeService } from './employee.service';

@Component({
  selector: 'app-search-employee',
  templateUrl: './search-employee.component.html',
  styleUrls: ['./search-employee.component.css']
})
export class SearchEmployeeComponent implements OnInit {

  employees:Employee[];

  constructor(private employeeservice:EmployeeService) { }

  ngOnInit() {
  }
  search(data){
   
    this.employees=this.employeeservice.getEmployees().filter(emp=>emp.name==data.searchTerm);
    if(this.employees.length==0){
      this.employees=this.employeeservice.getEmployees().filter(emp=>emp.gender.toLowerCase()==data.searchTerm);
    }

  }

}
