package com.itacademy.bolsaestudos.bean;

public class BolsistaZeroBean {
    
    private String name;
    private String cpf;
    private String entidadeEnsino;
    private Integer valorBolsa;

    public BolsistaZeroBean(String name, String cpf, String entidadeEnsino, Integer valorBolsa) {
        this.name = name;
        this.cpf = cpf;
        this.entidadeEnsino = entidadeEnsino;
        this.valorBolsa = valorBolsa;
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

    public Integer getValorBolsa() {
        return valorBolsa;
    }

    public void setValorBolsar(Integer valorBolsa) {
        this.valorBolsa = valorBolsa;
    }
    
}
