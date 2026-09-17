package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_processo_tarefa_evento", schema = "core")
public class ProcessoTarefaEvento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_processo_tarefa_evento")
	@SequenceGenerator(name = "sq_tb_processo_tarefa_evento", sequenceName = "sq_tb_processo_tarefa_evento", schema = "core", allocationSize = 1)
	@Column(name = "id_processo_tarefa_evento", nullable = false)
	private Long idProcessoTarefaEvento;

	@Column(name = "in_registrado")
	private Boolean inRegistrado;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_processo")
	private Processo processo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tarefa_evento")
	private TarefaEvento tarefaEvento;

	public Long getIdProcessoTarefaEvento() {
		return idProcessoTarefaEvento;
	}

	public void setIdProcessoTarefaEvento(Long idProcessoTarefaEvento) {
		this.idProcessoTarefaEvento = idProcessoTarefaEvento;
	}

	public Boolean getInRegistrado() {
		return inRegistrado;
	}

	public void setInRegistrado(Boolean inRegistrado) {
		this.inRegistrado = inRegistrado;
	}

	public Processo getProcesso() {
		return processo;
	}

	public void setProcesso(Processo processo) {
		this.processo = processo;
	}

	public TarefaEvento getTarefaEvento() {
		return tarefaEvento;
	}

	public void setTarefaEvento(TarefaEvento tarefaEvento) {
		this.tarefaEvento = tarefaEvento;
	}
}
