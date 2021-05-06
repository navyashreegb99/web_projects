import { Component, OnInit } from "@angular/core";
import { Subscription } from "rxjs";
import { Iproduct } from "./product";
import { ProductService } from "./product.service";

@Component({
    templateUrl:'./product-list.component.html',
    styleUrls:['./product-list.component.css'],
    providers:[ProductService]
})


export class productListComponent implements OnInit{
    errorMessage: string=' ';
   pageTitle:string='Product List!';
   showImage=false;
   private _listFilter:string="";
   filteredProducts:Iproduct[]=[];
   products:Iproduct[]=[];
    sub!: Subscription;
 


   constructor(private productService:ProductService){

}

get listFilter():string{
    return this._listFilter;
}

set listFilter(value:string){
    this._listFilter=value;
    console.log('In setter:',value);
    this.filteredProducts=this.performFilter(value);
}



performFilter(filterBy:string):Iproduct[]{
 filterBy=filterBy.toLocaleLowerCase();
 return this.products.filter((product:Iproduct)=>product.productName.toLocaleLowerCase().includes(filterBy));

}

 
toggleImage():void{
    this.showImage=!this.showImage;
}

onRatingClicked(message:string):void{
    this.pageTitle='Product List:'+message;
}

ngOnInit(): void {
    this.sub=this.productService.getProducts().subscribe({
      next: products =>{
        this.products=products;
        this.filteredProducts=this.products;
      },
      error: err => this.errorMessage=err
    });
   
 }


   
 }