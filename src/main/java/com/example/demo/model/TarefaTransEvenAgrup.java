package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_tarefa_trans_even_agrup", schema = "core")
public class TarefaTransEvenAgrup implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_tarefa_trans_even_agrup")
	@SequenceGenerator(name = "sq_tb_tarefa_trans_even_agrup", sequenceName = "sq_tb_tarefa_trans_even_agrup", schema = "core", allocationSize = 1)
	@Column(name = "id_tarfa_trnsco_ev_agrupamento", nullable = false)
	private Long idTarfaTrnscoEvAgrupamento;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_agrupamento")
	private Agrupamento agrupamento;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tarefa_transicao_evento")
	private TarefaTransicaoEvento tarefaTransicaoEvento;

	public Long getIdTarfaTrnscoEvAgrupamento() {
		return idTarfaTrnscoEvAgrupamento;
	}

	public void setIdTarfaTrnscoEvAgrupamento(Long idTarfaTrnscoEvAgrupamento) {
		this.idTarfaTrnscoEvAgrupamento = idTarfaTrnscoEvAgrupamento;
	}

	public Agrupamento getAgrupamento() {
		return agrupamento;
	}

	public void setAgrupamento(Agrupamento agrupamento) {
		this.agrupamento = agrupamento;
	}

	public TarefaTransicaoEvento getTarefaTransicaoEvento() {
		return tarefaTransicaoEvento;
	}

	public void setTarefaTransicaoEvento(TarefaTransicaoEvento tarefaTransicaoEvento) {
		this.tarefaTransicaoEvento = tarefaTransicaoEvento;
	}
}
