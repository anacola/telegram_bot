package br.com.eleicoes.model;

public class FornecedorModel {
	  private String cpfCnpj = null;
	  private String nome = null;
	  private String qntd = null;
	  private double valor = 0;
	  private String stFinanciamentoColetivo = null;


	 // Getter Methods 

	  public String getCpfCnpj() {
	    return cpfCnpj;
	  }

	  public String getNome() {
	    return nome;
	  }

	  public String getQntd() {
	    return qntd;
	  }

	  public double getValor() {
	    return valor;
	  }

	  public String getStFinanciamentoColetivo() {
	    return stFinanciamentoColetivo;
	  }

	 // Setter Methods 

	  public void setCpfCnpj( String cpfCnpj ) {
	    this.cpfCnpj = cpfCnpj;
	  }

	  public void setNome( String nome ) {
	    this.nome = nome;
	  }

	  public void setQntd( String qntd ) {
	    this.qntd = qntd;
	  }

	  public void setValor( double valor ) {
	    this.valor = valor;
	  }

	  public void setStFinanciamentoColetivo( String stFinanciamentoColetivo ) {
	    this.stFinanciamentoColetivo = stFinanciamentoColetivo;
	  }

	@Override
	public String toString() {
		return "FornecedorModel [cpfCnpj=" + cpfCnpj + ", nome=" + nome + ", qntd=" + qntd + ", valor=" + valor
				+ ", stFinanciamentoColetivo=" + stFinanciamentoColetivo + "]";
	}
	}