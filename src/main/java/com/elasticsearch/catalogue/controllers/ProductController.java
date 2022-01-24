package com.elasticsearch.catalogue.controllers;

import com.elasticsearch.catalogue.documents.Product;
import com.elasticsearch.catalogue.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("")
    public Iterable<Product> findAll(){
        return this.productService.findAll();
    }

    @GetMapping("{id}")
    public Product findOne(@PathVariable String id){
        return this.productService.findOne(Integer.parseInt(id));
    }

    @PostMapping("")
    public Product save(@RequestBody Product product){
        return this.productService.save(product);
    }
}
