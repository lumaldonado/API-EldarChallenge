package ar.com.eldar.challenge.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.eldar.challenge.entities.Holder;
import ar.com.eldar.challenge.repositories.HolderRepository;

@Service
public class HolderService {
    
    @Autowired
    HolderRepository repo;

    public void crear(Holder holder) {
        repo.save(holder);
    }

    

}
