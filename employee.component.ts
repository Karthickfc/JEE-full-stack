import { Component, OnInit } from '@angular/core';
import { Employee } from './employee';
import { EmployeeService } from './employee.service';
import { ActivatedRoute, Router } from "@angular/router";

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
  employee:Employee;


  constructor( private employeeservice:EmployeeService,
    private activatedroute:ActivatedRoute,private router:Router) { }

  ngOnInit() {
    let  code:string=this.activatedroute.snapshot.params["id"];
    this.employee=this.employeeservice.getEmployees().find(emp=>emp.code===code)
  }
  navigate(){
    this.router.navigate(["/employees"]);
  }

}
