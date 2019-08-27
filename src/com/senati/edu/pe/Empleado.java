package com.senati.edu.pe;

public class Empleado {
	
	String dni;
	String nombre;
	String apellido;
	int edad;
	String fecha_ingreso;
	
	public Empleado() {
		super();
	}

	public Empleado(String dni, String nombre, String apellido, int edad, String fecha_ingreso) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fecha_ingreso = fecha_ingreso;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getFecha_ingreso() {
		return fecha_ingreso;
	}

	public void setFecha_ingreso(String fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}

	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", fecha_ingreso=" + fecha_ingreso + "]";
	}
	
	
}
