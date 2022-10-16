package br.com.eleicoes.model;

public class ContaBancariaModel {
	  private long id = 0;
	  private int anoReferencia = 0;
	  private long prestadorConta = 0;
	  private String cnpj = null;
	  private int nrBanco = 0;
	  private String nomeBanco = null;
	  private long nrAgencia = 0;
	  private String nrConta = null;
	  private long dtAbertura = 0;
	  private double valorTotalCredito = 0;
	  private double valorTotalDebito = 0;
	  private double valorTotalSaldo = 0;
	  private String tipoConta = null;
	  private String dsFonteOrigem = null;
	  private String nomeExibicao = null;


	 // Getter Methods 

	  public long getId() {
	    return id;
	  }

	  public int getAnoReferencia() {
	    return anoReferencia;
	  }

	  public long getPrestadorConta() {
	    return prestadorConta;
	  }

	  public String getCnpj() {
	    return cnpj;
	  }

	  public int getNrBanco() {
	    return nrBanco;
	  }

	  public String getNomeBanco() {
	    return nomeBanco;
	  }

	  public long getNrAgencia() {
	    return nrAgencia;
	  }

	  public String getNrConta() {
	    return nrConta;
	  }

	  public long getDtAbertura() {
	    return dtAbertura;
	  }

	  public double getValorTotalCredito() {
	    return valorTotalCredito;
	  }

	  public double getValorTotalDebito() {
	    return valorTotalDebito;
	  }

	  public double getValorTotalSaldo() {
	    return valorTotalSaldo;
	  }

	  public String getTipoConta() {
	    return tipoConta;
	  }

	  public String getDsFonteOrigem() {
	    return dsFonteOrigem;
	  }

	  public String getNomeExibicao() {
	    return nomeExibicao;
	  }

	 // Setter Methods 

	  public void setId( long id ) {
	    this.id = id;
	  }

	  public void setAnoReferencia( int anoReferencia ) {
	    this.anoReferencia = anoReferencia;
	  }

	  public void setPrestadorConta( long prestadorConta ) {
	    this.prestadorConta = prestadorConta;
	  }

	  public void setCnpj( String cnpj ) {
	    this.cnpj = cnpj;
	  }

	  public void setNrBanco( int nrBanco ) {
	    this.nrBanco = nrBanco;
	  }

	  public void setNomeBanco( String nomeBanco ) {
	    this.nomeBanco = nomeBanco;
	  }

	  public void setNrAgencia( long nrAgencia ) {
	    this.nrAgencia = nrAgencia;
	  }

	  public void setNrConta( String nrConta ) {
	    this.nrConta = nrConta;
	  }

	  public void setDtAbertura( long dtAbertura ) {
	    this.dtAbertura = dtAbertura;
	  }

	  public void setValorTotalCredito( double valorTotalCredito ) {
	    this.valorTotalCredito = valorTotalCredito;
	  }

	  public void setValorTotalDebito( double valorTotalDebito ) {
	    this.valorTotalDebito = valorTotalDebito;
	  }

	  public void setValorTotalSaldo( double valorTotalSaldo ) {
	    this.valorTotalSaldo = valorTotalSaldo;
	  }

	  public void setTipoConta( String tipoConta ) {
	    this.tipoConta = tipoConta;
	  }

	  public void setDsFonteOrigem( String dsFonteOrigem ) {
	    this.dsFonteOrigem = dsFonteOrigem;
	  }

	  public void setNomeExibicao( String nomeExibicao ) {
	    this.nomeExibicao = nomeExibicao;
	  }

	@Override
	public String toString() {
		return "ContaBancariaModel [id=" + id + ", anoReferencia=" + anoReferencia + ", prestadorConta="
				+ prestadorConta + ", cnpj=" + cnpj + ", nrBanco=" + nrBanco + ", nomeBanco=" + nomeBanco
				+ ", nrAgencia=" + nrAgencia + ", nrConta=" + nrConta + ", dtAbertura=" + dtAbertura
				+ ", valorTotalCredito=" + valorTotalCredito + ", valorTotalDebito=" + valorTotalDebito
				+ ", valorTotalSaldo=" + valorTotalSaldo + ", tipoConta=" + tipoConta + ", dsFonteOrigem="
				+ dsFonteOrigem + ", nomeExibicao=" + nomeExibicao + "]";
	}
	}
