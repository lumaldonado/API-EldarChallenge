package ar.com.eldar.challenge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ar.com.eldar.challenge.entities.Tarjeta;
import ar.com.eldar.challenge.models.response.GenericResponse;
import ar.com.eldar.challenge.services.TarjetaService;

@RestController
public class TarjetaController {

    @Autowired
    TarjetaService service;

    @GetMapping("/tarjetas/{id}")
    public ResponseEntity<?> traerTarjetaPorId(@PathVariable Integer id) {
        Tarjeta tarjeta = service.buscarTarjetaPorId(id);
        if (tarjeta == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(tarjeta);
    }

    @PostMapping("/tarjetas")
    public ResponseEntity<?> crear(@RequestBody Tarjeta tarjeta) {
        GenericResponse respuesta = new GenericResponse();

        if (service.crear(tarjeta)) {
            respuesta.isOk = true;
            respuesta.id = tarjeta.getId();
            respuesta.message = "La tarjeta fue creado con exito";

            return ResponseEntity.ok(respuesta);

        } else {

            respuesta.isOk = false;
            respuesta.message = "La tarjeta ya existe";

            return ResponseEntity.badRequest().body(respuesta);
        }
    }
}
