package com.criminalistica.cadeiacustodia.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.criminalistica.cadeiacustodia.model.Usuario;
import com.criminalistica.cadeiacustodia.repository.helper.usuario.UsuariosQueries;

@Repository
@Transactional
public interface Usuarios extends JpaRepository<Usuario, Long>, UsuariosQueries{

	public Optional<Usuario> findByEmail(String email);
}
