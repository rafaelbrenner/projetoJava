package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_municipio", schema = "core")
public class Municipio implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_municipio")
	@SequenceGenerator(name = "sq_tb_municipio", sequenceName = "sq_tb_municipio", schema = "core", allocationSize = 1)
	@Column(name = "id_municipio", nullable = false)
	private Long idMunicipio;

	@Column(name = "ds_municipio")
	private String dsMunicipio;

	@Column(name = "in_ativo")
	private Boolean inAtivo;

	@Column(name = "id_municipio_ibge")
	private String idMunicipioIbge;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_estado")
	private Estado estado;

	public Long getIdMunicipio() {
		return idMunicipio;
	}

	public void setIdMunicipio(Long idMunicipio) {
		this.idMunicipio = idMunicipio;
	}

	public String getDsMunicipio() {
		return dsMunicipio;
	}

	public void setDsMunicipio(String dsMunicipio) {
		this.dsMunicipio = dsMunicipio;
	}

	public Boolean getInAtivo() {
		return inAtivo;
	}

	public void setInAtivo(Boolean inAtivo) {
		this.inAtivo = inAtivo;
	}

	public String getIdMunicipioIbge() {
		return idMunicipioIbge;
	}

	public void setIdMunicipioIbge(String idMunicipioIbge) {
		this.idMunicipioIbge = idMunicipioIbge;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
}
