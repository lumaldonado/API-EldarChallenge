package ar.com.eldar.challenge.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ar.com.eldar.challenge.entities.Operacion;
import ar.com.eldar.challenge.models.response.GenericResponse;
import ar.com.eldar.challenge.services.OperacionService;

@RestController
public class OperacionController {

    @Autowired
    OperacionService service;


    @PostMapping("/operaciones")
    public ResponseEntity<?> crearOperacion(@RequestBody Operacion operacion) {
        service.crear(operacion);
        GenericResponse respuesta = new GenericResponse();

        if(operacion.getMonto() < 1000){
        respuesta.isOk = true;
        respuesta.id = operacion.getId();
        respuesta.message = "La operacion fue procesada con exito";
        return ResponseEntity.ok(respuesta);
        }
        else{
        respuesta.isOk = false;
        respuesta.message = "La operacion es invalida";
        return ResponseEntity.badRequest().body(respuesta);
        }
        
 
        
    }
    
}
