package com.walkcash.api.controllers;

import com.walkcash.api.models.PercursoModel;
import com.walkcash.api.repositories.PercursoRepository;

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
@RequestMapping("/percursos")
public class PercursoController {
    
    @Autowired
    private PercursoRepository percursoRepository;

    @GetMapping
    public Page<PercursoModel> visualizarPercursos(@RequestParam(required = false) Long idPercurso,
            @PageableDefault(sort = "idPercurso", direction = Direction.ASC) Pageable page) {
        Page<PercursoModel> percursos = percursoRepository.findAll(page);
        return percursos;
    }

}
