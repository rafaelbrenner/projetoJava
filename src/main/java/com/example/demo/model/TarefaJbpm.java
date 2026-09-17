package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_tarefa_jbpm", schema = "core")
public class TarefaJbpm implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_tarefa_jbpm")
	@SequenceGenerator(name = "sq_tb_tarefa_jbpm", sequenceName = "sq_tb_tarefa_jbpm", schema = "core", allocationSize = 1)
	@Column(name = "id_tarefa_jbpm", nullable = false)
	private Long idTarefaJbpm;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tarefa")
	private Tarefa tarefa;

	public Long getIdTarefaJbpm() {
		return idTarefaJbpm;
	}

	public void setIdTarefaJbpm(Long idTarefaJbpm) {
		this.idTarefaJbpm = idTarefaJbpm;
	}

	public Tarefa getTarefa() {
		return tarefa;
	}

	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}
}
