package com.criminalistica.cadeiacustodia.repository.helper.usuario;

import java.util.Optional;

import com.criminalistica.cadeiacustodia.model.Usuario;

public interface UsuariosQueries {
	
	public Optional<Usuario> porEmailEAtivo(String email);

}
