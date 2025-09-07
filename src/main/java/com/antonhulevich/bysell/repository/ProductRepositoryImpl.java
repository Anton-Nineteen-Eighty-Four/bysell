package com.antonhulevich.bysell.repository;

import com.antonhulevich.bysell.models.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository{

    private List<Product> products = new ArrayList<>();

    private long ID = 0;

    {
        products.add(new Product(++ID,"PlayStation 5", "Simple description",67000,"Minsk", "Oleg"));
        products.add(new Product(++ID,"Iphone 8", "Simple description", 24000,"Gomel","Maxim"));
    }

    @Override
    public List<Product> getAll(){
        return products;
    }

    @Override
    public Product getById(Long id) {
        for(Product product : products){
            if (product.getId()==id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void save(Product product){
        product.setId(++ID);
        products.add(product);
    }

    @Override
    public void delete(Long id){
        products.removeIf(product -> product.getId() == id);
    }

}
