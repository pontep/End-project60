package com.example.voting.controller;

import java.util.Collection;
import java.util.stream.Collectors;

import com.example.voting.entity.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class AdminController {
    @Autowired
    AdminRepository adminRepository;

    @GetMapping("/admin")
    public Collection<Admin> getAllAdmins(){
        return adminRepository.findAll().stream().collect(Collectors.toList());
    }

    
}