package br.com.eleicoes.model;

public class DespesaModel {
	  private String dsDRD = null;
	  private String qtdeDespesas = null;
	  private double valor = 0;


	 // Getter Methods 

	  public String getDsDRD() {
	    return dsDRD;
	  }

	  public String getQtdeDespesas() {
	    return qtdeDespesas;
	  }

	  public double getValor() {
	    return valor;
	  }

	 // Setter Methods 

	  public void setDsDRD( String dsDRD ) {
	    this.dsDRD = dsDRD;
	  }

	  public void setQtdeDespesas( String qtdeDespesas ) {
	    this.qtdeDespesas = qtdeDespesas;
	  }

	  public void setValor( double valor ) {
	    this.valor = valor;
	  }

	@Override
	public String toString() {
		return "DespesaModel [dsDRD=" + dsDRD + ", qtdeDespesas=" + qtdeDespesas + ", valor=" + valor + "]";
	}
	}
