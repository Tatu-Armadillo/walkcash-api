package com.walkcash.api.repositories;

import com.walkcash.api.models.RecompensaModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public interface RecompensaRepository extends JpaRepository<RecompensaModel, Long>{
    
    public RecompensaModel getByIdRecompensa(Long idRecompensa);

}
