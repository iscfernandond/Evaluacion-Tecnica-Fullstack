package com.clientespolizas.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.clientespolizas.model.Polizas;
import com.clientespolizas.repository.PolizasRepository;

@Service
public class PolizasService {
	
    @Autowired
    private PolizasRepository polizasRepository;

    public List<Polizas> listarPolizas() {
        return polizasRepository.findAll();
    }

    public Polizas registrarPolizas(Polizas polizas) {
        return polizasRepository.save(polizas);
    }
	public List<Polizas> listarPorCliente(Long clientesId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void asociar(Polizas polizas) {
		// TODO Auto-generated method stub
		
	}

	public void cancelar(Long id) {
		// TODO Auto-generated method stub
		
	}

}
