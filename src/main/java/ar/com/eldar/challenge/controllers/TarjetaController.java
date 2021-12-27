package ar.com.eldar.challenge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ar.com.eldar.challenge.entities.Tarjeta;
import ar.com.eldar.challenge.services.TarjetaService;

@RestController
public class TarjetaController {
    
    @Autowired
    TarjetaService service;

    @GetMapping("/tarjetas/{id}")
    public ResponseEntity<?> traerTarjetaPorId(@PathVariable Integer id) {
        Tarjeta tarjeta = service.buscarTarjetaPorId(id);
        if (tarjeta == null){
             return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(tarjeta);
    }
}
