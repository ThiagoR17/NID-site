package com.example.LTDapi.controllers.model;

import java.sql.Date;
import java.time.LocalTime;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "evento")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "Nome_Evento", length = 50, nullable = true)
    private String nome;

    @Column(name = "Data", nullable = true)
    private Date data;

    @Column(name = "Horario", nullable = true)
    private LocalTime horario;

    @Column(name = "Statusconfirmacao", length = 30, nullable = true)
    private String status;


    public String getnome(){
        return nome;
     }
 
     public Date getdata(){
         return data;
     }
 
     public LocalTime gethr(){
         return horario;
     }
     
     public String getStatus(){
         return status;
     }
    
 
     

}

    
 
  
    

    
