package com.criminalistica.cadeiacustodia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.criminalistica.cadeiacustodia.model.Autoridade;
import com.criminalistica.cadeiacustodia.repository.Autoridades;

@Controller
public class AutoridadeController {
	
	
	@Autowired
	private Autoridades autoridadeRepository;

	@RequestMapping(method=RequestMethod.GET, value="/cadastroautoridade")
	public String inicio() {
		return "cadastro/cadastroautoridade";
	}
	@RequestMapping(method=RequestMethod.POST, value="/salvarautoridade")
	public String salvar(Autoridade autoridade) {
		autoridadeRepository.save(autoridade);
		return "cadastro/cadastroautoridade";
	}

}
