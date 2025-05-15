package com.rootsy.Rootsy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rootsy.Rootsy.model.Plant;

@Repository
public interface PlantRepository extends JpaRepository<Plant, Integer>{
    
}