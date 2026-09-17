package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_caixa", schema = "core")
public class Caixa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_caixa")
	@SequenceGenerator(name = "sq_tb_caixa", sequenceName = "sq_tb_caixa", schema = "core", allocationSize = 1)
	@Column(name = "id_caixa", nullable = false)
	private Long idCaixa;

	@Column(name = "nm_caixa")
	private String nmCaixa;

	@Column(name = "ds_caixa")
	private String dsCaixa;

	@Column(name = "in_sistema")
	private Boolean inSistema;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tarefa")
	private Tarefa tarefa;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tarefa_anterior")
	private Tarefa tarefaAnterior;

	public Long getIdCaixa() {
		return idCaixa;
	}

	public void setIdCaixa(Long idCaixa) {
		this.idCaixa = idCaixa;
	}

	public String getNmCaixa() {
		return nmCaixa;
	}

	public void setNmCaixa(String nmCaixa) {
		this.nmCaixa = nmCaixa;
	}

	public String getDsCaixa() {
		return dsCaixa;
	}

	public void setDsCaixa(String dsCaixa) {
		this.dsCaixa = dsCaixa;
	}

	public Boolean getInSistema() {
		return inSistema;
	}

	public void setInSistema(Boolean inSistema) {
		this.inSistema = inSistema;
	}

	public Tarefa getTarefa() {
		return tarefa;
	}

	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}

	public Tarefa getTarefaAnterior() {
		return tarefaAnterior;
	}

	public void setTarefaAnterior(Tarefa tarefaAnterior) {
		this.tarefaAnterior = tarefaAnterior;
	}
}
