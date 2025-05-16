package com.rootsy.Rootsy.service;

import org.springframework.stereotype.Service;

import com.rootsy.Rootsy.repository.TypeRepository;

@Service
public class TypeService {
    
    private final TypeRepository typeRepository;

    public TypeService(TypeRepository typeRepository){
        this.typeRepository = typeRepository;
    }

}
