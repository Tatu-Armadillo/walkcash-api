package com.walkcash.api.repositories;

import com.walkcash.api.models.PercursoModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PercursoRepository extends JpaRepository<PercursoModel, Long> {
    
}
