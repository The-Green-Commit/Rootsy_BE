package com.rootsy.Rootsy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rootsy.Rootsy.model.Plant;
import com.rootsy.Rootsy.service.PlantService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("api/v1/plant")
public class PlantController {
    
    private final PlantService plantService;
    
    public PlantController(PlantService plantService){
        this.plantService = plantService;
    }

    @PostMapping("/{familyId}/{genusId}/{typeId}}")
    public ResponseEntity<Object> createPlant(@PathVariable Integer familyId, @PathVariable Integer genusId, @PathVariable Integer typeId, @Valid @RequestBody Plant plant) {        
        
        return plantService.createPlant(plant, familyId, genusId, typeId);
    }

    @GetMapping
    public List<Plant> getAllPlants(){
        return plantService.getAllPlants();
    }
    }
        
    
    //MAP GET ALL
    
    //MAP GET BY ID

    //MAP GET BY TYPE

    //MAP GET BY PET-FRIENDLY

    //MAP GET BY FAMILY
        
    //MAP DELETE(sin cascade)

