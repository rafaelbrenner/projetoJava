package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_agrupamento", schema = "core")
public class Agrupamento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_agrupamento")
	@SequenceGenerator(name = "sq_tb_agrupamento", sequenceName = "sq_tb_agrupamento", schema = "core", allocationSize = 1)
	@Column(name = "id_agrupamento", nullable = false)
	private Long idAgrupamento;

	@Column(name = "ds_agrupamento")
	private String dsAgrupamento;

	@Column(name = "in_ativo")
	private Boolean inAtivo;

	public Long getIdAgrupamento() {
		return idAgrupamento;
	}

	public void setIdAgrupamento(Long idAgrupamento) {
		this.idAgrupamento = idAgrupamento;
	}

	public String getDsAgrupamento() {
		return dsAgrupamento;
	}

	public void setDsAgrupamento(String dsAgrupamento) {
		this.dsAgrupamento = dsAgrupamento;
	}

	public Boolean getInAtivo() {
		return inAtivo;
	}

	public void setInAtivo(Boolean inAtivo) {
		this.inAtivo = inAtivo;
	}
}
