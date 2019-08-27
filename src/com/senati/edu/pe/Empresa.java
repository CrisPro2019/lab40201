package com.senati.edu.pe;

public class Empresa {
	int codigo;
	String nombre;
	String razon_social;
	int telefono;
	int ruc;
	String tipo_de_permiso;
	String direccion;
	
	
	public Empresa() {
		super();
	}


	public Empresa(int codigo, String nombre, String razon_social, int telefono, int ruc, String tipo_de_permiso,
			String direccion) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.razon_social = razon_social;
		this.telefono = telefono;
		this.ruc = ruc;
		this.tipo_de_permiso = tipo_de_permiso;
		this.direccion = direccion;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getRazon_social() {
		return razon_social;
	}


	public void setRazon_social(String razon_social) {
		this.razon_social = razon_social;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public int getRuc() {
		return ruc;
	}


	public void setRuc(int ruc) {
		this.ruc = ruc;
	}


	public String getTipo_de_permiso() {
		return tipo_de_permiso;
	}


	public void setTipo_de_permiso(String tipo_de_permiso) {
		this.tipo_de_permiso = tipo_de_permiso;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	@Override
	public String toString() {
		return "Empresa [codigo=" + codigo + ", nombre=" + nombre + ", razon_social=" + razon_social + ", telefono="
				+ telefono + ", ruc=" + ruc + ", tipo_de_permiso=" + tipo_de_permiso + ", direccion=" + direccion + "]";
	}
	
	
	
}
