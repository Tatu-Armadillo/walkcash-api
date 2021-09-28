package com.walkcash.api.Repositories;

import com.walkcash.api.Models.PercursoModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PercursoRepository extends JpaRepository<PercursoModel, Long> {
    
}
