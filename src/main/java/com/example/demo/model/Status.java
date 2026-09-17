package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_status", schema = "core")
public class Status implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_status")
	@SequenceGenerator(name = "sq_tb_status", sequenceName = "sq_tb_status", schema = "core", allocationSize = 1)
	@Column(name = "id_status", nullable = false)
	private Long idStatus;

	@Column(name = "ds_status")
	private String dsStatus;

	@Column(name = "in_ativo")
	private Boolean inAtivo;

	public Long getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(Long idStatus) {
		this.idStatus = idStatus;
	}

	public String getDsStatus() {
		return dsStatus;
	}

	public void setDsStatus(String dsStatus) {
		this.dsStatus = dsStatus;
	}

	public Boolean getInAtivo() {
		return inAtivo;
	}

	public void setInAtivo(Boolean inAtivo) {
		this.inAtivo = inAtivo;
	}
}
