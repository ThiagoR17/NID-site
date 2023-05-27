package com.example.LTDapi.controllers.model;


import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "administrador")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;


    @Column (name = "nome", length = 32, nullable = true)
    private String nome;
    
    @Column (name = "senha", length = 15, nullable = true)
    private int senha;

    
    public String getNome() {
        return nome;
    }
    
    public Long getIdLong(){
        return id;
    }
    

}
