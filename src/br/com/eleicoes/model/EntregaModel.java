package br.com.eleicoes.model;

public class EntregaModel {
	  private String dataEntrega = null;
	  private String tipo = null;
	  private String retificadora = null;
	  private String numeroControle = null;
	  private String idEntrega = null;
	  private boolean isCompare;


	 // Getter Methods 

	  public String getDataEntrega() {
	    return dataEntrega;
	  }

	  public String getTipo() {
	    return tipo;
	  }

	  public String getRetificadora() {
	    return retificadora;
	  }

	  public String getNumeroControle() {
	    return numeroControle;
	  }

	  public String getIdEntrega() {
	    return idEntrega;
	  }

	  public boolean getIsCompare() {
	    return isCompare;
	  }

	 // Setter Methods 

	  public void setDataEntrega( String dataEntrega ) {
	    this.dataEntrega = dataEntrega;
	  }

	  public void setTipo( String tipo ) {
	    this.tipo = tipo;
	  }

	  public void setRetificadora( String retificadora ) {
	    this.retificadora = retificadora;
	  }

	  public void setNumeroControle( String numeroControle ) {
	    this.numeroControle = numeroControle;
	  }

	  public void setIdEntrega( String idEntrega ) {
	    this.idEntrega = idEntrega;
	  }

	  public void setIsCompare( boolean isCompare ) {
	    this.isCompare = isCompare;
	  }

	@Override
	public String toString() {
		return "EntregaModel [dataEntrega=" + dataEntrega + ", tipo=" + tipo + ", retificadora=" + retificadora
				+ ", numeroControle=" + numeroControle + ", idEntrega=" + idEntrega + ", isCompare=" + isCompare + "]";
	}
	}
