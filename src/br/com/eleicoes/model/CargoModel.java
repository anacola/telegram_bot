package br.com.eleicoes.model;

public class CargoModel {
	  private int codigo = 0;
	  private String sigla = null;
	  private String nome = null;
	  private int codSuperior = 0;
	  private boolean titular;
	  private int contagem = 0;


	 // Getter Methods 

	  public int getCodigo() {
	    return codigo;
	  }

	  public String getSigla() {
	    return sigla;
	  }

	  public String getNome() {
	    return nome;
	  }

	  public int getCodSuperior() {
	    return codSuperior;
	  }

	  public boolean getTitular() {
	    return titular;
	  }

	  public int getContagem() {
	    return contagem;
	  }

	 // Setter Methods 

	  public void setCodigo( int codigo ) {
	    this.codigo = codigo;
	  }

	  public void setSigla( String sigla ) {
	    this.sigla = sigla;
	  }

	  public void setNome( String nome ) {
	    this.nome = nome;
	  }

	  public void setCodSuperior( int codSuperior ) {
	    this.codSuperior = codSuperior;
	  }

	  public void setTitular( boolean titular ) {
	    this.titular = titular;
	  }

	  public void setContagem( int contagem ) {
	    this.contagem = contagem;
	  }

	@Override
	public String toString() {
		return "CargoModel [codigo=" + codigo + ", sigla=" + sigla + ", nome=" + nome + ", codSuperior=" + codSuperior
				+ ", titular=" + titular + ", contagem=" + contagem + "]";
	}
	}
