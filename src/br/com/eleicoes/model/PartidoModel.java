package br.com.eleicoes.model;

public class PartidoModel {
	  private int numero = 0;
	  private String sigla = null;
	  private String nome = null;


	 // Getter Methods 

	  public int getNumero() {
	    return numero;
	  }

	  public String getSigla() {
	    return sigla;
	  }

	  public String getNome() {
	    return nome;
	  }

	 // Setter Methods 

	  public void setNumero( int numero ) {
	    this.numero = numero;
	  }

	  public void setSigla( String sigla ) {
	    this.sigla = sigla;
	  }

	  public void setNome( String nome ) {
	    this.nome = nome;
	  }

	@Override
	public String toString() {
		return "PartidoModel [numero=" + numero + ", sigla=" + sigla + ", nome=" + nome + "]";
	}
	}
