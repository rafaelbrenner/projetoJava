package com.example.demo.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_documento_historico", schema = "core")
public class DocumentoHistorico implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_documento_historico", nullable = false)
	private Long idDocumentoHistorico;

	@Column(name = "id_documento")
	private Long idDocumento;

	@Column(name = "tp_operacao")
	private String tpOperacao;

	@Column(name = "dt_operacao")
	private LocalDateTime dtOperacao;

	@Column(name = "ds_motivo_exclusao")
	private String dsMotivoExclusao;

	@Column(name = "id_responsavel")
	private Long idResponsavel;

	@Column(name = "ds_conteudo_documento")
	private String dsConteudoDocumento;

	public Long getIdDocumentoHistorico() {
		return idDocumentoHistorico;
	}

	public void setIdDocumentoHistorico(Long idDocumentoHistorico) {
		this.idDocumentoHistorico = idDocumentoHistorico;
	}

	public Long getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(Long idDocumento) {
		this.idDocumento = idDocumento;
	}

	public String getTpOperacao() {
		return tpOperacao;
	}

	public void setTpOperacao(String tpOperacao) {
		this.tpOperacao = tpOperacao;
	}

	public LocalDateTime getDtOperacao() {
		return dtOperacao;
	}

	public void setDtOperacao(LocalDateTime dtOperacao) {
		this.dtOperacao = dtOperacao;
	}

	public String getDsMotivoExclusao() {
		return dsMotivoExclusao;
	}

	public void setDsMotivoExclusao(String dsMotivoExclusao) {
		this.dsMotivoExclusao = dsMotivoExclusao;
	}

	public Long getIdResponsavel() {
		return idResponsavel;
	}

	public void setIdResponsavel(Long idResponsavel) {
		this.idResponsavel = idResponsavel;
	}

	public String getDsConteudoDocumento() {
		return dsConteudoDocumento;
	}

	public void setDsConteudoDocumento(String dsConteudoDocumento) {
		this.dsConteudoDocumento = dsConteudoDocumento;
	}
}
