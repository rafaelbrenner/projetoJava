package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_evento", schema = "core")
public class Evento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_evento")
	@SequenceGenerator(name = "sq_tb_evento", sequenceName = "sq_tb_evento", schema = "core", allocationSize = 1)
	@Column(name = "id_evento", nullable = false)
	private Long idEvento;

	@Column(name = "ds_evento")
	private String dsEvento;

	@Column(name = "ds_observacao")
	private String dsObservacao;

	@Column(name = "in_ativo")
	private Boolean inAtivo;

	@Column(name = "ds_caminho_completo")
	private String dsCaminhoCompleto;

	@Column(name = "cd_evento")
	private String cdEvento;

	@Column(name = "cd_evento_outro")
	private String cdEventoOutro;

	@Column(name = "ds_movimento")
	private String dsMovimento;

	@Column(name = "in_complementar")
	private Boolean inComplementar;

	@Column(name = "ds_norma")
	private String dsNorma;

	@Column(name = "ds_lei")
	private String dsLei;

	@Column(name = "ds_lei_artigo")
	private String dsLeiArtigo;

	@Column(name = "in_segredo_justica")
	private Boolean inSegredoJustica;

	@Column(name = "in_visibilidade_externa")
	private Boolean inVisibilidadeExterna;

	@Column(name = "ds_glossario")
	private String dsGlossario;

	@Column(name = "ds_evento_completo")
	private String dsEventoCompleto;

	@Column(name = "ds_complemento")
	private String dsComplemento;

	@Column(name = "in_eletronico")
	private Boolean inEletronico;

	@Column(name = "in_papel")
	private Boolean inPapel;

	@Column(name = "in_permite_lancar_lote")
	private Boolean inPermiteLancarLote;

	@Column(name = "breadcrumb")
	private String breadcrumb;

	@Column(name = "in_padrao_sgt")
	private Boolean inPadraoSgt = false;

	@Column(name = "ds_motivo_inativacao")
	private String dsMotivoInativacao;

	@Column(name = "nr_faixa_inferior")
	private Integer nrFaixaInferior;

	@Column(name = "nr_faixa_superior")
	private Integer nrFaixaSuperior;

	@Column(name = "nr_nivel")
	private Integer nrNivel;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_evento_superior")
	private Evento eventoSuperior;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_status")
	private Status status;

	public Long getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(Long idEvento) {
		this.idEvento = idEvento;
	}

	public String getDsEvento() {
		return dsEvento;
	}

	public void setDsEvento(String dsEvento) {
		this.dsEvento = dsEvento;
	}

	public String getDsObservacao() {
		return dsObservacao;
	}

	public void setDsObservacao(String dsObservacao) {
		this.dsObservacao = dsObservacao;
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

	public String getCdEvento() {
		return cdEvento;
	}

	public void setCdEvento(String cdEvento) {
		this.cdEvento = cdEvento;
	}

	public String getCdEventoOutro() {
		return cdEventoOutro;
	}

	public void setCdEventoOutro(String cdEventoOutro) {
		this.cdEventoOutro = cdEventoOutro;
	}

	public String getDsMovimento() {
		return dsMovimento;
	}

	public void setDsMovimento(String dsMovimento) {
		this.dsMovimento = dsMovimento;
	}

	public Boolean getInComplementar() {
		return inComplementar;
	}

	public void setInComplementar(Boolean inComplementar) {
		this.inComplementar = inComplementar;
	}

	public String getDsNorma() {
		return dsNorma;
	}

	public void setDsNorma(String dsNorma) {
		this.dsNorma = dsNorma;
	}

	public String getDsLei() {
		return dsLei;
	}

	public void setDsLei(String dsLei) {
		this.dsLei = dsLei;
	}

	public String getDsLeiArtigo() {
		return dsLeiArtigo;
	}

	public void setDsLeiArtigo(String dsLeiArtigo) {
		this.dsLeiArtigo = dsLeiArtigo;
	}

	public Boolean getInSegredoJustica() {
		return inSegredoJustica;
	}

	public void setInSegredoJustica(Boolean inSegredoJustica) {
		this.inSegredoJustica = inSegredoJustica;
	}

	public Boolean getInVisibilidadeExterna() {
		return inVisibilidadeExterna;
	}

	public void setInVisibilidadeExterna(Boolean inVisibilidadeExterna) {
		this.inVisibilidadeExterna = inVisibilidadeExterna;
	}

	public String getDsGlossario() {
		return dsGlossario;
	}

	public void setDsGlossario(String dsGlossario) {
		this.dsGlossario = dsGlossario;
	}

	public String getDsEventoCompleto() {
		return dsEventoCompleto;
	}

	public void setDsEventoCompleto(String dsEventoCompleto) {
		this.dsEventoCompleto = dsEventoCompleto;
	}

	public String getDsComplemento() {
		return dsComplemento;
	}

	public void setDsComplemento(String dsComplemento) {
		this.dsComplemento = dsComplemento;
	}

	public Boolean getInEletronico() {
		return inEletronico;
	}

	public void setInEletronico(Boolean inEletronico) {
		this.inEletronico = inEletronico;
	}

	public Boolean getInPapel() {
		return inPapel;
	}

	public void setInPapel(Boolean inPapel) {
		this.inPapel = inPapel;
	}

	public Boolean getInPermiteLancarLote() {
		return inPermiteLancarLote;
	}

	public void setInPermiteLancarLote(Boolean inPermiteLancarLote) {
		this.inPermiteLancarLote = inPermiteLancarLote;
	}

	public String getBreadcrumb() {
		return breadcrumb;
	}

	public void setBreadcrumb(String breadcrumb) {
		this.breadcrumb = breadcrumb;
	}

	public Boolean getInPadraoSgt() {
		return inPadraoSgt;
	}

	public void setInPadraoSgt(Boolean inPadraoSgt) {
		this.inPadraoSgt = inPadraoSgt;
	}

	public String getDsMotivoInativacao() {
		return dsMotivoInativacao;
	}

	public void setDsMotivoInativacao(String dsMotivoInativacao) {
		this.dsMotivoInativacao = dsMotivoInativacao;
	}

	public Integer getNrFaixaInferior() {
		return nrFaixaInferior;
	}

	public void setNrFaixaInferior(Integer nrFaixaInferior) {
		this.nrFaixaInferior = nrFaixaInferior;
	}

	public Integer getNrFaixaSuperior() {
		return nrFaixaSuperior;
	}

	public void setNrFaixaSuperior(Integer nrFaixaSuperior) {
		this.nrFaixaSuperior = nrFaixaSuperior;
	}

	public Integer getNrNivel() {
		return nrNivel;
	}

	public void setNrNivel(Integer nrNivel) {
		this.nrNivel = nrNivel;
	}

	public Evento getEventoSuperior() {
		return eventoSuperior;
	}

	public void setEventoSuperior(Evento eventoSuperior) {
		this.eventoSuperior = eventoSuperior;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
}
