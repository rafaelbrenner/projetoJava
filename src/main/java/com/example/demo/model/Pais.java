package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_pais", schema = "core")
public class Pais implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_pais")
	@SequenceGenerator(name = "sq_tb_pais", sequenceName = "sq_tb_pais", schema = "core", allocationSize = 1)
	@Column(name = "id_pais", nullable = false)
	private Long idPais;

	@Column(name = "cd_pais")
	private String cdPais;

	@Column(name = "ds_pais")
	private String dsPais;

	@Column(name = "ds_sigla")
	private String dsSigla;

	public Long getIdPais() {
		return idPais;
	}

	public void setIdPais(Long idPais) {
		this.idPais = idPais;
	}

	public String getCdPais() {
		return cdPais;
	}

	public void setCdPais(String cdPais) {
		this.cdPais = cdPais;
	}

	public String getDsPais() {
		return dsPais;
	}

	public void setDsPais(String dsPais) {
		this.dsPais = dsPais;
	}

	public String getDsSigla() {
		return dsSigla;
	}

	public void setDsSigla(String dsSigla) {
		this.dsSigla = dsSigla;
	}
}
