package com.antonhulevich.bysell.service;

import com.antonhulevich.bysell.models.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getAllProducts();

    public void saveProduct(Product product);

    public void deleteProduct(Long id);

    Product getProductById(Long id);
}
