package com.rootsy.Rootsy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rootsy.Rootsy.service.GenusService;

@RestController
@RequestMapping ("api/v1/genus")
public class GenusController {
    
    private final GenusService genusService;
    
    public GenusController(GenusService genusService){
     this.genusService = genusService;
    }
    
    //MAP GET ALL
    
    //MAP GET BY ID
    
    //MAP POST
    
    //MAP DELETE(sin cascade)

}
