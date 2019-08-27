package com.senati.edu.pe;

public class Book {
	int id;
	String titulo;
	String nombre;
	String autor;
	int nroPag;
	
	
	public Book() {
		super();
	}

	public Book(int id, String titulo, String nombre, String autor, int nroPag) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.nombre = nombre;
		this.autor = autor;
		this.nroPag = nroPag;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNroPag() {
		return nroPag;
	}

	public void setNroPag(int nroPag) {
		this.nroPag = nroPag;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", titulo=" + titulo + ", nombre=" + nombre + ", autor=" + autor + ", nroPag="
				+ nroPag + "]";
	}
	
	
}
