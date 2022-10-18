package br.com.eleicoes.model;

public class UnidadeEleitoral {
	private Object id;
	private String sigla;
	private String nome;
	private Object regiao;
	private Object cargos;
	private Object diretorios;
	private String codigo;
	private boolean capital;
	private Object estado;
	
	public Object getId() {
		return id;
	}
	public void setId(Object id) {
		this.id = id;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Object getRegiao() {
		return regiao;
	}
	public void setRegiao(Object regiao) {
		this.regiao = regiao;
	}
	public Object getCargos() {
		return cargos;
	}
	public void setCargos(Object cargos) {
		this.cargos = cargos;
	}
	public Object getDiretorios() {
		return diretorios;
	}
	public void setDiretorios(Object diretorios) {
		this.diretorios = diretorios;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public boolean isCapital() {
		return capital;
	}
	public void setCapital(boolean capital) {
		this.capital = capital;
	}
	public Object getEstado() {
		return estado;
	}
	public void setEstado(Object estado) {
		this.estado = estado;
	}
}
