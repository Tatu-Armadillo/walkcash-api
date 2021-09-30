package com.walkcash.api.services;

import java.util.List;

import com.walkcash.api.models.RecompensaModel;
import com.walkcash.api.repositories.RecompensaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecompensaService {

    // @Autowired
    // private PercursoRepository percursoRepository;

    @Autowired
    private RecompensaRepository recompensaRepository;

    public List<RecompensaModel> visualizarRecompensas() {
        List<RecompensaModel> recompensas = recompensaRepository.findAll();
        return recompensas;
    }

}
