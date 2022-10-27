package br.com.eleicoes.model;

/**
 * Classe Partido.
 */
public class Partido {
    
    /** numero. */
    private int numero;
    
    /** sigla. */
    private String sigla;
    
    /** nome. */
    private Object nome;
    
	/**
	 * Gets numero.
	 *
	 * @return numero
	 */
	public int getNumero() {
		return numero;
	}
	
	/**
	 * Sets numero.
	 *
	 * @param numero new numero
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	/**
	 * Gets sigla.
	 *
	 * @return sigla
	 */
	public String getSigla() {
		return sigla;
	}
	
	/**
	 * Sets sigla.
	 *
	 * @param sigla new sigla
	 */
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	/**
	 * Gets nome.
	 *
	 * @return nome
	 */
	public Object getNome() {
		return nome;
	}
	
	/**
	 * Sets nome.
	 *
	 * @param nome new nome
	 */
	public void setNome(Object nome) {
		this.nome = nome;
	}
}
