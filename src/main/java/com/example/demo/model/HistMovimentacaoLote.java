package com.example.demo.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_hist_movimentacao_lote", schema = "core")
public class HistMovimentacaoLote implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_hist_movimentacao_lote", nullable = false)
	private Long idHistMovimentacaoLote;

	@Column(name = "dt_movimentacao")
	private LocalDateTime dtMovimentacao;

	@Column(name = "nm_tipo_atividade_lote")
	private String nmTipoAtividadeLote;

	@Column(name = "id_usuario")
	private Long idUsuario;

	public Long getIdHistMovimentacaoLote() {
		return idHistMovimentacaoLote;
	}

	public void setIdHistMovimentacaoLote(Long idHistMovimentacaoLote) {
		this.idHistMovimentacaoLote = idHistMovimentacaoLote;
	}

	public LocalDateTime getDtMovimentacao() {
		return dtMovimentacao;
	}

	public void setDtMovimentacao(LocalDateTime dtMovimentacao) {
		this.dtMovimentacao = dtMovimentacao;
	}

	public String getNmTipoAtividadeLote() {
		return nmTipoAtividadeLote;
	}

	public void setNmTipoAtividadeLote(String nmTipoAtividadeLote) {
		this.nmTipoAtividadeLote = nmTipoAtividadeLote;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
}
