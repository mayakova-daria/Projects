package com.example.registrationlogin.service;

import com.example.registrationlogin.model.Role;
import com.example.registrationlogin.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public void saveRole(Role role) {
        roleRepository.save(role);
    }

    public Role findByName(String name) {
        return roleRepository.findAll()
                .stream()
                .filter(role -> role.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
}
