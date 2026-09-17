package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cep", schema = "core")
public class Cep implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_cep")
	@SequenceGenerator(name = "sq_tb_cep", sequenceName = "sq_tb_cep", schema = "core", allocationSize = 1)
	@Column(name = "id_cep", nullable = false)
	private Long idCep;

	@Column(name = "nr_cep")
	private String nrCep;

	@Column(name = "nm_logradouro")
	private String nmLogradouro;

	@Column(name = "nm_bairro")
	private String nmBairro;

	@Column(name = "ds_complemento")
	private String dsComplemento;

	@Column(name = "in_ativo")
	private Boolean inAtivo;

	@Column(name = "nr_endereco_cep")
	private String nrEnderecoCep;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_municipio")
	private Municipio municipio;

	public Long getIdCep() {
		return idCep;
	}

	public void setIdCep(Long idCep) {
		this.idCep = idCep;
	}

	public String getNrCep() {
		return nrCep;
	}

	public void setNrCep(String nrCep) {
		this.nrCep = nrCep;
	}

	public String getNmLogradouro() {
		return nmLogradouro;
	}

	public void setNmLogradouro(String nmLogradouro) {
		this.nmLogradouro = nmLogradouro;
	}

	public String getNmBairro() {
		return nmBairro;
	}

	public void setNmBairro(String nmBairro) {
		this.nmBairro = nmBairro;
	}

	public String getDsComplemento() {
		return dsComplemento;
	}

	public void setDsComplemento(String dsComplemento) {
		this.dsComplemento = dsComplemento;
	}

	public Boolean getInAtivo() {
		return inAtivo;
	}

	public void setInAtivo(Boolean inAtivo) {
		this.inAtivo = inAtivo;
	}

	public String getNrEnderecoCep() {
		return nrEnderecoCep;
	}

	public void setNrEnderecoCep(String nrEnderecoCep) {
		this.nrEnderecoCep = nrEnderecoCep;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}
}
