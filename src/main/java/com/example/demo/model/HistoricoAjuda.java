package com.example.demo.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_historico_ajuda", schema = "core")
public class HistoricoAjuda implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_historico_ajuda")
	@SequenceGenerator(name = "sq_tb_historico_ajuda", sequenceName = "sq_tb_historico_ajuda", schema = "core", allocationSize = 1)
	@Column(name = "id_historico_ajuda", nullable = false)
	private Long idHistoricoAjuda;

	@Column(name = "dt_registro")
	private LocalDateTime dtRegistro;

	@Column(name = "ds_texto")
	private String dsTexto;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_pagina")
	private Pagina pagina;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	public Long getIdHistoricoAjuda() {
		return idHistoricoAjuda;
	}

	public void setIdHistoricoAjuda(Long idHistoricoAjuda) {
		this.idHistoricoAjuda = idHistoricoAjuda;
	}

	public LocalDateTime getDtRegistro() {
		return dtRegistro;
	}

	public void setDtRegistro(LocalDateTime dtRegistro) {
		this.dtRegistro = dtRegistro;
	}

	public String getDsTexto() {
		return dsTexto;
	}

	public void setDsTexto(String dsTexto) {
		this.dsTexto = dsTexto;
	}

	public Pagina getPagina() {
		return pagina;
	}

	public void setPagina(Pagina pagina) {
		this.pagina = pagina;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
