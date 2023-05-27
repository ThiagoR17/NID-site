package com.example.LTDapi.controllers.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@RestController
@RequestMapping("/eventos")

public class EventoController {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private EventoRepository eventoRepository;

    public EventoController(EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }

    @GetMapping
    public ResponseEntity<List<Evento>> getAllEvento() {
        List<Evento> eventos = eventoRepository.findAll();
        return ResponseEntity.ok(eventos);
    }
    
    @PostMapping("/cadastro")
    public ResponseEntity<Evento> createEvento(@RequestBody Evento evento) {
        Evento savedEvento = eventoRepository.save(evento);
        return ResponseEntity.ok(savedEvento);
    }
}
  
