package com.najot.oy5dars7.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    @GetMapping("/{id}")
    public String getProduct(@PathVariable Long id){
        return "Product id = "+id;
    }

    @GetMapping
    public String getProducts(){
        return "Products list";
    }
}
