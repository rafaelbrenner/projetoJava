package com.example.demo.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_fluxo", schema = "core")
public class Fluxo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_fluxo")
	@SequenceGenerator(name = "sq_tb_fluxo", sequenceName = "sq_tb_fluxo", schema = "core", allocationSize = 1)
	@Column(name = "id_fluxo", nullable = false)
	private Long idFluxo;

	@Column(name = "cd_fluxo")
	private String cdFluxo;

	@Column(name = "ds_fluxo")
	private String dsFluxo;

	@Column(name = "in_ativo")
	private Boolean inAtivo;

	@Column(name = "qt_prazo")
	private Integer qtPrazo;

	@Column(name = "in_publicado")
	private Boolean inPublicado;

	@Column(name = "dt_inicio_publicacao")
	private LocalDateTime dtInicioPublicacao;

	@Column(name = "dt_fim_publicacao")
	private LocalDateTime dtFimPublicacao;

	@Column(name = "ds_xml")
	private String dsXml;

	@Column(name = "dt_ultima_publicacao")
	private LocalDateTime dtUltimaPublicacao;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario_publicacao")
	private Usuario usuarioPublicacao;

	public Long getIdFluxo() {
		return idFluxo;
	}

	public void setIdFluxo(Long idFluxo) {
		this.idFluxo = idFluxo;
	}

	public String getCdFluxo() {
		return cdFluxo;
	}

	public void setCdFluxo(String cdFluxo) {
		this.cdFluxo = cdFluxo;
	}

	public String getDsFluxo() {
		return dsFluxo;
	}

	public void setDsFluxo(String dsFluxo) {
		this.dsFluxo = dsFluxo;
	}

	public Boolean getInAtivo() {
		return inAtivo;
	}

	public void setInAtivo(Boolean inAtivo) {
		this.inAtivo = inAtivo;
	}

	public Integer getQtPrazo() {
		return qtPrazo;
	}

	public void setQtPrazo(Integer qtPrazo) {
		this.qtPrazo = qtPrazo;
	}

	public Boolean getInPublicado() {
		return inPublicado;
	}

	public void setInPublicado(Boolean inPublicado) {
		this.inPublicado = inPublicado;
	}

	public LocalDateTime getDtInicioPublicacao() {
		return dtInicioPublicacao;
	}

	public void setDtInicioPublicacao(LocalDateTime dtInicioPublicacao) {
		this.dtInicioPublicacao = dtInicioPublicacao;
	}

	public LocalDateTime getDtFimPublicacao() {
		return dtFimPublicacao;
	}

	public void setDtFimPublicacao(LocalDateTime dtFimPublicacao) {
		this.dtFimPublicacao = dtFimPublicacao;
	}

	public String getDsXml() {
		return dsXml;
	}

	public void setDsXml(String dsXml) {
		this.dsXml = dsXml;
	}

	public LocalDateTime getDtUltimaPublicacao() {
		return dtUltimaPublicacao;
	}

	public void setDtUltimaPublicacao(LocalDateTime dtUltimaPublicacao) {
		this.dtUltimaPublicacao = dtUltimaPublicacao;
	}

	public Usuario getUsuarioPublicacao() {
		return usuarioPublicacao;
	}

	public void setUsuarioPublicacao(Usuario usuarioPublicacao) {
		this.usuarioPublicacao = usuarioPublicacao;
	}
}
