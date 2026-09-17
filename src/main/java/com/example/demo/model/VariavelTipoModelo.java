package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_variavel_tipo_modelo", schema = "core")
public class VariavelTipoModelo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_variavel_tipo_modelo")
	@SequenceGenerator(name = "sq_tb_variavel_tipo_modelo", sequenceName = "sq_tb_variavel_tipo_modelo", schema = "core", allocationSize = 1)
	@Column(name = "id_variavel_tipo_modelo", nullable = false)
	private Long idVariavelTipoModelo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_variavel")
	private Variavel variavel;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tipo_modelo_documento")
	private TipoModeloDocumento tipoModeloDocumento;

	public Long getIdVariavelTipoModelo() {
		return idVariavelTipoModelo;
	}

	public void setIdVariavelTipoModelo(Long idVariavelTipoModelo) {
		this.idVariavelTipoModelo = idVariavelTipoModelo;
	}

	public Variavel getVariavel() {
		return variavel;
	}

	public void setVariavel(Variavel variavel) {
		this.variavel = variavel;
	}

	public TipoModeloDocumento getTipoModeloDocumento() {
		return tipoModeloDocumento;
	}

	public void setTipoModeloDocumento(TipoModeloDocumento tipoModeloDocumento) {
		this.tipoModeloDocumento = tipoModeloDocumento;
	}
}
