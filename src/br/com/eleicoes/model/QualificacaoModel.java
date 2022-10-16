package br.com.eleicoes.model;

public class QualificacaoModel {
	  private String membro = null;
	  private int codigoFuncao = 0;
	  private String funcao = null;
	  private String nrRegistroConselho = null;
	  private long dtGestaoInicio = 0;
	  private long dtGestaoFim = 0;


	 // Getter Methods 

	  public String getMembro() {
	    return membro;
	  }

	  public int getCodigoFuncao() {
	    return codigoFuncao;
	  }

	  public String getFuncao() {
	    return funcao;
	  }

	  public String getNrRegistroConselho() {
	    return nrRegistroConselho;
	  }

	  public long getDtGestaoInicio() {
	    return dtGestaoInicio;
	  }

	  public long getDtGestaoFim() {
	    return dtGestaoFim;
	  }

	 // Setter Methods 

	  public void setMembro( String membro ) {
	    this.membro = membro;
	  }

	  public void setCodigoFuncao( int codigoFuncao ) {
	    this.codigoFuncao = codigoFuncao;
	  }

	  public void setFuncao( String funcao ) {
	    this.funcao = funcao;
	  }

	  public void setNrRegistroConselho( String nrRegistroConselho ) {
	    this.nrRegistroConselho = nrRegistroConselho;
	  }

	  public void setDtGestaoInicio( long dtGestaoInicio ) {
	    this.dtGestaoInicio = dtGestaoInicio;
	  }

	  public void setDtGestaoFim( long dtGestaoFim ) {
	    this.dtGestaoFim = dtGestaoFim;
	  }

	@Override
	public String toString() {
		return "QualificacaoModel [membro=" + membro + ", codigoFuncao=" + codigoFuncao + ", funcao=" + funcao
				+ ", nrRegistroConselho=" + nrRegistroConselho + ", dtGestaoInicio=" + dtGestaoInicio + ", dtGestaoFim="
				+ dtGestaoFim + "]";
	}
	}
