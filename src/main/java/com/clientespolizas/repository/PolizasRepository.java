package com.clientespolizas.repository;

import com.clientespolizas.model.Polizas;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PolizasRepository extends JpaRepository<Polizas, Long> {

	List<Polizas> findAll();

	Polizas save(Polizas polizas);

}
