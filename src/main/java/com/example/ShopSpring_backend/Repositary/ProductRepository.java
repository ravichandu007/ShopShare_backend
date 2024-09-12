package com.example.ShopSpring_backend.Repositary;

import com.example.ShopSpring_backend.Controller.ProductController;
import com.example.ShopSpring_backend.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}