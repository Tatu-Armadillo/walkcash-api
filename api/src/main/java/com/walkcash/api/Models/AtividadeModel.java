package com.walkcash.api.models;

import javax.persistence.*;

@Entity
@Table(name = "atividade")
public class AtividadeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_atividade")
    private Long idAtividade;

    @Column(name = "nome_atividade")
    private String nomeAtividade;

    public AtividadeModel() {
    }

    // #region DTO
    public AtividadeModel(Long idAtividade) {
        this.idAtividade = idAtividade;
    }

    public AtividadeModel(Long idAtividade, String nomeAtividade) {
        this.idAtividade = idAtividade;
        this.nomeAtividade = nomeAtividade;
    }
    // #endregion

    // #region Getters and Setters
    public Long getIdAtividade() {
        return idAtividade;
    }

    public String getNomeAtiviade() {
        return nomeAtividade;
    }
    // #endregion

}
