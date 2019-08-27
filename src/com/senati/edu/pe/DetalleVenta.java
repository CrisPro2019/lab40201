package com.senati.edu.pe;

public class DetalleVenta {
	int id;
	int id_libro;
	int id_cliente;
	int id_vendedor;
	int total;
	
	public DetalleVenta() {
		super();
	}

	public DetalleVenta(int id, int id_libro, int id_cliente, int id_vendedor, int total) {
		super();
		this.id = id;
		this.id_libro = id_libro;
		this.id_cliente = id_cliente;
		this.id_vendedor = id_vendedor;
		this.total = total;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_libro() {
		return id_libro;
	}

	public void setId_libro(int id_libro) {
		this.id_libro = id_libro;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public int getId_vendedor() {
		return id_vendedor;
	}

	public void setId_vendedor(int id_vendedor) {
		this.id_vendedor = id_vendedor;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "DetalleVenta [id=" + id + ", id_libro=" + id_libro + ", id_cliente=" + id_cliente + ", id_vendedor="
				+ id_vendedor + ", total=" + total + "]";
	};
	
	
}
