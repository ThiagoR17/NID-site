package com.example.LTDapi.controllers;


import org.springframework.data.jpa.repository.JpaRepository;


import com.example.LTDapi.controllers.model.User;

import jakarta.persistence.Id;

public interface UserRepository extends JpaRepository<User, Id> {
    
    User findByNome(String nome);

}
