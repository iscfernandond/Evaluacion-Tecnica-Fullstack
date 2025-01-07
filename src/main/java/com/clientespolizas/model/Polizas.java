package com.clientespolizas.model;

import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Polizas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Clientes clientes;
	private String tipoPoliza; // vida, automovil, salud, hogar
	private Date fechaInicio;
	private Date fechaExpiracion;
	private Double montoAsegurado;
	private String estado; // activa, cancelada

	public Polizas() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Clientes getClientes() {
		return clientes;
	}

	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}

	public String getTipoPoliza() {
		return tipoPoliza;
	}

	public void setTipoPoliza(String tipoPoliza) {
		this.tipoPoliza = tipoPoliza;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaExpiracion() {
		return fechaExpiracion;
	}

	public void setFechaExpiracion(Date fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}

	public Double getMontoAsegurado() {
		return montoAsegurado;
	}

	public void setMontoAsegurado(Double montoAsegurado) {
		this.montoAsegurado = montoAsegurado;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Polizas(Long id, Clientes clientes, String tipoPoliza, Date fechaInicio, Date fechaExpiracion,
			Double montoAsegurado, String estado) {
		super();
		this.id = id;
		this.clientes = clientes;
		this.tipoPoliza = tipoPoliza;
		this.fechaInicio = fechaInicio;
		this.fechaExpiracion = fechaExpiracion;
		this.montoAsegurado = montoAsegurado;
		this.estado = estado;
	}

}
