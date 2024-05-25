package com.github.viniciosromano.mvc_rh.controller.dto;

import com.github.viniciosromano.mvc_rh.model.Departamento;

public class FormDepartamento {
    private Long id;
    private String nome;


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

    public FormDepartamento toForm(Departamento departamento){
        this.id = departamento.getId();
        this.nome = departamento.getNome();
        return this;
    }
    public Departamento toModel(){
        Departamento departamento = new Departamento();
        departamento.setId(this.id);
        departamento.setNome(this.nome);
        return departamento;
    }
}
