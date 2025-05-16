package com.rootsy.Rootsy.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rootsy.Rootsy.model.User;
import com.rootsy.Rootsy.repository.UserRepository;

@Service
public class UserService {
    
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseEntity<Object> createUser (User user) {
        
    //if (userRepository.findByEmail(user.getEmail()) != null) {
    //  throw new EmailAlreadyExistsException(message: "(!) ERROR: this email is already taken. Try a new one.");
    //}
    //if (userRepository.findByUsername(user.getUsername()) != null) {
    //  throw new UsernameAlreadyExistsException((!) ERROR: this email is already taken. Try a new one.");
    //}

        return new ResponseEntity<>(userRepository.save(user), HttpStatus.CREATED);
    }

}
