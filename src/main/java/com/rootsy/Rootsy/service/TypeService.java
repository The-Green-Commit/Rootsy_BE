package com.rootsy.Rootsy.service;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.rootsy.Rootsy.model.Type;
import com.rootsy.Rootsy.repository.TypeRepository;

@Service
public class TypeService {
    
    private final TypeRepository typeRepository;

    public TypeService(TypeRepository typeRepository){
        this.typeRepository = typeRepository;
    }

    public ResponseEntity<Object> createType(Type type) {

        // if (typeRepository.findByType(type.getType()) != null) {
        //     throw new TypeAlreadyExistsException(message: "(!) ERROR: this type already exists. Try a new one.")
        // }

        return new ResponseEntity<>(typeRepository.save(type), HttpStatus.CREATED);
    }

    public List<Type> getAllTypes() {
        return this.typeRepository.findAll();
    }

}
