package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_localizacao", schema = "core")
public class Localizacao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_localizacao")
	@SequenceGenerator(name = "sq_tb_localizacao", sequenceName = "sq_tb_localizacao", schema = "core", allocationSize = 1)
	@Column(name = "id_localizacao", nullable = false)
	private Long idLocalizacao;

	@Column(name = "ds_localizacao")
	private String dsLocalizacao;

	@Column(name = "in_ativo")
	private Boolean inAtivo;

	@Column(name = "in_estrutura")
	private Boolean inEstrutura;

	@Column(name = "nr_faixa_inferior")
	private Integer nrFaixaInferior;

	@Column(name = "nr_faixa_superior")
	private Integer nrFaixaSuperior;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_localizacao_pai")
	private Localizacao localizacaoPai;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_estrutura_pai")
	private Localizacao estruturaPai;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_endereco")
	private Endereco endereco;

	public Long getIdLocalizacao() {
		return idLocalizacao;
	}

	public void setIdLocalizacao(Long idLocalizacao) {
		this.idLocalizacao = idLocalizacao;
	}

	public String getDsLocalizacao() {
		return dsLocalizacao;
	}

	public void setDsLocalizacao(String dsLocalizacao) {
		this.dsLocalizacao = dsLocalizacao;
	}

	public Boolean getInAtivo() {
		return inAtivo;
	}

	public void setInAtivo(Boolean inAtivo) {
		this.inAtivo = inAtivo;
	}

	public Boolean getInEstrutura() {
		return inEstrutura;
	}

	public void setInEstrutura(Boolean inEstrutura) {
		this.inEstrutura = inEstrutura;
	}

	public Integer getNrFaixaInferior() {
		return nrFaixaInferior;
	}

	public void setNrFaixaInferior(Integer nrFaixaInferior) {
		this.nrFaixaInferior = nrFaixaInferior;
	}

	public Integer getNrFaixaSuperior() {
		return nrFaixaSuperior;
	}

	public void setNrFaixaSuperior(Integer nrFaixaSuperior) {
		this.nrFaixaSuperior = nrFaixaSuperior;
	}

	public Localizacao getLocalizacaoPai() {
		return localizacaoPai;
	}

	public void setLocalizacaoPai(Localizacao localizacaoPai) {
		this.localizacaoPai = localizacaoPai;
	}

	public Localizacao getEstruturaPai() {
		return estruturaPai;
	}

	public void setEstruturaPai(Localizacao estruturaPai) {
		this.estruturaPai = estruturaPai;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
