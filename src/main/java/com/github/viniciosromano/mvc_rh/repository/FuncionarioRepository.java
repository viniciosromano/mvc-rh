package com.github.viniciosromano.mvc_rh.repository;

import com.github.viniciosromano.mvc_rh.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario,Long> {

}

