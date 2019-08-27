package com.senati.edu.pe;

public class CintasVideo {
	String titulo;
	String director;
	String actores;
	int duracion;
	public CintasVideo() {
		super();
	}
	public CintasVideo(String titulo, String director, String actores, int duracion) {
		super();
		this.titulo = titulo;
		this.director = director;
		this.actores = actores;
		this.duracion = duracion;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActores() {
		return actores;
	}
	public void setActores(String actores) {
		this.actores = actores;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	@Override
	public String toString() {
		return "CintasVideo [titulo=" + titulo + ", director=" + director + ", actores=" + actores + ", duracion="
				+ duracion + "]";
	}
	
	
}
