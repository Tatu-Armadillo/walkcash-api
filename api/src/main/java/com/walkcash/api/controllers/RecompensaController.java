package com.walkcash.api.controllers;

import java.util.List;

import com.walkcash.api.models.RecompensaModel;
import com.walkcash.api.services.RecompensaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recompensas")
public class RecompensaController {
    
    @Autowired
    private RecompensaService recompensaService;

    @GetMapping
    public List<RecompensaModel> visualizarRecompensas() {
        List<RecompensaModel> recompensas = recompensaService.visualizarRecompensas();
        return recompensas;
    }

}
