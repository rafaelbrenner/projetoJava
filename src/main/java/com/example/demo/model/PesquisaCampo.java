package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_pesquisa_campo", schema = "core")
public class PesquisaCampo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_pesquisa_campo")
	@SequenceGenerator(name = "sq_tb_pesquisa_campo", sequenceName = "sq_tb_pesquisa_campo", schema = "core", allocationSize = 1)
	@Column(name = "id_pesquisa_campo", nullable = false)
	private Long idPesquisaCampo;

	@Column(name = "ds_nome")
	private String dsNome;

	@Column(name = "ds_valor")
	private String dsValor;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_pesquisa")
	private Pesquisa pesquisa;

	public Long getIdPesquisaCampo() {
		return idPesquisaCampo;
	}

	public void setIdPesquisaCampo(Long idPesquisaCampo) {
		this.idPesquisaCampo = idPesquisaCampo;
	}

	public String getDsNome() {
		return dsNome;
	}

	public void setDsNome(String dsNome) {
		this.dsNome = dsNome;
	}

	public String getDsValor() {
		return dsValor;
	}

	public void setDsValor(String dsValor) {
		this.dsValor = dsValor;
	}

	public Pesquisa getPesquisa() {
		return pesquisa;
	}

	public void setPesquisa(Pesquisa pesquisa) {
		this.pesquisa = pesquisa;
	}
}
