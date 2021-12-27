package ar.com.eldar.challenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.eldar.challenge.entities.Tarjeta;

@Repository
public interface TarjetaRepository extends JpaRepository<Tarjeta,Integer> {
    
}
