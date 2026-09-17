package com.example.demo.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_processo_conexao", schema = "core")
@IdClass(ProcessoConexao.Id.class)
public class ProcessoConexao implements Serializable {

	private static final long serialVersionUID = 1L;

	@jakarta.persistence.Id
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "id_processo", nullable = false)
	private Processo processo;

	@jakarta.persistence.Id
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "id_processo_conexao", nullable = false)
	private Processo processoConexao;

	@Column(name = "dt_processo_conexao")
	private LocalDateTime dtProcessoConexao;

	public Processo getProcesso() {
		return processo;
	}

	public void setProcesso(Processo processo) {
		this.processo = processo;
	}

	public Processo getProcessoConexao() {
		return processoConexao;
	}

	public void setProcessoConexao(Processo processoConexao) {
		this.processoConexao = processoConexao;
	}

	public LocalDateTime getDtProcessoConexao() {
		return dtProcessoConexao;
	}

	public void setDtProcessoConexao(LocalDateTime dtProcessoConexao) {
		this.dtProcessoConexao = dtProcessoConexao;
	}

	public static class Id implements Serializable {

		private static final long serialVersionUID = 1L;

		private Long processo;
		private Long processoConexao;

		public Id() {
		}

		public Id(Long processo, Long processoConexao) {
			this.processo = processo;
			this.processoConexao = processoConexao;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (!(o instanceof Id other)) return false;
			return Objects.equals(processo, other.processo)
					&& Objects.equals(processoConexao, other.processoConexao);
		}

		@Override
		public int hashCode() {
			return Objects.hash(processo, processoConexao);
		}
	}
}
