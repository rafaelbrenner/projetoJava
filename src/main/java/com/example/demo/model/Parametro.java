package com.example.demo.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_parametro", schema = "core")
public class Parametro implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_parametro")
	@SequenceGenerator(name = "sq_tb_parametro", sequenceName = "sq_tb_parametro", schema = "core", allocationSize = 1)
	@Column(name = "id_parametro", nullable = false)
	private Long idParametro;

	@Column(name = "nm_variavel")
	private String nmVariavel;

	@Column(name = "ds_variavel")
	private String dsVariavel;

	@Column(name = "vl_variavel")
	private String vlVariavel;

	@Column(name = "dt_atualizacao")
	private LocalDateTime dtAtualizacao;

	@Column(name = "in_sistema")
	private Boolean inSistema;

	@Column(name = "in_ativo")
	private Boolean inAtivo;

	@Column(name = "ds_esquema_tabela_id")
	private String dsEsquemaTabelaId;

	@Column(name = "in_dados_sensiveis")
	private Boolean inDadosSensiveis = true;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario_modificacao")
	private Usuario usuarioModificacao;

	public Long getIdParametro() {
		return idParametro;
	}

	public void setIdParametro(Long idParametro) {
		this.idParametro = idParametro;
	}

	public String getNmVariavel() {
		return nmVariavel;
	}

	public void setNmVariavel(String nmVariavel) {
		this.nmVariavel = nmVariavel;
	}

	public String getDsVariavel() {
		return dsVariavel;
	}

	public void setDsVariavel(String dsVariavel) {
		this.dsVariavel = dsVariavel;
	}

	public String getVlVariavel() {
		return vlVariavel;
	}

	public void setVlVariavel(String vlVariavel) {
		this.vlVariavel = vlVariavel;
	}

	public LocalDateTime getDtAtualizacao() {
		return dtAtualizacao;
	}

	public void setDtAtualizacao(LocalDateTime dtAtualizacao) {
		this.dtAtualizacao = dtAtualizacao;
	}

	public Boolean getInSistema() {
		return inSistema;
	}

	public void setInSistema(Boolean inSistema) {
		this.inSistema = inSistema;
	}

	public Boolean getInAtivo() {
		return inAtivo;
	}

	public void setInAtivo(Boolean inAtivo) {
		this.inAtivo = inAtivo;
	}

	public String getDsEsquemaTabelaId() {
		return dsEsquemaTabelaId;
	}

	public void setDsEsquemaTabelaId(String dsEsquemaTabelaId) {
		this.dsEsquemaTabelaId = dsEsquemaTabelaId;
	}

	public Boolean getInDadosSensiveis() {
		return inDadosSensiveis;
	}

	public void setInDadosSensiveis(Boolean inDadosSensiveis) {
		this.inDadosSensiveis = inDadosSensiveis;
	}

	public Usuario getUsuarioModificacao() {
		return usuarioModificacao;
	}

	public void setUsuarioModificacao(Usuario usuarioModificacao) {
		this.usuarioModificacao = usuarioModificacao;
	}
}
