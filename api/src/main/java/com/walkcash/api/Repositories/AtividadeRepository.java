package com.walkcash.api.repositories;

import com.walkcash.api.models.AtividadeModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtividadeRepository extends JpaRepository<AtividadeModel, Long> {

}
