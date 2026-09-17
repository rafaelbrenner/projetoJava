package com.example.demo.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_bloqueio_usuario", schema = "core")
public class BloqueioUsuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_bloqueio_usuario")
	@SequenceGenerator(name = "sq_tb_bloqueio_usuario", sequenceName = "sq_tb_bloqueio_usuario", schema = "core", allocationSize = 1)
	@Column(name = "id_bloqueio_usuario", nullable = false)
	private Long idBloqueioUsuario;

	@Column(name = "dt_bloqueio")
	private LocalDateTime dtBloqueio;

	@Column(name = "dt_previsao_desbloqueio")
	private LocalDateTime dtPrevisaoDesbloqueio;

	@Column(name = "ds_motivo_bloqueio")
	private String dsMotivoBloqueio;

	@Column(name = "dt_desbloqueio")
	private LocalDateTime dtDesbloqueio;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	public Long getIdBloqueioUsuario() {
		return idBloqueioUsuario;
	}

	public void setIdBloqueioUsuario(Long idBloqueioUsuario) {
		this.idBloqueioUsuario = idBloqueioUsuario;
	}

	public LocalDateTime getDtBloqueio() {
		return dtBloqueio;
	}

	public void setDtBloqueio(LocalDateTime dtBloqueio) {
		this.dtBloqueio = dtBloqueio;
	}

	public LocalDateTime getDtPrevisaoDesbloqueio() {
		return dtPrevisaoDesbloqueio;
	}

	public void setDtPrevisaoDesbloqueio(LocalDateTime dtPrevisaoDesbloqueio) {
		this.dtPrevisaoDesbloqueio = dtPrevisaoDesbloqueio;
	}

	public String getDsMotivoBloqueio() {
		return dsMotivoBloqueio;
	}

	public void setDsMotivoBloqueio(String dsMotivoBloqueio) {
		this.dsMotivoBloqueio = dsMotivoBloqueio;
	}

	public LocalDateTime getDtDesbloqueio() {
		return dtDesbloqueio;
	}

	public void setDtDesbloqueio(LocalDateTime dtDesbloqueio) {
		this.dtDesbloqueio = dtDesbloqueio;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
