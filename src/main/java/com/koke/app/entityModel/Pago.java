package com.koke.app.entityModel;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pagos")
public class Pago {

	@Id
	@Column(name = "Id_pagos")
	private int id;

	@Column(name = "Fecha")
	private Date fecha;

	@Column(name = "Monto")
	private float monto;

	@Column(name = "Monto_Total")
	private float montoTotal;

	@Column(name = "No_Pagos")
	private int numPagos;

	@Column(name = "Credito_id")
	private int creditoId;

	@Column(name = "Interes_id")
	private int interesId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	public float getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(float montoTotal) {
		this.montoTotal = montoTotal;
	}

	public int getNumPagos() {
		return numPagos;
	}

	public void setNumPagos(int numPagos) {
		this.numPagos = numPagos;
	}

	public int getCreditoId() {
		return creditoId;
	}

	public void setCreditoId(int creditoId) {
		this.creditoId = creditoId;
	}

	public int getInteresId() {
		return interesId;
	}

	public void setInteresId(int interesId) {
		this.interesId = interesId;
	}

}
