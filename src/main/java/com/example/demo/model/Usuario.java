package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_usuario", schema = "core")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_usuario", nullable = false)
	private Long idUsuario;

	@Column(name = "in_bloqueio")
	private Boolean inBloqueio;

	@Column(name = "in_provisorio")
	private Boolean inProvisorio;

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Boolean getInBloqueio() {
		return inBloqueio;
	}

	public void setInBloqueio(Boolean inBloqueio) {
		this.inBloqueio = inBloqueio;
	}

	public Boolean getInProvisorio() {
		return inProvisorio;
	}

	public void setInProvisorio(Boolean inProvisorio) {
		this.inProvisorio = inProvisorio;
	}
}
