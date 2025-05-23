package com.rootsy.Rootsy.service;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.rootsy.Rootsy.model.Genus;
import com.rootsy.Rootsy.repository.GenusRepository;


@Service
public class GenusService {
    
    private final GenusRepository genusRepository;

    public GenusService(GenusRepository genusRepository) {
        this.genusRepository = genusRepository;
    }

    public ResponseEntity<Object> createGenus(Genus genus) {
        return new ResponseEntity<>(genusRepository.save(genus), HttpStatus.CREATED);
    }

    public List<Genus> getAllGenuses() {
        return genusRepository.findAll();
    }
}


