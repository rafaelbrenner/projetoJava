package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_tipo_modelo_documento", schema = "core")
public class TipoModeloDocumento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_tipo_modelo_documento")
	@SequenceGenerator(name = "sq_tb_tipo_modelo_documento", sequenceName = "sq_tb_tipo_modelo_documento", schema = "core", allocationSize = 1)
	@Column(name = "id_tipo_modelo_documento", nullable = false)
	private Long idTipoModeloDocumento;

	@Column(name = "ds_tipo_modelo_documento")
	private String dsTipoModeloDocumento;

	@Column(name = "ds_abreviacao")
	private String dsAbreviacao;

	@Column(name = "in_ativo")
	private Boolean inAtivo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_grupo_modelo_documento")
	private GrupoModeloDocumento grupoModeloDocumento;

	public Long getIdTipoModeloDocumento() {
		return idTipoModeloDocumento;
	}

	public void setIdTipoModeloDocumento(Long idTipoModeloDocumento) {
		this.idTipoModeloDocumento = idTipoModeloDocumento;
	}

	public String getDsTipoModeloDocumento() {
		return dsTipoModeloDocumento;
	}

	public void setDsTipoModeloDocumento(String dsTipoModeloDocumento) {
		this.dsTipoModeloDocumento = dsTipoModeloDocumento;
	}

	public String getDsAbreviacao() {
		return dsAbreviacao;
	}

	public void setDsAbreviacao(String dsAbreviacao) {
		this.dsAbreviacao = dsAbreviacao;
	}

	public Boolean getInAtivo() {
		return inAtivo;
	}

	public void setInAtivo(Boolean inAtivo) {
		this.inAtivo = inAtivo;
	}

	public GrupoModeloDocumento getGrupoModeloDocumento() {
		return grupoModeloDocumento;
	}

	public void setGrupoModeloDocumento(GrupoModeloDocumento grupoModeloDocumento) {
		this.grupoModeloDocumento = grupoModeloDocumento;
	}
}
