package camt.se331.shoppingcart.dao;

import camt.se331.shoppingcart.entity.Product;
import camt.se331.shoppingcart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Taro on 3/18/2015.
 */
@Profile("db.dbdao")
@Repository
public class DbProductDao implements ProductDao{

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getProducts() {
        return null;
    }

    @Override
    public List<Product> getProducts(String anyKeyword) {
        return null;
    }

    @Override
    public Product getProduct(Long id) {
        return null;
    }

    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public Product deleteProduct(Product product) {
        return null;
    }

    @Override
    public Product updateProduct(Product product) {
        return null;
    }
}