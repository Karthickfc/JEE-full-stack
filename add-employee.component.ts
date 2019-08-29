import { Component, OnInit } from '@angular/core';
import { EmployeeService } from './employee.service';
import { Employee } from './employee';
import { Router } from "@angular/router";


@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent implements OnInit {


  constructor(private employeeservice:EmployeeService,private router:Router) { }

  ngOnInit() {
  }
  onSubmit(employee:Employee){
    console.log(employee)
    this.employeeservice.addEmployee(employee);
    this.router.navigate(["/employees"]);
  }

}
