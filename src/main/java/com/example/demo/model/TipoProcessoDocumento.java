package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_tipo_processo_documento", schema = "core")
public class TipoProcessoDocumento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_tipo_processo_documento")
	@SequenceGenerator(name = "sq_tb_tipo_processo_documento", sequenceName = "sq_tb_tipo_processo_documento", schema = "core", allocationSize = 1)
	@Column(name = "id_tipo_processo_documento", nullable = false)
	private Long idTipoProcessoDocumento;

	@Column(name = "ds_tipo_processo_documento")
	private String dsTipoProcessoDocumento;

	@Column(name = "in_ativo")
	private Boolean inAtivo;

	@Column(name = "in_sistema")
	private Boolean inSistema;

	@Column(name = "cd_tipo_documento")
	private String cdTipoDocumento;

	@Column(name = "cd_documento")
	private String cdDocumento;

	@Column(name = "in_tipo_documento")
	private String inTipoDocumento;

	@Column(name = "in_anexar")
	private Boolean inAnexar;

	@Column(name = "in_numera")
	private Boolean inNumera;

	@Column(name = "ds_tp_proc_dcumento_observacao")
	private String dsTpProcDcumentoObservacao;

	@Column(name = "ds_mascara")
	private String dsMascara;

	@Column(name = "tp_visibilidade")
	private String tpVisibilidade;

	@Column(name = "in_obriga_assinatura")
	private String inObrigaAssinatura = "U";

	@Column(name = "in_publico")
	private Boolean inPublico;

	@Column(name = "in_tipo_comunicacao")
	private Boolean inTipoComunicacao;

	@Column(name = "in_tipo_expediente")
	private Boolean inTipoExpediente;

	@Column(name = "nr_codigo_materia")
	private String nrCodigoMateria;

	@Column(name = "in_notifica_advogado")
	private Boolean inNotificaAdvogado;

	@Column(name = "in_notifica_parte")
	private Boolean inNotificaParte;

	@Column(name = "in_ato_proferido")
	private Boolean inAtoProferido = true;

	@Column(name = "id_fluxo")
	private Long idFluxo;

	@Column(name = "ds_variavel_fluxo")
	private String dsVariavelFluxo;

	@Column(name = "in_pesquisavel")
	private Boolean inPesquisavel = false;

	@Column(name = "ds_url_bnmp")
	private String dsUrlBnmp;

	@Column(name = "in_exibe_juntada_documento")
	private Boolean inExibeJuntadaDocumento = true;

	@Column(name = "in_possui_custas")
	private Boolean inPossuiCustas = false;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_agrupamento")
	private Agrupamento agrupamento;

	public Long getIdTipoProcessoDocumento() {
		return idTipoProcessoDocumento;
	}

	public void setIdTipoProcessoDocumento(Long idTipoProcessoDocumento) {
		this.idTipoProcessoDocumento = idTipoProcessoDocumento;
	}

	public String getDsTipoProcessoDocumento() {
		return dsTipoProcessoDocumento;
	}

	public void setDsTipoProcessoDocumento(String dsTipoProcessoDocumento) {
		this.dsTipoProcessoDocumento = dsTipoProcessoDocumento;
	}

	public Boolean getInAtivo() {
		return inAtivo;
	}

	public void setInAtivo(Boolean inAtivo) {
		this.inAtivo = inAtivo;
	}

	public Boolean getInSistema() {
		return inSistema;
	}

	public void setInSistema(Boolean inSistema) {
		this.inSistema = inSistema;
	}

	public String getCdTipoDocumento() {
		return cdTipoDocumento;
	}

	public void setCdTipoDocumento(String cdTipoDocumento) {
		this.cdTipoDocumento = cdTipoDocumento;
	}

	public String getCdDocumento() {
		return cdDocumento;
	}

	public void setCdDocumento(String cdDocumento) {
		this.cdDocumento = cdDocumento;
	}

	public String getInTipoDocumento() {
		return inTipoDocumento;
	}

	public void setInTipoDocumento(String inTipoDocumento) {
		this.inTipoDocumento = inTipoDocumento;
	}

	public Boolean getInAnexar() {
		return inAnexar;
	}

	public void setInAnexar(Boolean inAnexar) {
		this.inAnexar = inAnexar;
	}

	public Boolean getInNumera() {
		return inNumera;
	}

	public void setInNumera(Boolean inNumera) {
		this.inNumera = inNumera;
	}

	public String getDsTpProcDcumentoObservacao() {
		return dsTpProcDcumentoObservacao;
	}

	public void setDsTpProcDcumentoObservacao(String dsTpProcDcumentoObservacao) {
		this.dsTpProcDcumentoObservacao = dsTpProcDcumentoObservacao;
	}

	public String getDsMascara() {
		return dsMascara;
	}

	public void setDsMascara(String dsMascara) {
		this.dsMascara = dsMascara;
	}

	public String getTpVisibilidade() {
		return tpVisibilidade;
	}

	public void setTpVisibilidade(String tpVisibilidade) {
		this.tpVisibilidade = tpVisibilidade;
	}

	public String getInObrigaAssinatura() {
		return inObrigaAssinatura;
	}

	public void setInObrigaAssinatura(String inObrigaAssinatura) {
		this.inObrigaAssinatura = inObrigaAssinatura;
	}

	public Boolean getInPublico() {
		return inPublico;
	}

	public void setInPublico(Boolean inPublico) {
		this.inPublico = inPublico;
	}

	public Boolean getInTipoComunicacao() {
		return inTipoComunicacao;
	}

	public void setInTipoComunicacao(Boolean inTipoComunicacao) {
		this.inTipoComunicacao = inTipoComunicacao;
	}

	public Boolean getInTipoExpediente() {
		return inTipoExpediente;
	}

	public void setInTipoExpediente(Boolean inTipoExpediente) {
		this.inTipoExpediente = inTipoExpediente;
	}

	public String getNrCodigoMateria() {
		return nrCodigoMateria;
	}

	public void setNrCodigoMateria(String nrCodigoMateria) {
		this.nrCodigoMateria = nrCodigoMateria;
	}

	public Boolean getInNotificaAdvogado() {
		return inNotificaAdvogado;
	}

	public void setInNotificaAdvogado(Boolean inNotificaAdvogado) {
		this.inNotificaAdvogado = inNotificaAdvogado;
	}

	public Boolean getInNotificaParte() {
		return inNotificaParte;
	}

	public void setInNotificaParte(Boolean inNotificaParte) {
		this.inNotificaParte = inNotificaParte;
	}

	public Boolean getInAtoProferido() {
		return inAtoProferido;
	}

	public void setInAtoProferido(Boolean inAtoProferido) {
		this.inAtoProferido = inAtoProferido;
	}

	public Long getIdFluxo() {
		return idFluxo;
	}

	public void setIdFluxo(Long idFluxo) {
		this.idFluxo = idFluxo;
	}

	public String getDsVariavelFluxo() {
		return dsVariavelFluxo;
	}

	public void setDsVariavelFluxo(String dsVariavelFluxo) {
		this.dsVariavelFluxo = dsVariavelFluxo;
	}

	public Boolean getInPesquisavel() {
		return inPesquisavel;
	}

	public void setInPesquisavel(Boolean inPesquisavel) {
		this.inPesquisavel = inPesquisavel;
	}

	public String getDsUrlBnmp() {
		return dsUrlBnmp;
	}

	public void setDsUrlBnmp(String dsUrlBnmp) {
		this.dsUrlBnmp = dsUrlBnmp;
	}

	public Boolean getInExibeJuntadaDocumento() {
		return inExibeJuntadaDocumento;
	}

	public void setInExibeJuntadaDocumento(Boolean inExibeJuntadaDocumento) {
		this.inExibeJuntadaDocumento = inExibeJuntadaDocumento;
	}

	public Boolean getInPossuiCustas() {
		return inPossuiCustas;
	}

	public void setInPossuiCustas(Boolean inPossuiCustas) {
		this.inPossuiCustas = inPossuiCustas;
	}

	public Agrupamento getAgrupamento() {
		return agrupamento;
	}

	public void setAgrupamento(Agrupamento agrupamento) {
		this.agrupamento = agrupamento;
	}
}
