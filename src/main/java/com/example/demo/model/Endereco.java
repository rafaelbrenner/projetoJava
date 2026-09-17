package com.example.demo.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_endereco", schema = "core")
public class Endereco implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_endereco")
	@SequenceGenerator(name = "sq_tb_endereco", sequenceName = "sq_tb_endereco", schema = "core", allocationSize = 1)
	@Column(name = "id_endereco", nullable = false)
	private Long idEndereco;

	@Column(name = "nm_logradouro")
	private String nmLogradouro;

	@Column(name = "nr_endereco")
	private String nrEndereco;

	@Column(name = "ds_complemento")
	private String dsComplemento;

	@Column(name = "nm_bairro")
	private String nmBairro;

	@Column(name = "nm_cidade")
	private String nmCidade;

	@Column(name = "cd_uf")
	private String cdUf;

	@Column(name = "in_correspondencia")
	private Boolean inCorrespondencia;

	@Column(name = "dt_alteracao_endereco")
	private LocalDateTime dtAlteracaoEndereco;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_cep")
	private Cep cep;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario_cadastrador")
	private Usuario usuarioCadastrador;

	public Long getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Long idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getNmLogradouro() {
		return nmLogradouro;
	}

	public void setNmLogradouro(String nmLogradouro) {
		this.nmLogradouro = nmLogradouro;
	}

	public String getNrEndereco() {
		return nrEndereco;
	}

	public void setNrEndereco(String nrEndereco) {
		this.nrEndereco = nrEndereco;
	}

	public String getDsComplemento() {
		return dsComplemento;
	}

	public void setDsComplemento(String dsComplemento) {
		this.dsComplemento = dsComplemento;
	}

	public String getNmBairro() {
		return nmBairro;
	}

	public void setNmBairro(String nmBairro) {
		this.nmBairro = nmBairro;
	}

	public String getNmCidade() {
		return nmCidade;
	}

	public void setNmCidade(String nmCidade) {
		this.nmCidade = nmCidade;
	}

	public String getCdUf() {
		return cdUf;
	}

	public void setCdUf(String cdUf) {
		this.cdUf = cdUf;
	}

	public Boolean getInCorrespondencia() {
		return inCorrespondencia;
	}

	public void setInCorrespondencia(Boolean inCorrespondencia) {
		this.inCorrespondencia = inCorrespondencia;
	}

	public LocalDateTime getDtAlteracaoEndereco() {
		return dtAlteracaoEndereco;
	}

	public void setDtAlteracaoEndereco(LocalDateTime dtAlteracaoEndereco) {
		this.dtAlteracaoEndereco = dtAlteracaoEndereco;
	}

	public Cep getCep() {
		return cep;
	}

	public void setCep(Cep cep) {
		this.cep = cep;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Usuario getUsuarioCadastrador() {
		return usuarioCadastrador;
	}

	public void setUsuarioCadastrador(Usuario usuarioCadastrador) {
		this.usuarioCadastrador = usuarioCadastrador;
	}
}
