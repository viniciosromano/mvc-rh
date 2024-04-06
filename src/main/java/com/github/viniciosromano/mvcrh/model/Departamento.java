package com.github.viniciosromano.mvcrh.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "departamentos")
public class Departamento extends AbstractEntity {

    @Column(nullable = false,length = 60,unique = true)
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
