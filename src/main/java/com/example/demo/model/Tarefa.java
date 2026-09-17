package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_tarefa", schema = "core")
public class Tarefa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_tarefa")
	@SequenceGenerator(name = "sq_tb_tarefa", sequenceName = "sq_tb_tarefa", schema = "core", allocationSize = 1)
	@Column(name = "id_tarefa", nullable = false)
	private Long idTarefa;

	@Column(name = "ds_tarefa")
	private String dsTarefa;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_fluxo")
	private Fluxo fluxo;

	public Long getIdTarefa() {
		return idTarefa;
	}

	public void setIdTarefa(Long idTarefa) {
		this.idTarefa = idTarefa;
	}

	public String getDsTarefa() {
		return dsTarefa;
	}

	public void setDsTarefa(String dsTarefa) {
		this.dsTarefa = dsTarefa;
	}

	public Fluxo getFluxo() {
		return fluxo;
	}

	public void setFluxo(Fluxo fluxo) {
		this.fluxo = fluxo;
	}
}
