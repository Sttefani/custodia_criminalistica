package com.criminalistica.cadeiacustodia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.criminalistica.cadeiacustodia.model.Perito;

@Repository
@Transactional
public interface Peritos extends JpaRepository<Perito, Long>{

}
