package com.example.registrationlogin.repository;

import com.example.registrationlogin.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email); // Метод для пошуку користувача за email
}
