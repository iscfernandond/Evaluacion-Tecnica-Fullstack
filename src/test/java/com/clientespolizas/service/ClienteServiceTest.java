package com.clientespolizas.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.clientespolizas.model.Clientes;
import com.clientespolizas.repository.ClientesRepository;

public class ClienteServiceTest {
    @MockBean
    private ClientesRepository clientesRepository;

    @Autowired
    private ClientesService clientesService;

    @Test
    public void testRegistrarCliente() {
        Clientes clientes = new Clientes();
        clientes.setNumeroIdentificacion("1234567890");
        clientes.setNombreCompleto("Juan Pérez");
        // Configurar el comportamiento del mock
        Mockito.when(clientesRepository.save(clientes)).thenReturn(clientes);
        
        Clientes resultado = (Clientes) clientesService.registrar(clientes);
        assertEquals("Juan Pérez", resultado.getNombreCompleto());
    }

}
