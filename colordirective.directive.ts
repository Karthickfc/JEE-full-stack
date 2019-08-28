import { Directive, ElementRef } from '@angular/core';

@Directive({
  selector: '[appColordirective]'
})
export class ColordirectiveDirective {

  constructor(private e1:ElementRef) {
    this.e1.nativeElement.style.color='blue';
    this.e1.nativeElement.style.background='red';
   }

}
