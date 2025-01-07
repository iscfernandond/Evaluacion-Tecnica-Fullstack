package com.clientespolizas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clientespolizas.model.Clientes;

public interface ClientesRepository extends JpaRepository<Clientes, Long> {

}
