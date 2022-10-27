package br.com.eleicoes.model;

/**
 * Classe Cargo.
 */
public class Cargo {
    
    /** codigo. */
    private int codigo;
    
    /** sigla. */
    private Object sigla;
    
    /** nome. */
    private String nome;
    
    /** cod superior. */
    private int codSuperior;
    
    /** titular. */
    private boolean titular;
    
    /** contagem. */
    private int contagem;
    
	/**
	 * Gets codigo.
	 *
	 * @return codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	
	/**
	 * Sets codigo.
	 *
	 * @param codigo new codigo
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	/**
	 * Gets sigla.
	 *
	 * @return sigla
	 */
	public Object getSigla() {
		return sigla;
	}
	
	/**
	 * Sets sigla.
	 *
	 * @param sigla new sigla
	 */
	public void setSigla(Object sigla) {
		this.sigla = sigla;
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
	 * Gets cod superior.
	 *
	 * @return cod superior
	 */
	public int getCodSuperior() {
		return codSuperior;
	}
	
	/**
	 * Sets cod superior.
	 *
	 * @param codSuperior new cod superior
	 */
	public void setCodSuperior(int codSuperior) {
		this.codSuperior = codSuperior;
	}
	
	/**
	 * Checks if is titular.
	 *
	 * @return true, if is titular
	 */
	public boolean isTitular() {
		return titular;
	}
	
	/**
	 * Sets titular.
	 *
	 * @param titular new titular
	 */
	public void setTitular(boolean titular) {
		this.titular = titular;
	}
	
	/**
	 * Gets contagem.
	 *
	 * @return contagem
	 */
	public int getContagem() {
		return contagem;
	}
	
	/**
	 * Sets contagem.
	 *
	 * @param contagem new contagem
	 */
	public void setContagem(int contagem) {
		this.contagem = contagem;
	}
}