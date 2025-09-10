package com.antonhulevich.bysell.service;

import com.antonhulevich.bysell.models.Product;
import com.antonhulevich.bysell.models.User;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.security.Principal;
import java.util.List;

public interface ProductService  {
    List<Product> getAllProducts(String title);

    void saveProduct(Principal principal, Product product, MultipartFile file1, MultipartFile file2, MultipartFile file3) throws IOException;

    void deleteProduct(Long id);

    Product getProductById(Long id);

    User getUserByPrincipal(Principal principal);
}
