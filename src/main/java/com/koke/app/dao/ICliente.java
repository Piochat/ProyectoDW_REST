package com.koke.app.dao;

import java.util.List;

import com.koke.app.entityModel.Cliente;

public interface ICliente {

	public List<Cliente> findAll();
	
	public String save(Cliente cl);
	
	public Cliente findById(int id);
	
	public String mod(Cliente cl);
}
