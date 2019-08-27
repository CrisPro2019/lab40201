package com.senati.edu.pe;

public class Cliente {
	int id;
	String nombre;
	String tipo;
	String calificacion;
	String limite_credito;
	
	public Cliente() {
		super();
	}
	
	public Cliente(int id, String nombre, String tipo, String calificacion, String limite_credito) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.calificacion = calificacion;
		this.limite_credito = limite_credito;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}

	public String getLimite_credito() {
		return limite_credito;
	}

	public void setLimite_credito(String limite_credito) {
		this.limite_credito = limite_credito;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", calificacion=" + calificacion
				+ ", limite_credito=" + limite_credito + "]";
	}
	
	
	
}
