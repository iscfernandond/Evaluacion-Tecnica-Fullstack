package com.clientespolizas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.clientespolizas.model.Polizas;
import com.clientespolizas.service.PolizasService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/polizas")
public class PolizasController {
    @Autowired
    private PolizasService polizasService;

    @GetMapping("/cliente/{clienteId}")
    public List<Polizas> listarPolizasPorCliente(@PathVariable Long clientesId) {
        return polizasService.listarPorCliente(clientesId);
    }

    @PostMapping
    public ResponseEntity<Polizas> asociarPoliza(@RequestBody Polizas polizas) {
        polizasService.asociar(polizas);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{id}/cancelar")
    public ResponseEntity<Polizas> cancelarPoliza(@PathVariable Long id) {
        polizasService.cancelar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
 }
}


