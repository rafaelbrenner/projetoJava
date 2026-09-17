package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_evento_agrupamento", schema = "core")
public class EventoAgrupamento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_evento_agrupamento")
	@SequenceGenerator(name = "sq_tb_evento_agrupamento", sequenceName = "sq_tb_evento_agrupamento", schema = "core", allocationSize = 1)
	@Column(name = "id_evento_agrupamento", nullable = false)
	private Long idEventoAgrupamento;

	@Column(name = "in_multiplo")
	private Boolean inMultiplo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_evento")
	private Evento evento;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_agrupamento")
	private Agrupamento agrupamento;

	public Long getIdEventoAgrupamento() {
		return idEventoAgrupamento;
	}

	public void setIdEventoAgrupamento(Long idEventoAgrupamento) {
		this.idEventoAgrupamento = idEventoAgrupamento;
	}

	public Boolean getInMultiplo() {
		return inMultiplo;
	}

	public void setInMultiplo(Boolean inMultiplo) {
		this.inMultiplo = inMultiplo;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public Agrupamento getAgrupamento() {
		return agrupamento;
	}

	public void setAgrupamento(Agrupamento agrupamento) {
		this.agrupamento = agrupamento;
	}
}
