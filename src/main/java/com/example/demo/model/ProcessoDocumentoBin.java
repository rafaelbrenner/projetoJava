package com.example.demo.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_processo_documento_bin", schema = "core")
public class ProcessoDocumentoBin implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_processo_documento_bin")
	@SequenceGenerator(name = "sq_tb_processo_documento_bin", sequenceName = "sq_tb_processo_documento_bin", schema = "core", allocationSize = 1)
	@Column(name = "id_processo_documento_bin", nullable = false)
	private Long idProcessoDocumentoBin;

	@Column(name = "ds_extensao")
	private String dsExtensao;

	@Column(name = "ds_modelo_documento")
	private String dsModeloDocumento;

	@Column(name = "ds_md5_documento")
	private String dsMd5Documento;

	@Column(name = "nm_arquivo")
	private String nmArquivo;

	@Column(name = "dt_inclusao")
	private LocalDateTime dtInclusao;

	@Column(name = "ob_processo_documento")
	private String obProcessoDocumento;

	@Column(name = "nr_tamanho")
	private Integer nrTamanho;

	@Column(name = "ds_signature")
	private String dsSignature;

	@Column(name = "ds_cert_chain")
	private String dsCertChain;

	@Column(name = "ds_nome_usuario_ultimo_assinar")
	private String dsNomeUsuarioUltimoAssinar;

	@Column(name = "ds_nome_usuario")
	private String dsNomeUsuario;

	@Column(name = "dt_primeira_assinatura")
	private LocalDateTime dtPrimeiraAssinatura;

	@Column(name = "id_sessao_pg")
	private Long idSessaoPg;

	@Column(name = "in_valido")
	private Boolean inValido;

	@Column(name = "in_binario")
	private Boolean inBinario = false;

	@Column(name = "id_pk_tb_pro_docum_bin_pg")
	private Long idPkTbProDocumBinPg;

	@Column(name = "nr_documento_storage")
	private String nrDocumentoStorage;

	@Column(name = "nm_documento_wopi")
	private String nmDocumentoWopi;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario_ultimo_assinar")
	private Usuario usuarioUltimoAssinar;

	public Long getIdProcessoDocumentoBin() {
		return idProcessoDocumentoBin;
	}

	public void setIdProcessoDocumentoBin(Long idProcessoDocumentoBin) {
		this.idProcessoDocumentoBin = idProcessoDocumentoBin;
	}

	public String getDsExtensao() {
		return dsExtensao;
	}

	public void setDsExtensao(String dsExtensao) {
		this.dsExtensao = dsExtensao;
	}

	public String getDsModeloDocumento() {
		return dsModeloDocumento;
	}

	public void setDsModeloDocumento(String dsModeloDocumento) {
		this.dsModeloDocumento = dsModeloDocumento;
	}

	public String getDsMd5Documento() {
		return dsMd5Documento;
	}

	public void setDsMd5Documento(String dsMd5Documento) {
		this.dsMd5Documento = dsMd5Documento;
	}

	public String getNmArquivo() {
		return nmArquivo;
	}

	public void setNmArquivo(String nmArquivo) {
		this.nmArquivo = nmArquivo;
	}

	public LocalDateTime getDtInclusao() {
		return dtInclusao;
	}

	public void setDtInclusao(LocalDateTime dtInclusao) {
		this.dtInclusao = dtInclusao;
	}

	public String getObProcessoDocumento() {
		return obProcessoDocumento;
	}

	public void setObProcessoDocumento(String obProcessoDocumento) {
		this.obProcessoDocumento = obProcessoDocumento;
	}

	public Integer getNrTamanho() {
		return nrTamanho;
	}

	public void setNrTamanho(Integer nrTamanho) {
		this.nrTamanho = nrTamanho;
	}

	public String getDsSignature() {
		return dsSignature;
	}

	public void setDsSignature(String dsSignature) {
		this.dsSignature = dsSignature;
	}

	public String getDsCertChain() {
		return dsCertChain;
	}

	public void setDsCertChain(String dsCertChain) {
		this.dsCertChain = dsCertChain;
	}

	public String getDsNomeUsuarioUltimoAssinar() {
		return dsNomeUsuarioUltimoAssinar;
	}

	public void setDsNomeUsuarioUltimoAssinar(String dsNomeUsuarioUltimoAssinar) {
		this.dsNomeUsuarioUltimoAssinar = dsNomeUsuarioUltimoAssinar;
	}

	public String getDsNomeUsuario() {
		return dsNomeUsuario;
	}

	public void setDsNomeUsuario(String dsNomeUsuario) {
		this.dsNomeUsuario = dsNomeUsuario;
	}

	public LocalDateTime getDtPrimeiraAssinatura() {
		return dtPrimeiraAssinatura;
	}

	public void setDtPrimeiraAssinatura(LocalDateTime dtPrimeiraAssinatura) {
		this.dtPrimeiraAssinatura = dtPrimeiraAssinatura;
	}

	public Long getIdSessaoPg() {
		return idSessaoPg;
	}

	public void setIdSessaoPg(Long idSessaoPg) {
		this.idSessaoPg = idSessaoPg;
	}

	public Boolean getInValido() {
		return inValido;
	}

	public void setInValido(Boolean inValido) {
		this.inValido = inValido;
	}

	public Boolean getInBinario() {
		return inBinario;
	}

	public void setInBinario(Boolean inBinario) {
		this.inBinario = inBinario;
	}

	public Long getIdPkTbProDocumBinPg() {
		return idPkTbProDocumBinPg;
	}

	public void setIdPkTbProDocumBinPg(Long idPkTbProDocumBinPg) {
		this.idPkTbProDocumBinPg = idPkTbProDocumBinPg;
	}

	public String getNrDocumentoStorage() {
		return nrDocumentoStorage;
	}

	public void setNrDocumentoStorage(String nrDocumentoStorage) {
		this.nrDocumentoStorage = nrDocumentoStorage;
	}

	public String getNmDocumentoWopi() {
		return nmDocumentoWopi;
	}

	public void setNmDocumentoWopi(String nmDocumentoWopi) {
		this.nmDocumentoWopi = nmDocumentoWopi;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Usuario getUsuarioUltimoAssinar() {
		return usuarioUltimoAssinar;
	}

	public void setUsuarioUltimoAssinar(Usuario usuarioUltimoAssinar) {
		this.usuarioUltimoAssinar = usuarioUltimoAssinar;
	}
}
