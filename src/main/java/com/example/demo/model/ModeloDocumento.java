package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_modelo_documento", schema = "core")
public class ModeloDocumento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_modelo_documento")
	@SequenceGenerator(name = "sq_tb_modelo_documento", sequenceName = "sq_tb_modelo_documento", schema = "core", allocationSize = 1)
	@Column(name = "id_modelo_documento", nullable = false)
	private Long idModeloDocumento;

	@Column(name = "ds_titulo_modelo_documento")
	private String dsTituloModeloDocumento;

	@Column(name = "ds_modelo_documento")
	private String dsModeloDocumento;

	@Column(name = "in_ativo")
	private Boolean inAtivo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tipo_modelo_documento")
	private TipoModeloDocumento tipoModeloDocumento;

	public Long getIdModeloDocumento() {
		return idModeloDocumento;
	}

	public void setIdModeloDocumento(Long idModeloDocumento) {
		this.idModeloDocumento = idModeloDocumento;
	}

	public String getDsTituloModeloDocumento() {
		return dsTituloModeloDocumento;
	}

	public void setDsTituloModeloDocumento(String dsTituloModeloDocumento) {
		this.dsTituloModeloDocumento = dsTituloModeloDocumento;
	}

	public String getDsModeloDocumento() {
		return dsModeloDocumento;
	}

	public void setDsModeloDocumento(String dsModeloDocumento) {
		this.dsModeloDocumento = dsModeloDocumento;
	}

	public Boolean getInAtivo() {
		return inAtivo;
	}

	public void setInAtivo(Boolean inAtivo) {
		this.inAtivo = inAtivo;
	}

	public TipoModeloDocumento getTipoModeloDocumento() {
		return tipoModeloDocumento;
	}

	public void setTipoModeloDocumento(TipoModeloDocumento tipoModeloDocumento) {
		this.tipoModeloDocumento = tipoModeloDocumento;
	}
}
