import { Component, OnInit } from '@angular/core';
import { EmployeeService } from './employee.service';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
employees:any;


  constructor(private employeeservice:EmployeeService) { }

  ngOnInit() {
    this.employees=this.employeeservice.getEmployees();
  }
  deleteEmployee(code){
    this.employeeservice.deleteEmployee(code);
    this.employees=this.employeeservice.getEmployees();

  }

}
