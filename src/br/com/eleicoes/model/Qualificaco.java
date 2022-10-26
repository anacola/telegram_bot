package br.com.eleicoes.model;

/**
 * Classe Qualificaco.
 */
public class Qualificaco {
	
	/** membro. */
	private String membro;
    
    /** codigo funcao. */
    private int codigoFuncao;
    
    /** funcao. */
    private String funcao;
    
    /** nr registro conselho. */
    private String nrRegistroConselho;
    
    /** dt gestao inicio. */
    private long dtGestaoInicio;
    
    /** dt gestao fim. */
    private long dtGestaoFim;
    
	/**
	 * Gets membro.
	 *
	 * @return membro
	 */
	public String getMembro() {
		return membro;
	}
	
	/**
	 * Sets membro.
	 *
	 * @param membro new membro
	 */
	public void setMembro(String membro) {
		this.membro = membro;
	}
	
	/**
	 * Gets codigo funcao.
	 *
	 * @return codigo funcao
	 */
	public int getCodigoFuncao() {
		return codigoFuncao;
	}
	
	/**
	 * Sets codigo funcao.
	 *
	 * @param codigoFuncao new codigo funcao
	 */
	public void setCodigoFuncao(int codigoFuncao) {
		this.codigoFuncao = codigoFuncao;
	}
	
	/**
	 * Gets funcao.
	 *
	 * @return funcao
	 */
	public String getFuncao() {
		return funcao;
	}
	
	/**
	 * Sets funcao.
	 *
	 * @param funcao new funcao
	 */
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	/**
	 * Gets nr registro conselho.
	 *
	 * @return nr registro conselho
	 */
	public String getNrRegistroConselho() {
		return nrRegistroConselho;
	}
	
	/**
	 * Sets nr registro conselho.
	 *
	 * @param nrRegistroConselho new nr registro conselho
	 */
	public void setNrRegistroConselho(String nrRegistroConselho) {
		this.nrRegistroConselho = nrRegistroConselho;
	}
	
	/**
	 * Gets dt gestao inicio.
	 *
	 * @return dt gestao inicio
	 */
	public long getDtGestaoInicio() {
		return dtGestaoInicio;
	}
	
	/**
	 * Sets dt gestao inicio.
	 *
	 * @param dtGestaoInicio new dt gestao inicio
	 */
	public void setDtGestaoInicio(long dtGestaoInicio) {
		this.dtGestaoInicio = dtGestaoInicio;
	}
	
	/**
	 * Gets dt gestao fim.
	 *
	 * @return dt gestao fim
	 */
	public long getDtGestaoFim() {
		return dtGestaoFim;
	}
	
	/**
	 * Sets dt gestao fim.
	 *
	 * @param dtGestaoFim new dt gestao fim
	 */
	public void setDtGestaoFim(long dtGestaoFim) {
		this.dtGestaoFim = dtGestaoFim;
	}
}
