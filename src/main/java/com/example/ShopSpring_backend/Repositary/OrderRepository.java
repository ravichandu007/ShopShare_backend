package com.example.ShopSpring_backend.Repositary;

import com.example.ShopSpring_backend.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {


    List<Order> findByCustomerName(String customerName);


    List<Order> findByStatus(String status);

    List<Order> findByUserId(Long userId);
}