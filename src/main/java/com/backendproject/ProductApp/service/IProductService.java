package com.backendproject.ProductApp.service;
import java.util.List;

public interface IProductService {
    public String getProductById(Long id);
    public List<String> getProducts();
    public List<String> getProductsByCategory(String category);
}
