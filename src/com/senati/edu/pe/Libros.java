package com.senati.edu.pe;

public class Libros {
	String titulo;
	String auto;
	int numpage;
	int isbn;
	
	public Libros() {
		super();
	}

	public Libros(String titulo, String auto, int numpage, int isbn) {
		super();
		this.titulo = titulo;
		this.auto = auto;
		this.numpage = numpage;
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAuto() {
		return auto;
	}

	public void setAuto(String auto) {
		this.auto = auto;
	}

	public int getNumpage() {
		return numpage;
	}

	public void setNumpage(int numpage) {
		this.numpage = numpage;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Libros [titulo=" + titulo + ", auto=" + auto + ", numpage=" + numpage + ", isbn=" + isbn + "]";
	}
	
	
}
