package com.rootsy.Rootsy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rootsy.Rootsy.service.TypeService;
import com.rootsy.Rootsy.model.Type;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("api/v1/type")
public class TypeController {
    
    private final TypeService typeService;

    public TypeController(TypeService typeService){
    this.typeService = typeService;
    }

    @PostMapping
    public ResponseEntity<Object> createType(@Valid @RequestBody Type type){
        return this.typeService.createType(type);
    }

    }
    

//MAP GET ALL

//MAP GET BY TYPE


