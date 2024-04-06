package com.github.viniciosromano.mvcrh.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "enderecos")
public class Endereco extends AbstractEntity<Long> {

    @Column(nullable = false,length = 60)
    private String bairro;
    @Column(nullable = false,length = 10)
    private String cep;
    @Column(nullable = false,length = 10)
    private String complemento;
    @Column(length = 10)
    private String logradouro;
    @Column(length = 10)
    private long numero;
    @Column(nullable = false,length = 2)
    private String uf;



    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
