package com.example.registrationlogin.service;

import com.example.registrationlogin.model.User;
import com.example.registrationlogin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void saveUser(User user) {
        // Шифруємо пароль перед збереженням
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user); // Зберігаємо користувача у базі даних
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email); // Знаходимо користувача за email
    }
}
