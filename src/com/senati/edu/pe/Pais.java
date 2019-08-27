package com.senati.edu.pe;

public class Pais {
	String nombre;
	String descripcion;
	
	public Pais() {
		super();
	}

	public Pais(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Pais [nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
	
	
}
