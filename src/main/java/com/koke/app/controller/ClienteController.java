package com.koke.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.koke.app.dao.ICliente;

@Controller
public class ClienteController {
	
	@Autowired
	private ICliente cliente;
	
	@GetMapping("/darling")
	public String listar(Model m) {
		m.addAttribute("Titulo", "Valió madres");
		m.addAttribute("Clientes", cliente.findAll());
		return "darling";
	}
}
