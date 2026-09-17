package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_hist_proc_moviment_lote", schema = "core")
public class HistProcMovimentLote implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_hist_proc_moviment_lote", nullable = false)
	private Long idHistProcMovimentLote;

	@Column(name = "id_processo_trf")
	private Long idProcessoTrf;

	@Column(name = "id_transicao")
	private Long idTransicao;

	@Column(name = "nm_fluxo")
	private String nmFluxo;

	@Column(name = "nm_tarefa_origem")
	private String nmTarefaOrigem;

	@Column(name = "id_process_instance_origem")
	private Long idProcessInstanceOrigem;

	@Column(name = "id_task_instance_origem")
	private Long idTaskInstanceOrigem;

	@Column(name = "id_task_origem")
	private Long idTaskOrigem;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_hist_movimentacao_lote")
	private HistMovimentacaoLote histMovimentacaoLote;

	public Long getIdHistProcMovimentLote() {
		return idHistProcMovimentLote;
	}

	public void setIdHistProcMovimentLote(Long idHistProcMovimentLote) {
		this.idHistProcMovimentLote = idHistProcMovimentLote;
	}

	public Long getIdProcessoTrf() {
		return idProcessoTrf;
	}

	public void setIdProcessoTrf(Long idProcessoTrf) {
		this.idProcessoTrf = idProcessoTrf;
	}

	public Long getIdTransicao() {
		return idTransicao;
	}

	public void setIdTransicao(Long idTransicao) {
		this.idTransicao = idTransicao;
	}

	public String getNmFluxo() {
		return nmFluxo;
	}

	public void setNmFluxo(String nmFluxo) {
		this.nmFluxo = nmFluxo;
	}

	public String getNmTarefaOrigem() {
		return nmTarefaOrigem;
	}

	public void setNmTarefaOrigem(String nmTarefaOrigem) {
		this.nmTarefaOrigem = nmTarefaOrigem;
	}

	public Long getIdProcessInstanceOrigem() {
		return idProcessInstanceOrigem;
	}

	public void setIdProcessInstanceOrigem(Long idProcessInstanceOrigem) {
		this.idProcessInstanceOrigem = idProcessInstanceOrigem;
	}

	public Long getIdTaskInstanceOrigem() {
		return idTaskInstanceOrigem;
	}

	public void setIdTaskInstanceOrigem(Long idTaskInstanceOrigem) {
		this.idTaskInstanceOrigem = idTaskInstanceOrigem;
	}

	public Long getIdTaskOrigem() {
		return idTaskOrigem;
	}

	public void setIdTaskOrigem(Long idTaskOrigem) {
		this.idTaskOrigem = idTaskOrigem;
	}

	public HistMovimentacaoLote getHistMovimentacaoLote() {
		return histMovimentacaoLote;
	}

	public void setHistMovimentacaoLote(HistMovimentacaoLote histMovimentacaoLote) {
		this.histMovimentacaoLote = histMovimentacaoLote;
	}
}
