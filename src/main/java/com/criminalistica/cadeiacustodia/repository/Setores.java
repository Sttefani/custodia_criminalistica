package com.criminalistica.cadeiacustodia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.criminalistica.cadeiacustodia.model.Setor;

@Repository
@Transactional
public interface Setores extends JpaRepository<Setor, Long>{

}
