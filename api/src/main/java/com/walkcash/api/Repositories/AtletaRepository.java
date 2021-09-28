package com.walkcash.api.Repositories;

import com.walkcash.api.Models.AtletaModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtletaRepository extends JpaRepository<AtletaModel, Long> {
    
}
