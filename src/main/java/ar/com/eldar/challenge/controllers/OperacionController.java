package ar.com.eldar.challenge.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import ar.com.eldar.challenge.services.OperacionService;

@RestController
public class OperacionController {

    @Autowired
    OperacionService service;
    
}
