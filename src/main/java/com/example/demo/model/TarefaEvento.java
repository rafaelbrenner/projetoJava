package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_tarefa_evento", schema = "core")
public class TarefaEvento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_tarefa_evento")
	@SequenceGenerator(name = "sq_tb_tarefa_evento", sequenceName = "sq_tb_tarefa_evento", schema = "core", allocationSize = 1)
	@Column(name = "id_tarefa_evento", nullable = false)
	private Long idTarefaEvento;

	@Column(name = "in_evento")
	private Boolean inEvento;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tarefa")
	private Tarefa tarefa;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tarefa_origem")
	private Tarefa tarefaOrigem;

	public Long getIdTarefaEvento() {
		return idTarefaEvento;
	}

	public void setIdTarefaEvento(Long idTarefaEvento) {
		this.idTarefaEvento = idTarefaEvento;
	}

	public Boolean getInEvento() {
		return inEvento;
	}

	public void setInEvento(Boolean inEvento) {
		this.inEvento = inEvento;
	}

	public Tarefa getTarefa() {
		return tarefa;
	}

	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}

	public Tarefa getTarefaOrigem() {
		return tarefaOrigem;
	}

	public void setTarefaOrigem(Tarefa tarefaOrigem) {
		this.tarefaOrigem = tarefaOrigem;
	}
}
