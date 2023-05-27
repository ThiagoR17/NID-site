package com.example.LTDapi.controllers.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Id>{
        
    }
    

