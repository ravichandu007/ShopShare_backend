package com.example.ShopSpring_backend.Repositary;


import com.example.ShopSpring_backend.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}