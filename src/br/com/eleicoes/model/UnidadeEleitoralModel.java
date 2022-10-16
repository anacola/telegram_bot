package br.com.eleicoes.model;

public class UnidadeEleitoralModel {
	  private String id = null;
	  private String sigla = null;
	  private String nome = null;
	  private String regiao = null;
	  private String cargos = null;
	  private String diretorios = null;
	  private String codigo = null;
	  private boolean capital;
	  private String estado = null;


	 // Getter Methods 

	  public String getId() {
	    return id;
	  }

	  public String getSigla() {
	    return sigla;
	  }

	  public String getNome() {
	    return nome;
	  }

	  public String getRegiao() {
	    return regiao;
	  }

	  public String getCargos() {
	    return cargos;
	  }

	  public String getDiretorios() {
	    return diretorios;
	  }

	  public String getCodigo() {
	    return codigo;
	  }

	  public boolean getCapital() {
	    return capital;
	  }

	  public String getEstado() {
	    return estado;
	  }

	 // Setter Methods 

	  public void setId( String id ) {
	    this.id = id;
	  }

	  public void setSigla( String sigla ) {
	    this.sigla = sigla;
	  }

	  public void setNome( String nome ) {
	    this.nome = nome;
	  }

	  public void setRegiao( String regiao ) {
	    this.regiao = regiao;
	  }

	  public void setCargos( String cargos ) {
	    this.cargos = cargos;
	  }

	  public void setDiretorios( String diretorios ) {
	    this.diretorios = diretorios;
	  }

	  public void setCodigo( String codigo ) {
	    this.codigo = codigo;
	  }

	  public void setCapital( boolean capital ) {
	    this.capital = capital;
	  }

	  public void setEstado( String estado ) {
	    this.estado = estado;
	  }

	@Override
	public String toString() {
		return "UnidadeEleitoralModel [id=" + id + ", sigla=" + sigla + ", nome=" + nome + ", regiao=" + regiao
				+ ", cargos=" + cargos + ", diretorios=" + diretorios + ", codigo=" + codigo + ", capital=" + capital
				+ ", estado=" + estado + "]";
	}
	}
