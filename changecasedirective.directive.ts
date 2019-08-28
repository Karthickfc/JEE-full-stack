import { Directive, ElementRef, Renderer, HostListener } from '@angular/core';

@Directive({
  selector: '[appChangecasedirective]'
})
export class ChangecasedirectiveDirective {

  constructor(private e1:ElementRef,private renderer:Renderer) { }
  @HostListener('click')
onBlur(){
  let changedvalue=this.e1.nativeElement.value.toUpperCase();
  this.renderer.setElementProperty(this.e1.nativeElement,'value',changedvalue);

}

}
