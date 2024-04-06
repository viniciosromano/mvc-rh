package com.github.viniciosromano.mvcrh.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "cargo")
public class Cargo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false,length = 50,unique = true)
    private String nome;
    @ManyToOne
    private Departamento departamento;

    public Cargo(long id, String nome) {
        this.id = id;
        this.nome = nome;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
