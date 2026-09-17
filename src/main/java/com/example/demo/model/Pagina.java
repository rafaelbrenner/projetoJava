package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_pagina", schema = "core")
public class Pagina implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_pagina")
	@SequenceGenerator(name = "sq_tb_pagina", sequenceName = "sq_tb_pagina", schema = "core", allocationSize = 1)
	@Column(name = "id_pagina", nullable = false)
	private Long idPagina;

	@Column(name = "ds_descricao")
	private String dsDescricao;

	@Column(name = "ds_url")
	private String dsUrl;

	public Long getIdPagina() {
		return idPagina;
	}

	public void setIdPagina(Long idPagina) {
		this.idPagina = idPagina;
	}

	public String getDsDescricao() {
		return dsDescricao;
	}

	public void setDsDescricao(String dsDescricao) {
		this.dsDescricao = dsDescricao;
	}

	public String getDsUrl() {
		return dsUrl;
	}

	public void setDsUrl(String dsUrl) {
		this.dsUrl = dsUrl;
	}
}
