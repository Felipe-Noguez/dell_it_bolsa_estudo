package com.itacademy.bolsaestudos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//representação da tabela do banco

@Entity
@Table(name = "bolsista")
public class Bolsista {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nm_bolsista", length = 90, nullable = false)
    private String name;
    
    @Column(name = "cpf_bolsista", length = 18, nullable = false)
    private String cpf;

    @Column(name = "nm_entidade_ensino", length = 150, nullable = false)
    private String entidadeEnsino;

    @Column(name = "me_referencia", length = 2)
    private String meReferencia;

    @Column(name = "an_referencia", length = 4)
    private Integer anoReferencia;

    @Column(name = "sg_diretoria", length = 6)
    private String diretoria;

    @Column(name = "sg_sistema_origem", length = 5)
    private String sistemaOrigem;

    @Column(name = "cd_modalidade_sgb", length = 5)
    private Integer modalidadeSgb;

    @Column(name = "ds_modalidade_pagamento", length = 40)
    private String modalidadePagamento;

    @Column(name = "cd_moeda", length = 4)
    private String moeda;

    @Column(name = "vl_bolsista_pagamento", length = 8)
    private Integer valorBolsistaPagamento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEntidadeEnsino() {
        return entidadeEnsino;
    }

    public void setEntidadeEnsino(String entidadeEnsino) {
        this.entidadeEnsino = entidadeEnsino;
    }

    public String getMeReferencia() {
        return meReferencia;
    }

    public void setMeReferencia(String meReferencia) {
        this.meReferencia = meReferencia;
    }

    public int getAnoReferencia() {
        return anoReferencia;
    }

    public void setAnoReferencia(int anoReferencia) {
        this.anoReferencia = anoReferencia;
    }

    public String getDiretoria() {
        return diretoria;
    }

    public void setDiretoria(String diretoria) {
        this.diretoria = diretoria;
    }

    public String getSistemaOrigem() {
        return sistemaOrigem;
    }

    public void setSistemaOrigem(String sistemaOrigem) {
        this.sistemaOrigem = sistemaOrigem;
    }

    public int getModalidadeSgb() {
        return modalidadeSgb;
    }

    public void setModalidadeSgb(int modalidadeSgb) {
        this.modalidadeSgb = modalidadeSgb;
    }

    public String getModalidadePagamento() {
        return modalidadePagamento;
    }

    public void setModalidadePagamento(String modalidadePagamento) {
        this.modalidadePagamento = modalidadePagamento;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public int getValorBolsistaPagamento() {
        return valorBolsistaPagamento;
    }

    public void setValorBolsistaPagamento(int valorBolsistaPagamento) {
        this.valorBolsistaPagamento = valorBolsistaPagamento;
    }        
}
