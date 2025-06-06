package com.rootsy.Rootsy.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rootsy.Rootsy.model.Family;

@Repository
public interface FamilyRepository extends JpaRepository<Family, Integer>{
    Optional<Family> getFamilyById(Integer id);
}
