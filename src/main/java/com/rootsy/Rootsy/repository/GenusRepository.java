package com.rootsy.Rootsy.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.rootsy.Rootsy.model.Genus;

public interface GenusRepository extends JpaRepository<Genus, Integer>{
    Optional<Genus> getGenusById(Integer Id);
}
