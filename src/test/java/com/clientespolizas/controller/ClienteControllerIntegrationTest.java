package com.clientespolizas.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.clientespolizas.model.Clientes;
import com.clientespolizas.repository.ClientesRepository;


@SpringBootTest
@AutoConfigureMockMvc
public class ClienteControllerIntegrationTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ClientesRepository clientesRepository;

    @BeforeEach
    public void setUp() {
        clientesRepository.deleteAll();
    }

    @Test
    public void testRegistrarCliente() throws Exception {
        Clientes clientes = new Clientes();
        clientes.setNumeroIdentificacion("1234567890");
        clientes.setNombreCompleto("Juan Perez");
        clientes.setEmail("juan.perez@example.com");
        clientes.setTelefono("123456789");

        mockMvc.perform(post("/api/clientes")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"numeroIdentificacion\":\"1234567890\",\"nombreCompleto\":\"Juan Perez\",\"email\":\"juan.perez@example.com\",\"telefono\":\"123456789\"}"))
                .andExpect(status().isOk());
    }

}
