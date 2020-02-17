package com.criminalistica.cadeiacustodia.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

@Entity
@Table(name= "custodia")
public class Custodia extends AuditModel implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@DateTimeFormat(pattern= "dd/MM/yyyy HH:mm")
	private Date dataHoraDaAbertura;
	
	@OneToMany(
			mappedBy = "custodia",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true)
	private List<Vestigio> vestigios = new ArrayList<>();
	
	@OneToMany(
			mappedBy = "custodia",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true)
	private List<Historico> historicos = new ArrayList<>();
	
	@NotNull
	private Usuario usuario;

	public Custodia() {
		
	}

	public Custodia(Long id, Date dataHoraDaAbertura, List<Vestigio> vestigios, List<Historico> historicos,
			Usuario usuario) {
		super();
		this.id = id;
		this.dataHoraDaAbertura = dataHoraDaAbertura;
		this.vestigios = vestigios;
		this.historicos = historicos;
		this.usuario = usuario;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Date getDataHoraDaAbertura() {
		return dataHoraDaAbertura;
	}



	public void setDataHoraDaAbertura(Date dataHoraDaAbertura) {
		this.dataHoraDaAbertura = dataHoraDaAbertura;
	}



	public List<Vestigio> getVestigios() {
		return vestigios;
	}



	public void setVestigios(List<Vestigio> vestigios) {
		this.vestigios = vestigios;
	}



	public List<Historico> getHistoricos() {
		return historicos;
	}



	public void setHistoricos(List<Historico> historicos) {
		this.historicos = historicos;
	}



	public Usuario getUsuario() {
		return usuario;
	}



	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	

	

	

	
	
	
}


