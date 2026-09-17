package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_tarefa_even_agrupamento", schema = "core")
public class TarefaEvenAgrupamento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_tarefa_even_agrupamento")
	@SequenceGenerator(name = "sq_tb_tarefa_even_agrupamento", sequenceName = "sq_tb_tarefa_even_agrupamento", schema = "core", allocationSize = 1)
	@Column(name = "id_tarefa_evento_agrupamento", nullable = false)
	private Long idTarefaEventoAgrupamento;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_agrupamento")
	private Agrupamento agrupamento;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tarefa_evento")
	private TarefaEvento tarefaEvento;

	public Long getIdTarefaEventoAgrupamento() {
		return idTarefaEventoAgrupamento;
	}

	public void setIdTarefaEventoAgrupamento(Long idTarefaEventoAgrupamento) {
		this.idTarefaEventoAgrupamento = idTarefaEventoAgrupamento;
	}

	public Agrupamento getAgrupamento() {
		return agrupamento;
	}

	public void setAgrupamento(Agrupamento agrupamento) {
		this.agrupamento = agrupamento;
	}

	public TarefaEvento getTarefaEvento() {
		return tarefaEvento;
	}

	public void setTarefaEvento(TarefaEvento tarefaEvento) {
		this.tarefaEvento = tarefaEvento;
	}
}
