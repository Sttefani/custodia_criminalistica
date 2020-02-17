package com.criminalistica.cadeiacustodia.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;
import org.springframework.format.annotation.DateTimeFormat;

import com.criminalistica.cadeiacustodia.util.Grupo;
import com.sun.istack.NotNull;
 
@Entity
@Table(name= "perfil")
public class Perfil {
 
    @Id
    private Long id;
    @NotNull
    private String nome;
    @NotNull
    private String sobrenome;
    @NaturalId
    private String email;
    @NotNull
	@DateTimeFormat(pattern= "dd/MM/yyyy HH:mm")
    private Date nascimento;
    @NotNull
    private String endereco;
    @NotNull
    private String celular;
    @NotNull
    @Column(unique = true)
	@Enumerated(EnumType.STRING)
    private Grupo grupo;
	
    public Perfil() {
    	
    }
    
    public Perfil(Long id, String nome, String sobrenome, String email, Date nascimento, String endereco,
			String celular, Grupo grupo) {
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.nascimento = nascimento;
		this.endereco = endereco;
		this.celular = celular;
		this.grupo = grupo;
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


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Date getNascimento() {
		return nascimento;
	}


	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}


	public Grupo getGrupo() {
		return grupo;
	}


	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
 
    
    
}
