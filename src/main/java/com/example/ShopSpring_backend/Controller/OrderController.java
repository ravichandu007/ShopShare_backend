package com.example.ShopSpring_backend.Controller;

import com.example.ShopSpring_backend.Model.Order;
import com.example.ShopSpring_backend.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @PostMapping("/place")
    public Order placeOrder(@RequestBody Order order) {
        return orderService.placeOrder(order);
    }


    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable Long id) {
        return orderService.getOrderById(id).orElse(null); // Handle as needed
    }


    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }
}
