package com.clientespolizas.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;

public class Clientes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true, nullable = false)
	private String numeroIdentificacion;

	@Column(nullable = false)
	private String nombreCompleto;

	@Email
	@Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private String telefono;

	public Clientes() {
    	
}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Clientes(Long id, String numeroIdentificacion, String nombreCompleto, @Email String email, String telefono) {
		super();
		this.id = id;
		this.numeroIdentificacion = numeroIdentificacion;
		this.nombreCompleto = nombreCompleto;
		this.email = email;
		this.telefono = telefono;
	}

}
