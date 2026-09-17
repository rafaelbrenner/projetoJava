package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_estado", schema = "core")
public class Estado implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_estado")
	@SequenceGenerator(name = "sq_tb_estado", sequenceName = "sq_tb_estado", schema = "core", allocationSize = 1)
	@Column(name = "id_estado", nullable = false)
	private Long idEstado;

	@Column(name = "cd_estado")
	private String cdEstado;

	@Column(name = "ds_estado")
	private String dsEstado;

	@Column(name = "in_ativo")
	private Boolean inAtivo;

	public Long getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Long idEstado) {
		this.idEstado = idEstado;
	}

	public String getCdEstado() {
		return cdEstado;
	}

	public void setCdEstado(String cdEstado) {
		this.cdEstado = cdEstado;
	}

	public String getDsEstado() {
		return dsEstado;
	}

	public void setDsEstado(String dsEstado) {
		this.dsEstado = dsEstado;
	}

	public Boolean getInAtivo() {
		return inAtivo;
	}

	public void setInAtivo(Boolean inAtivo) {
		this.inAtivo = inAtivo;
	}
}
