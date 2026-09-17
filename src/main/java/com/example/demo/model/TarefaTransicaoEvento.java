package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_tarefa_transicao_evento", schema = "core")
public class TarefaTransicaoEvento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_tarefa_transicao_evento")
	@SequenceGenerator(name = "sq_tb_tarefa_transicao_evento", sequenceName = "sq_tb_tarefa_transicao_evento", schema = "core", allocationSize = 1)
	@Column(name = "id_tarefa_transicao_evento", nullable = false)
	private Long idTarefaTransicaoEvento;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tarefa_origem")
	private Tarefa tarefaOrigem;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tarefa_destino")
	private Tarefa tarefaDestino;

	public Long getIdTarefaTransicaoEvento() {
		return idTarefaTransicaoEvento;
	}

	public void setIdTarefaTransicaoEvento(Long idTarefaTransicaoEvento) {
		this.idTarefaTransicaoEvento = idTarefaTransicaoEvento;
	}

	public Tarefa getTarefaOrigem() {
		return tarefaOrigem;
	}

	public void setTarefaOrigem(Tarefa tarefaOrigem) {
		this.tarefaOrigem = tarefaOrigem;
	}

	public Tarefa getTarefaDestino() {
		return tarefaDestino;
	}

	public void setTarefaDestino(Tarefa tarefaDestino) {
		this.tarefaDestino = tarefaDestino;
	}
}
