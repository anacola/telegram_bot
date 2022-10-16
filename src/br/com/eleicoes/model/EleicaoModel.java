package br.com.eleicoes.model;

public class EleicaoModel {
	  private long id = 0;
	  private String siglaUF = null;
	  private String localidadeSgUe = null;
	  private int ano = 0;
	  private String codigo = null;
	  private String nomeEleicao = null;
	  private String tipoEleicao = null;
	  private String turno = null;
	  private String tipoAbrangencia = null;
	  private String dataEleicao = null;
	  private String codSituacaoEleicao = null;
	  private String descricaoSituacaoEleicao = null;
	  private String descricaoEleicao = null;


	 // Getter Methods 

	  public long getId() {
	    return id;
	  }

	  public String getSiglaUF() {
	    return siglaUF;
	  }

	  public String getLocalidadeSgUe() {
	    return localidadeSgUe;
	  }

	  public int getAno() {
	    return ano;
	  }

	  public String getCodigo() {
	    return codigo;
	  }

	  public String getNomeEleicao() {
	    return nomeEleicao;
	  }

	  public String getTipoEleicao() {
	    return tipoEleicao;
	  }

	  public String getTurno() {
	    return turno;
	  }

	  public String getTipoAbrangencia() {
	    return tipoAbrangencia;
	  }

	  public String getDataEleicao() {
	    return dataEleicao;
	  }

	  public String getCodSituacaoEleicao() {
	    return codSituacaoEleicao;
	  }

	  public String getDescricaoSituacaoEleicao() {
	    return descricaoSituacaoEleicao;
	  }

	  public String getDescricaoEleicao() {
	    return descricaoEleicao;
	  }

	 // Setter Methods 

	  public void setId( long id ) {
	    this.id = id;
	  }

	  public void setSiglaUF( String siglaUF ) {
	    this.siglaUF = siglaUF;
	  }

	  public void setLocalidadeSgUe( String localidadeSgUe ) {
	    this.localidadeSgUe = localidadeSgUe;
	  }

	  public void setAno( int ano ) {
	    this.ano = ano;
	  }

	  public void setCodigo( String codigo ) {
	    this.codigo = codigo;
	  }

	  public void setNomeEleicao( String nomeEleicao ) {
	    this.nomeEleicao = nomeEleicao;
	  }

	  public void setTipoEleicao( String tipoEleicao ) {
	    this.tipoEleicao = tipoEleicao;
	  }

	  public void setTurno( String turno ) {
	    this.turno = turno;
	  }

	  public void setTipoAbrangencia( String tipoAbrangencia ) {
	    this.tipoAbrangencia = tipoAbrangencia;
	  }

	  public void setDataEleicao( String dataEleicao ) {
	    this.dataEleicao = dataEleicao;
	  }

	  public void setCodSituacaoEleicao( String codSituacaoEleicao ) {
	    this.codSituacaoEleicao = codSituacaoEleicao;
	  }

	  public void setDescricaoSituacaoEleicao( String descricaoSituacaoEleicao ) {
	    this.descricaoSituacaoEleicao = descricaoSituacaoEleicao;
	  }

	  public void setDescricaoEleicao( String descricaoEleicao ) {
	    this.descricaoEleicao = descricaoEleicao;
	  }

	@Override
	public String toString() {
		return "EleicaoModel [id=" + id + ", siglaUF=" + siglaUF + ", localidadeSgUe=" + localidadeSgUe + ", ano=" + ano
				+ ", codigo=" + codigo + ", nomeEleicao=" + nomeEleicao + ", tipoEleicao=" + tipoEleicao + ", turno="
				+ turno + ", tipoAbrangencia=" + tipoAbrangencia + ", dataEleicao=" + dataEleicao
				+ ", codSituacaoEleicao=" + codSituacaoEleicao + ", descricaoSituacaoEleicao="
				+ descricaoSituacaoEleicao + ", descricaoEleicao=" + descricaoEleicao + "]";
	}
	}
