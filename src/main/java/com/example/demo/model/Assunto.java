package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_assunto", schema = "core")
public class Assunto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_assunto")
	@SequenceGenerator(name = "sq_tb_assunto", sequenceName = "sq_tb_assunto", schema = "core", allocationSize = 1)
	@Column(name = "id_assunto", nullable = false)
	private Long idAssunto;

	@Column(name = "cd_assunto")
	private String cdAssunto;

	@Column(name = "ds_assunto")
	private String dsAssunto;

	@Column(name = "in_ativo")
	private Boolean inAtivo;

	@Column(name = "ds_caminho_completo")
	private String dsCaminhoCompleto;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_assunto_pai")
	private Assunto assuntoPai;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_fluxo")
	private Fluxo fluxo;

	public Long getIdAssunto() {
		return idAssunto;
	}

	public void setIdAssunto(Long idAssunto) {
		this.idAssunto = idAssunto;
	}

	public String getCdAssunto() {
		return cdAssunto;
	}

	public void setCdAssunto(String cdAssunto) {
		this.cdAssunto = cdAssunto;
	}

	public String getDsAssunto() {
		return dsAssunto;
	}

	public void setDsAssunto(String dsAssunto) {
		this.dsAssunto = dsAssunto;
	}

	public Boolean getInAtivo() {
		return inAtivo;
	}

	public void setInAtivo(Boolean inAtivo) {
		this.inAtivo = inAtivo;
	}

	public String getDsCaminhoCompleto() {
		return dsCaminhoCompleto;
	}

	public void setDsCaminhoCompleto(String dsCaminhoCompleto) {
		this.dsCaminhoCompleto = dsCaminhoCompleto;
	}

	public Assunto getAssuntoPai() {
		return assuntoPai;
	}

	public void setAssuntoPai(Assunto assuntoPai) {
		this.assuntoPai = assuntoPai;
	}

	public Fluxo getFluxo() {
		return fluxo;
	}

	public void setFluxo(Fluxo fluxo) {
		this.fluxo = fluxo;
	}
}
