package com.koke.app.entityModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "creditos")
public class Credito {

	@Id
	@Column(name = "Id_credito")
	private int id;
	
	@Column(name = "Monto")
	private float monto;
	
	@Column(name = "No_Pagos")
	private int numPagos;
	
	@Column(name = "Rango_Pagos")
	private String rangoPagos;
	
	@Column(name = "Estado")
	private String estado;
	
	@Column(name = "Cliente_Id")
	private int clienteId;

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	public int getNumPagos() {
		return numPagos;
	}

	public void setNumPagos(int numPagos) {
		this.numPagos = numPagos;
	}

	public String getRangoPagos() {
		return rangoPagos;
	}

	public void setRangoPagos(String rangoPagos) {
		this.rangoPagos = rangoPagos;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

}
