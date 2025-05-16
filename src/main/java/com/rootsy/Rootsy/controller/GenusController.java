package com.rootsy.Rootsy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rootsy.Rootsy.model.Genus;
import com.rootsy.Rootsy.service.GenusService;
import jakarta.validation.Valid;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping ("api/v1/genus")
public class GenusController {
    
    private final GenusService genusService;
    
    public GenusController(GenusService genusService){
        this.genusService = genusService;
    }
    
    @PostMapping
    public ResponseEntity<Object> createGenus (@Valid @RequestBody Genus genus) {
        return genusService.createGenus(genus);
    }
    
    @GetMapping
    public List<Genus> getAllGenuses() {
        return genusService.getAllGenuses();
    }
    
}
