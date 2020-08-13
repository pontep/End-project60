package com.example.voting.controller;

import java.util.Collection;

import com.example.voting.entity.Students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/student")
    public Collection<Students> getAllStudents() {
        return studentsRepository.findAll().stream().collect(Collectors.toList());
    }
}