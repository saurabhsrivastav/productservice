package com.example.productservice.service;

import com.example.productservice.models.Product;

import java.util.List;


public interface ProductService {

    List<String> getAllProduct();

    Product getProductById(Long id);

    String addProduct();

    String deleteProduct();

}
