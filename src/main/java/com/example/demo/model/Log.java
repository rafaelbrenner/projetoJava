package com.example.demo.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_log", schema = "core")
public class Log implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_log")
	@SequenceGenerator(name = "sq_tb_log", sequenceName = "sq_tb_log", schema = "core", allocationSize = 1)
	@Column(name = "id_log", nullable = false)
	private Long idLog;

	@Column(name = "id_pagina")
	private Long idPagina;

	@Column(name = "ds_ip")
	private String dsIp;

	@Column(name = "ds_entidade")
	private String dsEntidade;

	@Column(name = "ds_id_entidade")
	private String dsIdEntidade;

	@Column(name = "tp_operacao")
	private String tpOperacao;

	@Column(name = "dt_log")
	private LocalDateTime dtLog;

	@Column(name = "ds_package")
	private String dsPackage;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	public Long getIdLog() {
		return idLog;
	}

	public void setIdLog(Long idLog) {
		this.idLog = idLog;
	}

	public Long getIdPagina() {
		return idPagina;
	}

	public void setIdPagina(Long idPagina) {
		this.idPagina = idPagina;
	}

	public String getDsIp() {
		return dsIp;
	}

	public void setDsIp(String dsIp) {
		this.dsIp = dsIp;
	}

	public String getDsEntidade() {
		return dsEntidade;
	}

	public void setDsEntidade(String dsEntidade) {
		this.dsEntidade = dsEntidade;
	}

	public String getDsIdEntidade() {
		return dsIdEntidade;
	}

	public void setDsIdEntidade(String dsIdEntidade) {
		this.dsIdEntidade = dsIdEntidade;
	}

	public String getTpOperacao() {
		return tpOperacao;
	}

	public void setTpOperacao(String tpOperacao) {
		this.tpOperacao = tpOperacao;
	}

	public LocalDateTime getDtLog() {
		return dtLog;
	}

	public void setDtLog(LocalDateTime dtLog) {
		this.dtLog = dtLog;
	}

	public String getDsPackage() {
		return dsPackage;
	}

	public void setDsPackage(String dsPackage) {
		this.dsPackage = dsPackage;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
