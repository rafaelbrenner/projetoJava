package com.example.demo.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_processo_evento", schema = "core")
public class ProcessoEvento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_processo_evento")
	@SequenceGenerator(name = "sq_tb_processo_evento", sequenceName = "sq_tb_processo_evento", schema = "core", allocationSize = 1)
	@Column(name = "id_processo_evento", nullable = false)
	private Long idProcessoEvento;

	@Column(name = "dt_atualizacao")
	private LocalDateTime dtAtualizacao;

	@Column(name = "id_jbpm_task")
	private Long idJbpmTask;

	@Column(name = "ds_nome_usuario")
	private String dsNomeUsuario;

	@Column(name = "ds_cpf_usuario")
	private String dsCpfUsuario;

	@Column(name = "ds_cnpj_usuario")
	private String dsCnpjUsuario;

	@Column(name = "in_processado")
	private Boolean inProcessado;

	@Column(name = "in_verificado_processado")
	private Boolean inVerificadoProcessado;

	@Column(name = "tp_processo_evento")
	private String tpProcessoEvento = "E";

	@Column(name = "ds_texto_final_externo")
	private String dsTextoFinalExterno;

	@Column(name = "ds_texto_final_interno")
	private String dsTextoFinalInterno;

	@Column(name = "in_visibilidade_externa")
	private Boolean inVisibilidadeExterna;

	@Column(name = "ds_texto_parametrizado")
	private String dsTextoParametrizado;

	@Column(name = "ds_processo_evento")
	private String dsProcessoEvento;

	@Column(name = "ds_observacao")
	private String dsObservacao;

	@Column(name = "in_ativo")
	private Boolean inAtivo = true;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_processo_evento_excludente")
	private ProcessoEvento processoEventoExcludente;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_processo_documento")
	private ProcessoDocumento processoDocumento;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tarefa")
	private Tarefa tarefa;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_evento")
	private Evento evento;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_processo")
	private Processo processo;

	public Long getIdProcessoEvento() {
		return idProcessoEvento;
	}

	public void setIdProcessoEvento(Long idProcessoEvento) {
		this.idProcessoEvento = idProcessoEvento;
	}

	public LocalDateTime getDtAtualizacao() {
		return dtAtualizacao;
	}

	public void setDtAtualizacao(LocalDateTime dtAtualizacao) {
		this.dtAtualizacao = dtAtualizacao;
	}

	public Long getIdJbpmTask() {
		return idJbpmTask;
	}

	public void setIdJbpmTask(Long idJbpmTask) {
		this.idJbpmTask = idJbpmTask;
	}

	public String getDsNomeUsuario() {
		return dsNomeUsuario;
	}

	public void setDsNomeUsuario(String dsNomeUsuario) {
		this.dsNomeUsuario = dsNomeUsuario;
	}

	public String getDsCpfUsuario() {
		return dsCpfUsuario;
	}

	public void setDsCpfUsuario(String dsCpfUsuario) {
		this.dsCpfUsuario = dsCpfUsuario;
	}

	public String getDsCnpjUsuario() {
		return dsCnpjUsuario;
	}

	public void setDsCnpjUsuario(String dsCnpjUsuario) {
		this.dsCnpjUsuario = dsCnpjUsuario;
	}

	public Boolean getInProcessado() {
		return inProcessado;
	}

	public void setInProcessado(Boolean inProcessado) {
		this.inProcessado = inProcessado;
	}

	public Boolean getInVerificadoProcessado() {
		return inVerificadoProcessado;
	}

	public void setInVerificadoProcessado(Boolean inVerificadoProcessado) {
		this.inVerificadoProcessado = inVerificadoProcessado;
	}

	public String getTpProcessoEvento() {
		return tpProcessoEvento;
	}

	public void setTpProcessoEvento(String tpProcessoEvento) {
		this.tpProcessoEvento = tpProcessoEvento;
	}

	public String getDsTextoFinalExterno() {
		return dsTextoFinalExterno;
	}

	public void setDsTextoFinalExterno(String dsTextoFinalExterno) {
		this.dsTextoFinalExterno = dsTextoFinalExterno;
	}

	public String getDsTextoFinalInterno() {
		return dsTextoFinalInterno;
	}

	public void setDsTextoFinalInterno(String dsTextoFinalInterno) {
		this.dsTextoFinalInterno = dsTextoFinalInterno;
	}

	public Boolean getInVisibilidadeExterna() {
		return inVisibilidadeExterna;
	}

	public void setInVisibilidadeExterna(Boolean inVisibilidadeExterna) {
		this.inVisibilidadeExterna = inVisibilidadeExterna;
	}

	public String getDsTextoParametrizado() {
		return dsTextoParametrizado;
	}

	public void setDsTextoParametrizado(String dsTextoParametrizado) {
		this.dsTextoParametrizado = dsTextoParametrizado;
	}

	public String getDsProcessoEvento() {
		return dsProcessoEvento;
	}

	public void setDsProcessoEvento(String dsProcessoEvento) {
		this.dsProcessoEvento = dsProcessoEvento;
	}

	public String getDsObservacao() {
		return dsObservacao;
	}

	public void setDsObservacao(String dsObservacao) {
		this.dsObservacao = dsObservacao;
	}

	public Boolean getInAtivo() {
		return inAtivo;
	}

	public void setInAtivo(Boolean inAtivo) {
		this.inAtivo = inAtivo;
	}

	public ProcessoEvento getProcessoEventoExcludente() {
		return processoEventoExcludente;
	}

	public void setProcessoEventoExcludente(ProcessoEvento processoEventoExcludente) {
		this.processoEventoExcludente = processoEventoExcludente;
	}

	public ProcessoDocumento getProcessoDocumento() {
		return processoDocumento;
	}

	public void setProcessoDocumento(ProcessoDocumento processoDocumento) {
		this.processoDocumento = processoDocumento;
	}

	public Tarefa getTarefa() {
		return tarefa;
	}

	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public Processo getProcesso() {
		return processo;
	}

	public void setProcesso(Processo processo) {
		this.processo = processo;
	}
}
