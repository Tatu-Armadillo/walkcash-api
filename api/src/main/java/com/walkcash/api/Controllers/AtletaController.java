package com.walkcash.api.controllers;

import com.walkcash.api.models.AtletaModel;
import com.walkcash.api.repositories.AtletaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atletas")
public class AtletaController {
 
    @Autowired
    private AtletaRepository atletaRepository;

    @GetMapping
    public Page<AtletaModel> visualizarAtletas(@RequestParam(required = false) Long idAlteta,
            @PageableDefault(sort = "idAtleta", direction = Direction.ASC) Pageable page) {
        Page<AtletaModel> atletas = atletaRepository.findAll(page);
        return atletas;
    }
}
