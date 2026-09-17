package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_item_tipo_documento", schema = "core")
public class ItemTipoDocumento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_item_tipo_documento")
	@SequenceGenerator(name = "sq_tb_item_tipo_documento", sequenceName = "sq_tb_item_tipo_documento", schema = "core", allocationSize = 1)
	@Column(name = "id_item_tipo_documento", nullable = false)
	private Long idItemTipoDocumento;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_localizacao")
	private Localizacao localizacao;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_grupo_modelo_documento")
	private GrupoModeloDocumento grupoModeloDocumento;

	public Long getIdItemTipoDocumento() {
		return idItemTipoDocumento;
	}

	public void setIdItemTipoDocumento(Long idItemTipoDocumento) {
		this.idItemTipoDocumento = idItemTipoDocumento;
	}

	public Localizacao getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}

	public GrupoModeloDocumento getGrupoModeloDocumento() {
		return grupoModeloDocumento;
	}

	public void setGrupoModeloDocumento(GrupoModeloDocumento grupoModeloDocumento) {
		this.grupoModeloDocumento = grupoModeloDocumento;
	}
}
