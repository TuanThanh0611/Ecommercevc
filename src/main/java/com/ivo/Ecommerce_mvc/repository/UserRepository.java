package com.ivo.Ecommerce_mvc.repository;

import com.ivo.Ecommerce_mvc.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
    User findFirstByEmail(String email);
}
