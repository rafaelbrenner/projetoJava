package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_grupo_modelo_documento", schema = "core")
public class GrupoModeloDocumento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_grupo_modelo_documento")
	@SequenceGenerator(name = "sq_tb_grupo_modelo_documento", sequenceName = "sq_tb_grupo_modelo_documento", schema = "core", allocationSize = 1)
	@Column(name = "id_grupo_modelo_documento", nullable = false)
	private Long idGrupoModeloDocumento;

	@Column(name = "ds_grupo_modelo_documento")
	private String dsGrupoModeloDocumento;

	@Column(name = "in_ativo")
	private Boolean inAtivo;

	public Long getIdGrupoModeloDocumento() {
		return idGrupoModeloDocumento;
	}

	public void setIdGrupoModeloDocumento(Long idGrupoModeloDocumento) {
		this.idGrupoModeloDocumento = idGrupoModeloDocumento;
	}

	public String getDsGrupoModeloDocumento() {
		return dsGrupoModeloDocumento;
	}

	public void setDsGrupoModeloDocumento(String dsGrupoModeloDocumento) {
		this.dsGrupoModeloDocumento = dsGrupoModeloDocumento;
	}

	public Boolean getInAtivo() {
		return inAtivo;
	}

	public void setInAtivo(Boolean inAtivo) {
		this.inAtivo = inAtivo;
	}
}
