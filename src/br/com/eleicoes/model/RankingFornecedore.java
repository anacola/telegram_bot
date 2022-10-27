package br.com.eleicoes.model;

/**
 * Classe RankingFornecedore.
 */
public class RankingFornecedore {
	
	/** cpf cnpj. */
	private String cpfCnpj;
    
    /** nome. */
    private String nome;
    
    /** qntd. */
    private String qntd;
    
    /** valor. */
    private double valor;
    
    /** st financiamento coletivo. */
    private Object stFinanciamentoColetivo;
    
	/**
	 * Gets cpf cnpj.
	 *
	 * @return cpf cnpj
	 */
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	
	/**
	 * Sets cpf cnpj.
	 *
	 * @param cpfCnpj new cpf cnpj
	 */
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	
	/**
	 * Gets nome.
	 *
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Sets nome.
	 *
	 * @param nome new nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Gets qntd.
	 *
	 * @return qntd
	 */
	public String getQntd() {
		return qntd;
	}
	
	/**
	 * Sets qntd.
	 *
	 * @param qntd new qntd
	 */
	public void setQntd(String qntd) {
		this.qntd = qntd;
	}
	
	/**
	 * Gets valor.
	 *
	 * @return valor
	 */
	public double getValor() {
		return valor;
	}
	
	/**
	 * Sets valor.
	 *
	 * @param valor new valor
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	/**
	 * Gets st financiamento coletivo.
	 *
	 * @return st financiamento coletivo
	 */
	public Object getStFinanciamentoColetivo() {
		return stFinanciamentoColetivo;
	}
	
	/**
	 * Sets st financiamento coletivo.
	 *
	 * @param stFinanciamentoColetivo new st financiamento coletivo
	 */
	public void setStFinanciamentoColetivo(Object stFinanciamentoColetivo) {
		this.stFinanciamentoColetivo = stFinanciamentoColetivo;
	}
}
