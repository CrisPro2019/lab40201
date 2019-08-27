package com.senati.edu.pe;

public class Cargo {
	String nombre;
	int sueldo_basico;
	
	public Cargo() {
		super();
	}

	public Cargo(String nombre, int sueldo_basico) {
		super();
		this.nombre = nombre;
		this.sueldo_basico = sueldo_basico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSueldo_basico() {
		return sueldo_basico;
	}

	public void setSueldo_basico(int sueldo_basico) {
		this.sueldo_basico = sueldo_basico;
	}

	@Override
	public String toString() {
		return "Cargo [nombre=" + nombre + ", sueldo_basico=" + sueldo_basico + "]";
	}
	
	
}
