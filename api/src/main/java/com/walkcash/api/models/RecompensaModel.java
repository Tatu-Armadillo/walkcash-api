package com.walkcash.api.models;

import java.math.BigDecimal;

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
@Table(name = "recompensa")
public class RecompensaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_recompensa")
    private Long idRecompensa;

    private BigDecimal cotacao;

    @Column(name = "total_recompensa")
    private BigDecimal totalRecompensa;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "percurso", referencedColumnName = "id_percurso")
    private PercursoModel percurso;

    public RecompensaModel() { }

    public RecompensaModel(Long idRecompensa) {
        this.idRecompensa = idRecompensa;
    }

    public RecompensaModel(Long idRecompensa, BigDecimal cotacao, BigDecimal totalRecompensa, PercursoModel percurso) {
        this.idRecompensa = idRecompensa;
        this.cotacao = cotacao;
        this.totalRecompensa = totalRecompensa;
        this.percurso = percurso;
    }

    // #region Getters and Setters
    public Long getIdRecompensa() {
        return idRecompensa;
    }

    public BigDecimal getCotacao() {
        return cotacao;
    }

    public void setCotacao(BigDecimal cotacao) {
        this.cotacao = cotacao;
    }

    public BigDecimal getTotalRecompensa() {
        return totalRecompensa;
    }

    public void setTotalRecompensa(BigDecimal totalRecompensa) {
        this.totalRecompensa = totalRecompensa;
    }

    public PercursoModel getPercurso() {
        return percurso;
    }

    public void setPercurso(PercursoModel percurso) {
        this.percurso = percurso;
    }
    // #endregion
}
