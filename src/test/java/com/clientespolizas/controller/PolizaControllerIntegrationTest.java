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

import com.clientespolizas.model.Polizas;
import com.clientespolizas.repository.PolizasRepository;

@SpringBootTest
@AutoConfigureMockMvc
public class PolizaControllerIntegrationTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private PolizasRepository polizasRepository;

    @BeforeEach
    public void setUp() {
        polizasRepository.deleteAll();
    }

    @Test
    public void testRegistrarPoliza() throws Exception {
        Polizas polizas = new Polizas();
        polizas.setTipoPoliza("vida");
        polizas.setMontoAsegurado(100000.0);
        polizas.setEstado("activa");

        mockMvc.perform(post("/api/polizas")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"tipoPoliza\":\"vida\",\"montoAsegurado\":100000.0,\"estado\":\"activa\"}"))
                .andExpect(status().isOk());
    }

}
