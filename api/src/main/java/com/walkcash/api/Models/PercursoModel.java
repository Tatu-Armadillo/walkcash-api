package com.walkcash.api.Models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "percurso")
public class PercursoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_percurso")
    private Long idPercurso;

    private BigDecimal distancia;
    private LocalTime tempo;
    private LocalDate data;
    private String observacao;
    private BigDecimal recompensa;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "atleta", referencedColumnName = "id_atleta")
    private AtletaModel atleta;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "atividade", referencedColumnName = "id_atividade")
    private AtividadeModel atividade;

    public PercursoModel() { }

    public PercursoModel(Long idPercurso) {
        this.idPercurso = idPercurso;
    }

    public PercursoModel(Long idPercurso, BigDecimal distancia, LocalTime tempo, LocalDate data, String observacao, BigDecimal recompensa, AtletaModel atleta, AtividadeModel atividade) {
        this.idPercurso = idPercurso;
        this.distancia = distancia;
        this.tempo = tempo;
        this.data = data;
        this.observacao = observacao;
        this.recompensa = recompensa;
        this.atleta = atleta;
        this.atividade = atividade;
    }

    // #region Getters and Setters
    public Long getIdPercurso() {
        return idPercurso;
    }

    public BigDecimal getDistancia() {
        return distancia;
    }

    public LocalTime getTempo() {
        return tempo;
    }

    public LocalDate getData() {
        return data;
    }

    public String getObservacao() {
        return observacao;
    }

    public BigDecimal getRecompensa() {
        return recompensa;
    }

    public AtletaModel getAtleta() {
        return atleta;
    }

    public AtividadeModel getAtividade() {
        return atividade;
    }
    // #endregion

}
