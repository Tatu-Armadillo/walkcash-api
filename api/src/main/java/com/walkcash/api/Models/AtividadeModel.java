package com.walkcash.api.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.domain.Page;

@Entity
@Table(name = "atividade")
public class AtividadeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_atividade")
    private Long idAtividade;

    @Column(name = "nome_atividade")
    private String nomeAtividade;

    public AtividadeModel() { }
    public AtividadeModel(Long idAtividade) {
        this.idAtividade = idAtividade;
     }

    //#region DTO
    public AtividadeModel(Long idAtividade, String nomeAtividade) {
        this.idAtividade = idAtividade;
        this.nomeAtividade = nomeAtividade;
    }

    public static Page<AtividadeModel> converterDto(Page<AtividadeModel> atividades) {
        return atividades;
    }
    //#endregion

    // #region Getters and Setters
    public Long getIdAtividade() {
        return idAtividade;
    }

    public void setIdAtividade(Long idAtividade) {
        this.idAtividade = idAtividade;
    }

    public String getNomeAtiviade() {
        return nomeAtividade;
    }

    public void setNomeAtiviade(String nomeAtiviade) {
        this.nomeAtividade = nomeAtiviade;
    }
    // #endregion

}
