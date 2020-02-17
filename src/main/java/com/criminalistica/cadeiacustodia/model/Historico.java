package com.criminalistica.cadeiacustodia.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

@Entity
@Table(name= "historico")
public class Historico extends AuditModel  implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@DateTimeFormat(pattern= "dd/MM/yyyy HH:mm")
	private Date dataHoraDaMovimentacao;
	
	@NotNull
	private Usuario usuario;

	@NotNull
	@Lob
	private String movimentacao;
	
    @ManyToOne(fetch = FetchType.LAZY)
	private Custodia custodia;
    
    public Historico() {
    	
    }

	public Historico(Long id, Date dataHoraDaMovimentacao, Usuario usuario, String movimentacao, Custodia custodia) {
		this.id = id;
		this.dataHoraDaMovimentacao = dataHoraDaMovimentacao;
		this.usuario = usuario;
		this.movimentacao = movimentacao;
		this.custodia = custodia;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDataHoraDaMovimentacao() {
		return dataHoraDaMovimentacao;
	}

	public void setDataHoraDaMovimentacao(Date dataHoraDaMovimentacao) {
		this.dataHoraDaMovimentacao = dataHoraDaMovimentacao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getMovimentacao() {
		return movimentacao;
	}

	public void setMovimentacao(String movimentacao) {
		this.movimentacao = movimentacao;
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
        if (!(o instanceof Historico )) return false;
        return id != null && id.equals(((Historico) o).getId());
    }
 
    @Override
    public int hashCode() {
        return 31;
    }
    
    
}
