package com.rootsy.Rootsy.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.rootsy.Rootsy.model.Family;
import com.rootsy.Rootsy.repository.FamilyRepository;

public class FamilyService {
    
    private final FamilyRepository familyRepository;

    public FamilyService(FamilyRepository familyRepository) {
        this.familyRepository = familyRepository;
    }

    public ResponseEntity<Object> createFamily (Family family) {

        //if (familyRepository.findByFamily(family.getFamily()) != null) {
        //  throw new FamilyAlreadyExistsException(message: "(!) ERROR: this family already exists. Try a new one.") 
        //}

        return new ResponseEntity<>(familyRepository.save(family), HttpStatus.CREATED);
    }

    public List<Family> getAllFamilies(){
        return familyRepository.findAll();
    }

}
