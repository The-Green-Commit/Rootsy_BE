package com.rootsy.Rootsy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rootsy.Rootsy.service.UserService;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
    
    private final UserService userService;
    
    public UserController(UserService userService){
        this.userService = userService;
    }
    
    //MAP GET ALL
    
    //MAP POST

}