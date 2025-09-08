package com.antonhulevich.bysell.service;

import com.antonhulevich.bysell.models.Product;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ProductService  {
    List<Product> getAllProducts(String title);

    void saveProduct(Product product, MultipartFile file1, MultipartFile file2, MultipartFile file3) throws IOException;

    void deleteProduct(Long id);

    Product getProductById(Long id);
}
