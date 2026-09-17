package com.example.demo.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_variavel_fluxo", schema = "core")
@IdClass(VariavelFluxo.Id.class)
public class VariavelFluxo implements Serializable {

	private static final long serialVersionUID = 1L;

	@jakarta.persistence.Id
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "id_fluxo", nullable = false)
	private Fluxo fluxo;

	@jakarta.persistence.Id
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "id_variavel", nullable = false)
	private Variavel variavel;

	public Fluxo getFluxo() {
		return fluxo;
	}

	public void setFluxo(Fluxo fluxo) {
		this.fluxo = fluxo;
	}

	public Variavel getVariavel() {
		return variavel;
	}

	public void setVariavel(Variavel variavel) {
		this.variavel = variavel;
	}

	public static class Id implements Serializable {

		private static final long serialVersionUID = 1L;

		private Long fluxo;
		private Long variavel;

		public Id() {
		}

		public Id(Long fluxo, Long variavel) {
			this.fluxo = fluxo;
			this.variavel = variavel;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (!(o instanceof Id other)) return false;
			return Objects.equals(fluxo, other.fluxo)
					&& Objects.equals(variavel, other.variavel);
		}

		@Override
		public int hashCode() {
			return Objects.hash(fluxo, variavel);
		}
	}
}
