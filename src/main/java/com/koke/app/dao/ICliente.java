package com.koke.app.dao;

import java.util.List;

import com.koke.app.entityModel.Cliente;

public interface ICliente {

	// Hace un Select * from a la tabla
	public List<Cliente> findAll();
	
	// Inserta datos en la tabla
	public String save(Cliente cl);
	
	// Hace un Select condicionado
	public Cliente findById(int id);
	
	// Hace un update a la tabla
	public String mod(Cliente cl);
	
	// Elimina un registro
	public String del(Cliente cl);
}
