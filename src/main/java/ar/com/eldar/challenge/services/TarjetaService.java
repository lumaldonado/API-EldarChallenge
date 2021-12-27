package ar.com.eldar.challenge.services;

import java.lang.StackWalker.Option;
import java.util.Optional;

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

    public Tarjeta buscarTarjetaPorId(Integer id) {
        Optional<Tarjeta> resultado =  repo.findById(id);

        if(resultado.isPresent()){
            return resultado.get();
        }

        return null;    
    
    }

}
