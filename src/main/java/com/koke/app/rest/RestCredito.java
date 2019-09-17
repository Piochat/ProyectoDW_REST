package com.koke.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.koke.app.dao.ICredito;
import com.koke.app.entityModel.Credito;

@RestController
@RequestMapping("/creditos")
public class RestCredito {

	@Autowired
	private ICredito credito;
	
	@GetMapping
	public List<Credito> getCreditos() {
		return credito.findAll();
	}
	
	@PostMapping
	public String saveCredito(@RequestBody Credito c) {
		return credito.save(c);
	}
	
	@GetMapping(value = "/{id}")
	public Credito getCredito(@PathVariable("id") Integer id) {
		return credito.findById(id);
	}
	
	@PutMapping
	public String updateCredito(@RequestBody Credito c) {
		return credito.mod(c);
	}
	
	@DeleteMapping
	public String delCredito(@RequestBody Credito c) {
		return credito.del(c);
	}
}
