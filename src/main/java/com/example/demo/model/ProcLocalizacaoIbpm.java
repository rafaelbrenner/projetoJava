package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_proc_localizacao_ibpm", schema = "core")
public class ProcLocalizacaoIbpm implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_proc_localizacao_ibpm")
	@SequenceGenerator(name = "sq_tb_proc_localizacao_ibpm", sequenceName = "sq_tb_proc_localizacao_ibpm", schema = "core", allocationSize = 1)
	@Column(name = "id_processo_localizacao", nullable = false)
	private Long idProcessoLocalizacao;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_processo")
	private Processo processo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_localizacao")
	private Localizacao localizacao;

	public Long getIdProcessoLocalizacao() {
		return idProcessoLocalizacao;
	}

	public void setIdProcessoLocalizacao(Long idProcessoLocalizacao) {
		this.idProcessoLocalizacao = idProcessoLocalizacao;
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
