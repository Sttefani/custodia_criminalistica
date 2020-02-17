package com.criminalistica.cadeiacustodia.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.criminalistica.cadeiacustodia.util.CargoAutoridade;
import com.criminalistica.cadeiacustodia.util.OrigemAutoridade;
import com.sun.istack.NotNull;

@Entity
@Table(name= "autoridade")
public class Autoridade extends AuditModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
    @Column(unique = true)
	private String nome;
	
	@NotNull
    @Column(unique = true)
	@Enumerated(EnumType.STRING)
	private CargoAutoridade cargoAutoridade;
	
	@NotNull
    @Column(unique = true)
	@Enumerated(EnumType.STRING)
	private OrigemAutoridade origemAutoridade;
	
	
	
	public Autoridade() {
		
	}
	public Autoridade(String nome, CargoAutoridade cargoAutoridade, OrigemAutoridade origemAutoridade) {
		this.nome = nome;
		this.cargoAutoridade = cargoAutoridade;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public CargoAutoridade getCargoAutoridade() {
		return cargoAutoridade;
	}
	public void setCargoAutoridade(CargoAutoridade cargoAutoridade) {
		this.cargoAutoridade = cargoAutoridade;
	}
	public OrigemAutoridade getOrigemAutoridade() {
		return origemAutoridade;
	}
	public void setOrigemAutoridade(OrigemAutoridade origemAutoridade) {
		this.origemAutoridade = origemAutoridade;
	}
	

}
