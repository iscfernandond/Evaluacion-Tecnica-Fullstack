package com.clientespolizas.service;

import com.clientespolizas.model.Clientes;
import com.clientespolizas.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientesService {
	
    @Autowired
    private ClientesRepository clientesRepository;
    
    public List<Clientes> listarClientes() {
        return clientesRepository.findAll();
    }

    public Clientes registrarCliente(Clientes clientes) {
        return clientesRepository.save(clientes);
    }

	public Clientes registrar(Clientes clientes) {
		// TODO Auto-generated method stub
		
	}

	public List<Clientes> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	public void editar(Long id, Clientes clientes) {
		// TODO Auto-generated method stub
		
	}

	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		
	}
    
    
    
}
