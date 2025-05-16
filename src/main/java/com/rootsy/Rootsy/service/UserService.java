package com.rootsy.Rootsy.service;

import org.springframework.stereotype.Service;

import com.rootsy.Rootsy.repository.UserRepository;

@Service
public class UserService {
    
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

}
