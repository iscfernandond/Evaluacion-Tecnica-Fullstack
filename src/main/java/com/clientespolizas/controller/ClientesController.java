package com.clientespolizas.controller;

import com.clientespolizas.model.Clientes;

import com.clientespolizas.service.ClientesService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clientes")
public class ClientesController {
    @Autowired
    private ClientesService clientesService;

    @PostMapping
    public ResponseEntity<Clientes> registrarCliente(@RequestBody Clientes clientes) {
        clientesService.registrar(clientes);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public List<Clientes> listarClientes() {
        return clientesService.listarTodos();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Clientes> editarCliente(@PathVariable Long id, @RequestBody Clientes clientes) {
        clientesService.editar(id, clientes);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarCliente(@PathVariable Long id) {
        clientesService.eliminar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
