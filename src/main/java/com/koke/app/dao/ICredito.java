package com.koke.app.dao;

import java.util.List;

import com.koke.app.entityModel.Credito;

public interface ICredito {

	// Hace un Select * from a la tabla
	public List<Credito> findAll();

	// Inserta datos en la tabla
	public String save(Credito cl);

	// Hace un Select condicionado
	public Credito findById(int id);

	// Hace un update a la tabla
	public String mod(Credito cl);

	// Elimina un registro
	public String del(Credito cl);
}
