package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_jbpm_variavel_label", schema = "core")
public class JbpmVariavelLabel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_jbpm_variavel_label")
	@SequenceGenerator(name = "sq_tb_jbpm_variavel_label", sequenceName = "sq_tb_jbpm_variavel_label", schema = "core", allocationSize = 1)
	@Column(name = "id_jbpm_variavel_label", nullable = false)
	private Long idJbpmVariavelLabel;

	@Column(name = "nm_variavel")
	private String nmVariavel;

	@Column(name = "ds_label_variavel")
	private String dsLabelVariavel;

	@Column(name = "ds_nome_tarefa")
	private String dsNomeTarefa;

	@Column(name = "ds_nome_fluxo")
	private String dsNomeFluxo;

	public Long getIdJbpmVariavelLabel() {
		return idJbpmVariavelLabel;
	}

	public void setIdJbpmVariavelLabel(Long idJbpmVariavelLabel) {
		this.idJbpmVariavelLabel = idJbpmVariavelLabel;
	}

	public String getNmVariavel() {
		return nmVariavel;
	}

	public void setNmVariavel(String nmVariavel) {
		this.nmVariavel = nmVariavel;
	}

	public String getDsLabelVariavel() {
		return dsLabelVariavel;
	}

	public void setDsLabelVariavel(String dsLabelVariavel) {
		this.dsLabelVariavel = dsLabelVariavel;
	}

	public String getDsNomeTarefa() {
		return dsNomeTarefa;
	}

	public void setDsNomeTarefa(String dsNomeTarefa) {
		this.dsNomeTarefa = dsNomeTarefa;
	}

	public String getDsNomeFluxo() {
		return dsNomeFluxo;
	}

	public void setDsNomeFluxo(String dsNomeFluxo) {
		this.dsNomeFluxo = dsNomeFluxo;
	}
}
