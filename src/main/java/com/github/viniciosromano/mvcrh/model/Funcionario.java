package com.github.viniciosromano.mvcrh.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
@Table(name = "funcionarios")
public class Funcionario extends AbstractEntity {
    @Column(nullable = false,length = 60)
    private String nome;
    @Column(nullable = false,columnDefinition = "DATE")
    private LocalDate dataEntrada;
    @Column(nullable = false,columnDefinition = "DATE")
    private LocalDate dataSaida;
    @Column(nullable = false,columnDefinition = "NUMERIC(15,2)")
    private BigDecimal salario;
    @ManyToOne
    @JoinColumn(name = "cargo_id_fk",nullable = false)
    private Cargo cargo;
    @OneToOne
    @JoinColumn(name = "endereco_id_fk",nullable = false)
    private Endereco endereco;
}
