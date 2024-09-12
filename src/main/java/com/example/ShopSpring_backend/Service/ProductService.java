package com.example.ShopSpring_backend.Service;

import com.example.ShopSpring_backend.Model.Product;
import com.example.ShopSpring_backend.Repositary.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }


    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }


    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }


    public Product updateProduct(Long id, Product product) {
        if (productRepository.existsById(id)) {
            product.setId(id);
            return productRepository.save(product);
        }
        return null; //
    }


    public void deleteProduct(Long id) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
        }
    }
}