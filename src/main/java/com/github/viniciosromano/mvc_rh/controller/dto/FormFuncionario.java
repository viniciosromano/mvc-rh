package com.github.viniciosromano.mvc_rh.controller.dto;

import com.github.viniciosromano.mvc_rh.model.Cargo;
import com.github.viniciosromano.mvc_rh.model.Funcionario;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FormFuncionario {
    private Long id;
    private String nome;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private BigDecimal salario;
    private Cargo cargo;

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

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    public FormFuncionario toForm(Funcionario funcionario) {
        return this;
    }
    public Funcionario toModel(){
        Funcionario funcionario = new Funcionario();
        return funcionario;
    }
}
