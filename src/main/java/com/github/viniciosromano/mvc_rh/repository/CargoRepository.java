package com.github.viniciosromano.mvc_rh.repository;

import com.github.viniciosromano.mvc_rh.model.Cargo;
import com.github.viniciosromano.mvc_rh.model.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoRepository extends JpaRepository<Cargo,Long> {
}
