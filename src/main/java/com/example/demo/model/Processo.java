package com.example.demo.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_processo", schema = "core")
public class Processo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_processo")
	@SequenceGenerator(name = "sq_tb_processo", sequenceName = "sq_tb_processo", schema = "core", allocationSize = 1)
	@Column(name = "id_processo", nullable = false)
	private Long idProcesso;

	@Column(name = "nr_processo")
	private String nrProcesso;

	@Column(name = "nr_processo_origem")
	private String nrProcessoOrigem;

	@Column(name = "ds_complemento")
	private String dsComplemento;

	@Column(name = "dt_inicio")
	private LocalDateTime dtInicio;

	@Column(name = "id_jbpm")
	private Long idJbpm;

	@Column(name = "dt_fim")
	private LocalDateTime dtFim;

	@Column(name = "nr_duracao")
	private Long nrDuracao;

	@Column(name = "nm_actor_id")
	private String nmActorId;

	@Column(name = "ds_nm_usu_cadastro_processo")
	private String dsNmUsuCadastroProcesso;

	@Column(name = "id_pk_tb_processo_pg")
	private Long idPkTbProcessoPg;

	@Column(name = "id_sessao_pg")
	private Long idSessaoPg;

	@Column(name = "nr_processo_temp")
	private String nrProcessoTemp;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_status")
	private Status status;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_caixa")
	private Caixa caixa;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_fluxo")
	private Fluxo fluxo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario_cadastro_processo")
	private Usuario usuarioCadastroProcesso;

	public Long getIdProcesso() {
		return idProcesso;
	}

	public void setIdProcesso(Long idProcesso) {
		this.idProcesso = idProcesso;
	}

	public String getNrProcesso() {
		return nrProcesso;
	}

	public void setNrProcesso(String nrProcesso) {
		this.nrProcesso = nrProcesso;
	}

	public String getNrProcessoOrigem() {
		return nrProcessoOrigem;
	}

	public void setNrProcessoOrigem(String nrProcessoOrigem) {
		this.nrProcessoOrigem = nrProcessoOrigem;
	}

	public String getDsComplemento() {
		return dsComplemento;
	}

	public void setDsComplemento(String dsComplemento) {
		this.dsComplemento = dsComplemento;
	}

	public LocalDateTime getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(LocalDateTime dtInicio) {
		this.dtInicio = dtInicio;
	}

	public Long getIdJbpm() {
		return idJbpm;
	}

	public void setIdJbpm(Long idJbpm) {
		this.idJbpm = idJbpm;
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

	public String getNmActorId() {
		return nmActorId;
	}

	public void setNmActorId(String nmActorId) {
		this.nmActorId = nmActorId;
	}

	public String getDsNmUsuCadastroProcesso() {
		return dsNmUsuCadastroProcesso;
	}

	public void setDsNmUsuCadastroProcesso(String dsNmUsuCadastroProcesso) {
		this.dsNmUsuCadastroProcesso = dsNmUsuCadastroProcesso;
	}

	public Long getIdPkTbProcessoPg() {
		return idPkTbProcessoPg;
	}

	public void setIdPkTbProcessoPg(Long idPkTbProcessoPg) {
		this.idPkTbProcessoPg = idPkTbProcessoPg;
	}

	public Long getIdSessaoPg() {
		return idSessaoPg;
	}

	public void setIdSessaoPg(Long idSessaoPg) {
		this.idSessaoPg = idSessaoPg;
	}

	public String getNrProcessoTemp() {
		return nrProcessoTemp;
	}

	public void setNrProcessoTemp(String nrProcessoTemp) {
		this.nrProcessoTemp = nrProcessoTemp;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Caixa getCaixa() {
		return caixa;
	}

	public void setCaixa(Caixa caixa) {
		this.caixa = caixa;
	}

	public Fluxo getFluxo() {
		return fluxo;
	}

	public void setFluxo(Fluxo fluxo) {
		this.fluxo = fluxo;
	}

	public Usuario getUsuarioCadastroProcesso() {
		return usuarioCadastroProcesso;
	}

	public void setUsuarioCadastroProcesso(Usuario usuarioCadastroProcesso) {
		this.usuarioCadastroProcesso = usuarioCadastroProcesso;
	}
}
