package br.com.eleicoes.model;

/**
 * Classe ContasBancaria.
 */
public class ContasBancaria {
	
	/** id. */
	private int id;
    
    /** ano referencia. */
    private int anoReferencia;
    
    /** prestador conta. */
    private Object prestadorConta;
    
    /** cnpj. */
    private String cnpj;
    
    /** nr banco. */
    private int nrBanco;
    
    /** nome banco. */
    private String nomeBanco;
    
    /** nr agencia. */
    private int nrAgencia;
    
    /** nr conta. */
    private String nrConta;
    
    /** dt abertura. */
    private Object dtAbertura;
    
    /** valor total credito. */
    private double valorTotalCredito;
    
    /** valor total debito. */
    private double valorTotalDebito;
    
    /** valor total saldo. */
    private double valorTotalSaldo;
    
    /** tipo conta. */
    private String tipoConta;
    
    /** ds fonte origem. */
    private String dsFonteOrigem;
    
    /** nome exibicao. */
    private String nomeExibicao;
    
	/**
	 * Gets id.
	 *
	 * @return id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Sets id.
	 *
	 * @param id new id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Gets ano referencia.
	 *
	 * @return ano referencia
	 */
	public int getAnoReferencia() {
		return anoReferencia;
	}
	
	/**
	 * Sets ano referencia.
	 *
	 * @param anoReferencia new ano referencia
	 */
	public void setAnoReferencia(int anoReferencia) {
		this.anoReferencia = anoReferencia;
	}
	
	/**
	 * Gets prestador conta.
	 *
	 * @return prestador conta
	 */
	public Object getPrestadorConta() {
		return prestadorConta;
	}
	
	/**
	 * Sets prestador conta.
	 *
	 * @param prestadorConta new prestador conta
	 */
	public void setPrestadorConta(Object prestadorConta) {
		this.prestadorConta = prestadorConta;
	}
	
	/**
	 * Gets cnpj.
	 *
	 * @return cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}
	
	/**
	 * Sets cnpj.
	 *
	 * @param cnpj new cnpj
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	/**
	 * Gets nr banco.
	 *
	 * @return nr banco
	 */
	public int getNrBanco() {
		return nrBanco;
	}
	
	/**
	 * Sets nr banco.
	 *
	 * @param nrBanco new nr banco
	 */
	public void setNrBanco(int nrBanco) {
		this.nrBanco = nrBanco;
	}
	
	/**
	 * Gets nome banco.
	 *
	 * @return nome banco
	 */
	public String getNomeBanco() {
		return nomeBanco;
	}
	
	/**
	 * Sets nome banco.
	 *
	 * @param nomeBanco new nome banco
	 */
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	
	/**
	 * Gets nr agencia.
	 *
	 * @return nr agencia
	 */
	public int getNrAgencia() {
		return nrAgencia;
	}
	
	/**
	 * Sets nr agencia.
	 *
	 * @param nrAgencia new nr agencia
	 */
	public void setNrAgencia(int nrAgencia) {
		this.nrAgencia = nrAgencia;
	}
	
	/**
	 * Gets nr conta.
	 *
	 * @return nr conta
	 */
	public String getNrConta() {
		return nrConta;
	}
	
	/**
	 * Sets nr conta.
	 *
	 * @param nrConta new nr conta
	 */
	public void setNrConta(String nrConta) {
		this.nrConta = nrConta;
	}
	
	/**
	 * Gets dt abertura.
	 *
	 * @return dt abertura
	 */
	public Object getDtAbertura() {
		return dtAbertura;
	}
	
	/**
	 * Sets dt abertura.
	 *
	 * @param dtAbertura new dt abertura
	 */
	public void setDtAbertura(Object dtAbertura) {
		this.dtAbertura = dtAbertura;
	}
	
	/**
	 * Gets valor total credito.
	 *
	 * @return valor total credito
	 */
	public double getValorTotalCredito() {
		return valorTotalCredito;
	}
	
	/**
	 * Sets valor total credito.
	 *
	 * @param valorTotalCredito new valor total credito
	 */
	public void setValorTotalCredito(double valorTotalCredito) {
		this.valorTotalCredito = valorTotalCredito;
	}
	
	/**
	 * Gets valor total debito.
	 *
	 * @return valor total debito
	 */
	public double getValorTotalDebito() {
		return valorTotalDebito;
	}
	
	/**
	 * Sets valor total debito.
	 *
	 * @param valorTotalDebito new valor total debito
	 */
	public void setValorTotalDebito(double valorTotalDebito) {
		this.valorTotalDebito = valorTotalDebito;
	}
	
	/**
	 * Gets valor total saldo.
	 *
	 * @return valor total saldo
	 */
	public double getValorTotalSaldo() {
		return valorTotalSaldo;
	}
	
	/**
	 * Sets valor total saldo.
	 *
	 * @param valorTotalSaldo new valor total saldo
	 */
	public void setValorTotalSaldo(double valorTotalSaldo) {
		this.valorTotalSaldo = valorTotalSaldo;
	}
	
	/**
	 * Gets tipo conta.
	 *
	 * @return tipo conta
	 */
	public String getTipoConta() {
		return tipoConta;
	}
	
	/**
	 * Sets tipo conta.
	 *
	 * @param tipoConta new tipo conta
	 */
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	
	/**
	 * Gets ds fonte origem.
	 *
	 * @return ds fonte origem
	 */
	public String getDsFonteOrigem() {
		return dsFonteOrigem;
	}
	
	/**
	 * Sets ds fonte origem.
	 *
	 * @param dsFonteOrigem new ds fonte origem
	 */
	public void setDsFonteOrigem(String dsFonteOrigem) {
		this.dsFonteOrigem = dsFonteOrigem;
	}
	
	/**
	 * Gets nome exibicao.
	 *
	 * @return nome exibicao
	 */
	public String getNomeExibicao() {
		return nomeExibicao;
	}
	
	/**
	 * Sets nome exibicao.
	 *
	 * @param nomeExibicao new nome exibicao
	 */
	public void setNomeExibicao(String nomeExibicao) {
		this.nomeExibicao = nomeExibicao;
	}
}
