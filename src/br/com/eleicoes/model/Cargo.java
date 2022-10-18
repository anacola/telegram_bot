package br.com.eleicoes.model;

public class Cargo {
    private int codigo;
    private Object sigla;
    private String nome;
    private int codSuperior;
    private boolean titular;
    private int contagem;
    
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Object getSigla() {
		return sigla;
	}
	public void setSigla(Object sigla) {
		this.sigla = sigla;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodSuperior() {
		return codSuperior;
	}
	public void setCodSuperior(int codSuperior) {
		this.codSuperior = codSuperior;
	}
	public boolean isTitular() {
		return titular;
	}
	public void setTitular(boolean titular) {
		this.titular = titular;
	}
	public int getContagem() {
		return contagem;
	}
	public void setContagem(int contagem) {
		this.contagem = contagem;
	}
}