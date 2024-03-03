package com.backendproject.ProductApp.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService{

    @Override
    public String getProductById(Long id) {
        return id.toString();
    }

    @Override
    public List<String> getProducts() {
        return null;
    }

    @Override
    public List<String> getProductsByCategory(String category) {
        return null;
    }
}
