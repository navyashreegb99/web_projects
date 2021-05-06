import { NgModule } from '@angular/core';

import { productListComponent } from 'src/products/product-list.component';
import { ProductDetailComponent } from './product-detail.component';
import { ConvertToSpacesPipe } from '../shared/convert-to-spaces.pipe';

import { RouterModule } from '@angular/router';
import { ProductDetailGuard } from './product-detail.guard';
import { SharedModule } from '../shared/shared.module';



@NgModule({
  declarations: [
    productListComponent,
    ProductDetailComponent,
    ConvertToSpacesPipe,
  ],
  imports: [

    RouterModule.forChild([   
      { path: 'products', component: productListComponent },
    { path: 'products/:id', 
    canActivate:[ProductDetailGuard],
    component: ProductDetailComponent },]),
    SharedModule
  ]
})
export class ProductModule { }
