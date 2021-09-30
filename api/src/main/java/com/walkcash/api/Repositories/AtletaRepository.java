package com.walkcash.api.repositories;

import com.walkcash.api.models.AtletaModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtletaRepository extends JpaRepository<AtletaModel, Long> {
    
}
