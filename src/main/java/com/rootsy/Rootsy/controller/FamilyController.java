package com.rootsy.Rootsy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rootsy.Rootsy.model.Family;
import com.rootsy.Rootsy.service.FamilyService;
import jakarta.validation.Valid;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("api/v1/family")
public class FamilyController {
    
    private final FamilyService familyService;
    
    public FamilyController(FamilyService familyService){
     this.familyService = familyService;
    }
    
    @PostMapping
    public ResponseEntity<Object> createFamily (@Valid @RequestBody Family family) {
        return familyService.createFamily(family);
    }
    
    @GetMapping
    public List<Family> getAllFamilies(@Valid @RequestParam Family family) {
        return this.familyService.getAllFamilies();
    }

}
