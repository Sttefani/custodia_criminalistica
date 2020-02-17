package com.criminalistica.cadeiacustodia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.criminalistica.cadeiacustodia.model.Perfil;

@Repository
@Transactional
public interface Perfis extends JpaRepository<Perfil, Long>{

}
