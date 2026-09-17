package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_lista_email", schema = "core")
public class ListaEmail implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_lista_email")
	@SequenceGenerator(name = "sq_tb_lista_email", sequenceName = "sq_tb_lista_email", schema = "core", allocationSize = 1)
	@Column(name = "id_lista_email", nullable = false)
	private Long idListaEmail;

	@Column(name = "id_grupo_email")
	private Long idGrupoEmail;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_localizacao")
	private Localizacao localizacao;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_estrutura")
	private Localizacao estrutura;

	public Long getIdListaEmail() {
		return idListaEmail;
	}

	public void setIdListaEmail(Long idListaEmail) {
		this.idListaEmail = idListaEmail;
	}

	public Long getIdGrupoEmail() {
		return idGrupoEmail;
	}

	public void setIdGrupoEmail(Long idGrupoEmail) {
		this.idGrupoEmail = idGrupoEmail;
	}

	public Localizacao getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}

	public Localizacao getEstrutura() {
		return estrutura;
	}

	public void setEstrutura(Localizacao estrutura) {
		this.estrutura = estrutura;
	}
}
