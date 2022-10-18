package br.com.eleicoes.model;

public class ContasBancaria {
	private int id;
    private int anoReferencia;
    private Object prestadorConta;
    private String cnpj;
    private int nrBanco;
    private String nomeBanco;
    private int nrAgencia;
    private String nrConta;
    private Object dtAbertura;
    private double valorTotalCredito;
    private double valorTotalDebito;
    private double valorTotalSaldo;
    private String tipoConta;
    private String dsFonteOrigem;
    private String nomeExibicao;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAnoReferencia() {
		return anoReferencia;
	}
	public void setAnoReferencia(int anoReferencia) {
		this.anoReferencia = anoReferencia;
	}
	public Object getPrestadorConta() {
		return prestadorConta;
	}
	public void setPrestadorConta(Object prestadorConta) {
		this.prestadorConta = prestadorConta;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public int getNrBanco() {
		return nrBanco;
	}
	public void setNrBanco(int nrBanco) {
		this.nrBanco = nrBanco;
	}
	public String getNomeBanco() {
		return nomeBanco;
	}
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	public int getNrAgencia() {
		return nrAgencia;
	}
	public void setNrAgencia(int nrAgencia) {
		this.nrAgencia = nrAgencia;
	}
	public String getNrConta() {
		return nrConta;
	}
	public void setNrConta(String nrConta) {
		this.nrConta = nrConta;
	}
	public Object getDtAbertura() {
		return dtAbertura;
	}
	public void setDtAbertura(Object dtAbertura) {
		this.dtAbertura = dtAbertura;
	}
	public double getValorTotalCredito() {
		return valorTotalCredito;
	}
	public void setValorTotalCredito(double valorTotalCredito) {
		this.valorTotalCredito = valorTotalCredito;
	}
	public double getValorTotalDebito() {
		return valorTotalDebito;
	}
	public void setValorTotalDebito(double valorTotalDebito) {
		this.valorTotalDebito = valorTotalDebito;
	}
	public double getValorTotalSaldo() {
		return valorTotalSaldo;
	}
	public void setValorTotalSaldo(double valorTotalSaldo) {
		this.valorTotalSaldo = valorTotalSaldo;
	}
	public String getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	public String getDsFonteOrigem() {
		return dsFonteOrigem;
	}
	public void setDsFonteOrigem(String dsFonteOrigem) {
		this.dsFonteOrigem = dsFonteOrigem;
	}
	public String getNomeExibicao() {
		return nomeExibicao;
	}
	public void setNomeExibicao(String nomeExibicao) {
		this.nomeExibicao = nomeExibicao;
	}
}
