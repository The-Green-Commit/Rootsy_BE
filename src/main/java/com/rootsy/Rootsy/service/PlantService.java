package com.rootsy.Rootsy.service;

import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.rootsy.Rootsy.exceptions.PlantNameAlreadyExistsException;
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
        Optional<Family> familyOptional = familyRepository.getFamilyById(familyId);
        Optional<Genus> genusOptional = genusRepository.getGenusById(genusId);
        Optional<Type> typeOptional = typeRepository.getTypeById(typeId);

        if (plant.getPlantName() != null && plantRepository.findByPlantName(plant.getPlantName()) != null) {
            throw new PlantNameAlreadyExistsException("(!) ERROR: this plant already exists");
        }

        plant.setFamily(familyOptional.get());
        plant.setGenus(genusOptional.get());
        plant.setType(typeOptional.get());

        return new ResponseEntity<>(plantRepository.save(plant), HttpStatus.CREATED);
    }

    public List<Plant> getAllPlants() {
        return this.plantRepository.findAll();
    }

}
