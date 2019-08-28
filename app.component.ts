import { Component } from '@angular/core';
import { FormGroup,FormControl, Validator, Validators } from '@angular/forms';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
 /* title = 'app';
  name:string='Tom';
  day:number=1;

process(){
  alert('Welcome');
}
 processData(event){
  this.name=event.target.value;

}
processForm(value:any){
  console.log(value);
}*/

userForm:FormGroup=new FormGroup({
  name:new FormControl("Reni",[Validators.required,Validators.minLength(4),Validators.maxLength(10)]),
  email:new FormControl(),
  address:new FormGroup({
    area:new FormControl(),
    city:new FormControl(),
    pincode:new FormControl(null,Validators.pattern("[1-9][0-9]{5}"))
   
  })

})

process(value:any){
  console.log(this.userForm.value);
}







}