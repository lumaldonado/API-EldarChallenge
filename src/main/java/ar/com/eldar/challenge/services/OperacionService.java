package ar.com.eldar.challenge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.eldar.challenge.entities.Operacion;
import ar.com.eldar.challenge.repositories.OperacionRepository;

@Service
public class OperacionService {

    @Autowired
    OperacionRepository repo;

    public void crear(Operacion operacion) {
        repo.save(operacion);
    }

    public List<Operacion> traerTodasLasOperaciones() {
        return repo.findAll();
    }


    
}
