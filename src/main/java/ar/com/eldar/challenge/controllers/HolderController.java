package ar.com.eldar.challenge.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ar.com.eldar.challenge.entities.Holder;
import ar.com.eldar.challenge.models.response.GenericResponse;
import ar.com.eldar.challenge.services.HolderService;

@RestController
public class HolderController {
    
    @Autowired
    HolderService service;

    @PostMapping("/cardholders")
    public ResponseEntity<?> crear(@RequestBody Holder holder) {
        GenericResponse respuesta = new GenericResponse();

        service.crear(holder);
        respuesta.isOk = true;
        respuesta.id = holder.getId();
        respuesta.message = "El cliente fue creado con exito";

        return ResponseEntity.ok(respuesta);
    }

}
