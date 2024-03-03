package com.backendproject.ProductApp.controller;


import com.backendproject.ProductApp.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/products")
public class ProductController {


    IProductService productService;

    @Autowired
    public ProductController(IProductService productService)
    {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public String getProductsById(@PathVariable("id") Long id)
    {
        return productService.getProductById(id);
    }

    @GetMapping()
    public List<String> getProducts()
    {
        return productService.getProducts();
    }

    @GetMapping("/category/{category}")
    public List<String> getProductsByCategory(@PathVariable("category") String category)
    {
        return productService.getProductsByCategory(category);
    }

}
