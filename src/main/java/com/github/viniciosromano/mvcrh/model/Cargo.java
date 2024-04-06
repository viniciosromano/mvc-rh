package com.github.viniciosromano.mvcrh.model;

import jakarta.persistence.*;
import org.springframework.boot.SpringApplication;

import java.io.Serializable;

@Entity
@Table(name = "cargo")
public class Cargo extends AbstractEntity<Long> {

    @Column(nullable = false,length = 50,unique = true)
    private String nome;
    @ManyToOne
    private Departamento departamento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
