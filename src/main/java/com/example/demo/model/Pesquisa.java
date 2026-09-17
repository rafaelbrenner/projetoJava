package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_pesquisa", schema = "core")
public class Pesquisa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_pesquisa")
	@SequenceGenerator(name = "sq_tb_pesquisa", sequenceName = "sq_tb_pesquisa", schema = "core", allocationSize = 1)
	@Column(name = "id_pesquisa", nullable = false)
	private Long idPesquisa;

	@Column(name = "ds_nome")
	private String dsNome;

	@Column(name = "ds_descricao")
	private String dsDescricao;

	@Column(name = "ds_coluna_ordenacao")
	private String dsColunaOrdenacao;

	@Column(name = "ds_operador_logico")
	private String dsOperadorLogico;

	@Column(name = "ds_entity_list")
	private String dsEntityList;

	public Long getIdPesquisa() {
		return idPesquisa;
	}

	public void setIdPesquisa(Long idPesquisa) {
		this.idPesquisa = idPesquisa;
	}

	public String getDsNome() {
		return dsNome;
	}

	public void setDsNome(String dsNome) {
		this.dsNome = dsNome;
	}

	public String getDsDescricao() {
		return dsDescricao;
	}

	public void setDsDescricao(String dsDescricao) {
		this.dsDescricao = dsDescricao;
	}

	public String getDsColunaOrdenacao() {
		return dsColunaOrdenacao;
	}

	public void setDsColunaOrdenacao(String dsColunaOrdenacao) {
		this.dsColunaOrdenacao = dsColunaOrdenacao;
	}

	public String getDsOperadorLogico() {
		return dsOperadorLogico;
	}

	public void setDsOperadorLogico(String dsOperadorLogico) {
		this.dsOperadorLogico = dsOperadorLogico;
	}

	public String getDsEntityList() {
		return dsEntityList;
	}

	public void setDsEntityList(String dsEntityList) {
		this.dsEntityList = dsEntityList;
	}
}
