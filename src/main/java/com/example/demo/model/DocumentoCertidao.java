package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_documento_certidao", schema = "core")
public class DocumentoCertidao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_documento_certidao", nullable = false)
	private Long idDocumentoCertidao;

	@Column(name = "id_documento")
	private Long idDocumento;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_processo_documento")
	private ProcessoDocumento processoDocumento;

	public Long getIdDocumentoCertidao() {
		return idDocumentoCertidao;
	}

	public void setIdDocumentoCertidao(Long idDocumentoCertidao) {
		this.idDocumentoCertidao = idDocumentoCertidao;
	}

	public Long getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(Long idDocumento) {
		this.idDocumento = idDocumento;
	}

	public ProcessoDocumento getProcessoDocumento() {
		return processoDocumento;
	}

	public void setProcessoDocumento(ProcessoDocumento processoDocumento) {
		this.processoDocumento = processoDocumento;
	}
}
