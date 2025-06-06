package com.rootsy.Rootsy.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rootsy.Rootsy.model.Type;

@Repository
public interface TypeRepository extends JpaRepository <Type, Integer>{
    Optional<Type> getTypeById(Integer id);
}
