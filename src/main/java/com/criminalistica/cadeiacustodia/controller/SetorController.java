package com.criminalistica.cadeiacustodia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.criminalistica.cadeiacustodia.model.Setor;
import com.criminalistica.cadeiacustodia.repository.Setores;


@Controller
public class SetorController {
	
	@Autowired
	private Setores setorRepository;

	@RequestMapping(method=RequestMethod.GET, value="/cadastrosetor")
	public String inicio() {
		return "cadastro/cadastrosetor";
	}
	@RequestMapping(method=RequestMethod.POST, value="/salvarsetor")
	public String salvar(Setor setor) {
		setorRepository.save(setor);
		return "cadastro/cadastrosetor";
		
	}
}
