package com.example.demo.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_estatistica", schema = "core")
public class Estatistica implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_estatistica")
	@SequenceGenerator(name = "sq_tb_estatistica", sequenceName = "sq_tb_estatistica", schema = "core", allocationSize = 1)
	@Column(name = "id_estatistica", nullable = false)
	private Long idEstatistica;

	@Column(name = "nm_task")
	private String nmTask;

	@Column(name = "nm_node")
	private String nmNode;

	@Column(name = "dt_inicio")
	private LocalDateTime dtInicio;

	@Column(name = "dt_fim")
	private LocalDateTime dtFim;

	@Column(name = "nr_duracao")
	private Long nrDuracao;

	@Column(name = "ds_fluxo")
	private String dsFluxo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_fluxo")
	private Fluxo fluxo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_processo")
	private Processo processo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_localizacao")
	private Localizacao localizacao;

	public Long getIdEstatistica() {
		return idEstatistica;
	}

	public void setIdEstatistica(Long idEstatistica) {
		this.idEstatistica = idEstatistica;
	}

	public String getNmTask() {
		return nmTask;
	}

	public void setNmTask(String nmTask) {
		this.nmTask = nmTask;
	}

	public String getNmNode() {
		return nmNode;
	}

	public void setNmNode(String nmNode) {
		this.nmNode = nmNode;
	}

	public LocalDateTime getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(LocalDateTime dtInicio) {
		this.dtInicio = dtInicio;
	}

	public LocalDateTime getDtFim() {
		return dtFim;
	}

	public void setDtFim(LocalDateTime dtFim) {
		this.dtFim = dtFim;
	}

	public Long getNrDuracao() {
		return nrDuracao;
	}

	public void setNrDuracao(Long nrDuracao) {
		this.nrDuracao = nrDuracao;
	}

	public String getDsFluxo() {
		return dsFluxo;
	}

	public void setDsFluxo(String dsFluxo) {
		this.dsFluxo = dsFluxo;
	}

	public Fluxo getFluxo() {
		return fluxo;
	}

	public void setFluxo(Fluxo fluxo) {
		this.fluxo = fluxo;
	}

	public Processo getProcesso() {
		return processo;
	}

	public void setProcesso(Processo processo) {
		this.processo = processo;
	}

	public Localizacao getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}
}
