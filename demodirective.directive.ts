import { Directive, Renderer,ElementRef, HostListener, HostBinding } from '@angular/core';

@Directive({
  selector: '[appDemodirective]'
})
export class DemodirectiveDirective {
  @HostBinding('style.color')
  color:string;
  @HostListener('click')
  onClick(){
   // this.renderer.setElementStyle(this.e1.nativeElement,'color','green');
   this.renderer.setElementStyle(this.e1.nativeElement,'border','3px solid red');
   this.color='blue';

  }

  constructor(private e1:ElementRef,private renderer:Renderer) { 
    

  }

}
