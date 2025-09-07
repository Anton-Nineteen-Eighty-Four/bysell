package com.antonhulevich.bysell.repository;

import com.antonhulevich.bysell.models.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> getAll();

    Product getById(Long id);

    void save(Product product);

    void delete(Long id);


}
