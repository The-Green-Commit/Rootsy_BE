package com.rootsy.Rootsy.service;

import org.springframework.stereotype.Service;

import com.rootsy.Rootsy.repository.GenusRepository;

@Service
public class GenusService {
    
    private final GenusRepository genusRepository;

    public GenusService(GenusRepository genusRepository) {
        this.genusRepository = genusRepository;
    }

}


