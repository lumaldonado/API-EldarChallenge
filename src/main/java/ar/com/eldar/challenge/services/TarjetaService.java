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

    public boolean crear(Tarjeta tarjeta) {
       if(existe(tarjeta.getId()))
          return false;
       
       repo.save(tarjeta);

       return true;
    }

    public boolean existe(Integer id) {
        Optional<Tarjeta> tarjeta = repo.findById(id);
        return tarjeta != null;
    }

    public Tarjeta buscarTarjetaPorId(Integer id) {
        Optional<Tarjeta> resultado =  repo.findById(id);

        if(resultado.isPresent()){
            return resultado.get();
        }

        return null;    
    
    }

}
