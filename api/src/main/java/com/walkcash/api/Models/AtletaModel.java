package com.walkcash.api.models;

import java.math.BigDecimal;

import javax.persistence.*;

@Entity
@Table(name = "atleta")
public class AtletaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_atleta")
    private Long idAtleta;

    private BigDecimal peso;
    private BigDecimal altura;

    @Column(name = "nome_atleta")
    private String nomeAtleta;

    private String cpf;
    private String email;
    private String senha;

    public AtletaModel() { }

    public AtletaModel(Long idAtleta) {
        this.idAtleta = idAtleta;
    }
    
    public AtletaModel(Long idAtleta, BigDecimal peso, BigDecimal altura, String nomeAtleta, String cpf, String email, String senha ) {
        this.idAtleta = idAtleta;
        this.peso = peso;
        this.altura = altura;
        this.nomeAtleta = nomeAtleta;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }

    // #region Getters and Setters
    public Long getIdAtleta() {
        return idAtleta;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public BigDecimal getAltura() {
        return altura;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    // #endregion
}
