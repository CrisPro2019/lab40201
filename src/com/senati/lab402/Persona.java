package com.senati.lab402;

public class Persona {
	
	// DECLARACION DE ATRIBUTOS DE LA CLASE PERSONA
	int id;
	String nombre;
	String apellido;
	boolean sexo;
	char ecivil;
	
	// CONSTRUCTORES EN BLANCO Y CON ARGUMENTOS
	
	public Persona() {
		super();
	}
	public Persona(int id, String nombre, String apellido, boolean sexo, char ecivil) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.ecivil = ecivil;
	}
	
	// GETTERS AND SETTERS
	
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
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public boolean isSexo() {
		return sexo;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	public char getEcivil() {
		return ecivil;
	}
	public void setEcivil(char ecivil) {
		this.ecivil = ecivil;
	}
	// OVERRIDE INDICA QUE LA MAQUINA GENERO EL CODIGO
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", ecivil="
				+ ecivil + "]";
	}
	
	
}
