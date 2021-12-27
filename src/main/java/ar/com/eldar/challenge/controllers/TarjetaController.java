package ar.com.eldar.challenge.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import ar.com.eldar.challenge.services.TarjetaService;

@RestController
public class TarjetaController {
    
    @Autowired
    TarjetaService service;
}
