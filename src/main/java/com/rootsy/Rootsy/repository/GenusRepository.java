package com.rootsy.Rootsy.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rootsy.Rootsy.model.Genus;

@Repository
public interface GenusRepository extends JpaRepository<Genus, Integer>{
    Optional<Genus> getGenusById(Integer Id);
}
