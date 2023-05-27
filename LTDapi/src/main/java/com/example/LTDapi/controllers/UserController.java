package com.example.LTDapi.controllers;


import org.springframework.data.annotation.Id;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.LTDapi.controllers.model.User;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@RestController
@RequestMapping("/api/auth")

public class UserController {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody User user) {
        User storedUser = userRepository.findByNome(user.getNome());
        if (storedUser != null) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(null);
        } else {
            User savedUser = userRepository.save(user);
            return ResponseEntity.ok(savedUser);
        }
    }
}




   
    







