package br.com.eleicoes.model;

/**
 * Classe Eleicao.
 */
public class Eleicao {
    
    /** id. */
    private int id;
    
    /** sigla UF. */
    private Object siglaUF;
    
    /** localidade sg ue. */
    private Object localidadeSgUe;
    
    /** ano. */
    private int ano;
    
    /** codigo. */
    private Object codigo;
    
    /** nome eleicao. */
    private Object nomeEleicao;
    
    /** tipo eleicao. */
    private Object tipoEleicao;
    
    /** turno. */
    private Object turno;
    
    /** tipo abrangencia. */
    private Object tipoAbrangencia;
    
    /** data eleicao. */
    private Object dataEleicao;
    
    /** cod situacao eleicao. */
    private Object codSituacaoEleicao;
    
    /** descricao situacao eleicao. */
    private Object descricaoSituacaoEleicao;
    
    /** descricao eleicao. */
    private String descricaoEleicao;
    
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
	 * Gets sigla UF.
	 *
	 * @return sigla UF
	 */
	public Object getSiglaUF() {
		return siglaUF;
	}
	
	/**
	 * Sets sigla UF.
	 *
	 * @param siglaUF new sigla UF
	 */
	public void setSiglaUF(Object siglaUF) {
		this.siglaUF = siglaUF;
	}
	
	/**
	 * Gets localidade sg ue.
	 *
	 * @return localidade sg ue
	 */
	public Object getLocalidadeSgUe() {
		return localidadeSgUe;
	}
	
	/**
	 * Sets localidade sg ue.
	 *
	 * @param localidadeSgUe new localidade sg ue
	 */
	public void setLocalidadeSgUe(Object localidadeSgUe) {
		this.localidadeSgUe = localidadeSgUe;
	}
	
	/**
	 * Gets ano.
	 *
	 * @return ano
	 */
	public int getAno() {
		return ano;
	}
	
	/**
	 * Sets ano.
	 *
	 * @param ano new ano
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	/**
	 * Gets codigo.
	 *
	 * @return codigo
	 */
	public Object getCodigo() {
		return codigo;
	}
	
	/**
	 * Sets codigo.
	 *
	 * @param codigo new codigo
	 */
	public void setCodigo(Object codigo) {
		this.codigo = codigo;
	}
	
	/**
	 * Gets nome eleicao.
	 *
	 * @return nome eleicao
	 */
	public Object getNomeEleicao() {
		return nomeEleicao;
	}
	
	/**
	 * Sets nome eleicao.
	 *
	 * @param nomeEleicao new nome eleicao
	 */
	public void setNomeEleicao(Object nomeEleicao) {
		this.nomeEleicao = nomeEleicao;
	}
	
	/**
	 * Gets tipo eleicao.
	 *
	 * @return tipo eleicao
	 */
	public Object getTipoEleicao() {
		return tipoEleicao;
	}
	
	/**
	 * Sets tipo eleicao.
	 *
	 * @param tipoEleicao new tipo eleicao
	 */
	public void setTipoEleicao(Object tipoEleicao) {
		this.tipoEleicao = tipoEleicao;
	}
	
	/**
	 * Gets turno.
	 *
	 * @return turno
	 */
	public Object getTurno() {
		return turno;
	}
	
	/**
	 * Sets turno.
	 *
	 * @param turno new turno
	 */
	public void setTurno(Object turno) {
		this.turno = turno;
	}
	
	/**
	 * Gets tipo abrangencia.
	 *
	 * @return tipo abrangencia
	 */
	public Object getTipoAbrangencia() {
		return tipoAbrangencia;
	}
	
	/**
	 * Sets tipo abrangencia.
	 *
	 * @param tipoAbrangencia new tipo abrangencia
	 */
	public void setTipoAbrangencia(Object tipoAbrangencia) {
		this.tipoAbrangencia = tipoAbrangencia;
	}
	
	/**
	 * Gets data eleicao.
	 *
	 * @return data eleicao
	 */
	public Object getDataEleicao() {
		return dataEleicao;
	}
	
	/**
	 * Sets data eleicao.
	 *
	 * @param dataEleicao new data eleicao
	 */
	public void setDataEleicao(Object dataEleicao) {
		this.dataEleicao = dataEleicao;
	}
	
	/**
	 * Gets cod situacao eleicao.
	 *
	 * @return cod situacao eleicao
	 */
	public Object getCodSituacaoEleicao() {
		return codSituacaoEleicao;
	}
	
	/**
	 * Sets cod situacao eleicao.
	 *
	 * @param codSituacaoEleicao new cod situacao eleicao
	 */
	public void setCodSituacaoEleicao(Object codSituacaoEleicao) {
		this.codSituacaoEleicao = codSituacaoEleicao;
	}
	
	/**
	 * Gets descricao situacao eleicao.
	 *
	 * @return descricao situacao eleicao
	 */
	public Object getDescricaoSituacaoEleicao() {
		return descricaoSituacaoEleicao;
	}
	
	/**
	 * Sets descricao situacao eleicao.
	 *
	 * @param descricaoSituacaoEleicao new descricao situacao eleicao
	 */
	public void setDescricaoSituacaoEleicao(Object descricaoSituacaoEleicao) {
		this.descricaoSituacaoEleicao = descricaoSituacaoEleicao;
	}
	
	/**
	 * Gets descricao eleicao.
	 *
	 * @return descricao eleicao
	 */
	public String getDescricaoEleicao() {
		return descricaoEleicao;
	}
	
	/**
	 * Sets descricao eleicao.
	 *
	 * @param descricaoEleicao new descricao eleicao
	 */
	public void setDescricaoEleicao(String descricaoEleicao) {
		this.descricaoEleicao = descricaoEleicao;
	}
}
