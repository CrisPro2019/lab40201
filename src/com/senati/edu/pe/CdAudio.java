package com.senati.edu.pe;

public class CdAudio {
	String titulo;
	String autor;
	String lugar;
	int duracion;
	
	public CdAudio() {
		super();
	}

	public CdAudio(String titulo, String autor, String lugar, int duracion) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.lugar = lugar;
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "CdAudio [titulo=" + titulo + ", autor=" + autor + ", lugar=" + lugar + ", duracion=" + duracion + "]";
	}
	
}
