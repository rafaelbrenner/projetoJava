package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_tipo_proc_doc_papel", schema = "core")
public class TipoProcDocPapel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_tipo_proc_doc_papel")
	@SequenceGenerator(name = "sq_tb_tipo_proc_doc_papel", sequenceName = "sq_tb_tipo_proc_doc_papel", schema = "core", allocationSize = 1)
	@Column(name = "id_tp_processo_documento_papel", nullable = false)
	private Long idTpProcessoDocumentoPapel;

	@Column(name = "in_obrigatorio")
	private Boolean inObrigatorio;

	@Column(name = "in_exigibilidade")
	private String inExigibilidade = "F";

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tipo_processo_documento")
	private TipoProcessoDocumento tipoProcessoDocumento;

	public Long getIdTpProcessoDocumentoPapel() {
		return idTpProcessoDocumentoPapel;
	}

	public void setIdTpProcessoDocumentoPapel(Long idTpProcessoDocumentoPapel) {
		this.idTpProcessoDocumentoPapel = idTpProcessoDocumentoPapel;
	}

	public Boolean getInObrigatorio() {
		return inObrigatorio;
	}

	public void setInObrigatorio(Boolean inObrigatorio) {
		this.inObrigatorio = inObrigatorio;
	}

	public String getInExigibilidade() {
		return inExigibilidade;
	}

	public void setInExigibilidade(String inExigibilidade) {
		this.inExigibilidade = inExigibilidade;
	}

	public TipoProcessoDocumento getTipoProcessoDocumento() {
		return tipoProcessoDocumento;
	}

	public void setTipoProcessoDocumento(TipoProcessoDocumento tipoProcessoDocumento) {
		this.tipoProcessoDocumento = tipoProcessoDocumento;
	}
}
