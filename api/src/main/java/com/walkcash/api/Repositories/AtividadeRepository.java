package com.walkcash.api.Repositories;

import com.walkcash.api.Models.AtividadeModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtividadeRepository extends JpaRepository<AtividadeModel, Long> {

}
