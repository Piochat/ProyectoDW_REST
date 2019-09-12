package com.koke.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.koke.app.entityModel.Cliente;

@Repository
public class ClienteDAO implements ICliente {

	@PersistenceContext
	private EntityManager em;
	
	@Transactional(readOnly = true)
	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("from Cliente").getResultList();
	}

	@Transactional
	@Override
	public String save(Cliente cl) {
		try {
			em.persist(cl);
			return "OK";
		} catch (Exception e) {
			System.err.println("Error Save" + e.getMessage() + " " +  e.toString());
			return "Error";
		}
	}

	@Transactional(readOnly = true)
	@Override
	public Cliente findById(int id) {
		// TODO Auto-generated method stub
		return em.find(Cliente.class, id);
	}

	@Transactional
	@Override
	public String mod(Cliente cl) {
		// TODO Auto-generated method stub
		try {
			em.merge(cl);
			return "OK";
		} catch (Exception e) {
			System.err.println("Error mod" + e.getMessage() + " " +  e.toString());
			return "Error";
		}
	}
}
