package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_processo_instance", schema = "core")
public class ProcessoInstance implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_proc_inst", nullable = false)
	private Long idProcInst;

	@Column(name = "id_orgao_julgador_cargo")
	private Long idOrgaoJulgadorCargo;

	@Column(name = "id_orgao_julgador_colegiado")
	private Long idOrgaoJulgadorColegiado;

	@Column(name = "in_ativo")
	private Boolean inAtivo;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "id_processo", nullable = false)
	private Processo processo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_localizacao")
	private Localizacao localizacao;

	public Long getIdProcInst() {
		return idProcInst;
	}

	public void setIdProcInst(Long idProcInst) {
		this.idProcInst = idProcInst;
	}

	public Long getIdOrgaoJulgadorCargo() {
		return idOrgaoJulgadorCargo;
	}

	public void setIdOrgaoJulgadorCargo(Long idOrgaoJulgadorCargo) {
		this.idOrgaoJulgadorCargo = idOrgaoJulgadorCargo;
	}

	public Long getIdOrgaoJulgadorColegiado() {
		return idOrgaoJulgadorColegiado;
	}

	public void setIdOrgaoJulgadorColegiado(Long idOrgaoJulgadorColegiado) {
		this.idOrgaoJulgadorColegiado = idOrgaoJulgadorColegiado;
	}

	public Boolean getInAtivo() {
		return inAtivo;
	}

	public void setInAtivo(Boolean inAtivo) {
		this.inAtivo = inAtivo;
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
