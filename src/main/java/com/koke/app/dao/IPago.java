package com.koke.app.dao;

import java.util.List;

import com.koke.app.entityModel.Pago;

public interface IPago {

	// Hace un Select * from a la tabla
	public List<Pago> findAll();

	// Inserta datos en la tabla
	public String save(Pago cl);

	// Hace un Select condicionado
	public Pago findById(int id);

	// Hace un update a la tabla
	public String mod(Pago cl);

	// Elimina un registro
	public String del(Pago cl);
}
