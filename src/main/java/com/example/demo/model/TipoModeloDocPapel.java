package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_tipo_modelo_doc_papel", schema = "core")
public class TipoModeloDocPapel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_tipo_modelo_doc_papel")
	@SequenceGenerator(name = "sq_tb_tipo_modelo_doc_papel", sequenceName = "sq_tb_tipo_modelo_doc_papel", schema = "core", allocationSize = 1)
	@Column(name = "id_tipo_modelo_documento_papel", nullable = false)
	private Long idTipoModeloDocumentoPapel;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tipo_modelo_documento")
	private TipoModeloDocumento tipoModeloDocumento;

	public Long getIdTipoModeloDocumentoPapel() {
		return idTipoModeloDocumentoPapel;
	}

	public void setIdTipoModeloDocumentoPapel(Long idTipoModeloDocumentoPapel) {
		this.idTipoModeloDocumentoPapel = idTipoModeloDocumentoPapel;
	}

	public TipoModeloDocumento getTipoModeloDocumento() {
		return tipoModeloDocumento;
	}

	public void setTipoModeloDocumento(TipoModeloDocumento tipoModeloDocumento) {
		this.tipoModeloDocumento = tipoModeloDocumento;
	}
}
