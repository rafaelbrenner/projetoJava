package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_usuario_localizacao", schema = "core")
public class UsuarioLocalizacao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_usuario_localizacao")
	@SequenceGenerator(name = "sq_tb_usuario_localizacao", sequenceName = "sq_tb_usuario_localizacao", schema = "core", allocationSize = 1)
	@Column(name = "id_usuario_localizacao", nullable = false)
	private Long idUsuarioLocalizacao;

	@Column(name = "in_responsavel_localizacao")
	private Boolean inResponsavelLocalizacao;

	@Column(name = "id_localizacao_backup")
	private Long idLocalizacaoBackup;

	@Column(name = "id_estrutura_backup")
	private Long idEstruturaBackup;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_localizacao")
	private Localizacao localizacao;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_estrutura")
	private Localizacao estrutura;

	public Long getIdUsuarioLocalizacao() {
		return idUsuarioLocalizacao;
	}

	public void setIdUsuarioLocalizacao(Long idUsuarioLocalizacao) {
		this.idUsuarioLocalizacao = idUsuarioLocalizacao;
	}

	public Boolean getInResponsavelLocalizacao() {
		return inResponsavelLocalizacao;
	}

	public void setInResponsavelLocalizacao(Boolean inResponsavelLocalizacao) {
		this.inResponsavelLocalizacao = inResponsavelLocalizacao;
	}

	public Long getIdLocalizacaoBackup() {
		return idLocalizacaoBackup;
	}

	public void setIdLocalizacaoBackup(Long idLocalizacaoBackup) {
		this.idLocalizacaoBackup = idLocalizacaoBackup;
	}

	public Long getIdEstruturaBackup() {
		return idEstruturaBackup;
	}

	public void setIdEstruturaBackup(Long idEstruturaBackup) {
		this.idEstruturaBackup = idEstruturaBackup;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Localizacao getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}

	public Localizacao getEstrutura() {
		return estrutura;
	}

	public void setEstrutura(Localizacao estrutura) {
		this.estrutura = estrutura;
	}
}
