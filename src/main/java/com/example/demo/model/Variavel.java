package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_variavel", schema = "core")
public class Variavel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_variavel")
	@SequenceGenerator(name = "sq_tb_variavel", sequenceName = "sq_tb_variavel", schema = "core", allocationSize = 1)
	@Column(name = "id_variavel", nullable = false)
	private Long idVariavel;

	@Column(name = "ds_variavel")
	private String dsVariavel;

	@Column(name = "vl_variavel")
	private String vlVariavel;

	@Column(name = "in_ativo")
	private Boolean inAtivo;

	@Column(name = "ds_descricao")
	private String dsDescricao;

	public Long getIdVariavel() {
		return idVariavel;
	}

	public void setIdVariavel(Long idVariavel) {
		this.idVariavel = idVariavel;
	}

	public String getDsVariavel() {
		return dsVariavel;
	}

	public void setDsVariavel(String dsVariavel) {
		this.dsVariavel = dsVariavel;
	}

	public String getVlVariavel() {
		return vlVariavel;
	}

	public void setVlVariavel(String vlVariavel) {
		this.vlVariavel = vlVariavel;
	}

	public Boolean getInAtivo() {
		return inAtivo;
	}

	public void setInAtivo(Boolean inAtivo) {
		this.inAtivo = inAtivo;
	}

	public String getDsDescricao() {
		return dsDescricao;
	}

	public void setDsDescricao(String dsDescricao) {
		this.dsDescricao = dsDescricao;
	}
}
