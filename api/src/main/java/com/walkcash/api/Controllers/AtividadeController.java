package com.walkcash.api.controllers;

import com.walkcash.api.models.AtividadeModel;
import com.walkcash.api.repositories.AtividadeRepository;

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
@RequestMapping("/atividades")
public class AtividadeController {

    @Autowired
    private AtividadeRepository atividadeRepository;

    @GetMapping
    public Page<AtividadeModel> visualizarAtividades(@RequestParam(required = false) Long idAtividade,
            @PageableDefault(sort = "idAtividade", direction = Direction.ASC) Pageable page) {
        Page<AtividadeModel> atividades = atividadeRepository.findAll(page);
        return atividades;
    }

}
