package com.scalar.productservice.controllers;

import com.scalar.productservice.model.product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping( "/products")
public class ProductController {
    @GetMapping()
    public List<product> getAllProducts(){
       return new ArrayList<>();
    }
    @GetMapping( "/{id}")
    public product getSingleProducts(@PathVariable("id")Long id) {
        return new product();

    }
    @PostMapping()
    Public product addNewProduct(@RequestBody product Product){
        product p=New product();
        p.setTitle("New Project");
        return p;
    }
    @PatchMapping("/{id}")
            public product UpdateProduct(@PathVariable("id") Long id, @RequestBody product Product)
    {
         return new product();
    }
    @PutMapping("/{id}")
    public product replaceProduct(@PathVariable("id") Long id, @RequestBody product Product){
        return new product();
    }
    @DeleteMapping("/{id}")
     public product delectProduct(@PathVariable("id") Long id)
    {

    }



}
