package ar.com.eldar.challenge.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.eldar.challenge.entities.Tarjeta;
import ar.com.eldar.challenge.repositories.TarjetaRepository;

@Service
public class TarjetaService {
    
    @Autowired
    TarjetaRepository repo;

    public void crear(Tarjeta tarjeta) {
        repo.save(tarjeta);
    }

}
