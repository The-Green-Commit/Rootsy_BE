package com.rootsy.Rootsy.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.rootsy.Rootsy.model.Family;
import com.rootsy.Rootsy.model.Genus;
import com.rootsy.Rootsy.model.Type;
import com.rootsy.Rootsy.model.Plant;
import com.rootsy.Rootsy.repository.FamilyRepository;
import com.rootsy.Rootsy.repository.GenusRepository;
import com.rootsy.Rootsy.repository.PlantRepository;
import com.rootsy.Rootsy.repository.TypeRepository;

public class PlantService {

    private final PlantRepository plantRepository;
    private final GenusRepository genusRepository;
    private final FamilyRepository familyRepository;
    private final TypeRepository typeRepository;

    public PlantService (PlantRepository plantRepository, GenusRepository genusRepository, FamilyRepository familyRepository, TypeRepository typeRepository) {
        this.plantRepository = plantRepository;
        this.familyRepository = familyRepository;
        this.genusRepository = genusRepository;
        this.typeRepository = typeRepository;
    }

    public ResponseEntity<Object> createPlant(Plant plant, Integer familyId, Integer genusId, Integer typeId) {
        Family family = familyRepository.getFamilyById(familyId);
        Genus genus = genusRepository.getGenusById(genusId);
        Type type = typeRepository.getTypeById(typeId);

        plant.setFamily(family);
        plant.setGenus(genus);
        plant.setType(type);

        return new ResponseEntity<>(plantRepository.save(plant), HttpStatus.CREATED);
    }

}
