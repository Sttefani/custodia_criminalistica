package com.criminalistica.cadeiacustodia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.criminalistica.cadeiacustodia.model.Perito;
import com.criminalistica.cadeiacustodia.repository.Peritos;

@Controller
public class PeritoController {
	
	
	@Autowired
	private Peritos peritoRepository;

	@RequestMapping(method=RequestMethod.GET, value="/cadastroperito")
	public String inicio() {
		return "cadastro/cadastroperito";
	}

	@RequestMapping(method=RequestMethod.POST, value="/salvarperito")
	public String salvar(Perito perito) {
		peritoRepository.save(perito);
		return "cadastro/cadastroperito";
		
	}
}
