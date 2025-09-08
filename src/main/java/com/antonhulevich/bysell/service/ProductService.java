package com.antonhulevich.bysell.service;

import com.antonhulevich.bysell.models.Product;

import java.util.List;

public interface ProductService  {
    List<Product> getAllProducts(String title);

    void saveProduct(Product product);

    void deleteProduct(Long id);

    Product getProductById(Long id);
}
