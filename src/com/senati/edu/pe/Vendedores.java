package com.senati.edu.pe;

public class Vendedores {
	int id;
	String nombre;
	String sueldo_basico;
	String comision;
	
	public Vendedores(int id, String nombre, String sueldo_basico, String comision) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.sueldo_basico = sueldo_basico;
		this.comision = comision;
	}

	public Vendedores() {
		super();
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

	public String getSueldo_basico() {
		return sueldo_basico;
	}

	public void setSueldo_basico(String sueldo_basico) {
		this.sueldo_basico = sueldo_basico;
	}

	public String getComision() {
		return comision;
	}

	public void setComision(String comision) {
		this.comision = comision;
	}

	@Override
	public String toString() {
		return "Vendedores [id=" + id + ", nombre=" + nombre + ", sueldo_basico=" + sueldo_basico + ", comision="
				+ comision + "]";
	}
	
	
	
}	
