package com.rootsy.Rootsy.service;

import com.rootsy.Rootsy.repository.FamilyRepository;

public class FamilyService {
    
    private final FamilyRepository familyRepository;

    public FamilyService(FamilyRepository familyRepository) {
        this.familyRepository = familyRepository;
    }

}
