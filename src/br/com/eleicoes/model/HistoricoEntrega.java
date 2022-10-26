package br.com.eleicoes.model;

/**
 * Classe HistoricoEntrega.
 */
public class HistoricoEntrega {
	
	/** data entrega. */
	private String dataEntrega;
    
    /** tipo. */
    private String tipo;
    
    /** retificadora. */
    private String retificadora;
    
    /** numero controle. */
    private String numeroControle;
    
    /** id entrega. */
    private String idEntrega;
    
    /** is compare. */
    private boolean isCompare;
    
	/**
	 * Gets data entrega.
	 *
	 * @return data entrega
	 */
	public String getDataEntrega() {
		return dataEntrega;
	}
	
	/**
	 * Sets data entrega.
	 *
	 * @param dataEntrega new data entrega
	 */
	public void setDataEntrega(String dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	
	/**
	 * Gets tipo.
	 *
	 * @return tipo
	 */
	public String getTipo() {
		return tipo;
	}
	
	/**
	 * Sets tipo.
	 *
	 * @param tipo new tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	/**
	 * Gets retificadora.
	 *
	 * @return retificadora
	 */
	public String getRetificadora() {
		return retificadora;
	}
	
	/**
	 * Sets retificadora.
	 *
	 * @param retificadora new retificadora
	 */
	public void setRetificadora(String retificadora) {
		this.retificadora = retificadora;
	}
	
	/**
	 * Gets numero controle.
	 *
	 * @return numero controle
	 */
	public String getNumeroControle() {
		return numeroControle;
	}
	
	/**
	 * Sets numero controle.
	 *
	 * @param numeroControle new numero controle
	 */
	public void setNumeroControle(String numeroControle) {
		this.numeroControle = numeroControle;
	}
	
	/**
	 * Gets id entrega.
	 *
	 * @return id entrega
	 */
	public String getIdEntrega() {
		return idEntrega;
	}
	
	/**
	 * Sets id entrega.
	 *
	 * @param idEntrega new id entrega
	 */
	public void setIdEntrega(String idEntrega) {
		this.idEntrega = idEntrega;
	}
	
	/**
	 * Checks if is compare.
	 *
	 * @return true, if is compare
	 */
	public boolean isCompare() {
		return isCompare;
	}
	
	/**
	 * Sets compare.
	 *
	 * @param isCompare new compare
	 */
	public void setCompare(boolean isCompare) {
		this.isCompare = isCompare;
	}
}
