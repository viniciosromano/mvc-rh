package com.github.viniciosromano.mvc_rh.controller.dto;

import com.github.viniciosromano.mvc_rh.model.Cargo;
import com.github.viniciosromano.mvc_rh.model.Departamento;

import java.util.Calendar;

public class FormCargo {
    private Long id;
    private String nome;
    private Long idDepartamento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Long idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public FormCargo toForm(Cargo cargo){
        return this;
    }
    public Cargo toModel(){
        Cargo cargo = new Cargo();
        return cargo;
    }
}
