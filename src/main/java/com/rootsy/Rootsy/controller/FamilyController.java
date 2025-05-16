package com.rootsy.Rootsy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rootsy.Rootsy.service.FamilyService;

@RestController
@RequestMapping("api/v1/family")
public class FamilyController {
    
    private final FamilyService familyService;
    
    public FamilyController(FamilyService familyService){
     this.familyService = familyService;
    }
    
    //MAP GET ALL
    
    //MAP POST

}
