package com.rootsy.Rootsy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rootsy.Rootsy.model.Family;
import com.rootsy.Rootsy.service.FamilyService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


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
    

    //MAP GET ALL

}
