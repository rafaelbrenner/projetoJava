package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_documento_old", schema = "core")
public class DocumentoOld implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_documento", nullable = false)
	private Long idDocumento;

	@Column(name = "ds_documento")
	private String dsDocumento;

	@Column(name = "in_ativo")
	private Boolean inAtivo;

	@Column(name = "ds_mimetype")
	private String dsMimetype;

	@Column(name = "ds_conteudo")
	private String dsConteudo;

	@Column(name = "nr_tamanho")
	private Integer nrTamanho;

	@Column(name = "in_binario")
	private Boolean inBinario;

	@Column(name = "in_valido")
	private Boolean inValido;

	@Column(name = "ds_identificador_storage")
	private String dsIdentificadorStorage;

	public Long getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(Long idDocumento) {
		this.idDocumento = idDocumento;
	}

	public String getDsDocumento() {
		return dsDocumento;
	}

	public void setDsDocumento(String dsDocumento) {
		this.dsDocumento = dsDocumento;
	}

	public Boolean getInAtivo() {
		return inAtivo;
	}

	public void setInAtivo(Boolean inAtivo) {
		this.inAtivo = inAtivo;
	}

	public String getDsMimetype() {
		return dsMimetype;
	}

	public void setDsMimetype(String dsMimetype) {
		this.dsMimetype = dsMimetype;
	}

	public String getDsConteudo() {
		return dsConteudo;
	}

	public void setDsConteudo(String dsConteudo) {
		this.dsConteudo = dsConteudo;
	}

	public Integer getNrTamanho() {
		return nrTamanho;
	}

	public void setNrTamanho(Integer nrTamanho) {
		this.nrTamanho = nrTamanho;
	}

	public Boolean getInBinario() {
		return inBinario;
	}

	public void setInBinario(Boolean inBinario) {
		this.inBinario = inBinario;
	}

	public Boolean getInValido() {
		return inValido;
	}

	public void setInValido(Boolean inValido) {
		this.inValido = inValido;
	}

	public String getDsIdentificadorStorage() {
		return dsIdentificadorStorage;
	}

	public void setDsIdentificadorStorage(String dsIdentificadorStorage) {
		this.dsIdentificadorStorage = dsIdentificadorStorage;
	}
}
