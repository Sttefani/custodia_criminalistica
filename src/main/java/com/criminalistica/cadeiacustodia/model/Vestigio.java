package com.criminalistica.cadeiacustodia.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.criminalistica.cadeiacustodia.util.NaturezaVestigio;
import com.sun.istack.NotNull;

@Entity
@Table(name= "vestigio")
public class Vestigio extends AuditModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@DateTimeFormat(pattern= "dd/MM/yyyy HH:mm")
	private Date dataHoraDaEntrada;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private NaturezaVestigio naturezaVestigio;
	
	@NotNull
	private Integer ocorrencia;
	
	@NotNull
	@ManyToOne
	@JoinColumn
	private Autoridade autoridade;
	
	@NotNull
	@ManyToOne
	@JoinColumn
	private Perito perito;
	
	@NotNull
	@ManyToOne
	@JoinColumn
	private Setor setor;
	
	@NotNull
	private Boolean lacrado;
	
	@NotNull
	@Lob
	private String descricao;
	
	@NotNull
	@Lob
	private String localDeAcondicionamento;
	
	@NotNull
	private String numeroIdentificador;
	
	@NotNull
	private Usuario usuario;

	@ManyToOne(fetch = FetchType.LAZY)
	private Custodia custodia;

	public Vestigio() {
		
	}
	
	public Vestigio(Long id, Date dataHoraDaEntrada, NaturezaVestigio naturezaVestigio, Integer ocorrencia,
			Autoridade autoridade, Perito perito, Setor setor, Boolean lacrado, String descricao,
			String localDeAcondicionamento, String numeroIdentificador, Usuario usuario, Custodia custodia) {
		super();
		this.id = id;
		this.dataHoraDaEntrada = dataHoraDaEntrada;
		this.naturezaVestigio = naturezaVestigio;
		this.ocorrencia = ocorrencia;
		this.autoridade = autoridade;
		this.perito = perito;
		this.setor = setor;
		this.lacrado = lacrado;
		this.descricao = descricao;
		this.localDeAcondicionamento = localDeAcondicionamento;
		this.numeroIdentificador = numeroIdentificador;
		this.usuario = usuario;
		this.custodia = custodia;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDataHoraDaEntrada() {
		return dataHoraDaEntrada;
	}

	public void setDataHoraDaEntrada(Date dataHoraDaEntrada) {
		this.dataHoraDaEntrada = dataHoraDaEntrada;
	}

	public NaturezaVestigio getNaturezaVestigio() {
		return naturezaVestigio;
	}

	public void setNaturezaVestigio(NaturezaVestigio naturezaVestigio) {
		this.naturezaVestigio = naturezaVestigio;
	}

	public Integer getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(Integer ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	public Autoridade getAutoridade() {
		return autoridade;
	}

	public void setAutoridade(Autoridade autoridade) {
		this.autoridade = autoridade;
	}

	public Perito getPerito() {
		return perito;
	}

	public void setPerito(Perito perito) {
		this.perito = perito;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public Boolean getLacrado() {
		return lacrado;
	}

	public void setLacrado(Boolean lacrado) {
		this.lacrado = lacrado;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLocalDeAcondicionamento() {
		return localDeAcondicionamento;
	}

	public void setLocalDeAcondicionamento(String localDeAcondicionamento) {
		this.localDeAcondicionamento = localDeAcondicionamento;
	}

	public String getNumeroIdentificador() {
		return numeroIdentificador;
	}

	public void setNumeroIdentificador(String numeroIdentificador) {
		this.numeroIdentificador = numeroIdentificador;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Custodia getCustodia() {
		return custodia;
	}

	public void setCustodia(Custodia custodia) {
		this.custodia = custodia;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vestigio )) return false;
        return id != null && id.equals(((Vestigio) o).getId());
    }
 
    @Override
    public int hashCode() {
        return 31;
    }
}
