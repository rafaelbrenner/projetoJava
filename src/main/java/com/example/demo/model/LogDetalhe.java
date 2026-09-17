package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_log_detalhe", schema = "core")
public class LogDetalhe implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_log_detalhe")
	@SequenceGenerator(name = "sq_tb_log_detalhe", sequenceName = "sq_tb_log_detalhe", schema = "core", allocationSize = 1)
	@Column(name = "id_log_detalhe", nullable = false)
	private Long idLogDetalhe;

	@Column(name = "nm_atributo")
	private String nmAtributo;

	@Column(name = "ds_valor_anterior")
	private String dsValorAnterior;

	@Column(name = "ds_valor_atual")
	private String dsValorAtual;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_log")
	private Log log;

	public Long getIdLogDetalhe() {
		return idLogDetalhe;
	}

	public void setIdLogDetalhe(Long idLogDetalhe) {
		this.idLogDetalhe = idLogDetalhe;
	}

	public String getNmAtributo() {
		return nmAtributo;
	}

	public void setNmAtributo(String nmAtributo) {
		this.nmAtributo = nmAtributo;
	}

	public String getDsValorAnterior() {
		return dsValorAnterior;
	}

	public void setDsValorAnterior(String dsValorAnterior) {
		this.dsValorAnterior = dsValorAnterior;
	}

	public String getDsValorAtual() {
		return dsValorAtual;
	}

	public void setDsValorAtual(String dsValorAtual) {
		this.dsValorAtual = dsValorAtual;
	}

	public Log getLog() {
		return log;
	}

	public void setLog(Log log) {
		this.log = log;
	}
}
