package com.example.demo.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_processo_documento", schema = "core")
public class ProcessoDocumento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_processo_documento")
	@SequenceGenerator(name = "sq_tb_processo_documento", sequenceName = "sq_tb_processo_documento", schema = "core", allocationSize = 1)
	@Column(name = "id_processo_documento", nullable = false)
	private Long idProcessoDocumento;

	@Column(name = "ds_processo_documento")
	private String dsProcessoDocumento;

	@Column(name = "dt_inclusao")
	private LocalDateTime dtInclusao;

	@Column(name = "dt_exclusao")
	private LocalDateTime dtExclusao;

	@Column(name = "ds_motivo_exclusao")
	private String dsMotivoExclusao;

	@Column(name = "in_ativo")
	private Boolean inAtivo;

	@Column(name = "ds_observacao_procedimento")
	private String dsObservacaoProcedimento;

	@Column(name = "id_jbpm_task")
	private Long idJbpmTask;

	@Column(name = "in_documento_sigiloso")
	private Boolean inDocumentoSigiloso;

	@Column(name = "ds_nome_usuario_inclusao")
	private String dsNomeUsuarioInclusao;

	@Column(name = "ds_nome_papel")
	private String dsNomePapel;

	@Column(name = "ds_nome_usuario_alteracao")
	private String dsNomeUsuarioAlteracao;

	@Column(name = "ds_nome_usuario_exclusao")
	private String dsNomeUsuarioExclusao;

	@Column(name = "ds_nome_localizacao")
	private String dsNomeLocalizacao;

	@Column(name = "dt_alteracao")
	private LocalDateTime dtAlteracao;

	@Column(name = "id_pk_tb_processo_documento_pg")
	private Long idPkTbProcessoDocumentoPg;

	@Column(name = "id_sessao_pg")
	private Long idSessaoPg;

	@Column(name = "nr_documento")
	private String nrDocumento;

	@Column(name = "ds_instancia")
	private String dsInstancia;

	@Column(name = "dt_juntada")
	private LocalDateTime dtJuntada;

	@Column(name = "in_lido")
	private Boolean inLido = false;

	@Column(name = "nr_ordem")
	private Integer nrOrdem;

	@Column(name = "id_instancia_origem")
	private Long idInstanciaOrigem;

	@Column(name = "ds_nome_usuario_juntada")
	private String dsNomeUsuarioJuntada;

	@Column(name = "ds_localizacao_usuario_juntada")
	private String dsLocalizacaoUsuarioJuntada;

	@Column(name = "in_tipo_origem_juntada")
	private String inTipoOrigemJuntada;

	@Column(name = "in_atividade_especifica")
	private Boolean inAtividadeEspecifica = false;

	@Column(name = "ds_numero_guia")
	private String dsNumeroGuia;

	@Column(name = "in_destacar_processo")
	private Boolean inDestacarProcesso = false;

	@Column(name = "in_bloquear_visualizacao")
	private Boolean inBloquearVisualizacao = false;

	@Column(name = "id_localizacao_bloqueio")
	private Long idLocalizacaoBloqueio;

	@Column(name = "in_sincroniza_sessao_ms")
	private Boolean inSincronizaSessaoMs = false;

	@Column(name = "in_inteiro_teor")
	private Boolean inInteiroTeor = false;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_processo_documento_bin")
	private ProcessoDocumentoBin processoDocumentoBin;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tipo_processo_documento")
	private TipoProcessoDocumento tipoProcessoDocumento;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_processo")
	private Processo processo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_localizacao")
	private Localizacao localizacao;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario_inclusao")
	private Usuario usuarioInclusao;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario_alteracao")
	private Usuario usuarioAlteracao;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario_exclusao")
	private Usuario usuarioExclusao;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario_juntada")
	private Usuario usuarioJuntada;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_documento_principal")
	private ProcessoDocumento documentoPrincipal;

	public Long getIdProcessoDocumento() {
		return idProcessoDocumento;
	}

	public void setIdProcessoDocumento(Long idProcessoDocumento) {
		this.idProcessoDocumento = idProcessoDocumento;
	}

	public String getDsProcessoDocumento() {
		return dsProcessoDocumento;
	}

	public void setDsProcessoDocumento(String dsProcessoDocumento) {
		this.dsProcessoDocumento = dsProcessoDocumento;
	}

	public LocalDateTime getDtInclusao() {
		return dtInclusao;
	}

	public void setDtInclusao(LocalDateTime dtInclusao) {
		this.dtInclusao = dtInclusao;
	}

	public LocalDateTime getDtExclusao() {
		return dtExclusao;
	}

	public void setDtExclusao(LocalDateTime dtExclusao) {
		this.dtExclusao = dtExclusao;
	}

	public String getDsMotivoExclusao() {
		return dsMotivoExclusao;
	}

	public void setDsMotivoExclusao(String dsMotivoExclusao) {
		this.dsMotivoExclusao = dsMotivoExclusao;
	}

	public Boolean getInAtivo() {
		return inAtivo;
	}

	public void setInAtivo(Boolean inAtivo) {
		this.inAtivo = inAtivo;
	}

	public String getDsObservacaoProcedimento() {
		return dsObservacaoProcedimento;
	}

	public void setDsObservacaoProcedimento(String dsObservacaoProcedimento) {
		this.dsObservacaoProcedimento = dsObservacaoProcedimento;
	}

	public Long getIdJbpmTask() {
		return idJbpmTask;
	}

	public void setIdJbpmTask(Long idJbpmTask) {
		this.idJbpmTask = idJbpmTask;
	}

	public Boolean getInDocumentoSigiloso() {
		return inDocumentoSigiloso;
	}

	public void setInDocumentoSigiloso(Boolean inDocumentoSigiloso) {
		this.inDocumentoSigiloso = inDocumentoSigiloso;
	}

	public String getDsNomeUsuarioInclusao() {
		return dsNomeUsuarioInclusao;
	}

	public void setDsNomeUsuarioInclusao(String dsNomeUsuarioInclusao) {
		this.dsNomeUsuarioInclusao = dsNomeUsuarioInclusao;
	}

	public String getDsNomePapel() {
		return dsNomePapel;
	}

	public void setDsNomePapel(String dsNomePapel) {
		this.dsNomePapel = dsNomePapel;
	}

	public String getDsNomeUsuarioAlteracao() {
		return dsNomeUsuarioAlteracao;
	}

	public void setDsNomeUsuarioAlteracao(String dsNomeUsuarioAlteracao) {
		this.dsNomeUsuarioAlteracao = dsNomeUsuarioAlteracao;
	}

	public String getDsNomeUsuarioExclusao() {
		return dsNomeUsuarioExclusao;
	}

	public void setDsNomeUsuarioExclusao(String dsNomeUsuarioExclusao) {
		this.dsNomeUsuarioExclusao = dsNomeUsuarioExclusao;
	}

	public String getDsNomeLocalizacao() {
		return dsNomeLocalizacao;
	}

	public void setDsNomeLocalizacao(String dsNomeLocalizacao) {
		this.dsNomeLocalizacao = dsNomeLocalizacao;
	}

	public LocalDateTime getDtAlteracao() {
		return dtAlteracao;
	}

	public void setDtAlteracao(LocalDateTime dtAlteracao) {
		this.dtAlteracao = dtAlteracao;
	}

	public Long getIdPkTbProcessoDocumentoPg() {
		return idPkTbProcessoDocumentoPg;
	}

	public void setIdPkTbProcessoDocumentoPg(Long idPkTbProcessoDocumentoPg) {
		this.idPkTbProcessoDocumentoPg = idPkTbProcessoDocumentoPg;
	}

	public Long getIdSessaoPg() {
		return idSessaoPg;
	}

	public void setIdSessaoPg(Long idSessaoPg) {
		this.idSessaoPg = idSessaoPg;
	}

	public String getNrDocumento() {
		return nrDocumento;
	}

	public void setNrDocumento(String nrDocumento) {
		this.nrDocumento = nrDocumento;
	}

	public String getDsInstancia() {
		return dsInstancia;
	}

	public void setDsInstancia(String dsInstancia) {
		this.dsInstancia = dsInstancia;
	}

	public LocalDateTime getDtJuntada() {
		return dtJuntada;
	}

	public void setDtJuntada(LocalDateTime dtJuntada) {
		this.dtJuntada = dtJuntada;
	}

	public Boolean getInLido() {
		return inLido;
	}

	public void setInLido(Boolean inLido) {
		this.inLido = inLido;
	}

	public Integer getNrOrdem() {
		return nrOrdem;
	}

	public void setNrOrdem(Integer nrOrdem) {
		this.nrOrdem = nrOrdem;
	}

	public Long getIdInstanciaOrigem() {
		return idInstanciaOrigem;
	}

	public void setIdInstanciaOrigem(Long idInstanciaOrigem) {
		this.idInstanciaOrigem = idInstanciaOrigem;
	}

	public String getDsNomeUsuarioJuntada() {
		return dsNomeUsuarioJuntada;
	}

	public void setDsNomeUsuarioJuntada(String dsNomeUsuarioJuntada) {
		this.dsNomeUsuarioJuntada = dsNomeUsuarioJuntada;
	}

	public String getDsLocalizacaoUsuarioJuntada() {
		return dsLocalizacaoUsuarioJuntada;
	}

	public void setDsLocalizacaoUsuarioJuntada(String dsLocalizacaoUsuarioJuntada) {
		this.dsLocalizacaoUsuarioJuntada = dsLocalizacaoUsuarioJuntada;
	}

	public String getInTipoOrigemJuntada() {
		return inTipoOrigemJuntada;
	}

	public void setInTipoOrigemJuntada(String inTipoOrigemJuntada) {
		this.inTipoOrigemJuntada = inTipoOrigemJuntada;
	}

	public Boolean getInAtividadeEspecifica() {
		return inAtividadeEspecifica;
	}

	public void setInAtividadeEspecifica(Boolean inAtividadeEspecifica) {
		this.inAtividadeEspecifica = inAtividadeEspecifica;
	}

	public String getDsNumeroGuia() {
		return dsNumeroGuia;
	}

	public void setDsNumeroGuia(String dsNumeroGuia) {
		this.dsNumeroGuia = dsNumeroGuia;
	}

	public Boolean getInDestacarProcesso() {
		return inDestacarProcesso;
	}

	public void setInDestacarProcesso(Boolean inDestacarProcesso) {
		this.inDestacarProcesso = inDestacarProcesso;
	}

	public Boolean getInBloquearVisualizacao() {
		return inBloquearVisualizacao;
	}

	public void setInBloquearVisualizacao(Boolean inBloquearVisualizacao) {
		this.inBloquearVisualizacao = inBloquearVisualizacao;
	}

	public Long getIdLocalizacaoBloqueio() {
		return idLocalizacaoBloqueio;
	}

	public void setIdLocalizacaoBloqueio(Long idLocalizacaoBloqueio) {
		this.idLocalizacaoBloqueio = idLocalizacaoBloqueio;
	}

	public Boolean getInSincronizaSessaoMs() {
		return inSincronizaSessaoMs;
	}

	public void setInSincronizaSessaoMs(Boolean inSincronizaSessaoMs) {
		this.inSincronizaSessaoMs = inSincronizaSessaoMs;
	}

	public Boolean getInInteiroTeor() {
		return inInteiroTeor;
	}

	public void setInInteiroTeor(Boolean inInteiroTeor) {
		this.inInteiroTeor = inInteiroTeor;
	}

	public ProcessoDocumentoBin getProcessoDocumentoBin() {
		return processoDocumentoBin;
	}

	public void setProcessoDocumentoBin(ProcessoDocumentoBin processoDocumentoBin) {
		this.processoDocumentoBin = processoDocumentoBin;
	}

	public TipoProcessoDocumento getTipoProcessoDocumento() {
		return tipoProcessoDocumento;
	}

	public void setTipoProcessoDocumento(TipoProcessoDocumento tipoProcessoDocumento) {
		this.tipoProcessoDocumento = tipoProcessoDocumento;
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

	public Usuario getUsuarioInclusao() {
		return usuarioInclusao;
	}

	public void setUsuarioInclusao(Usuario usuarioInclusao) {
		this.usuarioInclusao = usuarioInclusao;
	}

	public Usuario getUsuarioAlteracao() {
		return usuarioAlteracao;
	}

	public void setUsuarioAlteracao(Usuario usuarioAlteracao) {
		this.usuarioAlteracao = usuarioAlteracao;
	}

	public Usuario getUsuarioExclusao() {
		return usuarioExclusao;
	}

	public void setUsuarioExclusao(Usuario usuarioExclusao) {
		this.usuarioExclusao = usuarioExclusao;
	}

	public Usuario getUsuarioJuntada() {
		return usuarioJuntada;
	}

	public void setUsuarioJuntada(Usuario usuarioJuntada) {
		this.usuarioJuntada = usuarioJuntada;
	}

	public ProcessoDocumento getDocumentoPrincipal() {
		return documentoPrincipal;
	}

	public void setDocumentoPrincipal(ProcessoDocumento documentoPrincipal) {
		this.documentoPrincipal = documentoPrincipal;
	}
}
